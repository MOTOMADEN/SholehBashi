package com.sholehbashi.app.data.db.seed

import com.sholehbashi.app.data.Source
import com.sholehbashi.app.data.db.RecipeEntity

object ModernRecipes {
    val all: List<RecipeEntity> = listOf(
        // ==================== فست‌فود ====================
        RecipeEntity(
            title = "چیزبرگر دوبل",
            ingredients = """
                • ۴۰۰ گرم گوشت چرخ‌کرده
                • ۲ عدد نان برگر
                • ۴ برش پنیر چدار
                • کاهو، گوجه، پیاز
                • سس مخصوص برگر
            """.trimIndent(),
            instructions = """
                ۱. گوشت را به دو برگر ضخیم تقسیم کنید.
                ۲. روی گریل داغ بپزید.
                ۳. پنیر را روی هر برگر بگذارید تا ذوب شود.
                ۴. نان را تست کنید.
                ۵. سس مخصوص را روی نان بمالید.
                ۶. لایه‌لایه بچینید و سرو کنید.
            """.trimIndent(),
            mealType = "lunch",
            region = "americas",
            source = Source.BUILTIN,
        ),
        RecipeEntity(
            title = "پیتزا پپرونی",
            ingredients = """
                • ۵۰۰ گرم خمیر پیتزا
                • ۱ پیمانه سس گوجه
                • ۲۰۰ گرم پنیر موزارلا
                • ۱۰۰ گرم پپرونی
                • اورگانو، روغن زیتون
            """.trimIndent(),
            instructions = """
                ۱. خمیر را پهن کنید.
                ۲. سس گوجه بمالید.
                ۳. پنیر و پپرونی بچینید.
                ۴. اورگانو بپاشید.
                ۵. در فر ۲۵۰ درجه بپزید (۱۰-۱۲ دقیقه).
                ۶. با روغن زیتون سرو کنید.
            """.trimIndent(),
            mealType = "dinner",
            region = "europe",
            source = Source.BUILTIN,
        ),
        RecipeEntity(
            title = "ساندویچ مرغ کریسپی",
            ingredients = """
                • ۲ عدد سینه مرغ
                • ۱ پیمانه آرد سوخاری
                • ۲ عدد تخم‌مرغ
                • ۴ عدد نان برگر
                • کاهو، خیارشور، مایونز
                • روغن برای سرخ کردن
            """.trimIndent(),
            instructions = """
                ۱. مرغ را نازک بکوبید.
                ۲. در تخم‌مرغ و آرد سوخاری بزنید.
                ۳. در روغن داغ سرخ کنید.
                ۴. نان را تست کنید.
                ۵. مایونز بمالید.
                ۶. مرغ، کاهو و خیارشور بچینید.
                ۷. سرو کنید.
            """.trimIndent(),
            mealType = "lunch",
            region = "americas",
            source = Source.BUILTIN,
        ),
        RecipeEntity(
            title = "سیب‌زمینی ویژه",
            ingredients = """
                • ۴ عدد سیب‌زمینی
                • ۲۰۰ گرم پنیر چدار
                • ۱۰۰ گرم بیکن
                • خامه ترش، پیازچه
                • روغن، نمک، فلفل
            """.trimIndent(),
            instructions = """
                ۱. سیب‌زمینی را خلالی خرد کنید.
                ۲. در روغن داغ سرخ کنید.
                ۳. بیکن را تفت دهید.
                ۴. پنیر را روی سیب‌زمینی بریزید.
                ۵. بیکن، خامه و پیازچه اضافه کنید.
                ۶. گرم سرو کنید.
            """.trimIndent(),
            mealType = "snack",
            region = "americas",
            source = Source.BUILTIN,
        ),
        RecipeEntity(
            title = "ناگت مرغ خانگی",
            ingredients = """
                • ۵۰۰ گرم سینه مرغ
                • ۱ پیمانه آرد سوخاری
                • ۲ عدد تخم‌مرغ
                • ۱ پیمانه آرد
                • ادویه، نمک، فلفل
                • روغن
            """.trimIndent(),
            instructions = """
                ۱. مرغ را به قطعات کوچک خرد کنید.
                ۲. در آرد، تخم‌مرغ و آرد سوخاری بزنید.
                ۳. ادویه اضافه کنید.
                ۴. در روغن داغ سرخ کنید.
                ۵. با سس سرو کنید.
            """.trimIndent(),
            mealType = "snack",
            region = "americas",
            source = Source.BUILTIN,
        ),
        RecipeEntity(
            title = "هات داگ نیویورکی",
            ingredients = """
                • ۴ عدد سوسیس
                • ۴ عدد نان هات داگ
                • ۱ عدد پیاز
                • ۲ قاشق غذاخوری سس گوجه
                • خردل زرد
                • خیارشور
            """.trimIndent(),
            instructions = """
                ۱. سوسیس‌ها را در آب گرم کنید.
                ۲. نان‌ها را گرم کنید.
                ۳. سوسیس را در نان بگذارید.
                ۴. پیاز، سس گوجه و خردل اضافه کنید.
                ۵. با خیارشور سرو کنید.
            """.trimIndent(),
            mealType = "snack",
            region = "americas",
            source = Source.BUILTIN,
        ),
        RecipeEntity(
            title = "پوتین مدرن",
            ingredients = """
                • ۴ عدد سیب‌زمینی
                • ۲۰۰ گرم پنیر چدار
                • ۲ پیمانه سس گریوی
                • ۱۰۰ گرم بیکن
                • پیازچه
            """.trimIndent(),
            instructions = """
                ۱. سیب‌زمینی را سرخ کنید.
                ۲. بیکن را تفت دهید.
                ۳. پنیر را روی سیب‌زمینی بپاشید.
                ۴. سس گریوی داغ روی آن بریزید.
                ۵. بیکن و پیازچه اضافه کنید.
                ۶. فوری سرو کنید.
            """.trimIndent(),
            mealType = "snack",
            region = "americas",
            source = Source.BUILTIN,
        ),
        RecipeEntity(
            title = "تاکو بلوفیش",
            ingredients = """
                • ۴ عدد ماهی سفید
                • ۸ عدد تورتیلای ذرت
                • ۱ پیمانه کلم رنده‌شده
                • ۱ عدد لیمو
                • سس مایونز، سس چیلی
            """.trimIndent(),
            instructions = """
                ۱. ماهی را با ادویه مزه‌دار کنید.
                ۲. در تابه سرخ کنید.
                ۳. تورتیلا را گرم کنید.
                ۴. کلم، ماهی و سس‌ها را بچینید.
                ۵. با لیمو سرو کنید.
            """.trimIndent(),
            mealType = "lunch",
            region = "americas",
            source = Source.BUILTIN,
        ),

        // ==================== فیوژن آسیایی ====================
        RecipeEntity(
            title = "بائو مرغ",
            ingredients = """
                • ۴ عدد نان بائو
                • ۵۰۰ گرم مرغ
                • ۲ قاشق غذاخوری سس سویا
                • ۱ قاشق غذاخوری عسل
                • خیارشور، پیازچه
            """.trimIndent(),
            instructions = """
                ۱. مرغ را با سس سویا و عسل مزه‌دار کنید.
                ۲. در تابه سرخ کنید.
                ۳. نان بائو را بخارپز کنید.
                ۴. مرغ را داخل نان بگذارید.
                ۵. خیارشور و پیازچه اضافه کنید.
                ۶. سرو کنید.
            """.trimIndent(),
            mealType = "lunch",
            region = "east_asia",
            source = Source.BUILTIN,
        ),
        RecipeEntity(
            title = "رامن مدرن",
            ingredients = """
                • ۲۰۰ گرم نودل رامن
                • ۱ لیتر آب مرغ
                • ۲۰۰ گرم مرغ
                • ۱ عدد تخم‌مرغ
                • میسو، کره، ذرت
                • پیازچه، نوری
            """.trimIndent(),
            instructions = """
                ۱. آب مرغ را بجوشانید.
                ۲. میسو اضافه کنید.
                ۳. نودل را بپزید.
                ۴. مرغ و تخم‌مرغ را اضافه کنید.
                ۵. کره و ذرت اضافه کنید.
                ۶. با پیازچه و نوری سرو کنید.
            """.trimIndent(),
            mealType = "dinner",
            region = "east_asia",
            source = Source.BUILTIN,
        ),
        RecipeEntity(
            title = "پوکه بول",
            ingredients = """
                • ۲ پیمانه برنج
                • ۳۰۰ گرم ماهی سالمون
                • ۱ عدد آووکادو
                • ۱ عدد خیار
                • سس سویا، کنجد
                • نوری، زنجبیل
            """.trimIndent(),
            instructions = """
                ۱. برنج را بپزید.
                ۲. ماهی را مکعبی خرد کنید.
                ۳. آووکادو و خیار را برش بزنید.
                ۴. همه را در کاسه بچینید.
                ۵. سس سویا، کنجد، نوری و زنجبیل اضافه کنید.
                ۶. مخلوط کنید و سرو کنید.
            """.trimIndent(),
            mealType = "lunch",
            region = "east_asia",
            source = Source.BUILTIN,
        ),
        RecipeEntity(
            title = "بان می ویتنامی",
            ingredients = """
                • ۱ عدد نان باگت
                • ۲۰۰ گرم گوشت خوک
                • ۱ عدد خیار
                • ۱ عدد هویج
                • ریحان، گشنیز
                • سس مایونز، سس چیلی
            """.trimIndent(),
            instructions = """
                ۱. نان را برش بزنید.
                ۲. گوشت را سرخ کنید.
                ۳. سبزیجات را برش بزنید.
                ۴. همه را در نان بچینید.
                ۵. با سس سرو کنید.
            """.trimIndent(),
            mealType = "lunch",
            region = "east_asia",
            source = Source.BUILTIN,
        ),
        RecipeEntity(
            title = "کاری ژاپنی",
            ingredients = """
                • ۵۰۰ گرم گوشت گاو
                • ۲ عدد پیاز
                • ۲ عدد سیب‌زمینی
                • ۲ عدد هویج
                • ۱ بسته خمیر کاری
                • برنج
            """.trimIndent(),
            instructions = """
                ۱. گوشت را تفت دهید.
                ۲. پیاز را اضافه کنید.
                ۳. آب اضافه کنید و بپزید.
                ۴. سیب‌زمینی و هویج اضافه کنید.
                ۵. خمیر کاری اضافه کنید.
                ۶. با برنج سرو کنید.
            """.trimIndent(),
            mealType = "dinner",
            region = "east_asia",
            source = Source.BUILTIN,
        ),
        RecipeEntity(
            title = "سوشی رول کالیفرنیا",
            ingredients = """
                • ۲ پیمانه برنج سوشی
                • ۴ ورق نوری
                • ۱ عدد آووکادو
                • ۱ عدد خیار
                • ۱۰۰ گرم خرچنگ
                • کنجد
            """.trimIndent(),
            instructions = """
                ۱. برنج را بپزید و با سرکه مخلوط کنید.
                ۲. نوری را روی حصیر بگذارید.
                ۳. برنج را پهن کنید.
                ۴. آووکادو، خیار و خرچنگ بچینید.
                ۵. رول کنید و برش بزنید.
                ۶. با کنجد سرو کنید.
            """.trimIndent(),
            mealType = "lunch",
            region = "east_asia",
            source = Source.BUILTIN,
        ),

        // ==================== مدیترانه‌ای مدرن ====================
        RecipeEntity(
            title = "کاسه بودا",
            ingredients = """
                • ۱ پیمانه کینوآ
                • ۱ عدد آووکادو
                • ۱ عدد سیب‌زمینی شیرین
                • ۱ پیمانه نخود
                • اسفناج، گوجه
                • سس تاهینی
            """.trimIndent(),
            instructions = """
                ۱. کینوآ را بپزید.
                ۲. سیب‌زمینی شیرین را کبابی کنید.
                ۳. نخود را بپزید.
                ۴. همه را در کاسه بچینید.
                ۵. با اسفناج و گوجه سرو کنید.
                ۶. سس تاهینی روی آن بریزید.
            """.trimIndent(),
            mealType = "lunch",
            region = "americas",
            source = Source.BUILTIN,
        ),
        RecipeEntity(
            title = "سالاد کینوآ",
            ingredients = """
                • ۱ پیمانه کینوآ
                • ۱ عدد خیار
                • ۲ عدد گوجه‌فرنگی
                • ۱ عدد فلفل دلمه
                • نعنا، جعفری
                • آبلیمو، روغن زیتون
            """.trimIndent(),
            instructions = """
                ۱. کینوآ را بپزید و سرد کنید.
                ۲. سبزیجات را خرد کنید.
                ۳. همه را مخلوط کنید.
                ۴. آبلیمو و روغن زیتون اضافه کنید.
                ۵. سرد سرو کنید.
            """.trimIndent(),
            mealType = "salad",
            region = "europe",
            source = Source.BUILTIN,
        ),
        RecipeEntity(
            title = "هوموس مدرن",
            ingredients = """
                • ۱ پیمانه نخود
                • ۳ قاشق غذاخوری ارده
                • ۲ حبه سیر
                • آبلیمو، روغن زیتون
                • پاپریکا، زیره
            """.trimIndent(),
            instructions = """
                ۱. نخود را بپزید.
                ۲. با ارده، سیر، آبلیمو و ادویه مخلوط کنید.
                ۳. پوره کنید.
                ۴. با روغن زیتون و پاپریکا سرو کنید.
            """.trimIndent(),
            mealType = "appetizer",
            region = "arab",
            source = Source.BUILTIN,
        ),
        RecipeEntity(
            title = "فالافل رپ",
            ingredients = """
                • ۸ عدد فالافل
                • ۴ عدد نان پیتا
                • ۱ پیمانه کاهو
                • ۱ عدد گوجه‌فرنگی
                • سس تاهینی
                • خیارشور
            """.trimIndent(),
            instructions = """
                ۱. فالافل‌ها را سرخ کنید.
                ۲. نان پیتا را گرم کنید.
                ۳. کاهو، گوجه، فالافل و خیارشور بچینید.
                ۴. سس تاهینی روی آن بریزید.
                ۵. رول کنید و سرو کنید.
            """.trimIndent(),
            mealType = "lunch",
            region = "arab",
            source = Source.BUILTIN,
        ),
        RecipeEntity(
            title = "شاورما رپ",
            ingredients = """
                • ۵۰۰ گرم مرغ
                • ۲ قاشق غذاخوری ماست
                • ۲ قاشق غذاخوری آبلیمو
                • ادویه شاورما
                • نان پیتا، سس سیر
                • سبزیجات
            """.trimIndent(),
            instructions = """
                ۱. مرغ را با ماست، آبلیمو و ادویه مزه‌دار کنید.
                ۲. ۲ ساعت استراحت دهید.
                ۳. در تابه سرخ کنید.
                ۴. نان پیتا را گرم کنید.
                ۵. مرغ، سبزیجات و سس سیر بچینید.
                ۶. رول کنید و سرو کنید.
            """.trimIndent(),
            mealType = "lunch",
            region = "arab",
            source = Source.BUILTIN,
        ),

        // ==================== گیاهی و وگان ====================
        RecipeEntity(
            title = "برگر گیاهی",
            ingredients = """
                • ۲ پیمانه لوبیا سیاه
                • ۱ عدد پیاز
                • ۲ حبه سیر
                • ۱ پیمانه آرد سوخاری
                • ۱ عدد تخم‌مرغ گیاهی
                • ادویه، نمک
            """.trimIndent(),
            instructions = """
                ۱. لوبیا را بپزید و له کنید.
                ۲. پیاز و سیر را تفت دهید.
                ۳. با لوبیا مخلوط کنید.
                ۴. آرد سوخاری و ادویه اضافه کنید.
                ۵. به شکل برگر درآورید.
                ۶. در تابه سرخ کنید.
                ۷. در نان برگر سرو کنید.
            """.trimIndent(),
            mealType = "lunch",
            region = "americas",
            source = Source.BUILTIN,
        ),
        RecipeEntity(
            title = "کاری سبزیجات وگان",
            ingredients = """
                • ۲ عدد سیب‌زمینی
                • ۱ عدد بادمجان
                • ۱ عدد فلفل دلمه
                • ۱ پیمانه نخود فرنگی
                • ۱ قوطی شیر نارگیل
                • ادویه کاری
            """.trimIndent(),
            instructions = """
                ۱. سبزیجات را برش بزنید.
                ۲. پیاز و ادویه را تفت دهید.
                ۳. سبزیجات را اضافه کنید.
                ۴. شیر نارگیل اضافه کنید.
                ۵. ۲۰ دقیقه بپزید.
                ۶. با برنج سرو کنید.
            """.trimIndent(),
            mealType = "dinner",
            region = "rest_asia",
            source = Source.BUILTIN,
        ),
        RecipeEntity(
            title = "توفو سرخ‌شده",
            ingredients = """
                • ۳۰۰ گرم توفو
                • ۳ قاشق غذاخوری سس سویا
                • ۱ قاشق غذاخوری عسل گیاهی
                • ۲ حبه سیر
                • زنجبیل، کنجد
                • روغن
            """.trimIndent(),
            instructions = """
                ۱. توفو را مکعبی برش بزنید.
                ۲. در روغن سرخ کنید تا طلایی شود.
                ۳. سس سویا، عسل، سیر و زنجبیل را مخلوط کنید.
                ۴. به توفو اضافه کنید.
                ۵. ۵ دقیقه بپزید.
                ۶. با کنجد سرو کنید.
            """.trimIndent(),
            mealType = "dinner",
            region = "east_asia",
            source = Source.BUILTIN,
        ),
        RecipeEntity(
            title = "لازانیا سبزیجات",
            ingredients = """
                • ۱۲ ورق لازانیا
                • ۲ عدد کدو
                • ۱ عدد بادمجان
                • ۲ پیمانه سس گوجه
                • ۲ پیمانه سس بشامل
                • پنیر پارمزان
            """.trimIndent(),
            instructions = """
                ۱. سبزیجات را برش بزنید و گریل کنید.
                ۲. سس بشامل آماده کنید.
                ۳. در ظرف لایه‌لایه بچینید.
                ۴. در فر ۱۸۰ درجه بپزید.
                ۵. با پنیر پارمزان سرو کنید.
            """.trimIndent(),
            mealType = "dinner",
            region = "europe",
            source = Source.BUILTIN,
        ),
        RecipeEntity(
            title = "سوپ عدس و نارگیل",
            ingredients = """
                • ۱ پیمانه عدس قرمز
                • ۱ قوطی شیر نارگیل
                • ۱ عدد پیاز
                • ۲ حبه سیر
                • زردچوبه، زیره
                • گشنیز، لیمو
            """.trimIndent(),
            instructions = """
                ۱. پیاز و سیر را تفت دهید.
                ۲. ادویه اضافه کنید.
                ۳. عدس و آب اضافه کنید.
                ۴. ۲۰ دقیقه بپزید.
                ۵. شیر نارگیل اضافه کنید.
                ۶. با گشنیز و لیمو سرو کنید.
            """.trimIndent(),
            mealType = "dinner",
            region = "rest_asia",
            source = Source.BUILTIN,
        ),

        // ==================== دریایی ====================
        RecipeEntity(
            title = "سالمون گریل",
            ingredients = """
                • ۴ فیله سالمون
                • ۱ عدد لیمو
                • ۲ قاشق غذاخوری روغن زیتون
                • ۲ حبه سیر
                • شوید، نمک، فلفل
            """.trimIndent(),
            instructions = """
                ۱. سالمون را با لیمو، روغن، سیر و ادویه مزه‌دار کنید.
                ۲. ۳۰ دقیقه استراحت دهید.
                ۳. روی گریل بپزید (هر طرف ۴ دقیقه).
                ۴. با شوید و لیمو سرو کنید.
            """.trimIndent(),
            mealType = "dinner",
            region = "europe",
            source = Source.BUILTIN,
        ),
        RecipeEntity(
            title = "میگو سوته",
            ingredients = """
                • ۳۰۰ گرم میگو
                • ۳ حبه سیر
                • ۱ عدد فلفل قرمز
                • ۲ قاشق غذاخوری روغن زیتون
                • جعفری، لیمو
            """.trimIndent(),
            instructions = """
                ۱. سیر و فلفل را در روغن تفت دهید.
                ۲. میگو را اضافه کنید.
                ۳. ۵ دقیقه بپزید.
                ۴. جعفری و لیمو اضافه کنید.
                ۵. با نان سرو کنید.
            """.trimIndent(),
            mealType = "appetizer",
            region = "europe",
            source = Source.BUILTIN,
        ),
        RecipeEntity(
            title = "ماهی و چیپس مدرن",
            ingredients = """
                • ۴ فیله ماهی سفید
                • ۴ عدد سیب‌زمینی
                • ۱ پیمانه آرد
                • ۱ پیمانه آبجو
                • نمک، فلفل
                • سس تارتار
            """.trimIndent(),
            instructions = """
                ۱. سیب‌زمینی را سرخ کنید.
                ۲. آرد، آبجو، نمک و فلفل را مخلوط کنید.
                ۳. ماهی را در خمیر بزنید.
                ۴. در روغن داغ سرخ کنید.
                ۵. با سیب‌زمینی و سس تارتار سرو کنید.
            """.trimIndent(),
            mealType = "lunch",
            region = "europe",
            source = Source.BUILTIN,
        ),
        RecipeEntity(
            title = "سیویچه",
            ingredients = """
                • ۵۰۰ گرم ماهی سفید
                • ۱ عدد پیاز قرمز
                • ۱ عدد فلفل آخی
                • ۴ عدد لیمو
                • گشنیز، ذرت بوداده
            """.trimIndent(),
            instructions = """
                ۱. ماهی را مکعبی خرد کنید.
                ۲. آبلیمو، پیاز و فلفل اضافه کنید.
                ۳. ۱۵ دقیقه در یخچال بگذارید.
                ۴. با گشنیز و ذرت سرو کنید.
            """.trimIndent(),
            mealType = "appetizer",
            region = "americas",
            source = Source.BUILTIN,
        ),
        RecipeEntity(
            title = "کباب ماهی مراکشی",
            ingredients = """
                • ۵۰۰ گرم ماهی
                • ۱ دسته گشنیز
                • ۴ حبه سیر
                • ۱ عدد لیمو
                • زیره، پاپریکا
                • روغن زیتون
            """.trimIndent(),
            instructions = """
                ۱. گشنیز، سیر، لیمو و ادویه را مخلوط کنید.
                ۲. ماهی را در سس بخیسانید.
                ۳. ۱ ساعت استراحت دهید.
                ۴. روی گریل کباب کنید.
                ۵. با سس سرو کنید.
            """.trimIndent(),
            mealType = "dinner",
            region = "africa",
            source = Source.BUILTIN,
        ),

        // ==================== پیش‌غذاهای مدرن ====================
        RecipeEntity(
            title = "سیب‌زمینی پنیری",
            ingredients = """
                • ۴ عدد سیب‌زمینی
                • ۲۰۰ گرم پنیر چدار
                • ۱۰۰ گرم خامه
                • ۲ حبه سیر
                • پیازچه
            """.trimIndent(),
            instructions = """
                ۱. سیب‌زمینی را برش بزنید.
                ۲. با خامه، سیر و پنیر مخلوط کنید.
                ۳. در ظرف بریزید.
                ۴. در فر ۱۸۰ درجه بپزید.
                ۵. با پیازچه سرو کنید.
            """.trimIndent(),
            mealType = "appetizer",
            region = "europe",
            source = Source.BUILTIN,
        ),
        RecipeEntity(
            title = "ناچوز گوشتی",
            ingredients = """
                • ۱ بسته چیپس تورتیلا
                • ۳۰۰ گرم گوشت چرخ‌کرده
                • ۲۰۰ گرم پنیر چدار
                • ۱ پیمانه لوبیا
                • خامه، سالسا، آووکادو
            """.trimIndent(),
            instructions = """
                ۱. گوشت را با ادویه تفت دهید.
                ۲. چیپس‌ها را در سینی بریزید.
                ۳. گوشت، لوبیا و پنیر بپاشید.
                ۴. در فر بپزید تا پنیر ذوب شود.
                ۵. با خامه، سالسا و آووکادو سرو کنید.
            """.trimIndent(),
            mealType = "appetizer",
            region = "americas",
            source = Source.BUILTIN,
        ),
        RecipeEntity(
            title = "دیپ اسفناج و پنیر",
            ingredients = """
                • ۵۰۰ گرم اسفناج
                • ۲۰۰ گرم پنیر خامه‌ای
                • ۱۰۰ گرم پنیر پارمزان
                • ۲ حبه سیر
                • خامه، نمک، فلفل
            """.trimIndent(),
            instructions = """
                ۱. اسفناج را بپزید و آبش را بگیرید.
                ۲. سیر را تفت دهید.
                ۳. پنیر خامه‌ای و پارمزان اضافه کنید.
                ۴. اسفناج را اضافه کنید.
                ۵. در فر بپزید تا طلایی شود.
                ۶. با نان سرو کنید.
            """.trimIndent(),
            mealType = "appetizer",
            region = "europe",
            source = Source.BUILTIN,
        ),
        RecipeEntity(
            title = "بروسکتا آووکادو",
            ingredients = """
                • ۱ عدد نان ایتالیایی
                • ۲ عدد آووکادو
                • ۱ عدد گوجه‌فرنگی
                • ۱ عدد لیمو
                • ریحان، روغن زیتون
            """.trimIndent(),
            instructions = """
                ۱. نان را تست کنید.
                ۲. آووکادو را له کنید.
                ۳. آبلیمو، نمک و فلفل اضافه کنید.
                ۴. روی نان بمالید.
                ۵. گوجه و ریحان اضافه کنید.
                ۶. با روغن زیتون سرو کنید.
            """.trimIndent(),
            mealType = "appetizer",
            region = "europe",
            source = Source.BUILTIN,
        ),
        RecipeEntity(
            title = "کروکت سیب‌زمینی",
            ingredients = """
                • ۴ عدد سیب‌زمینی
                • ۱۰۰ گرم پنیر
                • ۱ عدد تخم‌مرغ
                • ۱ پیمانه آرد سوخاری
                • ادویه، نمک
                • روغن
            """.trimIndent(),
            instructions = """
                ۱. سیب‌زمینی را بپزید و له کنید.
                ۲. پنیر و ادویه اضافه کنید.
                ۳. به شکل استوانه درآورید.
                ۴. در تخم‌مرغ و آرد سوخاری بزنید.
                ۵. در روغن داغ سرخ کنید.
                ۶. با سس سرو کنید.
            """.trimIndent(),
            mealType = "appetizer",
            region = "europe",
            source = Source.BUILTIN,
        ),

        // ==================== دسرهای مدرن ====================
        RecipeEntity(
            title = "ماگ کیک شکلاتی",
            ingredients = """
                • ۴ قاشق غذاخوری آرد
                • ۲ قاشق غذاخوری پودر کاکائو
                • ۳ قاشق غذاخوری شکر
                • ۳ قاشق غذاخوری شیر
                • ۲ قاشق غذاخوری روغن
                • بیکینگ پودر
            """.trimIndent(),
            instructions = """
                ۱. همه مواد را در ماگ مخلوط کنید.
                ۲. ۲ دقیقه در مایکروویو بپزید.
                ۳. بگذارید کمی سرد شود.
                ۴. با خامه یا بستنی سرو کنید.
            """.trimIndent(),
            mealType = "dessert",
            region = "americas",
            source = Source.BUILTIN,
        ),
        RecipeEntity(
            title = "چیزکیک بدون پخت",
            ingredients = """
                • ۲۰۰ گرم بیسکویت
                • ۱۰۰ گرم کره
                • ۴۰۰ گرم خامه پنیر
                • ۱ پیمانه شکر
                • ۱ پیمانه خامه
                • وانیل، ژلاتین
            """.trimIndent(),
            instructions = """
                ۱. بیسکویت و کره را مخلوط کنید.
                ۲. در قالب پهن کنید.
                ۳. خامه پنیر، شکر، خامه و وانیل را مخلوط کنید.
                ۴. ژلاتین حل‌شده اضافه کنید.
                ۵. روی بیسکویت بریزید.
                ۶. ۴ ساعت در یخچال بگذارید.
            """.trimIndent(),
            mealType = "dessert",
            region = "americas",
            source = Source.BUILTIN,
        ),
        RecipeEntity(
            title = "براونی ماگ",
            ingredients = """
                • ۴ قاشق غذاخوری آرد
                • ۳ قاشق غذاخوری پودر کاکائو
                • ۴ قاشق غذاخوری شکر
                • ۱ عدد تخم‌مرغ
                • ۳ قاشق غذاخوری روغن
                • شکلات چیپسی
            """.trimIndent(),
            instructions = """
                ۱. همه مواد را در ماگ مخلوط کنید.
                ۲. شکلات چیپسی بپاشید.
                ۳. ۹۰ ثانیه در مایکروویو بپزید.
                ۴. با بستنی سرو کنید.
            """.trimIndent(),
            mealType = "dessert",
            region = "americas",
            source = Source.BUILTIN,
        ),
        RecipeEntity(
            title = "اسموتی انبه و نارگیل",
            ingredients = """
                • ۲ عدد انبه
                • ۱ پیمانه شیر نارگیل
                • ۱ عدد موز
                • ۲ قاشق غذاخوری عسل
                • یخ
            """.trimIndent(),
            instructions = """
                ۱. همه مواد را در مخلوط‌کن بریزید.
                ۲. پوره کنید تا صاف شود.
                ۳. در لیوان بریزید.
                ۴. با یخ سرو کنید.
            """.trimIndent(),
            mealType = "snack",
            region = "rest_asia",
            source = Source.BUILTIN,
        ),
        RecipeEntity(
            title = "پودینگ چیا",
            ingredients = """
                • نصف پیمانه دانه چیا
                • ۲ پیمانه شیر
                • ۲ قاشق غذاخوری عسل
                • وانیل
                • میوه‌های تازه
            """.trimIndent(),
            instructions = """
                ۱. دانه چیا، شیر، عسل و وانیل را مخلوط کنید.
                ۲. ۴ ساعت در یخچال بگذارید.
                ۳. هم بزنید تا یکدست شود.
                ۴. با میوه‌های تازه سرو کنید.
            """.trimIndent(),
            mealType = "dessert",
            region = "americas",
            source = Source.BUILTIN,
        ),
        RecipeEntity(
            title = "بستنی خانگی وانیل",
            ingredients = """
                • ۲ پیمانه خامه
                • ۱ پیمانه شیر
                • نصف پیمانه شکر
                • ۱ قاشق چای‌خوری وانیل
                • ۴ عدد زرده تخم‌مرغ
            """.trimIndent(),
            instructions = """
                ۱. خامه، شیر و شکر را گرم کنید.
                ۲. زرده‌ها را هم بزنید و اضافه کنید.
                ۳. وانیل اضافه کنید.
                ۴. در دستگاه بستنی‌ساز بریزید.
                ۵. ۳۰ دقیقه بزنید.
                ۶. در فریزر بگذارید.
            """.trimIndent(),
            mealType = "dessert",
            region = "europe",
            source = Source.BUILTIN,
        ),
        RecipeEntity(
            title = "دونات",
            ingredients = """
                • ۳ پیمانه آرد
                • ۱ قاشق غذاخوری خمیرمایه
                • نصف پیمانه شکر
                • ۱ عدد تخم‌مرغ
                • ۱ پیمانه شیر
                • روغن برای سرخ کردن
                • شکلات ذوب‌شده
            """.trimIndent(),
            instructions = """
                ۱. خمیرمایه، شکر و شیر را مخلوط کنید.
                ۲. آرد و تخم‌مرغ اضافه کنید.
                ۳. خمیر را ورز دهید.
                ۴. ۱ ساعت استراحت دهید.
                ۵. حلقه‌های کوچک درست کنید.
                ۶. در روغن داغ سرخ کنید.
                ۷. در شکلات ذوب‌شده بزنید.
            """.trimIndent(),
            mealType = "dessert",
            region = "americas",
            source = Source.BUILTIN,
        ),
        RecipeEntity(
            title = "چوروس شکلاتی",
            ingredients = """
                • ۱ پیمانه آرد
                • ۱ پیمانه آب
                • ۲ قاشق غذاخوری کره
                • نمک، شکر
                • شکلات داغ
            """.trimIndent(),
            instructions = """
                ۱. آب و کره را بجوشانید.
                ۲. آرد را اضافه کنید و هم بزنید.
                ۳. خمیر را در قیف بریزید.
                ۴. در روغن داغ سرخ کنید.
                ۵. در شکر و دارچین بزنید.
                ۶. با شکلات داغ سرو کنید.
            """.trimIndent(),
            mealType = "dessert",
            region = "europe",
            source = Source.BUILTIN,
        ),
        RecipeEntity(
            title = "کیک لیوانی لیمو",
            ingredients = """
                • ۱ پیمانه آرد
                • ۱ پیمانه شکر
                • ۲ عدد تخم‌مرغ
                • نصف پیمانه روغن
                • آبلیمو، پوست لیمو
                • بیکینگ پودر
            """.trimIndent(),
            instructions = """
                ۱. تخم‌مرغ و شکر را بزنید.
                ۲. روغن و آبلیمو اضافه کنید.
                ۳. آرد و بیکینگ پودر اضافه کنید.
                ۴. در لیوان‌های کاغذی بریزید.
                ۵. در فر ۱۸۰ درجه بپزید.
            """.trimIndent(),
            mealType = "dessert",
            region = "europe",
            source = Source.BUILTIN,
        ),
    )
}