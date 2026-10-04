# سرور واسط شعله باشی (Cloudflare Worker + D1)

اپ ──(X-Device-Id)──► این Worker ──► Gemini / Grok

- کلیدهای API فقط اینجا هستند (به‌صورت Secret)، نه داخل اپ.
- هر گوشی در دیتابیس **D1** ثبت می‌شود. دستگاه جدید با وضعیت `pending` ساخته می‌شود و **تا وقتی شما تایید نکنید پیشنهاد نمی‌گیرد**.
- وضعیت‌ها: `pending` (منتظر) | `approved` (مجاز) | `blocked` (بلاک).
- سقف درخواست روزانه برای هر دستگاه (`DAILY_LIMIT`).
- اگر Gemini خطا داد، خودکار سراغ Grok می‌رود (ترتیب در `PROVIDER_ORDER`).

## راه‌اندازی (یک‌بار)

```bash
cd server
npm install
npx wrangler login

# ساخت دیتابیس؛ شناسه‌ی چاپ‌شده را در wrangler.toml بخش database_id بگذارید
npx wrangler d1 create sholehbashi
npx wrangler d1 execute sholehbashi --remote --file=schema.sql

# کلیدها (هر کدام را وقتی خواست وارد کنید)
npx wrangler secret put GEMINI_API_KEY
npx wrangler secret put GROK_API_KEY
npx wrangler secret put ADMIN_TOKEN      # یک رمز طولانی و تصادفی، فقط برای شما

npx wrangler deploy
```

آدرس چاپ‌شده را (مثل `https://sholehbashi-proxy.xxx.workers.dev/`) در اپ، فایل `ApiConfig.kt` بگذارید.

## مدیریت دستگاه‌ها

مقدار `URL` آدرس Worker و `TOKEN` همان `ADMIN_TOKEN` است.

```bash
# دیدن دستگاه‌های منتظر تایید (مدل گوشی هم نشان داده می‌شود)
curl -H "Authorization: Bearer TOKEN" "URL/admin/devices?status=pending"

# تایید یک دستگاه
curl -X POST -H "Authorization: Bearer TOKEN" -d '{"status":"approved","note":"گوشی علی"}' URL/admin/devices/ID

# بلاک کردن (اگر اپ لو رفت)
curl -X POST -H "Authorization: Bearer TOKEN" -d '{"status":"blocked"}' URL/admin/devices/ID

# همه‌ی دستگاه‌ها
curl -H "Authorization: Bearer TOKEN" URL/admin/devices
```

روش جایگزین بدون curl، مستقیم روی دیتابیس:

```bash
npx wrangler d1 execute sholehbashi --remote --command "SELECT id, model, status, last_seen, request_count FROM devices"
npx wrangler d1 execute sholehbashi --remote --command "UPDATE devices SET status='approved' WHERE id='ID'"
```

روند پیشنهادی: گوشی تستر اپ را باز می‌کند و یک بار «غذای جدید» را می‌زند (خطای عدم تایید می‌گیرد) → شما در لیست `pending` مدل گوشی را می‌بینید → تایید می‌کنید → از آن لحظه کار می‌کند.

## نکات مهم

- **Gemini و موقعیت اجرا:** اگر Gemini خطای `location not supported` داد، چون Worker در منطقه‌ای اجرا شده که گوگل پشتیبانی نمی‌کند. بخش `[placement] mode = "smart"` در `wrangler.toml` را فعال کنید یا Grok را اول بگذارید.
- **دسترسی از ایران:** آدرس `workers.dev` گاهی فیلتر است. اگر شد، یک دامنه‌ی شخصی به Worker وصل کنید.
- **امنیت:** شناسه‌ی دستگاه را جعل‌پذیر بدانید؛ ولی چون هر شناسه‌ی جدید باید دستی تایید شود، فقط شناسه‌های تاییدشده کار می‌کنند. اگر شناسه‌ای لو رفت، همان را بلاک کنید.
- **نام مدل‌ها** (`GEMINI_MODEL`, `GROK_MODEL`) را در `wrangler.toml` با مستندات فعلی Google و xAI چک کنید.
- **حساسیت غذایی:** مدل ممکن است اشتباه کند. بهتر است در اپ یک یادآوری «مواد غذا را خودتان هم بررسی کنید» نشان داده شود.
