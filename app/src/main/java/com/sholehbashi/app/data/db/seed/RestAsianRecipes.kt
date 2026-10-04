package com.sholehbashi.app.data.db.seed

import com.sholehbashi.app.data.Source
import com.sholehbashi.app.data.db.RecipeEntity

object RestAsianRecipes {
    val all: List<RecipeEntity> = listOf(
        // ==================== هند — صبحانه ====================
        RecipeEntity(
            title = "دوsa (دوسا)",
            ingredients = """
                • ۲ پیمانه برنج
                • نصف پیمانه عدس
                • ۱ قاشق چای‌خوری خمیرمایه
                • نمک
                • روغن برای سرخ کردن
                • سس نارگیل و سامبار
            """.trimIndent(),
            instructions = """
                ۱. برنج و عدس را از شب قبل خیس کنید.
                ۲. با مخلوط‌کن پوره کنید.
                ۳. ۸ ساعت تخمیر دهید.
                ۴. تابه را گرم کنید.
                ۵. از مخلوط در تابه بریزید و پهن کنید.
                ۶. دو طرف را سرخ کنید.
                ۷. با سس نارگیل و سامبار سرو کنید.
            """.trimIndent(),
            mealType = "breakfast",
            region = "rest_asia",
            source = Source.BUILTIN,
        ),
        RecipeEntity(
            title = "ايدلي",
            ingredients = """
                • ۲ پیمانه برنج
                • نصف پیمانه عدس
                • ۱ قاشق چای‌خوری خمیرمایه
                • نمک
                • روغن
            """.trimIndent(),
            instructions = """
                ۱. برنج و عدس را از شب قبل خیس کنید.
                ۲. پوره کنید و ۸ ساعت تخمیر دهید.
                ۳. در قالب ایدلی بریزید.
                ۴. بخارپز کنید (۱۵ دقیقه).
                ۵. با سامبار و چutney سرو کنید.
            """.trimIndent(),
            mealType = "breakfast",
            region = "rest_asia",
            source = Source.BUILTIN,
        ),
        RecipeEntity(
            title = "پاراته",
            ingredients = """
                • ۲ پیمانه آرد گندم
                • ۱ پیمانه آب
                • ۱ قاشق چای‌خوری نمک
                • ۲ قاشق غذاخوری روغن
                • کره برای پخت
            """.trimIndent(),
            instructions = """
                ۱. آرد، آب و نمک را مخلوط کنید.
                ۲. خمیر را ورز دهید.
                ۳. ۳۰ دقیقه استراحت دهید.
                ۴. به دایره‌های کوچک باز کنید.
                ۵. در تابه بپزید.
                ۶. با کره سرو کنید.
            """.trimIndent(),
            mealType = "breakfast",
            region = "rest_asia",
            source = Source.BUILTIN,
        ),
        RecipeEntity(
            title = "آلو پاراته",
            ingredients = """
                • ۲ پیمانه آرد
                • ۲ عدد سیب‌زمینی
                • ۱ عدد پیاز
                • ادویه هندی، نمک
                • گشنیز تازه
                • روغن
            """.trimIndent(),
            instructions = """
                ۱. سیب‌زمینی را بپزید و له کنید.
                ۲. پیاز و ادویه را اضافه کنید.
                ۳. خمیر را درست کنید.
                ۴. سیب‌زمینی را وسط خمیر بگذارید.
                ۵. باز کنید و بپزید.
                ۶. با ماست سرو کنید.
            """.trimIndent(),
            mealType = "breakfast",
            region = "rest_asia",
            source = Source.BUILTIN,
        ),
        RecipeEntity(
            title = "اوپما",
            ingredients = """
                • ۱ پیمانه سمولینا
                • ۲ پیمانه آب
                • ۱ عدد پیاز
                • ۲ عدد فلفل سبز
                • خردل، زردچوبه
                • گشنیز، لیمو
            """.trimIndent(),
            instructions = """
                ۱. پیاز و فلفل را تفت دهید.
                ۲. خردل و زردچوبه اضافه کنید.
                ۳. آب را اضافه کنید و بجوشانید.
                ۴. سمولینا را آرام بریزید و هم بزنید.
                ۵. ۵ دقیقه بپزید.
                ۶. با گشنیز و لیمو سرو کنید.
            """.trimIndent(),
            mealType = "breakfast",
            region = "rest_asia",
            source = Source.BUILTIN,
        ),

        // ==================== هند — ناهار و شام ====================
        RecipeEntity(
            title = "بریانی مرغ",
            ingredients = """
                • ۵۰۰ گرم مرغ
                • ۲ پیمانه برنج باسماتی
                • ۱ پیمانه ماست
                • ۲ عدد پیاز
                • ادویه بریانی، زعفران، زنجبیل
                • گشنیز، نعنا
            """.trimIndent(),
            instructions = """
                ۱. مرغ را با ماست و ادویه مزه‌دار کنید.
                ۲. پیاز را سرخ کنید.
                ۳. برنج را نیم‌پز کنید.
                ۴. لایه‌لایه در قابلمه بچینید.
                ۵. با زعفران، گشنیز و نعنا تزیین کنید.
                ۶. ۳۰ دقیقه دم کنید.
                ۷. با رايتا سرو کنید.
            """.trimIndent(),
            mealType = "lunch",
            region = "rest_asia",
            source = Source.BUILTIN,
        ),
        RecipeEntity(
            title = "باتر چیکن",
            ingredients = """
                • ۵۰۰ گرم مرغ
                • ۱ پیمانه ماست
                • ۲ پیمانه سس گوجه
                • ۱۰۰ گرم کره
                • خامه، ادویه گارام ماسالا
                • زنجبیل، سیر
            """.trimIndent(),
            instructions = """
                ۱. مرغ را با ماست و ادویه مزه‌دار کنید.
                ۲. کباب کنید یا در تابه بپزید.
                ۳. سس گوجه را با کره و ادویه بپزید.
                ۴. خامه اضافه کنید.
                ۵. مرغ را در سس بریزید.
                ۶. با نان نان سرو کنید.
            """.trimIndent(),
            mealType = "dinner",
            region = "rest_asia",
            source = Source.BUILTIN,
        ),
        RecipeEntity(
            title = "تندوری چیکن",
            ingredients = """
                • ۴ عدد ران مرغ
                • ۱ پیمانه ماست
                • ادویه تندوری، زنجبیل، سیر
                • آبلیمو، نمک
                • رنگ خوراکی قرمز (اختیاری)
            """.trimIndent(),
            instructions = """
                ۱. مرغ را با ماست و ادویه مزه‌دار کنید.
                ۲. ۴ ساعت در یخچال استراحت دهید.
                ۳. در فر یا گریل بپزید.
                ۴. با نان نان، پیاز و لیمو سرو کنید.
            """.trimIndent(),
            mealType = "dinner",
            region = "rest_asia",
            source = Source.BUILTIN,
        ),
        RecipeEntity(
            title = "پالاک پنیر",
            ingredients = """
                • ۵۰۰ گرم اسفناج
                • ۲۰۰ گرم پنیر پنیر
                • ۱ عدد پیاز
                • ۲ حبه سیر
                • زنجبیل، گارام ماسالا
                • خامه
            """.trimIndent(),
            instructions = """
                ۱. اسفناج را بپزید و پوره کنید.
                ۲. پیاز، سیر و زنجبیل را تفت دهید.
                ۳. ادویه‌ها را اضافه کنید.
                ۴. اسفناج را اضافه کنید.
                ۵. پنیر را مکعبی خرد و اضافه کنید.
                ۶. با خامه سرو کنید.
            """.trimIndent(),
            mealType = "dinner",
            region = "rest_asia",
            source = Source.BUILTIN,
        ),
        RecipeEntity(
            title = "چانا ماسالا",
            ingredients = """
                • ۲ پیمانه نخود
                • ۲ عدد پیاز
                • ۳ عدد گوجه‌فرنگی
                • ۲ حبه سیر
                • زنجبیل، ادویه هندی
                • گشنیز
            """.trimIndent(),
            instructions = """
                ۱. نخود را از شب قبل خیس کنید و بپزید.
                ۲. پیاز را تفت دهید.
                ۳. سیر و زنجبیل را اضافه کنید.
                ۴. گوجه را اضافه کنید.
                ۵. ادویه‌ها را اضافه کنید.
                ۶. نخود را اضافه کنید.
                ۷. با گشنیز سرو کنید.
            """.trimIndent(),
            mealType = "lunch",
            region = "rest_asia",
            source = Source.BUILTIN,
        ),
        RecipeEntity(
            title = "روگان جوش",
            ingredients = """
                • ۵۰۰ گرم گوشت گوسفندی
                • ۱ پیمانه ماست
                • ۲ عدد پیاز
                • ۳ قاشق غذاخوری رب گوجه
                • ادویه کشمیری، زنجبیل
                • خلال بادام
            """.trimIndent(),
            instructions = """
                ۱. پیاز را تفت دهید.
                ۲. گوشت را اضافه کنید و سرخ کنید.
                ۳. ماست و ادویه را اضافه کنید.
                ۴. رب گوجه اضافه کنید.
                ۵. آب اضافه کنید و ۱ ساعت بپزید.
                ۶. با خلال بادام تزیین کنید.
                ۷. با برنج سرو کنید.
            """.trimIndent(),
            mealType = "dinner",
            region = "rest_asia",
            source = Source.BUILTIN,
        ),
        RecipeEntity(
            title = "دال تادکا",
            ingredients = """
                • ۱ پیمانه عدس
                • ۱ عدد پیاز
                • ۲ عدد گوجه‌فرنگی
                • ۲ حبه سیر
                • زردچوبه، زیره، گشنیز
                • کره
            """.trimIndent(),
            instructions = """
                ۱. عدس را بپزید.
                ۲. پیاز را تفت دهید.
                ۳. سیر، زردچوبه و زیره را اضافه کنید.
                ۴. گوجه را اضافه کنید.
                ۵. عدس را اضافه کنید.
                ۶. با کره و گشنیز سرو کنید.
            """.trimIndent(),
            mealType = "lunch",
            region = "rest_asia",
            source = Source.BUILTIN,
        ),
        RecipeEntity(
            title = "بiryani سبزیجات",
            ingredients = """
                • ۲ پیمانه برنج باسماتی
                • ۲ عدد سیب‌زمینی
                • ۱ عدد هویج
                • ۱ پیمانه نخود فرنگی
                • ادویه بریانی، زعفران
                • پیاز سرخ‌شده
            """.trimIndent(),
            instructions = """
                ۱. سبزیجات را بپزید.
                ۲. برنج را نیم‌پز کنید.
                ۳. لایه‌لایه در قابلمه بچینید.
                ۴. زعفران و پیاز سرخ‌شده اضافه کنید.
                ۵. ۳۰ دقیقه دم کنید.
                ۶. با رايتا سرو کنید.
            """.trimIndent(),
            mealType = "lunch",
            region = "rest_asia",
            source = Source.BUILTIN,
        ),
        RecipeEntity(
            title = "نان هندی (نان)",
            ingredients = """
                • ۲ پیمانه آرد
                • ۱ پیمانه ماست
                • ۱ قاشق چای‌خوری بیکینگ پودر
                • نمک
                • کره
            """.trimIndent(),
            instructions = """
                ۱. آرد، ماست، بیکینگ پودر و نمک را مخلوط کنید.
                ۲. خمیر را ورز دهید.
                ۳. ۱ ساعت استراحت دهید.
                ۴. به دایره‌های کوچک باز کنید.
                ۵. در تابه داغ بپزید.
                ۶. با کره سرو کنید.
            """.trimIndent(),
            mealType = "lunch",
            region = "rest_asia",
            source = Source.BUILTIN,
        ),
        RecipeEntity(
            title = "سمبوسه هندی",
            ingredients = """
                • ۱۰ عدد خمیر سمبوسه
                • ۳ عدد سیب‌زمینی
                • ۱ پیمانه نخود فرنگی
                • ادویه هندی، نمک
                • گشنیز
                • روغن
            """.trimIndent(),
            instructions = """
                ۱. سیب‌زمینی را بپزید و له کنید.
                ۲. نخود و ادویه را اضافه کنید.
                ۳. گشنیز اضافه کنید.
                ۴. در خمیر بپیچید.
                ۵. در روغن سرخ کنید.
                ۶. با سس نعنا سرو کنید.
            """.trimIndent(),
            mealType = "snack",
            region = "rest_asia",
            source = Source.BUILTIN,
        ),
        RecipeEntity(
            title = "پاکورا",
            ingredients = """
                • ۱ پیمانه آرد نخودچی
                • ۱ عدد پیاز
                • ۱ عدد سیب‌زمینی
                • ۱ عدد فلفل سبز
                • زردچوبه، نمک
                • روغن
            """.trimIndent(),
            instructions = """
                ۱. سبزیجات را برش بزنید.
                ۲. آرد نخودچی، زردچوبه و نمک را مخلوط کنید.
                ۳. آب اضافه کنید تا خمیر شود.
                ۴. سبزیجات را در خمیر بزنید.
                ۵. در روغن داغ سرخ کنید.
                ۶. با چتنی سرو کنید.
            """.trimIndent(),
            mealType = "snack",
            region = "rest_asia",
            source = Source.BUILTIN,
        ),
        RecipeEntity(
            title = "کباب سیک",
            ingredients = """
                • ۵۰۰ گرم گوشت چرخ‌کرده
                • ۱ عدد پیاز
                • ۲ حبه سیر
                • زنجبیل، گشنیز
                • ادویه هندی، نمک
            """.trimIndent(),
            instructions = """
                ۱. پیاز، سیر و زنجبیل را رنده کنید.
                ۲. با گوشت مخلوط کنید.
                ۳. گشنیز و ادویه اضافه کنید.
                ۴. ۱ ساعت استراحت دهید.
                ۵. به سیخ بکشید.
                ۶. روی گریل کباب کنید.
                ۷. با نان و سس سرو کنید.
            """.trimIndent(),
            mealType = "dinner",
            region = "rest_asia",
            source = Source.BUILTIN,
        ),
        RecipeEntity(
            title = "کاری میگو",
            ingredients = """
                • ۳۰۰ گرم میگو
                • ۱ قوطی شیر نارگیل
                • ۲ قاشق غذاخوری خمیر کاری
                • ۱ عدد پیاز
                • ۲ حبه سیر
                • زنجبیل، گشنیز
            """.trimIndent(),
            instructions = """
                ۱. پیاز، سیر و زنجبیل را تفت دهید.
                ۲. خمیر کاری را اضافه کنید.
                ۳. شیر نارگیل را اضافه کنید.
                ۴. میگو را اضافه کنید.
                ۵. ۱۰ دقیقه بپزید.
                ۶. با گشنیز و برنج سرو کنید.
            """.trimIndent(),
            mealType = "dinner",
            region = "rest_asia",
            source = Source.BUILTIN,
        ),
        RecipeEntity(
            title = "کورمای مرغ",
            ingredients = """
                • ۵۰۰ گرم مرغ
                • ۱ پیمانه ماست
                • ۱ پیمانه خامه
                • ۲ عدد پیاز
                • خلال بادام، زعفران
                • ادویه کورمای
            """.trimIndent(),
            instructions = """
                ۱. پیاز را تفت دهید.
                ۲. مرغ را اضافه کنید و سرخ کنید.
                ۳. ماست و ادویه را اضافه کنید.
                ۴. آب اضافه کنید و بپزید.
                ۵. خامه و زعفران اضافه کنید.
                ۶. با خلال بادام تزیین کنید.
            """.trimIndent(),
            mealType = "dinner",
            region = "rest_asia",
            source = Source.BUILTIN,
        ),

        // ==================== پاکستان — ناهار و شام ====================
        RecipeEntity(
            title = "نيهاری",
            ingredients = """
                • ۵۰۰ گرم گوشت گوسفندی
                • ۲ عدد پیاز
                • ۲ قاشق غذاخوری ادویه نيهاری
                • زنجبیل، سیر
                • آب استخوان
                • خلال زنجبیل، لیمو
            """.trimIndent(),
            instructions = """
                ۱. پیاز را سرخ کنید.
                ۲. گوشت را اضافه کنید.
                ۳. ادویه نيهاری اضافه کنید.
                ۴. آب استخوان اضافه کنید.
                ۵. ۳ ساعت بپزید.
                ۶. با خلال زنجبیل و لیمو سرو کنید.
            """.trimIndent(),
            mealType = "breakfast",
            region = "rest_asia",
            source = Source.BUILTIN,
        ),
        RecipeEntity(
            title = "حلیم پاکستانی",
            ingredients = """
                • ۱ پیمانه گندم
                • ۱ پیمانه عدس
                • ۵۰۰ گرم گوشت گوسفندی
                • ۱ عدد پیاز
                • ادویه، نمک
                • خلال بادام، دارچین
            """.trimIndent(),
            instructions = """
                ۱. گندم و عدس را از شب قبل خیس کنید.
                ۲. با گوشت و پیاز بپزید.
                ۳. با گوشت‌کوب برقی بکوبید.
                ۴. ادویه اضافه کنید.
                ۵. با خلال بادام و دارچین سرو کنید.
            """.trimIndent(),
            mealType = "breakfast",
            region = "rest_asia",
            source = Source.BUILTIN,
        ),
        RecipeEntity(
            title = "کباب سیک پاکستانی",
            ingredients = """
                • ۵۰۰ گرم گوشت چرخ‌کرده
                • ۱ عدد پیاز
                • ۲ عدد فلفل سبز
                • گشنیز، نعنا
                • ادویه، نمک
            """.trimIndent(),
            instructions = """
                ۱. پیاز و فلفل را رنده کنید.
                ۲. با گوشت مخلوط کنید.
                ۳. گشنیز و نعنا اضافه کنید.
                ۴. ادویه اضافه کنید.
                ۵. ۱ ساعت استراحت دهید.
                ۶. به سیخ بکشید و کباب کنید.
            """.trimIndent(),
            mealType = "dinner",
            region = "rest_asia",
            source = Source.BUILTIN,
        ),
        RecipeEntity(
            title = "بریانی پاکستانی",
            ingredients = """
                • ۵۰۰ گرم گوشت گاو
                • ۲ پیمانه برنج باسماتی
                • ۱ پیمانه ماست
                • ۲ عدد پیاز
                • ادویه بریانی، زعفران
                • آلو خشک
            """.trimIndent(),
            instructions = """
                ۱. پیاز را سرخ کنید.
                ۲. گوشت را اضافه کنید و سرخ کنید.
                ۳. ماست و ادویه اضافه کنید.
                ۴. برنج را نیم‌پز کنید.
                ۵. لایه‌لایه در قابلمه بچینید.
                ۶. آلو و زعفران اضافه کنید.
                ۷. ۴۵ دقیقه دم کنید.
            """.trimIndent(),
            mealType = "lunch",
            region = "rest_asia",
            source = Source.BUILTIN,
        ),
        RecipeEntity(
            title = "چنایی",
            ingredients = """
                • ۱ پیمانه نخود
                • ۲ عدد پیاز
                • ۳ عدد گوجه‌فرنگی
                • ۲ حبه سیر
                • زنجبیل، ادویه
                • گشنیز
            """.trimIndent(),
            instructions = """
                ۱. نخود را از شب قبل خیس کنید.
                ۲. پیاز را تفت دهید.
                ۳. سیر و زنجبیل اضافه کنید.
                ۴. گوجه را اضافه کنید.
                ۵. نخود را اضافه کنید.
                ۶. با گشنیز سرو کنید.
            """.trimIndent(),
            mealType = "breakfast",
            region = "rest_asia",
            source = Source.BUILTIN,
        ),

        // ==================== افغانستان ====================
        RecipeEntity(
            title = "کابلی پلو",
            ingredients = """
                • ۵۰۰ گرم گوشت گوسفندی
                • ۲ پیمانه برنج باسماتی
                • ۲ عدد هویج
                • ۱ پیمانه کشمش
                • ۱ عدد پیاز
                • ادویه، زعفران، بادام
            """.trimIndent(),
            instructions = """
                ۱. پیاز را تفت دهید.
                ۲. گوشت را اضافه کنید و بپزید.
                ۳. هویج را خلالی خرد کنید و تفت دهید.
                ۴. کشمش را تفت دهید.
                ۵. برنج را بپزید.
                ۶. گوشت، هویج و کشمش را روی برنج بچینید.
                ۷. با زعفران و بادام تزیین کنید.
            """.trimIndent(),
            mealType = "lunch",
            region = "rest_asia",
            source = Source.BUILTIN,
        ),
        RecipeEntity(
            title = "منتو",
            ingredients = """
                • ۲ پیمانه آرد
                • ۵۰۰ گرم گوشت چرخ‌کرده
                • ۲ عدد پیاز
                • ادویه، نمک
                • ماست، سیر
            """.trimIndent(),
            instructions = """
                ۱. خمیر را درست کنید.
                ۲. گوشت و پیاز را مخلوط کنید.
                ۳. خمیر را به دایره‌های کوچک باز کنید.
                ۴. گوشت را وسط آن بگذارید.
                ۵. بپیچید.
                ۶. بخارپز کنید.
                ۷. با ماست و سیر سرو کنید.
            """.trimIndent(),
            mealType = "dinner",
            region = "rest_asia",
            source = Source.BUILTIN,
        ),
        RecipeEntity(
            title = "آشک",
            ingredients = """
                • ۲ پیمانه آرد
                • ۵۰۰ گرم گوشت چرخ‌کرده
                • ۲ عدد پیاز
                • ۱ دسته نعنا
                • ماست، سیر
                • ادویه
            """.trimIndent(),
            instructions = """
                ۱. خمیر را درست کنید و به قطعات کوچک برش بزنید.
                ۲. گوشت و پیاز را تفت دهید.
                ۳. خمیر را در آب بپزید.
                ۴. گوشت را اضافه کنید.
                ۵. نعنا را اضافه کنید.
                ۶. با ماست و سیر سرو کنید.
            """.trimIndent(),
            mealType = "dinner",
            region = "rest_asia",
            source = Source.BUILTIN,
        ),
        RecipeEntity(
            title = "کباب افغانی",
            ingredients = """
                • ۵۰۰ گرم گوشت گوسفندی
                • ۱ عدد پیاز
                • ادویه، نمک، فلفل
                • روغن
            """.trimIndent(),
            instructions = """
                ۱. گوشت را مکعبی خرد کنید.
                ۲. با پیاز و ادویه مزه‌دار کنید.
                ۳. ۲ ساعت استراحت دهید.
                ۴. به سیخ بکشید.
                ۵. روی گریل کباب کنید.
                ۶. با نان و سبزی سرو کنید.
            """.trimIndent(),
            mealType = "dinner",
            region = "rest_asia",
            source = Source.BUILTIN,
        ),

        // ==================== اندونزی و مالزی ====================
        RecipeEntity(
            title = "نasi گورنگ",
            ingredients = """
                • ۲ پیمانه برنج
                • ۲۰۰ گرم مرغ
                • ۱۰۰ گرم میگو
                • ۲ عدد تخم‌مرغ
                • سس سویا شیرین، خمیر میگو
                • پیازچه، خیار
            """.trimIndent(),
            instructions = """
                ۱. مرغ و میگو را تفت دهید.
                ۲. تخم‌مرغ را اضافه کنید.
                ۳. برنج را اضافه کنید.
                ۴. سس سویا و خمیر میگو اضافه کنید.
                ۵. هم بزنید.
                ۶. با پیازچه، خیار و کراکر سرو کنید.
            """.trimIndent(),
            mealType = "lunch",
            region = "rest_asia",
            source = Source.BUILTIN,
        ),
        RecipeEntity(
            title = "ساتای مرغ",
            ingredients = """
                • ۵۰۰ گرم مرغ
                • ۲ قاشق غذاخوری سس سویا
                • ۲ قاشق غذاخوری بادام‌زمینی
                • ۱ قاشق غذاخوری شکر
                • سیر، زنجبیل
                • سیخ چوبی
            """.trimIndent(),
            instructions = """
                ۱. مرغ را به قطعات کوچک خرد کنید.
                ۲. سس سویا، بادام‌زمینی، شکر، سیر و زنجبیل را مخلوط کنید.
                ۳. مرغ را در سس بخیسانید.
                ۴. به سیخ بکشید.
                ۵. روی گریل کباب کنید.
                ۶. با سس بادام‌زمینی سرو کنید.
            """.trimIndent(),
            mealType = "dinner",
            region = "rest_asia",
            source = Source.BUILTIN,
        ),
        RecipeEntity(
            title = "رندانگ",
            ingredients = """
                • ۵۰۰ گرم گوشت گاو
                • ۱ قوطی شیر نارگیل
                • ۳ قاشق غذاخوری خمیر رندانگ
                • ۲ عدد پیاز
                • ۲ حبه سیر
                • لیموگراس
            """.trimIndent(),
            instructions = """
                ۱. پیاز، سیر و لیموگراس را تفت دهید.
                ۲. خمیر رندانگ را اضافه کنید.
                ۳. شیر نارگیل را اضافه کنید.
                ۴. گوشت را اضافه کنید.
                ۵. ۲ ساعت بپزید تا سس غلیظ شود.
                ۶. با برنج سرو کنید.
            """.trimIndent(),
            mealType = "dinner",
            region = "rest_asia",
            source = Source.BUILTIN,
        ),
        RecipeEntity(
            title = "لاکسا",
            ingredients = """
                • ۲۰۰ گرم نودل
                • ۱ لیتر شیر نارگیل
                • ۲ قاشق غذاخوری خمیر لاکسا
                • ۲۰۰ گرم مرغ
                • ۱۰۰ گرم میگو
                • جوانه لوبیا
            """.trimIndent(),
            instructions = """
                ۱. خمیر لاکسا را تفت دهید.
                ۲. شیر نارگیل را اضافه کنید.
                ۳. مرغ را اضافه کنید.
                ۴. میگو را اضافه کنید.
                ۵. نودل را اضافه کنید.
                ۶. با جوانه لوبیا سرو کنید.
            """.trimIndent(),
            mealType = "lunch",
            region = "rest_asia",
            source = Source.BUILTIN,
        ),
        RecipeEntity(
            title = "به‌هون",
            ingredients = """
                • ۲۰۰ گرم نودل برنجی
                • ۱ لیتر آب مرغ
                • ۲۰۰ گرم گوشت گاو
                • ۱ عدد لیموگراس
                • برگ لیمو، فلفل
                • ریحان، لیمو
            """.trimIndent(),
            instructions = """
                ۱. آب مرغ را بجوشانید.
                ۲. لیموگراس، برگ لیمو و فلفل اضافه کنید.
                ۳. گوشت را اضافه کنید.
                ۴. نودل را اضافه کنید.
                ۵. با ریحان و لیمو سرو کنید.
            """.trimIndent(),
            mealType = "lunch",
            region = "rest_asia",
            source = Source.BUILTIN,
        ),
        RecipeEntity(
            title = "گادو گادو",
            ingredients = """
                • ۱ عدد کلم
                • ۱ عدد خیار
                • ۱ عدد هویج
                • ۱۰۰ گرم توفو
                • ۲ عدد تخم‌مرغ
                • سس بادام‌زمینی
            """.trimIndent(),
            instructions = """
                ۱. سبزیجات را برش بزنید.
                ۲. توفو و تخم‌مرغ را بپزید.
                ۳. همه را در بشقاب بچینید.
                ۴. سس بادام‌زمینی روی آن بریزید.
                ۵. سرو کنید.
            """.trimIndent(),
            mealType = "salad",
            region = "rest_asia",
            source = Source.BUILTIN,
        ),

        // ==================== فیلیپین ====================
        RecipeEntity(
            title = "آدوبو مرغ",
            ingredients = """
                • ۵۰۰ گرم مرغ
                • نصف پیمانه سس سویا
                • نصف پیمانه سرکه
                • ۵ حبه سیر
                • ۳ برگ بو
                • فلفل سیاه
            """.trimIndent(),
            instructions = """
                ۱. مرغ را با سس سویا، سرکه، سیر و برگ بو مخلوط کنید.
                ۲. ۱ ساعت استراحت دهید.
                ۳. در تابه بپزید.
                ۴. بگذارید سس غلیظ شود.
                ۵. با برنج سرو کنید.
            """.trimIndent(),
            mealType = "dinner",
            region = "rest_asia",
            source = Source.BUILTIN,
        ),
        RecipeEntity(
            title = "سینیگانگ",
            ingredients = """
                • ۵۰۰ گرم گوشت خوک
                • ۱ عدد گوجه‌فرنگی
                • ۱ عدد پیاز
                • ۱ عدد دایکون
                • ۲ عدد فلفل سبز
                • تامارین (آب تمر هندی)
            """.trimIndent(),
            instructions = """
                ۱. گوشت را تفت دهید.
                ۲. پیاز و گوجه را اضافه کنید.
                ۳. آب اضافه کنید و بپزید.
                ۴. دایکون و فلفل را اضافه کنید.
                ۵. تامارین اضافه کنید.
                ۶. با برنج سرو کنید.
            """.trimIndent(),
            mealType = "lunch",
            region = "rest_asia",
            source = Source.BUILTIN,
        ),
        RecipeEntity(
            title = "پانسیت",
            ingredients = """
                • ۲۰۰ گرم نودل
                • ۲۰۰ گرم گوشت خوک
                • ۱۰۰ گرم میگو
                • ۱ عدد کلم
                • ۱ عدد هویج
                • سس سویا، سیر
            """.trimIndent(),
            instructions = """
                ۱. نودل را بپزید.
                ۲. گوشت و میگو را تفت دهید.
                ۳. سبزیجات را اضافه کنید.
                ۴. نودل را اضافه کنید.
                ۵. سس سویا و سیر اضافه کنید.
                ۶. هم بزنید و سرو کنید.
            """.trimIndent(),
            mealType = "lunch",
            region = "rest_asia",
            source = Source.BUILTIN,
        ),
        RecipeEntity(
            title = "لو مپیا",
            ingredients = """
                • ۱۰ عدد خمیر اسپرینگ رول
                • ۲۰۰ گرم گوشت چرخ‌کرده
                • ۱ عدد کلم
                • ۱ عدد هویج
                • سیر، سس سویا
                • روغن
            """.trimIndent(),
            instructions = """
                ۱. گوشت را با سیر تفت دهید.
                ۲. کلم و هویج را اضافه کنید.
                ۳. سس سویا اضافه کنید.
                ۴. در خمیر بپیچید.
                ۵. در روغن سرخ کنید.
                ۶. با سس شیرین سرو کنید.
            """.trimIndent(),
            mealType = "snack",
            region = "rest_asia",
            source = Source.BUILTIN,
        ),
        RecipeEntity(
            title = "هالو هالو فیلیپینی",
            ingredients = """
                • یخ خردشده
                • ۱ پیمانه شیر تغلیظ‌شده
                • ژله رنگی
                • میوه‌های مختلف
                • لوبیا شیرین
                • بستنی
            """.trimIndent(),
            instructions = """
                ۱. یخ را در کاسه بریزید.
                ۲. ژله، میوه و لوبیا را اضافه کنید.
                ۳. شیر تغلیظ‌شده را روی آن بریزید.
                ۴. بستنی را روی آن بگذارید.
                ۵. سرد سرو کنید.
            """.trimIndent(),
            mealType = "dessert",
            region = "rest_asia",
            source = Source.BUILTIN,
        ),

        // ==================== سریلانکا ====================
        RecipeEntity(
            title = "کاری سریلانکایی",
            ingredients = """
                • ۵۰۰ گرم مرغ
                • ۱ قوطی شیر نارگیل
                • ۲ قاشق غذاخوری پودر کاری
                • ۱ عدد پیاز
                • ۲ حبه سیر
                • برگ کاری، دارچین
            """.trimIndent(),
            instructions = """
                ۱. پیاز، سیر و برگ کاری را تفت دهید.
                ۲. پودر کاری را اضافه کنید.
                ۳. شیر نارگیل را اضافه کنید.
                ۴. مرغ را اضافه کنید.
                ۵. ۳۰ دقیقه بپزید.
                ۶. با برنج سرو کنید.
            """.trimIndent(),
            mealType = "dinner",
            region = "rest_asia",
            source = Source.BUILTIN,
        ),
        RecipeEntity(
            title = "هپر",
            ingredients = """
                • ۲۰۰ گرم نودل برنجی
                • ۱ عدد کلم
                • ۱ عدد هویج
                • ۱ عدد فلفل سبز
                • ۱ پیمانه شیر نارگیل
                • ادویه سریلانکایی
            """.trimIndent(),
            instructions = """
                ۱. سبزیجات را برش بزنید.
                ۲. ادویه را تفت دهید.
                ۳. سبزیجات را اضافه کنید.
                ۴. شیر نارگیل را اضافه کنید.
                ۵. نودل را اضافه کنید.
                ۶. با لیمو سرو کنید.
            """.trimIndent(),
            mealType = "lunch",
            region = "rest_asia",
            source = Source.BUILTIN,
        ),
        RecipeEntity(
            title = "کوتو روتی",
            ingredients = """
                • ۲ پیمانه آرد
                • ۱ پیمانه آب
                • ۱ عدد تخم‌مرغ
                • ۱ عدد پیاز
                • ۱ عدد هویج
                • ادویه، نمک
            """.trimIndent(),
            instructions = """
                ۱. آرد، آب و تخم‌مرغ را مخلوط کنید.
                ۲. پیاز و هویج را ریز خرد کنید.
                ۳. به خمیر اضافه کنید.
                ۴. ادویه اضافه کنید.
                ۵. در تابه سرخ کنید.
                ۶. با سس سرو کنید.
            """.trimIndent(),
            mealType = "snack",
            region = "rest_asia",
            source = Source.BUILTIN,
        ),

        // ==================== نپال ====================
        RecipeEntity(
            title = "مومو",
            ingredients = """
                • ۲ پیمانه آرد
                • ۵۰۰ گرم گوشت چرخ‌کرده
                • ۲ عدد پیاز
                • ۲ حبه سیر
                • زنجبیل، گشنیز
                • ادویه نپالی
            """.trimIndent(),
            instructions = """
                ۱. خمیر را درست کنید.
                ۲. گوشت، پیاز، سیر و زنجبیل را مخلوط کنید.
                ۳. ادویه و گشنیز اضافه کنید.
                ۴. خمیر را به دایره‌های کوچک باز کنید.
                ۵. گوشت را وسط بگذارید.
                ۶. بپیچید و بخارپز کنید.
                ۷. با سس گوجه سرو کنید.
            """.trimIndent(),
            mealType = "snack",
            region = "rest_asia",
            source = Source.BUILTIN,
        ),
        RecipeEntity(
            title = "دال بات",
            ingredients = """
                • ۱ پیمانه عدس
                • ۱ پیمانه برنج
                • ۱ عدد پیاز
                • ۲ حبه سیر
                • زنجبیل، زردچوبه
                • گشنیز
            """.trimIndent(),
            instructions = """
                ۱. عدس را بپزید.
                ۲. پیاز، سیر و زنجبیل را تفت دهید.
                ۳. زردچوبه اضافه کنید.
                ۴. عدس را اضافه کنید.
                ۵. برنج را بپزید.
                ۶. با گشنیز سرو کنید.
            """.trimIndent(),
            mealType = "lunch",
            region = "rest_asia",
            source = Source.BUILTIN,
        ),
        RecipeEntity(
            title = "سل روتی",
            ingredients = """
                • ۲ پیمانه آرد برنج
                • ۱ پیمانه آب
                • ۱ قاشق غذاخوری شکر
                • ۱ قاشق چای‌خوری زردچوبه
                • روغن
            """.trimIndent(),
            instructions = """
                ۱. آرد، آب، شکر و زردچوبه را مخلوط کنید.
                ۲. خمیر را ورز دهید.
                ۳. به دایره‌های کوچک باز کنید.
                ۴. در تابه با روغن سرخ کنید.
                ۵. با کاری سرو کنید.
            """.trimIndent(),
            mealType = "dessert",
            region = "rest_asia",
            source = Source.BUILTIN,
        ),
        RecipeEntity(
            title = "تھوکپا",
            ingredients = """
                • ۲۰۰ گرم نودل
                • ۱ لیتر آب مرغ
                • ۲۰۰ گرم گوشت گاو
                • ۱ عدد پیاز
                • ۲ حبه سیر
                • زنجبیل، گشنیز
            """.trimIndent(),
            instructions = """
                ۱. آب مرغ را بجوشانید.
                ۲. پیاز، سیر و زنجبیل اضافه کنید.
                ۳. گوشت را اضافه کنید.
                ۴. نودل را اضافه کنید.
                ۵. با گشنیز و لیمو سرو کنید.
            """.trimIndent(),
            mealType = "dinner",
            region = "rest_asia",
            source = Source.BUILTIN,
        ),
        RecipeEntity(
            title = "کیر",
            ingredients = """
                • ۱ لیتر شیر
                • نصف پیمانه برنج
                • ۱ پیمانه شکر
                • زعفران، هل، بادام
            """.trimIndent(),
            instructions = """
                ۱. برنج را با شیر بپزید.
                ۲. شکر را اضافه کنید.
                ۳. زعفران و هل اضافه کنید.
                ۴. هم بزنید تا غلیظ شود.
                ۵. با بادام تزیین کنید.
                ۶. سرد سرو کنید.
            """.trimIndent(),
            mealType = "dessert",
            region = "rest_asia",
            source = Source.BUILTIN,
        ),

        // ==================== بنگلادش ====================
        RecipeEntity(
            title = "بiryani بنگلادشی",
            ingredients = """
                • ۵۰۰ گرم گوشت گوسفندی
                • ۲ پیمانه برنج باسماتی
                • ۱ پیمانه ماست
                • ۲ عدد پیاز
                • ادویه بریانی
                • زعفران، خلال بادام
            """.trimIndent(),
            instructions = """
                ۱. پیاز را سرخ کنید.
                ۲. گوشت را اضافه کنید.
                ۳. ماست و ادویه اضافه کنید.
                ۴. برنج را نیم‌پز کنید.
                ۵. لایه‌لایه بچینید.
                ۶. با زعفران و بادام تزیین کنید.
                ۷. ۳۰ دقیقه دم کنید.
            """.trimIndent(),
            mealType = "lunch",
            region = "rest_asia",
            source = Source.BUILTIN,
        ),
        RecipeEntity(
            title = "مچر جول",
            ingredients = """
                • ۵۰۰ گرم ماهی
                • ۱ عدد پیاز
                • ۲ حبه سیر
                • زردچوبه، فلفل قرمز
                • گشنیز
                • روغن خردل
            """.trimIndent(),
            instructions = """
                ۱. پیاز، سیر و ادویه را تفت دهید.
                ۲. ماهی را اضافه کنید.
                ۳. آب اضافه کنید.
                ۴. ۲۰ دقیقه بپزید.
                ۵. با گشنیز و برنج سرو کنید.
            """.trimIndent(),
            mealType = "lunch",
            region = "rest_asia",
            source = Source.BUILTIN,
        ),
        RecipeEntity(
            title = "پانته بهات",
            ingredients = """
                • ۲ پیمانه برنج
                • ۴ پیمانه آب
                • ۱ عدد پیاز
                • ۲ عدد فلفل سبز
                • ماست، لیمو
            """.trimIndent(),
            instructions = """
                ۱. برنج را با آب بپزید.
                ۲. یک شب بگذارید تا تخمیر شود.
                ۳. پیاز و فلفل را تفت دهید.
                ۴. روی برنج بریزید.
                ۵. با ماست و لیمو سرو کنید.
            """.trimIndent(),
            mealType = "breakfast",
            region = "rest_asia",
            source = Source.BUILTIN,
        ),

        // ==================== غذاهای دریایی و گیاهی ====================
        RecipeEntity(
            title = "کاری سبزیجات هندی",
            ingredients = """
                • ۲ عدد سیب‌زمینی
                • ۱ عدد بادمجان
                • ۱ عدد فلفل دلمه
                • ۱ پیمانه نخود فرنگی
                • ادویه کاری
                • شیر نارگیل
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
            title = "چتنی نعنا",
            ingredients = """
                • ۱ دسته نعنا
                • ۱ دسته گشنیز
                • ۲ عدد فلفل سبز
                • ۱ عدد پیاز
                • آبلیمو، نمک
            """.trimIndent(),
            instructions = """
                ۱. همه مواد را در مخلوط‌کن بریزید.
                ۲. کمی آب اضافه کنید.
                ۳. پوره کنید.
                ۴. با غذاهای هندی سرو کنید.
            """.trimIndent(),
            mealType = "appetizer",
            region = "rest_asia",
            source = Source.BUILTIN,
        ),
        RecipeEntity(
            title = "رایتا",
            ingredients = """
                • ۱ پیمانه ماست
                • ۱ عدد خیار
                • ۱ عدد گوجه‌فرنگی
                • ۱ عدد پیاز
                • زیره، نعنا خشک
            """.trimIndent(),
            instructions = """
                ۱. سبزیجات را ریز خرد کنید.
                ۲. با ماست مخلوط کنید.
                ۳. زیره و نعنا اضافه کنید.
                ۴. سرد سرو کنید.
            """.trimIndent(),
            mealType = "appetizer",
            region = "rest_asia",
            source = Source.BUILTIN,
        ),
        RecipeEntity(
            title = "دال سوپ",
            ingredients = """
                • ۱ پیمانه عدس
                • ۱ عدد پیاز
                • ۲ حبه سیر
                • زردچوبه، زیره
                • گشنیز
                • لیمو
            """.trimIndent(),
            instructions = """
                ۱. عدس را بپزید.
                ۲. پیاز و سیر را تفت دهید.
                ۳. زردچوبه و زیره اضافه کنید.
                ۴. عدس را اضافه کنید.
                ۵. با گشنیز و لیمو سرو کنید.
            """.trimIndent(),
            mealType = "appetizer",
            region = "rest_asia",
            source = Source.BUILTIN,
        ),
        RecipeEntity(
            title = "پنیر پالاک",
            ingredients = """
                • ۵۰۰ گرم اسفناج
                • ۲۰۰ گرم پنیر پنیر
                • ۲ عدد پیاز
                • ۲ حبه سیر
                • گارام ماسالا
                • خامه
            """.trimIndent(),
            instructions = """
                ۱. اسفناج را بپزید و پوره کنید.
                ۲. پیاز و سیر را تفت دهید.
                ۳. گارام ماسالا اضافه کنید.
                ۴. اسفناج را اضافه کنید.
                ۵. پنیر را اضافه کنید.
                ۶. با خامه سرو کنید.
            """.trimIndent(),
            mealType = "dinner",
            region = "rest_asia",
            source = Source.BUILTIN,
        ),
        RecipeEntity(
            title = "بریانی سبزیجات",
            ingredients = """
                • ۲ پیمانه برنج
                • ۱ عدد گل کلم
                • ۱ عدد هویج
                • ۱ پیمانه نخود فرنگی
                • ادویه بریانی
                • پیاز سرخ‌شده
            """.trimIndent(),
            instructions = """
                ۱. سبزیجات را بپزید.
                ۲. برنج را نیم‌پز کنید.
                ۳. لایه‌لایه بچینید.
                ۴. پیاز سرخ‌شده اضافه کنید.
                ۵. ۳۰ دقیقه دم کنید.
                ۶. با ماست سرو کنید.
            """.trimIndent(),
            mealType = "lunch",
            region = "rest_asia",
            source = Source.BUILTIN,
        ),
        RecipeEntity(
            title = "کباب ماهی هندی",
            ingredients = """
                • ۵۰۰ گرم ماهی
                • ۱ پیمانه ماست
                • ۲ قاشق غذاخوری ادویه
                • ۲ حبه سیر
                • زنجبیل، لیمو
            """.trimIndent(),
            instructions = """
                ۱. ماهی را برش بزنید.
                ۲. ماست، ادویه، سیر و زنجبیل را مخلوط کنید.
                ۳. ماهی را در سس بخیسانید.
                ۴. ۱ ساعت استراحت دهید.
                ۵. روی گریل کباب کنید.
                ۶. با لیمو سرو کنید.
            """.trimIndent(),
            mealType = "dinner",
            region = "rest_asia",
            source = Source.BUILTIN,
        ),
    )
}