package com.sholehbashi.app.data.db.seed

import com.sholehbashi.app.data.Source
import com.sholehbashi.app.data.db.RecipeEntity

object ArabTurkishRecipes {
    val all: List<RecipeEntity> = listOf(
        // ==================== عربی — صبحانه ====================
        RecipeEntity(
            title = "فول مدمس",
            ingredients = """
                • ۲ پیمانه فول (باقلا)
                • ۳ حبه سیر
                • ۱ عدد پیاز
                • ۲ عدد گوجه‌فرنگی
                • آبلیمو، زیره، نمک
                • روغن زیتون
            """.trimIndent(),
            instructions = """
                ۱. فول را از شب قبل خیس کنید.
                ۲. با آب بپزید تا کاملاً نرم شود.
                ۳. سیر، پیاز و گوجه را خرد کنید.
                ۴. با فول مخلوط کنید و له کنید.
                ۵. آبلیمو، زیره و نمک اضافه کنید.
                ۶. با روغن زیتون سرو کنید.
            """.trimIndent(),
            mealType = "breakfast",
            region = "arab",
            source = Source.BUILTIN,
        ),
        RecipeEntity(
            title = "فلافل",
            ingredients = """
                • ۲ پیمانه نخود (خیسانده)
                • ۱ عدد پیاز
                • ۴ حبه سیر
                • ۱ دسته جعفری
                • ۱ دسته گشنیز
                • زیره، نمک، فلفل
                • روغن برای سرخ کردن
            """.trimIndent(),
            instructions = """
                ۱. نخود را از شب قبل خیس کنید.
                ۲. همه مواد را چرخ کنید.
                ۳. به شکل توپ‌های کوچک درآورید.
                ۴. در روغن داغ سرخ کنید.
                ۵. در نان پیta با سبزی و سس سرو کنید.
            """.trimIndent(),
            mealType = "breakfast",
            region = "arab",
            source = Source.BUILTIN,
        ),
        RecipeEntity(
            title = "مناقیش زعتر",
            ingredients = """
                • ۵۰۰ گرم خمیر پیتزا
                • ۴ قاشق غذاخوری زعتر
                • ۴ قاشق غذاخوری روغن زیتون
                • کنجد (اختیاری)
            """.trimIndent(),
            instructions = """
                ۱. خمیر را به شکل دایره‌های کوچک باز کنید.
                ۲. زعتر و روغن زیتون را مخلوط کنید.
                ۳. روی خمیر بمالید.
                ۴. در فر ۲۰۰ درجه بپزید تا طلایی شود.
                ۵. گرم سرو کنید.
            """.trimIndent(),
            mealType = "breakfast",
            region = "arab",
            source = Source.BUILTIN,
        ),
        RecipeEntity(
            title = "لبنه",
            ingredients = """
                • ۱ کیلو ماست
                • نمک به مقدار لازم
                • روغن زیتون
                • نعنا خشک
            """.trimIndent(),
            instructions = """
                ۱. ماست را در پارچه تمیز بریزید.
                ۲. نمک اضافه کنید.
                ۳. پارچه را ببندید و در یخچال بگذارید.
                ۴. ۲۴ ساعت بگذارید تا آبش برود.
                ۵. با روغن زیتون و نعنا سرو کنید.
            """.trimIndent(),
            mealType = "breakfast",
            region = "arab",
            source = Source.BUILTIN,
        ),
        RecipeEntity(
            title = "خبز عربی",
            ingredients = """
                • ۴ پیمانه آرد
                • ۱ پیمانه آب گرم
                • ۱ قاشق غذاخوری خمیرمایه
                • ۱ قاشق چای‌خوری نمک
                • ۲ قاشق غذاخوری روغن
            """.trimIndent(),
            instructions = """
                ۱. خمیرمایه را در آب گرم حل کنید.
                ۲. آرد، نمک و روغن را اضافه کنید.
                ۳. خمیر را ورز دهید و ۱ ساعت استراحت دهید.
                ۴. به شکل دایره‌های کوچک باز کنید.
                ۵. در تابه داغ بپزید.
                ۶. با هر غذایی سرو کنید.
            """.trimIndent(),
            mealType = "breakfast",
            region = "arab",
            source = Source.BUILTIN,
        ),

        // ==================== عربی — ناهار و شام ====================
        RecipeEntity(
            title = "کبسه مرغ",
            ingredients = """
                • ۴ عدد ران مرغ
                • ۲ پیمانه برنج باسماتی
                • ۱ عدد پیاز
                • ۲ عدد گوجه‌فرنگی
                • ادویه کبسه (زردچوبه، دارچین، هل، زنجبیل)
                • نمک و فلفل
                • ۳ قاشق غذاخوری روغن
            """.trimIndent(),
            instructions = """
                ۱. پیاز را تفت دهید.
                ۲. مرغ را اضافه کنید و سرخ کنید.
                ۳. ادویه‌ها را اضافه کنید.
                ۴. گوجه‌های خردشده را اضافه کنید.
                ۵. آب اضافه کنید و ۳۰ دقیقه بپزید.
                ۶. برنج را جداگانه بپزید.
                ۷. برنج را در دیس بکشید و مرغ را روی آن بچینید.
                ۸. با سس گوجه سرو کنید.
            """.trimIndent(),
            mealType = "lunch",
            region = "arab",
            source = Source.BUILTIN,
        ),
        RecipeEntity(
            title = "منسف اردنی",
            ingredients = """
                • ۱ کیلو گوشت گوسفندی
                • ۲ پیمانه برنج
                • ۱ پیمانه ماست
                • ۲ عدد پیاز
                • ۱ قاشق چای‌خوری زردچوبه
                • نمک و فلفل
                • خلال بادام و پسته
            """.trimIndent(),
            instructions = """
                ۱. گوشت را با پیاز و ادویه بپزید.
                ۲. ماست را جداگانه بجوشانید.
                ۳. برنج را با آب گوشت بپزید.
                ۴. برنج را در دیس بکشید.
                ۵. گوشت را روی آن بچینید.
                ۶. ماست را روی آن بریزید.
                ۷. با خلال بادام و پسته تزیین کنید.
            """.trimIndent(),
            mealType = "lunch",
            region = "arab",
            source = Source.BUILTIN,
        ),
        RecipeEntity(
            title = "شاورما مرغ",
            ingredients = """
                • ۵۰۰ گرم مرغ
                • ۲ قاشق غذاخوری ماست
                • ۲ قاشق غذاخوری آبلیمو
                • ۲ حبه سیر
                • ادویه شاورما
                • نان عربی، سس سیر، سبزی
            """.trimIndent(),
            instructions = """
                ۱. مرغ را به نوارهای نازک برش بزنید.
                ۲. با ماست، آبلیمو، سیر و ادویه مزه‌دار کنید.
                ۳. ۴ ساعت استراحت دهید.
                ۴. در تابه داغ سرخ کنید.
                ۵. در نان عربی با سس سیر و سبزی بپیچید.
                ۶. گرم سرو کنید.
            """.trimIndent(),
            mealType = "dinner",
            region = "arab",
            source = Source.BUILTIN,
        ),
        RecipeEntity(
            title = "کباب کفتا",
            ingredients = """
                • ۵۰۰ گرم گوشت چرخ‌کرده
                • ۱ عدد پیاز
                • ۲ حبه سیر
                • ۱ دسته جعفری
                • ادویه کباب، نمک، فلفل
            """.trimIndent(),
            instructions = """
                ۱. پیاز و سیر را رنده کنید.
                ۲. با گوشت مخلوط کنید.
                ۳. جعفری خردشده و ادویه‌ها را اضافه کنید.
                ۴. ۳۰ دقیقه استراحت دهید.
                ۵. به سیخ بکشید.
                ۶. روی گریل کباب کنید.
                ۷. با نان و سبزی سرو کنید.
            """.trimIndent(),
            mealType = "dinner",
            region = "arab",
            source = Source.BUILTIN,
        ),
        RecipeEntity(
            title = "مقلوبه",
            ingredients = """
                • ۵۰۰ گرم مرغ یا گوشت
                • ۲ پیمانه برنج
                • ۱ عدد بادمجان
                • ۲ عدد گوجه‌فرنگی
                • ۱ عدد پیاز
                • ادویه، نمک، فلفل
                • ۳ قاشق غذاخوری روغن
            """.trimIndent(),
            instructions = """
                ۱. بادمجان‌ها را سرخ کنید.
                ۲. مرغ را با پیاز و ادویه بپزید.
                ۳. در قابلمه لایه‌لایه بچینید: بادمجان، گوجه، مرغ، برنج.
                ۴. با حرارت کم بپزید.
                ۵. قابلمه را برگردانید.
                ۶. با ماست سرو کنید.
            """.trimIndent(),
            mealType = "dinner",
            region = "arab",
            source = Source.BUILTIN,
        ),
        RecipeEntity(
            title = "مولخیه",
            ingredients = """
                • ۵۰۰ گرم مرغ
                • ۲ پیمانه برگ مولخیه
                • ۱ عدد پیاز
                • ۴ حبه سیر
                • ۱ قاشق چای‌خوری گشنیز خشک
                • نمک و فلفل
                • روغن
            """.trimIndent(),
            instructions = """
                ۱. مرغ را با پیاز بپزید.
                ۲. برگ مولخیه را خرد کنید.
                ۳. سیر و گشنیز را تفت دهید.
                ۴. مولخیه را اضافه کنید.
                ۵. با آب مرغ بپزید.
                ۶. مرغ را اضافه کنید.
                ۷. با برنج سفید سرو کنید.
            """.trimIndent(),
            mealType = "dinner",
            region = "arab",
            source = Source.BUILTIN,
        ),
        RecipeEntity(
            title = "کوارع محشی",
            ingredients = """
                • ۸ عدد پای مرغ
                • ۱ پیمانه برنج
                • ۳۰۰ گرم گوشت چرخ‌کرده
                • ۱ عدد پیاز
                • ادویه، نمک، فلفل
                • ۳ قاشق غذاخوری روغن
            """.trimIndent(),
            instructions = """
                ۱. پای مرغ‌ها را تمیز کنید.
                ۲. برنج و گوشت را با پیاز و ادویه مخلوط کنید.
                ۳. پای مرغ‌ها را پر کنید.
                ۴. در قابلمه بچینید.
                ۵. آب و ادویه اضافه کنید.
                ۶. ۱ ساعت بپزید.
                ۷. با برنج سرو کنید.
            """.trimIndent(),
            mealType = "lunch",
            region = "arab",
            source = Source.BUILTIN,
        ),
        RecipeEntity(
            title = "کباب حلبی",
            ingredients = """
                • ۵۰۰ گرم گوشت گوسفندی
                • ۱ عدد پیاز
                • ۲ عدد گوجه‌فرنگی
                • ۲ عدد فلفل سبز
                • ادویه، نمک، فلفل
                • روغن
            """.trimIndent(),
            instructions = """
                ۱. گوشت را به قطعات کوچک برش بزنید.
                ۲. با پیاز و ادویه مزه‌دار کنید.
                ۳. در سیخ بکشید.
                ۴. با گوجه و فلفل کباب کنید.
                ۵. با نان و سبزی سرو کنید.
            """.trimIndent(),
            mealType = "dinner",
            region = "arab",
            source = Source.BUILTIN,
        ),
        RecipeEntity(
            title = "شیش طاووق",
            ingredients = """
                • ۵۰۰ گرم سینه مرغ
                • ۱ پیمانه ماست
                • ۲ قاشق غذاخوری آبلیمو
                • ۳ حبه سیر
                • ادویه، نمک، فلفل
            """.trimIndent(),
            instructions = """
                ۱. مرغ را به قطعات خرد کنید.
                ۲. با ماست، آبلیمو، سیر و ادویه مخلوط کنید.
                ۳. ۴ ساعت در یخچال بگذارید.
                ۴. به سیخ بکشید.
                ۵. روی گریل کباب کنید.
                ۶. با نان و سس سیر سرو کنید.
            """.trimIndent(),
            mealType = "dinner",
            region = "arab",
            source = Source.BUILTIN,
        ),
        RecipeEntity(
            title = "کباب لحم",
            ingredients = """
                • ۵۰۰ گرم گوشت گوسفندی
                • ۱ عدد پیاز
                • ۲ عدد گوجه‌فرنگی
                • ادویه، نمک، فلفل
                • روغن زیتون
            """.trimIndent(),
            instructions = """
                ۱. گوشت را مکعبی برش بزنید.
                ۲. با ادویه و روغن زیتون مزه‌دار کنید.
                ۳. به سیخ بکشید.
                ۴. با گوجه کباب کنید.
                ۵. با نان عربی و سبزی سرو کنید.
            """.trimIndent(),
            mealType = "dinner",
            region = "arab",
            source = Source.BUILTIN,
        ),

        // ==================== عربی — پیش‌غذا و سالاد ====================
        RecipeEntity(
            title = "حمص",
            ingredients = """
                • ۱ پیمانه نخود
                • ۳ قاشق غذاخوری ارده
                • ۲ حبه سیر
                • آبلیمو، روغن زیتون
                • نمک، زیره
            """.trimIndent(),
            instructions = """
                ۱. نخود را بپزید تا نرم شود.
                ۲. با ارده، سیر، آبلیمو و نمک مخلوط کنید.
                ۳. با مخلوط‌کن پوره کنید.
                ۴. با روغن زیتون و زیره سرو کنید.
            """.trimIndent(),
            mealType = "appetizer",
            region = "arab",
            source = Source.BUILTIN,
        ),
        RecipeEntity(
            title = "متبل بادمجان",
            ingredients = """
                • ۴ عدد بادمجان
                • ۳ قاشق غذاخوری ارده
                • ۲ حبه سیر
                • آبلیمو، روغن زیتون
                • نمک
            """.trimIndent(),
            instructions = """
                ۱. بادمجان‌ها را کبابی کنید.
                ۲. پوست بگیرید و له کنید.
                ۳. ارده، سیر، آبلیمو و نمک اضافه کنید.
                ۴. با روغن زیتون سرو کنید.
            """.trimIndent(),
            mealType = "appetizer",
            region = "arab",
            source = Source.BUILTIN,
        ),
        RecipeEntity(
            title = "تبوله",
            ingredients = """
                • ۱ پیمانه بلغور
                • ۳ عدد گوجه‌فرنگی
                • ۱ دسته جعفری
                • ۱ دسته نعنا
                • آبلیمو، روغن زیتون
                • نمک
            """.trimIndent(),
            instructions = """
                ۱. بلغور را با آب خیس کنید.
                ۲. سبزی‌ها و گوجه را ریز خرد کنید.
                ۳. همه را مخلوط کنید.
                ۴. با آبلیمو و روغن زیتون سرو کنید.
            """.trimIndent(),
            mealType = "salad",
            region = "arab",
            source = Source.BUILTIN,
        ),
        RecipeEntity(
            title = "فتوش",
            ingredients = """
                • ۱ عدد کاهو
                • ۲ عدد گوجه‌فرنگی
                • ۱ عدد خیار
                • ۱ عدد فلفل دلمه
                • نان تست سرخ‌شده
                • سس سماق و روغن زیتون
            """.trimIndent(),
            instructions = """
                ۱. سبزیجات را خرد کنید.
                ۲. نان تست را سرخ کنید.
                ۳. همه را مخلوط کنید.
                ۴. با سس سماق و روغن زیتون سرو کنید.
            """.trimIndent(),
            mealType = "salad",
            region = "arab",
            source = Source.BUILTIN,
        ),
        RecipeEntity(
            title = "سالاد بابا غنوش",
            ingredients = """
                • ۳ عدد بادمجان کبابی
                • ۲ قاشق غذاخوری ارده
                • ۲ حبه سیر
                • آبلیمو، روغن زیتون
                • انار، نعنا
            """.trimIndent(),
            instructions = """
                ۱. بادمجان‌ها را کبابی و له کنید.
                ۲. ارده، سیر و آبلیمو اضافه کنید.
                ۳. با روغن زیتون، انار و نعنا سرو کنید.
            """.trimIndent(),
            mealType = "salad",
            region = "arab",
            source = Source.BUILTIN,
        ),
        RecipeEntity(
            title = "ورق عنب",
            ingredients = """
                • ۵۰۰ گرم برگ مو
                • ۱ پیمانه برنج
                • ۳۰۰ گرم گوشت چرخ‌کرده
                • ۱ عدد پیاز
                • آبلیمو، نمک، فلفل
                • روغن زیتون
            """.trimIndent(),
            instructions = """
                ۱. برگ موها را بشویید.
                ۲. برنج، گوشت، پیاز و ادویه را مخلوط کنید.
                ۳. در برگ مو بپیچید.
                ۴. در قابلمه بچینید.
                ۵. آب، آبلیمو و روغن اضافه کنید.
                ۶. ۱ ساعت بپزید.
                ۷. سرد یا گرم سرو کنید.
            """.trimIndent(),
            mealType = "appetizer",
            region = "arab",
            source = Source.BUILTIN,
        ),
        RecipeEntity(
            title = "کبه",
            ingredients = """
                • ۲ پیمانه بلغور
                • ۵۰۰ گرم گوشت چرخ‌کرده
                • ۱ عدد پیاز
                • ادویه، نمک، فلفل
                • روغن برای سرخ کردن
            """.trimIndent(),
            instructions = """
                ۱. بلغور را خیس کنید.
                ۲. با گوشت و پیاز مخلوط کنید.
                ۳. به شکل توپ درآورید.
                ۴. وسط آن را خالی کنید و با گوشت پر کنید.
                ۵. در روغن سرخ کنید.
                ۶. با ماست سرو کنید.
            """.trimIndent(),
            mealType = "appetizer",
            region = "arab",
            source = Source.BUILTIN,
        ),
        RecipeEntity(
            title = "سمبوسه",
            ingredients = """
                • ۲۰ عدد خمیر سمبوسه
                • ۳۰۰ گرم گوشت چرخ‌کرده
                • ۱ عدد پیاز
                • ادویه، نمک، فلفل
                • روغن برای سرخ کردن
            """.trimIndent(),
            instructions = """
                ۱. پیاز را تفت دهید.
                ۲. گوشت را اضافه کنید و بپزید.
                ۳. ادویه‌ها را اضافه کنید.
                ۴. در خمیر بپیچید.
                ۵. در روغن سرخ کنید.
                ۶. با سس سرو کنید.
            """.trimIndent(),
            mealType = "appetizer",
            region = "arab",
            source = Source.BUILTIN,
        ),

        // ==================== عربی — دسر ====================
        RecipeEntity(
            title = "کنافه",
            ingredients = """
                • ۵۰۰ گرم خمیر کنافه
                • ۲ پیمانه پنیر عکاوی
                • ۱ پیمانه کره ذوب‌شده
                • ۲ پیمانه شکر
                • ۱ پیمانه آب
                • گلاب، پسته
            """.trimIndent(),
            instructions = """
                ۱. خمیر را با کره مخلوط کنید.
                ۲. نصف خمیر را در قالب بریزید.
                ۳. پنیر را اضافه کنید.
                ۴. بقیه خمیر را روی آن بریزید.
                ۵. در فر ۱۸۰ درجه بپزید.
                ۶. شربت شکر، آب و گلاب را بجوشانید.
                ۷. روی کنافه بریزید.
                ۸. با پسته تزیین کنید.
            """.trimIndent(),
            mealType = "dessert",
            region = "arab",
            source = Source.BUILTIN,
        ),
        RecipeEntity(
            title = "بسبوسه",
            ingredients = """
                • ۲ پیمانه آرد ذرت
                • ۱ پیمانه شکر
                • ۱ پیمانه ماست
                • نصف پیمانه روغن
                • ۱ قاشق چای‌خوری بیکینگ پودر
                • شربت شکر، نارگیل
            """.trimIndent(),
            instructions = """
                ۱. همه مواد را مخلوط کنید.
                ۲. در قالب بریزید.
                ۳. در فر ۱۸۰ درجه بپزید.
                ۴. شربت شکر را بجوشانید.
                ۵. روی بسبوسه داغ بریزید.
                ۶. با نارگیل تزیین کنید.
            """.trimIndent(),
            mealType = "dessert",
            region = "arab",
            source = Source.BUILTIN,
        ),
        RecipeEntity(
            title = "قطایف",
            ingredients = """
                • ۲ پیمانه آرد
                • ۱ پیمانه آب
                • ۱ قاشق چای‌خوری خمیرمایه
                • ۱ پیمانه گردو
                • شربت شکر، گلاب
            """.trimIndent(),
            instructions = """
                ۱. خمیر را درست کنید.
                ۲. در تابه داغ دایره‌های کوچک بپزید.
                ۳. گردو را وسط آن بگذارید.
                ۴. تا کنید.
                ۵. در روغن سرخ کنید.
                ۶. در شربت بخیسانید.
            """.trimIndent(),
            mealType = "dessert",
            region = "arab",
            source = Source.BUILTIN,
        ),
        RecipeEntity(
            title = "ام علی",
            ingredients = """
                • ۱ پیمانه شیر
                • ۱ پیمانه خامه
                • ۱ پیمانه نان خشک
                • ۱ پیمانه مغزها (پسته، بادام، گردو)
                • شکر، دارچین
            """.trimIndent(),
            instructions = """
                ۱. نان خشک را در ظرف بریزید.
                ۲. شیر و خامه را بجوشانید.
                ۳. شکر اضافه کنید.
                ۴. روی نان بریزید.
                ۵. با مغزها و دارچین تزیین کنید.
                ۶. در فر بپزید تا طلایی شود.
            """.trimIndent(),
            mealType = "dessert",
            region = "arab",
            source = Source.BUILTIN,
        ),
        RecipeEntity(
            title = "مهلبیه",
            ingredients = """
                • ۴ پیمانه شیر
                • ۴ قاشق غذاخوری نشاسته
                • ۱ پیمانه شکر
                • گلاب، پسته
            """.trimIndent(),
            instructions = """
                ۱. شیر را بجوشانید.
                ۲. نشاسته را با کمی شیر سرد حل کنید.
                ۳. به شیر اضافه کنید و هم بزنید.
                ۴. شکر و گلاب اضافه کنید.
                ۵. در ظرف بریزید و سرد کنید.
                ۶. با پسته تزیین کنید.
            """.trimIndent(),
            mealType = "dessert",
            region = "arab",
            source = Source.BUILTIN,
        ),
        RecipeEntity(
            title = "معمول",
            ingredients = """
                • ۲ پیمانه آرد
                • ۱ پیمانه کره
                • ۱ پیمانه خرما
                • ۱ قاشق چای‌خوری گلاب
                • پودر قند
            """.trimIndent(),
            instructions = """
                ۱. آرد را با کره مخلوط کنید.
                ۲. خرما را له کنید و گلاب اضافه کنید.
                ۳. خمیر را باز کنید.
                ۴. خرما را وسط بگذارید و بپیچید.
                ۵. در فر بپزید.
                ۶. با پودر قند تزیین کنید.
            """.trimIndent(),
            mealType = "dessert",
            region = "arab",
            source = Source.BUILTIN,
        ),

        // ==================== ترکی — صبحانه ====================
        RecipeEntity(
            title = "منمن",
            ingredients = """
                • ۴ عدد تخم‌مرغ
                • ۳ عدد گوجه‌فرنگی
                • ۲ عدد فلفل دلمه‌ای سبز
                • ۱ عدد پیاز
                • روغن، نمک، فلفل
            """.trimIndent(),
            instructions = """
                ۱. پیاز و فلفل را تفت دهید.
                ۲. گوجه را اضافه کنید و بپزید.
                ۳. تخم‌مرغ‌ها را اضافه کنید.
                ۴. هم بزنید تا بپزد.
                ۵. با نان ترکی سرو کنید.
            """.trimIndent(),
            mealType = "breakfast",
            region = "turkey",
            source = Source.BUILTIN,
        ),
        RecipeEntity(
            title = "چیلبیر",
            ingredients = """
                • ۴ عدد تخم‌مرغ
                • ۱ پیمانه ماست
                • ۲ حبه سیر
                • کره، فلفل قرمز
                • نان تست
            """.trimIndent(),
            instructions = """
                ۱. ماست و سیر را مخلوط کنید.
                ۲. تخم‌مرغ‌ها را در آب جوش بریزید.
                ۳. در ظرف بچینید: نان، ماست، تخم‌مرغ.
                ۴. کره را با فلفل قرمز ذوب کنید.
                ۵. روی آن بریزید.
                ۶. گرم سرو کنید.
            """.trimIndent(),
            mealType = "breakfast",
            region = "turkey",
            source = Source.BUILTIN,
        ),
        RecipeEntity(
            title = "سیمیت",
            ingredients = """
                • ۴ پیمانه آرد
                • ۱ پیمانه آب گرم
                • ۱ قاشق غذاخوری خمیرمایه
                • کنجد، نمک، شکر
            """.trimIndent(),
            instructions = """
                ۱. خمیر را درست کنید.
                ۲. ۱ ساعت استراحت دهید.
                ۳. به شکل حلقه درآورید.
                ۴. در کنجد بزنید.
                ۵. در فر ۲۰۰ درجه بپزید.
                ۶. با پنیر و چای سرو کنید.
            """.trimIndent(),
            mealType = "breakfast",
            region = "turkey",
            source = Source.BUILTIN,
        ),
        RecipeEntity(
            title = "بورک پنیر",
            ingredients = """
                • ۵۰۰ گرم خمیر یوفکا
                • ۲۰۰ گرم پنیر سفید
                • ۱ دسته جعفری
                • ۱ عدد تخم‌مرغ
                • روغن برای سرخ کردن
            """.trimIndent(),
            instructions = """
                ۱. پنیر و جعفری را مخلوط کنید.
                ۲. خمیر را به نوارهای بلند برش بزنید.
                ۳. پنیر را در خمیر بپیچید.
                ۴. با تخم‌مرغ رومال کنید.
                ۵. در روغن سرخ کنید.
                ۶. گرم سرو کنید.
            """.trimIndent(),
            mealType = "breakfast",
            region = "turkey",
            source = Source.BUILTIN,
        ),
        RecipeEntity(
            title = "پیده",
            ingredients = """
                • ۵۰۰ گرم خمیر پیتزا
                • ۳۰۰ گرم گوشت چرخ‌کرده
                • ۲ عدد گوجه‌فرنگی
                • ۱ عدد پیاز
                • ادویه، نمک، فلفل
            """.trimIndent(),
            instructions = """
                ۱. خمیر را به شکل بیضی باز کنید.
                ۲. گوشت، پیاز و گوجه را مخلوط کنید.
                ۳. روی خمیر بمالید.
                ۴. در فر ۲۰۰ درجه بپزید.
                ۵. با جعفری و لیمو سرو کنید.
            """.trimIndent(),
            mealType = "breakfast",
            region = "turkey",
            source = Source.BUILTIN,
        ),

        // ==================== ترکی — ناهار و شام ====================
        RecipeEntity(
            title = "کباب آدانا",
            ingredients = """
                • ۵۰۰ گرم گوشت چرخ‌کرده
                • ۱ عدد پیاز
                • ۲ حبه سیر
                • فلفل قرمز، نمک، ادویه
            """.trimIndent(),
            instructions = """
                ۱. گوشت را با پیاز رنده‌شده مخلوط کنید.
                ۲. ادویه‌ها را اضافه کنید.
                ۳. به سیخ بکشید.
                ۴. روی زغال کباب کنید.
                ۵. با نان و سبزی سرو کنید.
            """.trimIndent(),
            mealType = "dinner",
            region = "turkey",
            source = Source.BUILTIN,
        ),
        RecipeEntity(
            title = "دونر کباب",
            ingredients = """
                • ۵۰۰ گرم گوشت گوسفندی
                • ۱ عدد پیاز
                • ۲ قاشق غذاخوری ماست
                • ادویه دونر
                • نان، سبزی، سس
            """.trimIndent(),
            instructions = """
                ۱. گوشت را نازک برش بزنید.
                ۲. با ادویه و ماست مزه‌دار کنید.
                ۳. ۴ ساعت استراحت دهید.
                ۴. در فر یا گریل بپزید.
                ۵. در نان بپیچید.
                ۶. با سبزی و سس سرو کنید.
            """.trimIndent(),
            mealType = "dinner",
            region = "turkey",
            source = Source.BUILTIN,
        ),
        RecipeEntity(
            title = "کباب اسکندر",
            ingredients = """
                • ۵۰۰ گرم گوشت گوسفندی
                • ۲ عدد نان پیده
                • ۲ پیمانه سس گوجه
                • ۱ پیمانه ماست
                • کره، ادویه
            """.trimIndent(),
            instructions = """
                ۱. گوشت را کباب کنید.
                ۲. نان پیده را خرد کنید.
                ۳. نان را در بشقاب بچینید.
                ۴. سس گوجه و گوشت را روی آن بریزید.
                ۵. ماست را کنار آن بگذارید.
                ۶. کره ذوب‌شده روی آن بریزید.
            """.trimIndent(),
            mealType = "dinner",
            region = "turkey",
            source = Source.BUILTIN,
        ),
        RecipeEntity(
            title = "مانتی",
            ingredients = """
                • ۲ پیمانه آرد
                • ۳۰۰ گرم گوشت چرخ‌کرده
                • ۱ عدد پیاز
                • ماست، سیر، کره
                • ادویه، نمک، فلفل
            """.trimIndent(),
            instructions = """
                ۱. خمیر را درست کنید.
                ۲. گوشت، پیاز و ادویه را مخلوط کنید.
                ۳. مربع‌های کوچک برش بزنید.
                ۴. گوشت را وسط آن بگذارید.
                ۵. بخارپز کنید.
                ۶. با ماست، سیر و کره سرو کنید.
            """.trimIndent(),
            mealType = "dinner",
            region = "turkey",
            source = Source.BUILTIN,
        ),
        RecipeEntity(
            title = "کوفته ترکی",
            ingredients = """
                • ۵۰۰ گرم گوشت چرخ‌کرده
                • ۱ پیمانه برنج
                • ۱ عدد پیاز
                • ادویه، نمک، فلفل
                • سس گوجه
            """.trimIndent(),
            instructions = """
                ۱. برنج را بپزید.
                ۲. با گوشت و پیاز مخلوط کنید.
                ۳. به شکل توپ درآورید.
                ۴. در سس گوجه بپزید.
                ۵. با ماست سرو کنید.
            """.trimIndent(),
            mealType = "dinner",
            region = "turkey",
            source = Source.BUILTIN,
        ),
        RecipeEntity(
            title = "کباب کوزو",
            ingredients = """
                • ۵۰۰ گرم گوشت گوسفندی
                • ۲ عدد بادمجان
                • ۲ عدد گوجه‌فرنگی
                • ادویه، نمک، فلفل
                • روغن زیتون
            """.trimIndent(),
            instructions = """
                ۱. گوشت را مکعبی برش بزنید.
                ۲. با ادویه مزه‌دار کنید.
                ۳. با بادمجان و گوجه به سیخ بکشید.
                ۴. روی گریل کباب کنید.
                ۵. با نان و سبزی سرو کنید.
            """.trimIndent(),
            mealType = "dinner",
            region = "turkey",
            source = Source.BUILTIN,
        ),

        // ==================== ترکی — پیش‌غذا و سالاد ====================
        RecipeEntity(
            title = "مزه ترکی",
            ingredients = """
                • ۱ پیمانه ماست
                • ۱ عدد خیار
                • ۲ حبه سیر
                • نعنا خشک، روغن زیتون
                • نمک
            """.trimIndent(),
            instructions = """
                ۱. خیار را رنده کنید و آبش را بگیرید.
                ۲. با ماست و سیر مخلوط کنید.
                ۳. نعنا و روغن زیتون اضافه کنید.
                ۴. سرد سرو کنید.
            """.trimIndent(),
            mealType = "appetizer",
            region = "turkey",
            source = Source.BUILTIN,
        ),
        RecipeEntity(
            title = "سالاد چوبان",
            ingredients = """
                • ۲ عدد گوجه‌فرنگی
                • ۲ عدد خیار
                • ۱ عدد پیاز
                • ۱ عدد فلفل سبز
                • پنیر سفید، زیتون
                • روغن زیتون، آبلیمو
            """.trimIndent(),
            instructions = """
                ۱. سبزیجات را خرد کنید.
                ۲. پنیر و زیتون اضافه کنید.
                ۳. با روغن زیتون و آبلیمو سرو کنید.
            """.trimIndent(),
            mealType = "salad",
            region = "turkey",
            source = Source.BUILTIN,
        ),
        RecipeEntity(
            title = "یالانچی دولما",
            ingredients = """
                • ۲۰ عدد برگ مو
                • ۱ پیمانه برنج
                • ۱ عدد پیاز
                • ۱ دسته نعنا
                • رب انار، آبلیمو
                • روغن زیتون
            """.trimIndent(),
            instructions = """
                ۱. برنج، پیاز و نعنا را مخلوط کنید.
                ۲. در برگ مو بپیچید.
                ۳. در قابلمه بچینید.
                ۴. رب انار، آبلیمو و روغن اضافه کنید.
                ۵. ۱ ساعت بپزید.
                ۶. سرد سرو کنید.
            """.trimIndent(),
            mealType = "appetizer",
            region = "turkey",
            source = Source.BUILTIN,
        ),
        RecipeEntity(
            title = "مرجیمک کوفته",
            ingredients = """
                • ۱ پیمانه عدس
                • نصف پیمانه بلغور
                • ۱ عدد پیاز
                • رب گوجه، ادویه
                • آبلیمو، روغن زیتون
            """.trimIndent(),
            instructions = """
                ۱. عدس و بلغور را بپزید.
                ۲. پیاز را تفت دهید.
                ۳. همه را مخلوط و له کنید.
                ۴. به شکل توپ درآورید.
                ۵. با کاهو و لیمو سرو کنید.
            """.trimIndent(),
            mealType = "appetizer",
            region = "turkey",
            source = Source.BUILTIN,
        ),
        RecipeEntity(
            title = "پیاز دولماسی",
            ingredients = """
                • ۴ عدد پیاز بزرگ
                • ۳۰۰ گرم گوشت چرخ‌کرده
                • ۱ پیمانه برنج
                • رب گوجه، ادویه
                • روغن
            """.trimIndent(),
            instructions = """
                ۱. پیازها را پوست بگیرید.
                ۲. لایه‌ها را جدا کنید.
                ۳. گوشت، برنج و ادویه را مخلوط کنید.
                ۴. در لایه‌های پیاز بپیچید.
                ۵. در سس گوجه بپزید.
            """.trimIndent(),
            mealType = "appetizer",
            region = "turkey",
            source = Source.BUILTIN,
        ),

        // ==================== ترکی — دسر ====================
        RecipeEntity(
            title = "باکلاوا",
            ingredients = """
                • ۵۰۰ گرم خمیر یوفکا
                • ۲ پیمانه گردو
                • ۱ پیمانه کره ذوب‌شده
                • ۲ پیمانه شکر
                • ۱ پیمانه آب
                • آبلیمو
            """.trimIndent(),
            instructions = """
                ۱. خمیر را لایه‌لایه با کره بچینید.
                ۲. گردو را بین لایه‌ها بپاشید.
                ۳. در فر ۱۸۰ درجه بپزید.
                ۴. شربت شکر و آبلیمو را بجوشانید.
                ۵. روی باکلاوا بریزید.
            """.trimIndent(),
            mealType = "dessert",
            region = "turkey",
            source = Source.BUILTIN,
        ),
        RecipeEntity(
            title = "کونفه",
            ingredients = """
                • ۵۰۰ گرم خمیر کونفه
                • ۲ پیمانه پنیر
                • ۱ پیمانه کره
                • شربت شکر
                • پسته
            """.trimIndent(),
            instructions = """
                ۱. خمیر را با کره مخلوط کنید.
                ۲. نصف را در قالب بریزید.
                ۳. پنیر را اضافه کنید.
                ۴. بقیه خمیر را روی آن بریزید.
                ۵. در فر بپزید.
                ۶. شربت را روی آن بریزید.
                ۷. با پسته تزیین کنید.
            """.trimIndent(),
            mealType = "dessert",
            region = "turkey",
            source = Source.BUILTIN,
        ),
        RecipeEntity(
            title = "لوکوم",
            ingredients = """
                • ۲ پیمانه شکر
                • ۱ پیمانه آب
                • ۲ قاشق غذاخوری نشاسته
                • گلاب، پودر قند
                • نارگیل
            """.trimIndent(),
            instructions = """
                ۱. شکر و آب را بجوشانید.
                ۲. نشاسته را با کمی آب حل کنید.
                ۳. به شربت اضافه کنید و هم بزنید.
                ۴. گلاب اضافه کنید.
                ۵. در قالب بریزید و سرد کنید.
                ۶. برش بزنید و در پودر قند بزنید.
            """.trimIndent(),
            mealType = "dessert",
            region = "turkey",
            source = Source.BUILTIN,
        ),
        RecipeEntity(
            title = "سوتلاج",
            ingredients = """
                • ۱ لیتر شیر
                • نصف پیمانه برنج
                • ۱ پیمانه شکر
                • وانیل، دارچین
            """.trimIndent(),
            instructions = """
                ۱. برنج را با کمی آب بپزید.
                ۲. شیر را اضافه کنید.
                ۳. شکر را اضافه کنید.
                ۴. هم بزنید تا غلیظ شود.
                ۵. در ظرف بریزید.
                ۶. با دارچین تزیین کنید.
            """.trimIndent(),
            mealType = "dessert",
            region = "turkey",
            source = Source.BUILTIN,
        ),
        RecipeEntity(
            title = "کادایف",
            ingredients = """
                • ۵۰۰ گرم خمیر کادایف
                • ۱ پیمانه کره
                • ۲ پیمانه گردو
                • شربت شکر
            """.trimIndent(),
            instructions = """
                ۱. خمیر را با کره مخلوط کنید.
                ۲. گردو را اضافه کنید.
                ۳. در قالب بریزید.
                ۴. در فر بپزید.
                ۵. شربت را روی آن بریزید.
            """.trimIndent(),
            mealType = "dessert",
            region = "turkey",
            source = Source.BUILTIN,
        ),
        RecipeEntity(
            title = "حلوا ترک",
            ingredients = """
                • ۲ پیمانه آرد
                • ۱ پیمانه شکر
                • ۱ پیمانه روغن
                • نصف پیمانه شیر
                • دارچین
            """.trimIndent(),
            instructions = """
                ۱. آرد را در روغن تفت دهید.
                ۲. شیر و شکر اضافه کنید.
                ۳. هم بزنید تا یکدست شود.
                ۴. با دارچین تزیین کنید.
                ۵. سرد سرو کنید.
            """.trimIndent(),
            mealType = "dessert",
            region = "turkey",
            source = Source.BUILTIN,
        ),
        RecipeEntity(
            title = "آشوره",
            ingredients = """
                • ۱ پیمانه گندم
                • ۱ پیمانه نخود
                • ۱ پیمانه لوبیا
                • ۱ پیمانه برنج
                • ۱ پیمانه شکر
                • میوه خشک، مغزها
                • دارچین، گلاب
            """.trimIndent(),
            instructions = """
                ۱. حبوبات را از شب قبل خیس کنید.
                ۲. با آب بپزید تا نرم شوند.
                ۳. برنج را اضافه کنید.
                ۴. شکر، میوه خشک و مغزها را اضافه کنید.
                ۵. گلاب و دارچین اضافه کنید.
                ۶. گرم یا سرد سرو کنید.
            """.trimIndent(),
            mealType = "dessert",
            region = "turkey",
            source = Source.BUILTIN,
        ),
    )
}