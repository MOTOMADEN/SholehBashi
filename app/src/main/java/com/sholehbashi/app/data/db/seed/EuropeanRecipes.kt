package com.sholehbashi.app.data.db.seed

import com.sholehbashi.app.data.Source
import com.sholehbashi.app.data.db.RecipeEntity

object EuropeanRecipes {
    val all: List<RecipeEntity> = listOf(
        // ==================== ایتالیا — صبحانه ====================
        RecipeEntity(
            title = "کروسان",
            ingredients = """
                • ۵۰۰ گرم خمیر هزارلا
                • ۲۰۰ گرم کره
                • ۱ عدد تخم‌مرغ
                • شکر، نمک
            """.trimIndent(),
            instructions = """
                ۱. خمیر را با کره لایه‌لایه کنید.
                ۲. به شکل مثلث برش بزنید.
                ۳. رول کنید.
                ۴. با تخم‌مرغ رومال کنید.
                ۵. در فر ۱۸۰ درجه بپزید.
                ۶. با قهوه یا چای سرو کنید.
            """.trimIndent(),
            mealType = "breakfast",
            region = "europe",
            source = Source.BUILTIN,
        ),
        RecipeEntity(
            title = "فریتاتا",
            ingredients = """
                • ۶ عدد تخم‌مرغ
                • ۲ عدد سیب‌زمینی
                • ۱ عدد پیاز
                • ۱۰۰ گرم پنیر
                • سبزیجات تازه
                • روغن زیتون
            """.trimIndent(),
            instructions = """
                ۱. سیب‌زمینی را نگینی خرد و سرخ کنید.
                ۲. پیاز را تفت دهید.
                ۳. تخم‌مرغ‌ها را هم بزنید و بریزید.
                ۴. پنیر و سبزیجات را اضافه کنید.
                ۵. در فر یا تابه بپزید.
                ۶. برش بزنید و سرو کنید.
            """.trimIndent(),
            mealType = "breakfast",
            region = "europe",
            source = Source.BUILTIN,
        ),
        RecipeEntity(
            title = "بریوش",
            ingredients = """
                • ۳ پیمانه آرد
                • ۳ عدد تخم‌مرغ
                • ۱ پیمانه کره
                • ۱ پیمانه شیر
                • ۱ قاشق غذاخوری خمیرمایه
                • شکر، نمک
            """.trimIndent(),
            instructions = """
                ۱. خمیرمایه را در شیر گرم حل کنید.
                ۲. آرد، تخم‌مرغ، شکر و نمک را اضافه کنید.
                ۳. کره را اضافه کنید و ورز دهید.
                ۴. ۲ ساعت استراحت دهید.
                ۵. در قالب بریزید.
                ۶. در فر ۱۸۰ درجه بپزید.
            """.trimIndent(),
            mealType = "breakfast",
            region = "europe",
            source = Source.BUILTIN,
        ),

        // ==================== ایتالیا — ناهار و شام ====================
        RecipeEntity(
            title = "پاستا کاربونارا",
            ingredients = """
                • ۲۰۰ گرم اسپاگتی
                • ۱۰۰ گرم بیکن
                • ۲ عدد تخم‌مرغ
                • ۵۰ گرم پنیر پارمزان
                • فلفل سیاه
                • نمک
            """.trimIndent(),
            instructions = """
                ۱. پاستا را در آب نمک بپزید.
                ۲. بیکن را سرخ کنید.
                ۳. تخم‌مرغ و پنیر را مخلوط کنید.
                ۴. پاستا را با بیکن مخلوط کنید.
                ۵. سس تخم‌مرغ را اضافه کنید و سریع هم بزنید.
                ۶. با فلفل سیاه سرو کنید.
            """.trimIndent(),
            mealType = "dinner",
            region = "europe",
            source = Source.BUILTIN,
        ),
        RecipeEntity(
            title = "پیتزا مارگاریتا",
            ingredients = """
                • ۵۰۰ گرم خمیر پیتزا
                • ۱ پیمانه سس گوجه
                • ۲۰۰ گرم پنیر موزارلا
                • برگ ریحان تازه
                • روغن زیتون
                • نمک
            """.trimIndent(),
            instructions = """
                ۱. خمیر را پهن کنید.
                ۲. سس گوجه را روی آن بمالید.
                ۳. پنیر موزارلا را اضافه کنید.
                ۴. در فر ۲۵۰ درجه بپزید (۱۰-۱۲ دقیقه).
                ۵. با ریحان و روغن زیتون سرو کنید.
            """.trimIndent(),
            mealType = "dinner",
            region = "europe",
            source = Source.BUILTIN,
        ),
        RecipeEntity(
            title = "لازانیا",
            ingredients = """
                • ۱۲ ورق لازانیا
                • ۵۰۰ گرم گوشت چرخ‌کرده
                • ۲ پیمانه سس گوجه
                • ۲ پیمانه سس بشامل
                • ۲۰۰ گرم پنیر پارمزان
                • پیاز، سیر، ادویه
            """.trimIndent(),
            instructions = """
                ۱. گوشت را با پیاز و سیر تفت دهید.
                ۲. سس گوجه اضافه کنید.
                ۳. سس بشامل را آماده کنید.
                ۴. در ظرف لایه‌لایه بچینید.
                ۵. در فر ۱۸۰ درجه بپزید (۳۰ دقیقه).
                ۶. با پنیر پارمزان سرو کنید.
            """.trimIndent(),
            mealType = "dinner",
            region = "europe",
            source = Source.BUILTIN,
        ),
        RecipeEntity(
            title = "ریزوتو قارچ",
            ingredients = """
                • ۲ پیمانه برنج آربوریو
                • ۳۰۰ گرم قارچ
                • ۱ عدد پیاز
                • ۲ حبه سیر
                • ۱ لیتر آب مرغ
                • پنیر پارمزان، کره
            """.trimIndent(),
            instructions = """
                ۱. پیاز و سیر را تفت دهید.
                ۲. قارچ را اضافه کنید.
                ۳. برنج را اضافه کنید.
                ۴. آب مرغ را آرام اضافه کنید و هم بزنید.
                ۵. ۲۰ دقیقه بپزید.
                ۶. کره و پنیر اضافه کنید.
                ۷. سرو کنید.
            """.trimIndent(),
            mealType = "dinner",
            region = "europe",
            source = Source.BUILTIN,
        ),
        RecipeEntity(
            title = "فتوچینی آلفردو",
            ingredients = """
                • ۲۰۰ گرم فتوچینی
                • ۱ پیمانه خامه
                • ۱۰۰ گرم پنیر پارمزان
                • ۲ حبه سیر
                • ۱۰۰ گرم کره
                • فلفل سیاه
            """.trimIndent(),
            instructions = """
                ۱. فتوچینی را بپزید.
                ۲. سیر را در کره تفت دهید.
                ۳. خامه را اضافه کنید.
                ۴. پنیر را اضافه کنید.
                ۵. فتوچینی را اضافه کنید.
                ۶. با فلفل سیاه سرو کنید.
            """.trimIndent(),
            mealType = "dinner",
            region = "europe",
            source = Source.BUILTIN,
        ),
        RecipeEntity(
            title = "راویولی",
            ingredients = """
                • ۳۰۰ گرم خمیر راویولی
                • ۲۵۰ گرم پنیر ریکوتا
                • ۱ عدد تخم‌مرغ
                • اسفناج
                • سس گوجه یا کره
                • پارمزان
            """.trimIndent(),
            instructions = """
                ۱. پنیر، تخم‌مرغ و اسفناج را مخلوط کنید.
                ۲. در خمیر بپیچید.
                ۳. در آب جوش بپزید.
                ۴. با سس گوجه یا کره سرو کنید.
                ۵. پارمزان روی آن بریزید.
            """.trimIndent(),
            mealType = "dinner",
            region = "europe",
            source = Source.BUILTIN,
        ),
        RecipeEntity(
            title = "مینسترونه",
            ingredients = """
                • ۱ پیمانه لوبیا
                • ۱ عدد پیاز
                • ۲ عدد هویج
                • ۲ عدد کرفس
                • ۲ عدد گوجه‌فرنگی
                • ۲۰۰ گرم ماکارونی کوچک
                • آب مرغ
            """.trimIndent(),
            instructions = """
                ۱. پیاز، هویج و کرفس را تفت دهید.
                ۲. گوجه را اضافه کنید.
                ۳. لوبیا و آب مرغ را اضافه کنید.
                ۴. ۳۰ دقیقه بپزید.
                ۵. ماکارونی را اضافه کنید.
                ۶. ۱۰ دقیقه دیگر بپزید.
                ۷. با پارمزان سرو کنید.
            """.trimIndent(),
            mealType = "lunch",
            region = "europe",
            source = Source.BUILTIN,
        ),
        RecipeEntity(
            title = "بروسکتا",
            ingredients = """
                • ۱ عدد نان ایتالیایی
                • ۳ عدد گوجه‌فرنگی
                • ۲ حبه سیر
                • ریحان تازه
                • روغن زیتون
                • نمک، فلفل
            """.trimIndent(),
            instructions = """
                ۱. نان را برش بزنید و تست کنید.
                ۲. گوجه‌ها را ریز خرد کنید.
                ۳. سیر را رنده کنید.
                ۴. همه را با روغن زیتون مخلوط کنید.
                ۵. روی نان تست بریزید.
                ۶. با ریحان سرو کنید.
            """.trimIndent(),
            mealType = "appetizer",
            region = "europe",
            source = Source.BUILTIN,
        ),
        RecipeEntity(
            title = "کاپاچینو و بیسکوتی",
            ingredients = """
                • ۲ فنجان قهوه اسپرسو
                • ۱ پیمانه شیر
                • ۲۰۰ گرم بیسکوتی
                • پودر کاکائو
            """.trimIndent(),
            instructions = """
                ۱. اسپرسو را در فنجان بریزید.
                ۲. شیر را بخارپز کنید.
                ۳. شیر را روی قهوه بریزید.
                ۴. با پودر کاکائو تزیین کنید.
                ۵. با بیسکوتی سرو کنید.
            """.trimIndent(),
            mealType = "snack",
            region = "europe",
            source = Source.BUILTIN,
        ),

        // ==================== فرانسه ====================
        RecipeEntity(
            title = "کرپ",
            ingredients = """
                • ۱ پیمانه آرد
                • ۲ عدد تخم‌مرغ
                • ۱ پیمانه شیر
                • ۲ قاشق غذاخوری شکر
                • کره
                • پرکننده: شکلات، موز، توت‌فرنگی
            """.trimIndent(),
            instructions = """
                ۱. آرد، تخم‌مرغ، شیر و شکر را مخلوط کنید.
                ۲. تابه را گرم کنید و کره بزنید.
                ۳. از مخلوط در تابه بریزید و پهن کنید.
                ۴. دو طرف را بپزید.
                ۵. با شکلات، موز یا توت سرو کنید.
            """.trimIndent(),
            mealType = "breakfast",
            region = "europe",
            source = Source.BUILTIN,
        ),
        RecipeEntity(
            title = "اوملت فرانسوی",
            ingredients = """
                • ۳ عدد تخم‌مرغ
                • ۱ قاشق غذاخوری کره
                • ۱ قاشق غذاخوری خامه
                • نمک، فلفل
                • سبزیجات تازه
            """.trimIndent(),
            instructions = """
                ۱. تخم‌مرغ‌ها را با خامه، نمک و فلفل مخلوط کنید.
                ۲. کره را در تابه ذوب کنید.
                ۳. مخلوط را بریزید.
                ۴. با چنگال هم بزنید تا بپزد.
                ۵. سبزیجات را وسط آن بگذارید.
                ۶. تا کنید و سرو کنید.
            """.trimIndent(),
            mealType = "breakfast",
            region = "europe",
            source = Source.BUILTIN,
        ),
        RecipeEntity(
            title = "کیش لورن",
            ingredients = """
                • ۱ عدد خمیر پای
                • ۲۰۰ گرم بیکن
                • ۳ عدد تخم‌مرغ
                • ۱ پیمانه خامه
                • ۱۰۰ گرم پنیر گرویر
                • نمک، فلفل
            """.trimIndent(),
            instructions = """
                ۱. خمیر را در قالب پهن کنید.
                ۲. بیکن را سرخ کنید.
                ۳. تخم‌مرغ، خامه و پنیر را مخلوط کنید.
                ۴. بیکن را اضافه کنید.
                ۵. روی خمیر بریزید.
                ۶. در فر ۱۸۰ درجه بپزید (۳۰ دقیقه).
            """.trimIndent(),
            mealType = "breakfast",
            region = "europe",
            source = Source.BUILTIN,
        ),
        RecipeEntity(
            title = "راتاتویی",
            ingredients = """
                • ۱ عدد بادمجان
                • ۲ عدد کدو
                • ۲ عدد فلفل دلمه
                • ۴ عدد گوجه‌فرنگی
                • ۱ عدد پیاز
                • سبزیجات پروانس، روغن زیتون
            """.trimIndent(),
            instructions = """
                ۱. همه سبزیجات را برش بزنید.
                ۲. پیاز را تفت دهید.
                ۳. سبزیجات را لایه‌لایه بچینید.
                ۴. ادویه و روغن زیتون اضافه کنید.
                ۵. ۴۵ دقیقه بپزید.
                ۶. گرم یا سرد سرو کنید.
            """.trimIndent(),
            mealType = "dinner",
            region = "europe",
            source = Source.BUILTIN,
        ),
        RecipeEntity(
            title = "کاسوله",
            ingredients = """
                • ۵۰۰ گرم گوشت گوسفندی
                • ۱ پیمانه لوبیا سفید
                • ۱ عدد پیاز
                • ۲ عدد هویج
                • ۲ عدد گوجه‌فرنگی
                • آب مرغ، ادویه
            """.trimIndent(),
            instructions = """
                ۱. لوبیا را از شب قبل خیس کنید.
                ۲. گوشت را با پیاز تفت دهید.
                ۳. هویج و گوجه را اضافه کنید.
                ۴. لوبیا و آب مرغ را اضافه کنید.
                ۵. ۲ ساعت بپزید.
                ۶. با نان سرو کنید.
            """.trimIndent(),
            mealType = "dinner",
            region = "europe",
            source = Source.BUILTIN,
        ),
        RecipeEntity(
            title = "بوفر بورگینیون",
            ingredients = """
                • ۵۰۰ گرم گوشت گاو
                • ۲ عدد پیاز
                • ۲ عدد هویج
                • ۲ پیمانه شراب قرمز
                • ۱ پیمانه آب مرغ
                • قارچ، بیکن
            """.trimIndent(),
            instructions = """
                ۱. گوشت را تفت دهید.
                ۲. پیاز، هویج و بیکن را اضافه کنید.
                ۳. شراب قرمز را اضافه کنید.
                ۴. آب مرغ اضافه کنید.
                ۵. ۲ ساعت با حرارت کم بپزید.
                ۶. قارچ را اضافه کنید.
                ۷. ۳۰ دقیقه دیگر بپزید.
            """.trimIndent(),
            mealType = "dinner",
            region = "europe",
            source = Source.BUILTIN,
        ),
        RecipeEntity(
            title = "کروک مسیو",
            ingredients = """
                • ۴ برش نان تست
                • ۲۰۰ گرم ژامبون
                • ۲۰۰ گرم پنیر گرویر
                • ۲ قاشق غذاخوری کره
                • ۲ قاشق غذاخوری آرد
                • ۱ پیمانه شیر
            """.trimIndent(),
            instructions = """
                ۱. سس بشامل را آماده کنید.
                ۲. نان را تست کنید.
                ۳. ژامبون و پنیر را لایه‌لایه بچینید.
                ۴. سس بشامل روی آن بریزید.
                ۵. پنیر بیشتری اضافه کنید.
                ۶. در فر گریل کنید تا طلایی شود.
            """.trimIndent(),
            mealType = "lunch",
            region = "europe",
            source = Source.BUILTIN,
        ),
        RecipeEntity(
            title = "نیسواز سالاد",
            ingredients = """
                • ۱ عدد کاهو
                • ۲ عدد گوجه‌فرنگی
                • ۱ عدد خیار
                • ۱ عدد فلفل دلمه
                • ۲ عدد تخم‌مرغ آب‌پز
                • ۱۰۰ گرم تن ماهی
                • زیتون، روغن زیتون
            """.trimIndent(),
            instructions = """
                ۱. سبزیجات را خرد کنید.
                ۲. تخم‌مرغ و تن ماهی را اضافه کنید.
                ۳. زیتون اضافه کنید.
                ۴. با روغن زیتون سرو کنید.
            """.trimIndent(),
            mealType = "salad",
            region = "europe",
            source = Source.BUILTIN,
        ),
        RecipeEntity(
            title = "کریم بروله",
            ingredients = """
                • ۲ پیمانه خامه
                • ۴ عدد زرده تخم‌مرغ
                • نصف پیمانه شکر
                • وانیل
                • شکر برای کارامل
            """.trimIndent(),
            instructions = """
                ۱. خامه را گرم کنید.
                ۲. زرده و شکر را مخلوط کنید.
                ۳. خامه را اضافه کنید.
                ۴. در قالب بریزید.
                ۵. در فر بن‌ماری بپزید.
                ۶. با شکر کاراملی سرو کنید.
            """.trimIndent(),
            mealType = "dessert",
            region = "europe",
            source = Source.BUILTIN,
        ),
        RecipeEntity(
            title = "ماکارون",
            ingredients = """
                • ۲ پیمانه پودر بادام
                • ۲ پیمانه پودر قند
                • ۳ عدد سفیده تخم‌مرغ
                • نصف پیمانه شکر
                • رنگ خوراکی
                • پرکننده: شکلات یا مربا
            """.trimIndent(),
            instructions = """
                ۱. پودر بادام و پودر قند را مخلوط کنید.
                ۲. سفیده را با شکر بزنید.
                ۳. مخلوط را اضافه کنید.
                ۴. در قیف بریزید.
                ۵. در سینی بچینید.
                ۶. ۳۰ دقیقه استراحت دهید.
                ۷. در فر ۱۵۰ درجه بپزید.
                ۸. با پرکننده سرو کنید.
            """.trimIndent(),
            mealType = "dessert",
            region = "europe",
            source = Source.BUILTIN,
        ),
        RecipeEntity(
            title = "تارت تاتن",
            ingredients = """
                • ۶ عدد سیب
                • ۱ پیمانه شکر
                • ۱۰۰ گرم کره
                • ۱ عدد خمیر هزارلا
                • دارچین
            """.trimIndent(),
            instructions = """
                ۱. شکر و کره را در تابه کاراملی کنید.
                ۲. سیب‌ها را لایه‌لایه بچینید.
                ۳. خمیر را روی آن بگذارید.
                ۴. در فر ۱۸۰ درجه بپزید.
                ۵. برگردانید و سرو کنید.
            """.trimIndent(),
            mealType = "dessert",
            region = "europe",
            source = Source.BUILTIN,
        ),

        // ==================== یونان ====================
        RecipeEntity(
            title = "موساکا",
            ingredients = """
                • ۲ عدد بادمجان
                • ۵۰۰ گرم گوشت چرخ‌کرده
                • ۲ عدد سیب‌زمینی
                • ۲ پیمانه سس بشامل
                • ۱ عدد پیاز
                • دارچین، ادویه
            """.trimIndent(),
            instructions = """
                ۱. بادمجان و سیب‌زمینی را سرخ کنید.
                ۲. گوشت را با پیاز و ادویه تفت دهید.
                ۳. سس بشامل را آماده کنید.
                ۴. در ظرف لایه‌لایه بچینید.
                ۵. در فر ۱۸۰ درجه بپزید.
                ۶. برش بزنید و سرو کنید.
            """.trimIndent(),
            mealType = "dinner",
            region = "europe",
            source = Source.BUILTIN,
        ),
        RecipeEntity(
            title = "سوولاکی",
            ingredients = """
                • ۵۰۰ گرم گوشت گوسفندی
                • ۲ قاشق غذاخوری روغن زیتون
                • ۲ قاشق غذاخوری آبلیمو
                • ۲ حبه سیر
                • اورگانو، نمک، فلفل
                • نان پیتا
            """.trimIndent(),
            instructions = """
                ۱. گوشت را مکعبی خرد کنید.
                ۲. با روغن زیتون، آبلیمو، سیر و ادویه مزه‌دار کنید.
                ۳. ۲ ساعت استراحت دهید.
                ۴. به سیخ بکشید و کباب کنید.
                ۵. در نان پیتا با سبزی و سس سرو کنید.
            """.trimIndent(),
            mealType = "dinner",
            region = "europe",
            source = Source.BUILTIN,
        ),
        RecipeEntity(
            title = "یونانی سالاد",
            ingredients = """
                • ۲ عدد گوجه‌فرنگی
                • ۱ عدد خیار
                • ۱ عدد پیاز قرمز
                • ۱۰۰ گرم پنیر فتا
                • زیتون
                • روغن زیتون، اورگانو
            """.trimIndent(),
            instructions = """
                ۱. سبزیجات را خرد کنید.
                ۲. پنیر فتا و زیتون را اضافه کنید.
                ۳. با روغن زیتون و اورگانو سرو کنید.
            """.trimIndent(),
            mealType = "salad",
            region = "europe",
            source = Source.BUILTIN,
        ),
        RecipeEntity(
            title = "اسپاناکوپیتا",
            ingredients = """
                • ۵۰۰ گرم خمیر یوفکا
                • ۵۰۰ گرم اسفناج
                • ۲۰۰ گرم پنیر فتا
                • ۱ عدد پیاز
                • ۲ عدد تخم‌مرغ
                • کره ذوب‌شده
            """.trimIndent(),
            instructions = """
                ۱. اسفناج را بپزید و آبش را بگیرید.
                ۲. پیاز را تفت دهید.
                ۳. پنیر و تخم‌مرغ را اضافه کنید.
                ۴. خمیر را لایه‌لایه با کره بچینید.
                ۵. مواد را وسط آن بگذارید.
                ۶. در فر ۱۸۰ درجه بپزید.
            """.trimIndent(),
            mealType = "appetizer",
            region = "europe",
            source = Source.BUILTIN,
        ),
        RecipeEntity(
            title = "تزاتزیکی",
            ingredients = """
                • ۱ پیمانه ماست
                • ۱ عدد خیار
                • ۲ حبه سیر
                • روغن زیتون
                • نعنا، نمک
            """.trimIndent(),
            instructions = """
                ۱. خیار را رنده کنید و آبش را بگیرید.
                ۲. با ماست و سیر مخلوط کنید.
                ۳. روغن زیتون و نعنا اضافه کنید.
                ۴. سرد سرو کنید.
            """.trimIndent(),
            mealType = "appetizer",
            region = "europe",
            source = Source.BUILTIN,
        ),
        RecipeEntity(
            title = "بaklava یونانی",
            ingredients = """
                • ۵۰۰ گرم خمیر یوفکا
                • ۲ پیمانه گردو
                • ۱ پیمانه کره
                • ۲ پیمانه شکر
                • ۱ پیمانه آب
                • عسل، دارچین
            """.trimIndent(),
            instructions = """
                ۱. خمیر را لایه‌لایه با کره بچینید.
                ۲. گردو و دارچین را بپاشید.
                ۳. در فر ۱۸۰ درجه بپزید.
                ۴. شربت شکر، آب و عسل را بجوشانید.
                ۵. روی باکلاوا بریزید.
            """.trimIndent(),
            mealType = "dessert",
            region = "europe",
            source = Source.BUILTIN,
        ),
        RecipeEntity(
            title = "لوکومادس",
            ingredients = """
                • ۱ پیمانه آرد
                • ۱ پیمانه آب
                • ۱ قاشق چای‌خوری خمیرمایه
                • روغن برای سرخ کردن
                • عسل، دارچین
            """.trimIndent(),
            instructions = """
                ۱. خمیر را درست کنید و ۱ ساعت استراحت دهید.
                ۲. به توپ‌های کوچک درآورید.
                ۳. در روغن داغ سرخ کنید.
                ۴. با عسل و دارچین سرو کنید.
            """.trimIndent(),
            mealType = "dessert",
            region = "europe",
            source = Source.BUILTIN,
        ),

        // ==================== اسپانیا ====================
        RecipeEntity(
            title = "پائیا",
            ingredients = """
                • ۲ پیمانه برنج
                • ۲۰۰ گرم میگو
                • ۲۰۰ گرم صدف
                • ۲۰۰ گرم مرغ
                • زعفران، فلفل دلمه، پیاز
                • آب مرغ
            """.trimIndent(),
            instructions = """
                ۱. پیاز و فلفل را تفت دهید.
                ۲. مرغ را اضافه کنید.
                ۳. برنج را اضافه کنید.
                ۴. آب مرغ و زعفران اضافه کنید.
                ۵. میگو و صدف را اضافه کنید.
                ۶. بگذارید بپزد (۲۰ دقیقه).
                ۷. با لیمو سرو کنید.
            """.trimIndent(),
            mealType = "lunch",
            region = "europe",
            source = Source.BUILTIN,
        ),
        RecipeEntity(
            title = "گاسپاچو",
            ingredients = """
                • ۴ عدد گوجه‌فرنگی رسیده
                • ۱ عدد خیار
                • ۱ عدد فلفل دلمه
                • ۱ عدد پیاز
                • ۲ حبه سیر
                • روغن زیتون، سرکه
            """.trimIndent(),
            instructions = """
                ۱. همه سبزیجات را خرد کنید.
                ۲. در مخلوط‌کن بریزید.
                ۳. روغن زیتون و سرکه اضافه کنید.
                ۴. پوره کنید.
                ۵. در یخچال بگذارید.
                ۶. سرد سرو کنید.
            """.trimIndent(),
            mealType = "appetizer",
            region = "europe",
            source = Source.BUILTIN,
        ),
        RecipeEntity(
            title = "تورتيا اسپانیایی",
            ingredients = """
                • ۶ عدد تخم‌مرغ
                • ۴ عدد سیب‌زمینی
                • ۱ عدد پیاز
                • روغن زیتون
                • نمک
            """.trimIndent(),
            instructions = """
                ۱. سیب‌زمینی را برش بزنید و سرخ کنید.
                ۲. پیاز را تفت دهید.
                ۳. تخم‌مرغ‌ها را هم بزنید.
                ۴. سیب‌زمینی و پیاز را اضافه کنید.
                ۵. در تابه بپزید.
                ۶. برگردانید و دو طرف را بپزید.
            """.trimIndent(),
            mealType = "breakfast",
            region = "europe",
            source = Source.BUILTIN,
        ),
        RecipeEntity(
            title = "چورو",
            ingredients = """
                • ۱ پیمانه آرد
                • ۱ پیمانه آب
                • ۱ قاشق غذاخوری کره
                • نمک، شکر
                • روغن برای سرخ کردن
                • شکلات داغ
            """.trimIndent(),
            instructions = """
                ۱. آب و کره را بجوشانید.
                ۲. آرد را اضافه کنید و هم بزنید.
                ۳. خمیر را در قیف بریزید.
                ۴. در روغن داغ سرخ کنید.
                ۵. در شکر بزنید.
                ۶. با شکلات داغ سرو کنید.
            """.trimIndent(),
            mealType = "breakfast",
            region = "europe",
            source = Source.BUILTIN,
        ),
        RecipeEntity(
            title = "پای سيب",
            ingredients = """
                • ۱ عدد خمیر پای
                • ۶ عدد سیب
                • ۱ پیمانه شکر
                • ۲ قاشق غذاخوری آرد
                • دارچین، کره
            """.trimIndent(),
            instructions = """
                ۱. سیب‌ها را برش بزنید.
                ۲. با شکر، آرد و دارچین مخلوط کنید.
                ۳. در قالب خمیر بریزید.
                ۴. کره روی آن بگذارید.
                ۵. با خمیر بپوشانید.
                ۶. در فر ۱۸۰ درجه بپزید.
            """.trimIndent(),
            mealType = "dessert",
            region = "europe",
            source = Source.BUILTIN,
        ),

        // ==================== آلمان و اتریش ====================
        RecipeEntity(
            title = "شنیتسل",
            ingredients = """
                • ۴ عدد گوشت گوساله
                • ۱ پیمانه آرد
                • ۲ عدد تخم‌مرغ
                • ۱ پیمانه آرد سوخاری
                • لیمو، نمک، فلفل
                • روغن
            """.trimIndent(),
            instructions = """
                ۱. گوشت را نازک بکوبید.
                ۲. در آرد، تخم‌مرغ و آرد سوخاری بزنید.
                ۳. در روغن داغ سرخ کنید.
                ۴. با لیمو و سیب‌زمینی سرخ‌شده سرو کنید.
            """.trimIndent(),
            mealType = "dinner",
            region = "europe",
            source = Source.BUILTIN,
        ),
        RecipeEntity(
            title = "براتوورست",
            ingredients = """
                • ۴ عدد سوسیس آلمانی
                • ۲ عدد پیاز
                • ۱ پیمانه آبجو
                • خردل، نمک، فلفل
                • نان
            """.trimIndent(),
            instructions = """
                ۱. سوسیس‌ها را در تابه سرخ کنید.
                ۲. پیاز را اضافه کنید.
                ۳. آبجو را اضافه کنید.
                ۴. ۱۵ دقیقه بپزید.
                ۵. با خردل و نان سرو کنید.
            """.trimIndent(),
            mealType = "lunch",
            region = "europe",
            source = Source.BUILTIN,
        ),
        RecipeEntity(
            title = "زاوربراتن",
            ingredients = """
                • ۱ کیلو گوشت گاو
                • ۲ عدد پیاز
                • ۲ عدد هویج
                • ۲ پیمانه سرکه
                • ۱ پیمانه آب
                • ادویه، برگ بو
            """.trimIndent(),
            instructions = """
                ۱. گوشت را در سرکه و ادویه بخیسانید (۲ روز).
                ۲. پیاز و هویج را تفت دهید.
                ۳. گوشت را اضافه کنید و سرخ کنید.
                ۴. آب اضافه کنید و بپزید.
                ۵. ۲ ساعت با حرارت کم بپزید.
                ۶. با سس سرو کنید.
            """.trimIndent(),
            mealType = "dinner",
            region = "europe",
            source = Source.BUILTIN,
        ),
        RecipeEntity(
            title = "کارتوfel سالاد",
            ingredients = """
                • ۴ عدد سیب‌زمینی
                • ۱ عدد پیاز
                • ۲ قاشق غذاخوری خیارشور
                • ۳ قاشق غذاخوری مایونز
                • خردل، نمک، فلفل
            """.trimIndent(),
            instructions = """
                ۱. سیب‌زمینی را بپزید و مکعبی خرد کنید.
                ۲. پیاز و خیارشور را خرد کنید.
                ۳. با مایونز و خردل مخلوط کنید.
                ۴. سرد سرو کنید.
            """.trimIndent(),
            mealType = "salad",
            region = "europe",
            source = Source.BUILTIN,
        ),
        RecipeEntity(
            title = "اشترودل سیب",
            ingredients = """
                • ۱ عدد خمیر هزارلا
                • ۶ عدد سیب
                • ۱ پیمانه کشمش
                • ۱ پیمانه گردو
                • شکر، دارچین
                • کره ذوب‌شده
            """.trimIndent(),
            instructions = """
                ۱. سیب‌ها را رنده کنید.
                ۲. کشمش، گردو، شکر و دارچین را اضافه کنید.
                ۳. خمیر را پهن کنید.
                ۴. مواد را وسط آن بریزید.
                ۵. رول کنید.
                ۶. در فر ۱۸۰ درجه بپزید.
            """.trimIndent(),
            mealType = "dessert",
            region = "europe",
            source = Source.BUILTIN,
        ),
        RecipeEntity(
            title = "زانتن",
            ingredients = """
                • ۱ پیمانه آرد
                • ۱ پیمانه شیر
                • ۱ عدد تخم‌مرغ
                • ۲ قاشق غذاخوری شکر
                • ۱ قاشق چای‌خوری بیکینگ پودر
                • مربا، خامه
            """.trimIndent(),
            instructions = """
                ۱. همه مواد را مخلوط کنید.
                ۲. در قالب بریزید.
                ۳. بخارپز کنید (۲۰ دقیقه).
                ۴. با مربا و خامه سرو کنید.
            """.trimIndent(),
            mealType = "dessert",
            region = "europe",
            source = Source.BUILTIN,
        ),

        // ==================== انگلیس و ایرلند ====================
        RecipeEntity(
            title = "فول انگلیسی",
            ingredients = """
                • ۲ پیمانه لوبیا سفید
                • ۲ عدد گوجه‌فرنگی
                • ۱ عدد پیاز
                • ۲ قاشق غذاخوری رب گوجه
                • شکر، سرکه
                • نان تست
            """.trimIndent(),
            instructions = """
                ۱. لوبیا را از شب قبل خیس کنید.
                ۲. با آب بپزید تا نرم شود.
                ۳. پیاز و گوجه را تفت دهید.
                ۴. رب گوجه، شکر و سرکه اضافه کنید.
                ۵. لوبیا را اضافه کنید.
                ۶. با نان تست سرو کنید.
            """.trimIndent(),
            mealType = "breakfast",
            region = "europe",
            source = Source.BUILTIN,
        ),
        RecipeEntity(
            title = "فیش اند چیپس",
            ingredients = """
                • ۴ عدد فیله ماهی سفید
                • ۴ عدد سیب‌زمینی
                • ۱ پیمانه آرد
                • ۱ پیمانه آبجو
                • نمک، فلفل
                • روغن برای سرخ کردن
            """.trimIndent(),
            instructions = """
                ۱. سیب‌زمینی را خلالی خرد و سرخ کنید.
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
            title = "روست بیف",
            ingredients = """
                • ۱ کیلو گوشت گاو
                • ۴ عدد سیب‌زمینی
                • ۲ عدد هویج
                • ۱ عدد پیاز
                • آب مرغ، ادویه
                • خردل
            """.trimIndent(),
            instructions = """
                ۱. گوشت را با خردل و ادویه مزه‌دار کنید.
                ۲. در فر ۱۸۰ درجه بپزید.
                ۳. سبزیجات را کنار آن بپزید.
                ۴. ۲ ساعت بپزید.
                ۵. برش بزنید و با سس سرو کنید.
            """.trimIndent(),
            mealType = "dinner",
            region = "europe",
            source = Source.BUILTIN,
        ),
        RecipeEntity(
            title = "شپرد پای",
            ingredients = """
                • ۵۰۰ گرم گوشت چرخ‌کرده
                • ۲ عدد پیاز
                • ۲ عدد هویج
                • ۱ پیمانه نخود فرنگی
                • ۴ عدد سیب‌زمینی
                • آب مرغ، ادویه
            """.trimIndent(),
            instructions = """
                ۱. گوشت را با پیاز و هویج تفت دهید.
                ۲. آب مرغ و ادویه اضافه کنید.
                ۳. نخود فرنگی را اضافه کنید.
                ۴. سیب‌زمینی را بپزید و له کنید.
                ۵. گوشت را در ظرف بریزید.
                ۶. سیب‌زمینی را روی آن پهن کنید.
                ۷. در فر ۱۸۰ درجه بپزید.
            """.trimIndent(),
            mealType = "dinner",
            region = "europe",
            source = Source.BUILTIN,
        ),
        RecipeEntity(
            title = "اسکون",
            ingredients = """
                • ۲ پیمانه آرد
                • ۱ قاشق غذاخوری بیکینگ پودر
                • ۱۰۰ گرم کره
                • نصف پیمانه شیر
                • شکر، نمک
                • مربا، خامه
            """.trimIndent(),
            instructions = """
                ۱. آرد، بیکینگ پودر، شکر و نمک را مخلوط کنید.
                ۲. کره را اضافه کنید و خرد کنید.
                ۳. شیر را اضافه کنید.
                ۴. خمیر را ورز دهید.
                ۵. به شکل دایره برش بزنید.
                ۶. در فر ۲۰۰ درجه بپزید.
                ۷. با مربا و خامه سرو کنید.
            """.trimIndent(),
            mealType = "snack",
            region = "europe",
            source = Source.BUILTIN,
        ),
        RecipeEntity(
            title = "پودینگ کریسمس",
            ingredients = """
                • ۲ پیمانه آرد
                • ۱ پیمانه کشمش
                • ۱ پیمانه خرما
                • ۱ پیمانه کره
                • ۲ عدد تخم‌مرغ
                • ادویه کریسمس
            """.trimIndent(),
            instructions = """
                ۱. همه مواد را مخلوط کنید.
                ۲. در قالب بریزید.
                ۳. بخارپز کنید (۳ ساعت).
                ۴. با سس براندی سرو کنید.
            """.trimIndent(),
            mealType = "dessert",
            region = "europe",
            source = Source.BUILTIN,
        ),

        // ==================== روسیه و اروپای شرقی ====================
        RecipeEntity(
            title = "بورش",
            ingredients = """
                • ۲ عدد چغندر
                • ۵۰۰ گرم گوشت گاو
                • ۲ عدد سیب‌زمینی
                • ۱ عدد هویج
                • ۱ عدد پیاز
                • کلم، آب مرغ
            """.trimIndent(),
            instructions = """
                ۱. گوشت را با آب بپزید.
                ۲. چغندر، سیب‌زمینی، هویج و پیاز را خرد کنید.
                ۳. به آبگوشت اضافه کنید.
                ۴. کلم را اضافه کنید.
                ۵. ۱ ساعت بپزید.
                ۶. با خامه ترش سرو کنید.
            """.trimIndent(),
            mealType = "dinner",
            region = "europe",
            source = Source.BUILTIN,
        ),
        RecipeEntity(
            title = "پیراشکی",
            ingredients = """
                • ۳ پیمانه آرد
                • ۱ پیمانه شیر
                • ۱ قاشق غذاخوری خمیرمایه
                • ۵۰۰ گرم گوشت چرخ‌کرده
                • ۱ عدد پیاز
                • ادویه
            """.trimIndent(),
            instructions = """
                ۱. خمیر را درست کنید و ۱ ساعت استراحت دهید.
                ۲. گوشت و پیاز را مخلوط کنید.
                ۳. ادویه اضافه کنید.
                ۴. خمیر را به دایره‌های کوچک باز کنید.
                ۵. گوشت را وسط آن بگذارید.
                ۶. بپیچید و سرخ کنید.
            """.trimIndent(),
            mealType = "snack",
            region = "europe",
            source = Source.BUILTIN,
        ),
        RecipeEntity(
            title = "بلینی",
            ingredients = """
                • ۱ پیمانه آرد گندم سیاه
                • ۱ پیمانه شیر
                • ۱ عدد تخم‌مرغ
                • ۱ قاشق غذاخوری خمیرمایه
                • کره
                • خامه ترش، خاویار
            """.trimIndent(),
            instructions = """
                ۱. همه مواد را مخلوط کنید.
                ۲. ۱ ساعت استراحت دهید.
                ۳. در تابه کوچک بپزید.
                ۴. با خامه ترش و خاویار سرو کنید.
            """.trimIndent(),
            mealType = "breakfast",
            region = "europe",
            source = Source.BUILTIN,
        ),
        RecipeEntity(
            title = "گولاش مجارستانی",
            ingredients = """
                • ۵۰۰ گرم گوشت گاو
                • ۲ عدد پیاز
                • ۲ قاشق غذاخوری پاپریکا
                • ۲ عدد سیب‌زمینی
                • ۱ عدد فلفل دلمه
                • آب مرغ
            """.trimIndent(),
            instructions = """
                ۱. پیاز را تفت دهید.
                ۲. گوشت را اضافه کنید.
                ۳. پاپریکا اضافه کنید.
                ۴. آب مرغ اضافه کنید.
                ۵. سیب‌زمینی و فلفل را اضافه کنید.
                ۶. ۱.۵ ساعت بپزید.
                ۷. با نان سرو کنید.
            """.trimIndent(),
            mealType = "dinner",
            region = "europe",
            source = Source.BUILTIN,
        ),
        RecipeEntity(
            title = "کوفته پراگ",
            ingredients = """
                • ۵۰۰ گرم گوشت چرخ‌کرده
                • ۱ عدد پیاز
                • ۲ حبه سیر
                • ۱ عدد تخم‌مرغ
                • ۱ پیمانه آرد سوخاری
                • ادویه، نمک
            """.trimIndent(),
            instructions = """
                ۱. پیاز و سیر را رنده کنید.
                ۲. با گوشت مخلوط کنید.
                ۳. تخم‌مرغ و آرد سوخاری اضافه کنید.
                ۴. ادویه اضافه کنید.
                ۵. به شکل توپ درآورید.
                ۶. در سس بپزید.
                ۷. با نان سرو کنید.
            """.trimIndent(),
            mealType = "dinner",
            region = "europe",
            source = Source.BUILTIN,
        ),

        // ==================== دسرها و سالادهای اروپایی ====================
        RecipeEntity(
            title = "تیرامیسو",
            ingredients = """
                • ۲۵۰ گرم ماسکارپونه
                • ۳ عدد تخم‌مرغ
                • ۱ پیمانه شکر
                • ۱ پیمانه قهوه اسپرسو
                • ۲۰ عدد بیسکویت لیدی فینگر
                • پودر کاکائو
            """.trimIndent(),
            instructions = """
                ۱. زرده و شکر را بزنید.
                ۲. ماسکارپونه را اضافه کنید.
                ۳. سفیده را جدا بزنید و اضافه کنید.
                ۴. بیسکویت‌ها را در قهوه بزنید.
                ۵. لایه‌لایه بچینید.
                ۶. با پودر کاکائو تزیین کنید.
                ۷. سرد سرو کنید.
            """.trimIndent(),
            mealType = "dessert",
            region = "europe",
            source = Source.BUILTIN,
        ),
        RecipeEntity(
            title = "پانا کوتا",
            ingredients = """
                • ۲ پیمانه خامه
                • ۱ پیمانه شیر
                • نصف پیمانه شکر
                • ۲ قاشق چای‌خوری ژلاتین
                • وانیل
                • سس توت‌فرنگی
            """.trimIndent(),
            instructions = """
                ۱. خامه، شیر و شکر را گرم کنید.
                ۲. ژلاتین را اضافه کنید.
                ۳. وانیل اضافه کنید.
                ۴. در قالب بریزید.
                ۵. ۴ ساعت در یخچال بگذارید.
                ۶. با سس توت‌فرنگی سرو کنید.
            """.trimIndent(),
            mealType = "dessert",
            region = "europe",
            source = Source.BUILTIN,
        ),
        RecipeEntity(
            title = "شو کولا",
            ingredients = """
                • ۱ پیمانه آب
                • ۱۰۰ گرم کره
                • ۱ پیمانه آرد
                • ۴ عدد تخم‌مرغ
                • خامه، شکلات
            """.trimIndent(),
            instructions = """
                ۱. آب و کره را بجوشانید.
                ۲. آرد را اضافه کنید و هم بزنید.
                ۳. تخم‌مرغ‌ها را یکی‌یکی اضافه کنید.
                ۴. در سینی بچینید.
                ۵. در فر ۲۰۰ درجه بپزید.
                ۶. با خامه و شکلات پر کنید.
            """.trimIndent(),
            mealType = "dessert",
            region = "europe",
            source = Source.BUILTIN,
        ),
        RecipeEntity(
            title = "کاپریس سالاد",
            ingredients = """
                • ۳ عدد گوجه‌فرنگی
                • ۲۰۰ گرم پنیر موزارلا
                • برگ ریحان تازه
                • روغن زیتون
                • نمک، فلفل
            """.trimIndent(),
            instructions = """
                ۱. گوجه و پنیر را برش بزنید.
                ۲. لایه‌لایه بچینید.
                ۳. ریحان روی آن بگذارید.
                ۴. با روغن زیتون، نمک و فلفل سرو کنید.
            """.trimIndent(),
            mealType = "salad",
            region = "europe",
            source = Source.BUILTIN,
        ),
        RecipeEntity(
            title = "سالاد سزار",
            ingredients = """
                • ۱ عدد کاهو رسمی
                • ۱۰۰ گرم پنیر پارمزان
                • ۱۰۰ گرم نان تست
                • سس سزار
                • مرغ گریل‌شده (اختیاری)
            """.trimIndent(),
            instructions = """
                ۱. کاهو را خرد کنید.
                ۲. نان تست را مکعبی خرد و تست کنید.
                ۳. پنیر پارمزان را رنده کنید.
                ۴. همه را مخلوط کنید.
                ۵. با سس سزار سرو کنید.
            """.trimIndent(),
            mealType = "salad",
            region = "europe",
            source = Source.BUILTIN,
        ),
        RecipeEntity(
            title = "سالاد والدورف",
            ingredients = """
                • ۲ عدد سیب
                • ۲ عدد کرفس
                • ۱ پیمانه گردو
                • ۱ پیمانه کشمش
                • ۳ قاشق غذاخوری مایونز
                • آبلیمو
            """.trimIndent(),
            instructions = """
                ۱. سیب و کرفس را خرد کنید.
                ۲. گردو و کشمش را اضافه کنید.
                ۳. مایونز و آبلیمو اضافه کنید.
                ۴. مخلوط کنید و سرد سرو کنید.
            """.trimIndent(),
            mealType = "salad",
            region = "europe",
            source = Source.BUILTIN,
        ),
        RecipeEntity(
            title = "سالاد نیسواز",
            ingredients = """
                • ۱ عدد کاهو
                • ۲ عدد گوجه‌فرنگی
                • ۱ عدد خیار
                • ۱ عدد فلفل دلمه
                • ۲ عدد تخم‌مرغ آب‌پز
                • ۱۰۰ گرم تن ماهی
                • زیتون
            """.trimIndent(),
            instructions = """
                ۱. سبزیجات را خرد کنید.
                ۲. تخم‌مرغ و تن ماهی را اضافه کنید.
                ۳. زیتون اضافه کنید.
                ۴. با روغن زیتون سرو کنید.
            """.trimIndent(),
            mealType = "salad",
            region = "europe",
            source = Source.BUILTIN,
        ),
        RecipeEntity(
            title = "سوپ پیاز فرانسوی",
            ingredients = """
                • ۴ عدد پیاز
                • ۱۰۰ گرم کره
                • ۲ قاشق غذاخوری آرد
                • ۴ پیمانه آب مرغ
                • ۱۰۰ گرم پنیر گرویر
                • نان تست
            """.trimIndent(),
            instructions = """
                ۱. پیاز را با کره کاراملی کنید.
                ۲. آرد را اضافه کنید.
                ۳. آب مرغ اضافه کنید و بپزید.
                ۴. نان تست را در کاسه بگذارید.
                ۵. سوپ را روی آن بریزید.
                ۶. پنیر را روی آن بگذارید و گریل کنید.
            """.trimIndent(),
            mealType = "appetizer",
            region = "europe",
            source = Source.BUILTIN,
        ),
        RecipeEntity(
            title = "سوپ گاسپاچو",
            ingredients = """
                • ۴ عدد گوجه‌فرنگی رسیده
                • ۱ عدد خیار
                • ۱ عدد فلفل دلمه
                • ۱ عدد پیاز
                • ۲ حبه سیر
                • روغن زیتون، سرکه
            """.trimIndent(),
            instructions = """
                ۱. همه سبزیجات را خرد کنید.
                ۲. در مخلوط‌کن بریزید.
                ۳. روغن زیتون و سرکه اضافه کنید.
                ۴. پوره کنید.
                ۵. در یخچال بگذارید.
                ۶. سرد سرو کنید.
            """.trimIndent(),
            mealType = "appetizer",
            region = "europe",
            source = Source.BUILTIN,
        ),
        RecipeEntity(
            title = "بروسکتا گوجه",
            ingredients = """
                • ۱ عدد نان ایتالیایی
                • ۳ عدد گوجه‌فرنگی
                • ۲ حبه سیر
                • ریحان تازه
                • روغن زیتون
                • نمک، فلفل
            """.trimIndent(),
            instructions = """
                ۱. نان را برش بزنید و تست کنید.
                ۲. گوجه‌ها را ریز خرد کنید.
                ۳. سیر را رنده کنید.
                ۴. همه را با روغن زیتون مخلوط کنید.
                ۵. روی نان بریزید.
                ۶. با ریحان سرو کنید.
            """.trimIndent(),
            mealType = "appetizer",
            region = "europe",
            source = Source.BUILTIN,
        ),
    )
}