package com.sholehbashi.app.data.db.seed

import com.sholehbashi.app.data.Source
import com.sholehbashi.app.data.db.RecipeEntity

object HealthyRecipes {
    val all: List<RecipeEntity> = listOf(
        // ==================== صبحانه سالم ====================
        RecipeEntity(
            title = "اوتمیل شب‌مانده",
            ingredients = """
                • ۱ پیمانه جو دوسر
                • ۱ پیمانه شیر بادام
                • ۱ قاشق غذاخوری دانه چیا
                • ۱ قاشق غذاخوری عسل
                • توت‌فرنگی، موز
                • دارچین
            """.trimIndent(),
            instructions = """
                ۱. جو دوسر، شیر بادام، چیا و عسل را مخلوط کنید.
                ۲. در ظرف دربسته بریزید.
                ۳. یک شب در یخچال بگذارید.
                ۴. صبح با توت و موز سرو کنید.
                ۵. دارچین بپاشید.
            """.trimIndent(),
            mealType = "breakfast",
            region = "europe",
            source = Source.BUILTIN,
        ),
        RecipeEntity(
            title = "اسموتی سبز",
            ingredients = """
                • ۲ پیمانه اسفناج تازه
                • ۱ عدد موز
                • ۱ عدد سیب سبز
                • ۱ پیمانه آب نارگیل
                • ۱ قاشق غذاخوری عسل
                • یخ
            """.trimIndent(),
            instructions = """
                ۱. همه مواد را در مخلوط‌کن بریزید.
                ۲. پوره کنید تا صاف شود.
                ۳. در لیوان بریزید.
                ۴. فوری سرو کنید.
            """.trimIndent(),
            mealType = "breakfast",
            region = "americas",
            source = Source.BUILTIN,
        ),
        RecipeEntity(
            title = "املت اسفناج و قارچ",
            ingredients = """
                • ۳ عدد تخم‌مرغ
                • ۱ پیمانه اسفناج
                • ۱۰۰ گرم قارچ
                • ۱ عدد پیاز
                • ۱ قاشق غذاخوری روغن زیتون
                • نمک، فلفل
            """.trimIndent(),
            instructions = """
                ۱. پیاز را در روغن زیتون تفت دهید.
                ۲. قارچ را اضافه کنید.
                ۳. اسفناج را اضافه کنید.
                ۴. تخم‌مرغ‌ها را هم بزنید و بریزید.
                ۵. بپزید و سرو کنید.
            """.trimIndent(),
            mealType = "breakfast",
            region = "europe",
            source = Source.BUILTIN,
        ),
        RecipeEntity(
            title = "توست آووکادو",
            ingredients = """
                • ۲ برش نان سبوس‌دار
                • ۱ عدد آووکادو
                • ۱ عدد تخم‌مرغ آب‌پز
                • ۱ عدد گوجه‌فرنگی
                • آبلیمو، نمک، فلفل
            """.trimIndent(),
            instructions = """
                ۱. نان را تست کنید.
                ۲. آووکادو را له کنید.
                ۳. آبلیمو، نمک و فلفل اضافه کنید.
                ۴. روی نان بمالید.
                ۵. تخم‌مرغ و گوجه را روی آن بچینید.
                ۶. سرو کنید.
            """.trimIndent(),
            mealType = "breakfast",
            region = "americas",
            source = Source.BUILTIN,
        ),
        RecipeEntity(
            title = "پارفه ماست و میوه",
            ingredients = """
                • ۱ پیمانه ماست یونانی
                • نصف پیمانه گرانولا
                • ۱ عدد موز
                • ۱ پیمانه توت‌فرنگی
                • ۱ قاشق غذاخوری عسل
            """.trimIndent(),
            instructions = """
                ۱. ماست را در لیوان بریزید.
                ۲. گرانولا اضافه کنید.
                ۳. میوه‌ها را برش بزنید و بچینید.
                ۴. دوباره ماست و گرانولا اضافه کنید.
                ۵. با عسل سرو کنید.
            """.trimIndent(),
            mealType = "breakfast",
            region = "europe",
            source = Source.BUILTIN,
        ),
        RecipeEntity(
            title = "پنکیک جو دوسر",
            ingredients = """
                • ۱ پیمانه جو دوسر
                • ۱ عدد موز
                • ۲ عدد تخم‌مرغ
                • ۱ قاشق چای‌خوری بیکینگ پودر
                • دارچین، عسل
            """.trimIndent(),
            instructions = """
                ۱. جو دوسر را آسیاب کنید.
                ۲. موز، تخم‌مرغ و بیکینگ پودر اضافه کنید.
                ۳. مخلوط کنید.
                ۴. در تابه بپزید.
                ۵. با عسل و میوه سرو کنید.
            """.trimIndent(),
            mealType = "breakfast",
            region = "europe",
            source = Source.BUILTIN,
        ),
        RecipeEntity(
            title = "اسموتی بری",
            ingredients = """
                • ۱ پیمانه توت‌فرنگی
                • ۱ پیمانه بلوبری
                • ۱ عدد موز
                • ۱ پیمانه ماست یونانی
                • ۱ قاشق غذاخوری عسل
            """.trimIndent(),
            instructions = """
                ۱. همه مواد را در مخلوط‌کن بریزید.
                ۲. پوره کنید.
                ۳. در لیوان بریزید.
                ۴. با توت تزیین کنید.
                ۵. سرد سرو کنید.
            """.trimIndent(),
            mealType = "breakfast",
            region = "europe",
            source = Source.BUILTIN,
        ),
        RecipeEntity(
            title = "تخم‌مرغ آب‌پز و سبزیجات",
            ingredients = """
                • ۳ عدد تخم‌مرغ
                • ۱ عدد گوجه‌فرنگی
                • ۱ عدد خیار
                • ۱ عدد فلفل دلمه
                • ۱ قاشق غذاخوری روغن زیتون
                • نمک، فلفل
            """.trimIndent(),
            instructions = """
                ۱. تخم‌مرغ‌ها را آب‌پز کنید.
                ۲. سبزیجات را برش بزنید.
                ۳. همه را در بشقاب بچینید.
                ۴. با روغن زیتون، نمک و فلفل سرو کنید.
            """.trimIndent(),
            mealType = "breakfast",
            region = "europe",
            source = Source.BUILTIN,
        ),

        // ==================== سالادهای سالم ====================
        RecipeEntity(
            title = "سالاد کینوآ و سبزیجات",
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
            title = "سالاد نخود و پنیر",
            ingredients = """
                • ۲ پیمانه نخود
                • ۱۰۰ گرم پنیر فتا
                • ۱ عدد خیار
                • ۱ عدد گوجه‌فرنگی
                • ۱ عدد پیاز قرمز
                • آبلیمو، روغن زیتون، نعنا
            """.trimIndent(),
            instructions = """
                ۱. نخود را بپزید.
                ۲. سبزیجات را خرد کنید.
                ۳. همه را مخلوط کنید.
                ۴. پنیر فتا اضافه کنید.
                ۵. با آبلیمو، روغن زیتون و نعنا سرو کنید.
            """.trimIndent(),
            mealType = "salad",
            region = "europe",
            source = Source.BUILTIN,
        ),
        RecipeEntity(
            title = "سالاد چغندر و گردو",
            ingredients = """
                • ۲ عدد چغندر
                • ۱ پیمانه گردو
                • ۱۰۰ گرم پنیر بز
                • ۱ دسته کاهو
                • روغن زیتون، سرکه بالزامیک
            """.trimIndent(),
            instructions = """
                ۱. چغندر را بپزید و برش بزنید.
                ۲. کاهو را خرد کنید.
                ۳. گردو و پنیر اضافه کنید.
                ۴. با روغن زیتون و سرکه سرو کنید.
            """.trimIndent(),
            mealType = "salad",
            region = "europe",
            source = Source.BUILTIN,
        ),
        RecipeEntity(
            title = "سالاد مرغ گریل",
            ingredients = """
                • ۲ عدد سینه مرغ
                • ۱ دسته کاهو
                • ۱ عدد گوجه‌فرنگی
                • ۱ عدد خیار
                • ۱۰۰ گرم پنیر پارمزان
                • آبلیمو، روغن زیتون
            """.trimIndent(),
            instructions = """
                ۱. مرغ را گریل کنید و برش بزنید.
                ۲. سبزیجات را خرد کنید.
                ۳. همه را مخلوط کنید.
                ۴. با آبلیمو و روغن زیتون سرو کنید.
            """.trimIndent(),
            mealType = "salad",
            region = "europe",
            source = Source.BUILTIN,
        ),
        RecipeEntity(
            title = "سالاد عدس و اسفناج",
            ingredients = """
                • ۱ پیمانه عدس
                • ۲ پیمانه اسفناج
                • ۱ عدد پیاز قرمز
                • ۱ عدد گوجه‌فرنگی
                • سرکه بالزامیک، روغن زیتون
            """.trimIndent(),
            instructions = """
                ۱. عدس را بپزید.
                ۲. اسفناج را بشویید.
                ۳. پیاز و گوجه را خرد کنید.
                ۴. همه را مخلوط کنید.
                ۵. با سرکه و روغن زیتون سرو کنید.
            """.trimIndent(),
            mealType = "salad",
            region = "europe",
            source = Source.BUILTIN,
        ),
        RecipeEntity(
            title = "سالاد کلم و هویج",
            ingredients = """
                • ۲ پیمانه کلم رنده‌شده
                • ۲ عدد هویج رنده‌شده
                • ۱ عدد سیب
                • ۲ قاشق غذاخوری مایونز کم‌چرب
                • آبلیمو، عسل
            """.trimIndent(),
            instructions = """
                ۱. کلم و هویج را رنده کنید.
                ۲. سیب را خلالی خرد کنید.
                ۳. همه را مخلوط کنید.
                ۴. مایونز، آبلیمو و عسل اضافه کنید.
                ۵. سرد سرو کنید.
            """.trimIndent(),
            mealType = "salad",
            region = "europe",
            source = Source.BUILTIN,
        ),
        RecipeEntity(
            title = "سالاد تن ماهی و لوبیا",
            ingredients = """
                • ۱ قوطی تن ماهی
                • ۱ پیمانه لوبیا سبز
                • ۱ عدد گوجه‌فرنگی
                • ۱ عدد خیار
                • ۱ عدد پیاز قرمز
                • آبلیمو، روغن زیتون
            """.trimIndent(),
            instructions = """
                ۱. لوبیا را بپزید.
                ۲. سبزیجات را خرد کنید.
                ۳. تن ماهی را اضافه کنید.
                ۴. همه را مخلوط کنید.
                ۵. با آبلیمو و روغن زیتون سرو کنید.
            """.trimIndent(),
            mealType = "salad",
            region = "europe",
            source = Source.BUILTIN,
        ),

        // ==================== ناهار و شام کم‌کالری ====================
        RecipeEntity(
            title = "سینه مرغ گریل با سبزیجات",
            ingredients = """
                • ۲ عدد سینه مرغ
                • ۱ عدد کدو
                • ۱ عدد بادمجان
                • ۱ عدد فلفل دلمه
                • ۲ قاشق غذاخوری روغن زیتون
                • لیمو، نمک، فلفل
            """.trimIndent(),
            instructions = """
                ۱. مرغ را با لیمو، نمک و فلفل مزه‌دار کنید.
                ۲. سبزیجات را برش بزنید.
                ۳. همه را روی گریل بپزید.
                ۴. با روغن زیتون سرو کنید.
            """.trimIndent(),
            mealType = "dinner",
            region = "europe",
            source = Source.BUILTIN,
        ),
        RecipeEntity(
            title = "ماهی سالمون با کینوآ",
            ingredients = """
                • ۲ فیله سالمون
                • ۱ پیمانه کینوآ
                • ۱ عدد لیمو
                • ۱ قاشق غذاخوری روغن زیتون
                • شوید، نمک، فلفل
            """.trimIndent(),
            instructions = """
                ۱. کینوآ را بپزید.
                ۲. سالمون را با لیمو و ادویه مزه‌دار کنید.
                ۳. در تابه گریل کنید.
                ۴. با کینوآ و شوید سرو کنید.
            """.trimIndent(),
            mealType = "dinner",
            region = "europe",
            source = Source.BUILTIN,
        ),
        RecipeEntity(
            title = "خورش سبزیجات رژیمی",
            ingredients = """
                • ۱ عدد کدو
                • ۱ عدد بادمجان
                • ۲ عدد گوجه‌فرنگی
                • ۱ عدد پیاز
                • ۲ حبه سیر
                • روغن زیتون، ادویه
            """.trimIndent(),
            instructions = """
                ۱. پیاز و سیر را تفت دهید.
                ۲. سبزیجات را اضافه کنید.
                ۳. ادویه اضافه کنید.
                ۴. آب اضافه کنید و بپزید.
                ۵. ۳۰ دقیقه بپزید.
                ۶. گرم سرو کنید.
            """.trimIndent(),
            mealType = "dinner",
            region = "europe",
            source = Source.BUILTIN,
        ),
        RecipeEntity(
            title = "کتلت مرغ و سبزیجات",
            ingredients = """
                • ۵۰۰ گرم سینه مرغ چرخ‌کرده
                • ۱ عدد هویج
                • ۱ عدد کدو
                • ۱ عدد پیاز
                • ۱ عدد تخم‌مرغ
                • ادویه، نمک
            """.trimIndent(),
            instructions = """
                ۱. سبزیجات را رنده کنید.
                ۲. با مرغ چرخ‌کرده مخلوط کنید.
                ۳. تخم‌مرغ و ادویه اضافه کنید.
                ۴. به شکل کتلت درآورید.
                ۵. در فر ۱۸۰ درجه بپزید.
            """.trimIndent(),
            mealType = "dinner",
            region = "europe",
            source = Source.BUILTIN,
        ),
        RecipeEntity(
            title = "سوپ سبزیجات رژیمی",
            ingredients = """
                • ۲ عدد هویج
                • ۲ عدد کرفس
                • ۱ عدد پیاز
                • ۲ عدد گوجه‌فرنگی
                • ۱ عدد کدو
                • آب مرغ کم‌چرب
            """.trimIndent(),
            instructions = """
                ۱. سبزیجات را خرد کنید.
                ۲. با آب مرغ بپزید.
                ۳. ۳۰ دقیقه بپزید.
                ۴. با مخلوط‌کن پوره کنید.
                ۵. گرم سرو کنید.
            """.trimIndent(),
            mealType = "dinner",
            region = "europe",
            source = Source.BUILTIN,
        ),
        RecipeEntity(
            title = "خوراک لوبیا و اسفناج",
            ingredients = """
                • ۲ پیمانه لوبیا
                • ۳ پیمانه اسفناج
                • ۲ حبه سیر
                • ۱ عدد پیاز
                • ۲ قاشق غذاخوری روغن زیتون
                • آبلیمو، ادویه
            """.trimIndent(),
            instructions = """
                ۱. پیاز و سیر را تفت دهید.
                ۲. لوبیا را اضافه کنید.
                ۳. اسفناج را اضافه کنید.
                ۴. ادویه و آبلیمو اضافه کنید.
                ۵. ۱۵ دقیقه بپزید.
                ۶. سرو کنید.
            """.trimIndent(),
            mealType = "dinner",
            region = "europe",
            source = Source.BUILTIN,
        ),
        RecipeEntity(
            title = "خوراک مرغ و کلم بروکلی",
            ingredients = """
                • ۵۰۰ گرم سینه مرغ
                • ۱ عدد کلم بروکلی
                • ۲ حبه سیر
                • ۲ قاشق غذاخوری سس سویا
                • ۱ قاشق غذاخوری روغن کنجد
                • زنجبیل
            """.trimIndent(),
            instructions = """
                ۱. مرغ را نوارهای نازک برش بزنید.
                ۲. سیر و زنجبیل را تفت دهید.
                ۳. مرغ را اضافه کنید.
                ۴. کلم بروکلی را اضافه کنید.
                ۵. سس سویا و روغن کنجد اضافه کنید.
                ۶. ۱۰ دقیقه بپزید.
            """.trimIndent(),
            mealType = "dinner",
            region = "east_asia",
            source = Source.BUILTIN,
        ),
        RecipeEntity(
            title = "خوراک بادمجان و عدس",
            ingredients = """
                • ۲ عدد بادمجان
                • ۱ پیمانه عدس
                • ۲ عدد گوجه‌فرنگی
                • ۱ عدد پیاز
                • ۲ حبه سیر
                • ادویه، روغن زیتون
            """.trimIndent(),
            instructions = """
                ۱. بادمجان را کبابی کنید.
                ۲. پیاز و سیر را تفت دهید.
                ۳. عدس را بپزید.
                ۴. گوجه را اضافه کنید.
                ۵. بادمجان را اضافه کنید.
                ۶. با ادویه و روغن زیتون سرو کنید.
            """.trimIndent(),
            mealType = "dinner",
            region = "europe",
            source = Source.BUILTIN,
        ),
        RecipeEntity(
            title = "کتلت سبزیجات",
            ingredients = """
                • ۲ عدد سیب‌زمینی
                • ۲ عدد هویج
                • ۱ عدد کدو
                • ۱ عدد پیاز
                • ۱ عدد تخم‌مرغ
                • آرد سوخاری، ادویه
            """.trimIndent(),
            instructions = """
                ۱. سبزیجات را رنده کنید.
                ۲. تخم‌مرغ و ادویه اضافه کنید.
                ۳. آرد سوخاری اضافه کنید.
                ۴. به شکل کتلت درآورید.
                ۵. در فر ۱۸۰ درجه بپزید.
            """.trimIndent(),
            mealType = "dinner",
            region = "europe",
            source = Source.BUILTIN,
        ),

        // ==================== میان‌وعده‌های سالم ====================
        RecipeEntity(
            title = "اسموتی سبز و پروتئین",
            ingredients = """
                • ۲ پیمانه اسفناج
                • ۱ عدد موز
                • ۱ قاشق غذاخوری پودر پروتئین
                • ۱ پیمانه شیر بادام
                • ۱ قاشق غذاخوری عسل
                • یخ
            """.trimIndent(),
            instructions = """
                ۱. همه مواد را در مخلوط‌کن بریزید.
                ۲. پوره کنید.
                ۳. در لیوان بریزید.
                ۴. فوری سرو کنید.
            """.trimIndent(),
            mealType = "snack",
            region = "americas",
            source = Source.BUILTIN,
        ),
        RecipeEntity(
            title = "انرژی بال چیا",
            ingredients = """
                • ۱ پیمانه خرما
                • ۱ پیمانه گردو
                • ۲ قاشق غذاخوری دانه چیا
                • ۲ قاشق غذاخوری پودر کاکائو
                • نارگیل رنده‌شده
            """.trimIndent(),
            instructions = """
                ۱. خرما و گردو را در مخلوط‌کن بریزید.
                ۲. چیا و کاکائو اضافه کنید.
                ۳. به شکل توپ درآورید.
                ۴. در نارگیل بزنید.
                ۵. در یخچال نگه دارید.
            """.trimIndent(),
            mealType = "snack",
            region = "americas",
            source = Source.BUILTIN,
        ),
        RecipeEntity(
            title = "ماست و خیار و نعنا",
            ingredients = """
                • ۱ پیمانه ماست کم‌چرب
                • ۱ عدد خیار
                • ۲ قاشق غذاخوری نعنا خشک
                • ۱ قاشق غذاخوری روغن زیتون
                • گردو، نمک
            """.trimIndent(),
            instructions = """
                ۱. خیار را رنده کنید و آبش را بگیرید.
                ۲. با ماست مخلوط کنید.
                ۳. نعنا و نمک اضافه کنید.
                ۴. روغن زیتون و گردو روی آن بریزید.
                ۵. سرد سرو کنید.
            """.trimIndent(),
            mealType = "snack",
            region = "iran",
            source = Source.BUILTIN,
        ),
        RecipeEntity(
            title = "هوموس سبزیجات",
            ingredients = """
                • ۱ پیمانه نخود
                • ۳ قاشق غذاخوری ارده
                • ۲ حبه سیر
                • آبلیمو، روغن زیتون
                • هویج، خیار، فلفل دلمه
            """.trimIndent(),
            instructions = """
                ۱. نخود را بپزید.
                ۲. با ارده، سیر، آبلیمو و ادویه مخلوط کنید.
                ۳. پوره کنید.
                ۴. با سبزیجات تازه سرو کنید.
            """.trimIndent(),
            mealType = "snack",
            region = "arab",
            source = Source.BUILTIN,
        ),
        RecipeEntity(
            title = "میوه خشک و مغزها",
            ingredients = """
                • ۱ پیمانه بادام
                • ۱ پیمانه گردو
                • ۱ پیمانه پسته
                • ۱ پیمانه خرما
                • ۱ پیمانه توت خشک
                • ۱ پیمانه کشمش
            """.trimIndent(),
            instructions = """
                ۱. همه مواد را مخلوط کنید.
                ۲. در ظرف دربسته بریزید.
                ۳. به عنوان میان‌وعده مصرف کنید.
                ۴. در یخچال نگه دارید.
            """.trimIndent(),
            mealType = "snack",
            region = "iran",
            source = Source.BUILTIN,
        ),
        RecipeEntity(
            title = "پاپ کورن خانگی",
            ingredients = """
                • نصف پیمانه ذرت بوداده
                • ۲ قاشق غذاخوری روغن نارگیل
                • نمک دریا
                • پاپریکا (اختیاری)
            """.trimIndent(),
            instructions = """
                ۱. روغن را در قابلمه گرم کنید.
                ۲. ذرت را اضافه کنید.
                ۳. درب را بگذارید.
                ۴. روی حرارت متوسط بگذارید تا پاپ شود.
                ۵. نمک و پاپریکا بپاشید.
            """.trimIndent(),
            mealType = "snack",
            region = "americas",
            source = Source.BUILTIN,
        ),
        RecipeEntity(
            title = "سینه مرغ و آووکادو",
            ingredients = """
                • ۲ عدد سینه مرغ
                • ۱ عدد آووکادو
                • ۱ عدد گوجه‌فرنگی
                • ۱ دسته کاهو
                • آبلیمو، روغن زیتون
            """.trimIndent(),
            instructions = """
                ۱. مرغ را گریل کنید و برش بزنید.
                ۲. آووکادو و گوجه را برش بزنید.
                ۳. کاهو را خرد کنید.
                ۴. همه را در بشقاب بچینید.
                ۵. با آبلیمو و روغن زیتون سرو کنید.
            """.trimIndent(),
            mealType = "snack",
            region = "americas",
            source = Source.BUILTIN,
        ),

        // ==================== نوشیدنی‌های سالم ====================
        RecipeEntity(
            title = "آب سبزیجات سبز",
            ingredients = """
                • ۲ پیمانه اسفناج
                • ۱ عدد خیار
                • ۱ عدد سیب سبز
                • ۱ عدد لیمو
                • ۱ قاشق غذاخوری عسل
                • ۲ پیمانه آب
            """.trimIndent(),
            instructions = """
                ۱. همه مواد را در مخلوط‌کن بریزید.
                ۲. صاف کنید.
                ۳. در لیوان بریزید.
                ۴. سرد سرو کنید.
            """.trimIndent(),
            mealType = "snack",
            region = "europe",
            source = Source.BUILTIN,
        ),
        RecipeEntity(
            title = "آب هویج و پرتقال",
            ingredients = """
                • ۴ عدد هویج
                • ۳ عدد پرتقال
                • ۱ عدد لیمو
                • ۱ قاشق چای‌خوری زنجبیل رنده‌شده
                • یخ
            """.trimIndent(),
            instructions = """
                ۱. هویج و پرتقال را آب بگیرید.
                ۲. لیمو و زنجبیل اضافه کنید.
                ۳. در لیوان بریزید.
                ۴. با یخ سرو کنید.
            """.trimIndent(),
            mealType = "snack",
            region = "europe",
            source = Source.BUILTIN,
        ),
        RecipeEntity(
            title = "چای سبز و لیمو",
            ingredients = """
                • ۱ عدد چای سبز کیسه‌ای
                • ۲ پیمانه آب جوش
                • ۱ عدد لیمو
                • ۱ قاشق غذاخوری عسل
                • نعنا
            """.trimIndent(),
            instructions = """
                ۱. چای سبز را در آب جوش دم کنید.
                ۲. لیمو و عسل اضافه کنید.
                ۳. نعنا اضافه کنید.
                ۴. گرم یا سرد سرو کنید.
            """.trimIndent(),
            mealType = "snack",
            region = "east_asia",
            source = Source.BUILTIN,
        ),
        RecipeEntity(
            title = "دم‌نوش زنجبیل و دارچین",
            ingredients = """
                • ۱ قاشق غذاخوری زنجبیل رنده‌شده
                • ۱ عدد دارچین چوبی
                • ۲ پیمانه آب
                • ۱ قاشق غذاخوری عسل
                • ۱ عدد لیمو
            """.trimIndent(),
            instructions = """
                ۱. آب را بجوشانید.
                ۲. زنجبیل و دارچین اضافه کنید.
                ۳. ۱۰ دقیقه دم کنید.
                ۴. عسل و لیمو اضافه کنید.
                ۵. گرم سرو کنید.
            """.trimIndent(),
            mealType = "snack",
            region = "rest_asia",
            source = Source.BUILTIN,
        ),
        RecipeEntity(
            title = "اسموتی انبه و زردچوبه",
            ingredients = """
                • ۲ عدد انبه
                • ۱ عدد موز
                • ۱ پیمانه شیر نارگیل
                • ۱ قاشق چای‌خوری زردچوبه
                • ۱ قاشق غذاخوری عسل
                • یخ
            """.trimIndent(),
            instructions = """
                ۱. همه مواد را در مخلوط‌کن بریزید.
                ۲. پوره کنید.
                ۳. در لیوان بریزید.
                ۴. سرد سرو کنید.
            """.trimIndent(),
            mealType = "snack",
            region = "rest_asia",
            source = Source.BUILTIN,
        ),

        // ==================== غذاهای گیاهی و رژیمی ====================
        RecipeEntity(
            title = "برگر لوبیا و جو",
            ingredients = """
                • ۲ پیمانه لوبیا
                • ۱ پیمانه جو دوسر
                • ۱ عدد پیاز
                • ۲ حبه سیر
                • ۱ عدد تخم‌مرغ
                • ادویه، نمک
            """.trimIndent(),
            instructions = """
                ۱. لوبیا را بپزید و له کنید.
                ۲. جو دوسر، پیاز و سیر اضافه کنید.
                ۳. تخم‌مرغ و ادویه اضافه کنید.
                ۴. به شکل برگر درآورید.
                ۵. در فر ۱۸۰ درجه بپزید.
                ۶. در نان سبوس‌دار سرو کنید.
            """.trimIndent(),
            mealType = "lunch",
            region = "americas",
            source = Source.BUILTIN,
        ),
        RecipeEntity(
            title = "خوراک نخود و اسفناج",
            ingredients = """
                • ۲ پیمانه نخود
                • ۳ پیمانه اسفناج
                • ۱ عدد پیاز
                • ۲ حبه سیر
                • ۲ قاشق غذاخوری رب گوجه
                • ادویه، روغن زیتون
            """.trimIndent(),
            instructions = """
                ۱. نخود را از شب قبل خیس کنید.
                ۲. پیاز و سیر را تفت دهید.
                ۳. رب گوجه اضافه کنید.
                ۴. نخود را اضافه کنید.
                ۵. اسفناج را اضافه کنید.
                ۶. ۳۰ دقیقه بپزید.
            """.trimIndent(),
            mealType = "dinner",
            region = "rest_asia",
            source = Source.BUILTIN,
        ),
        RecipeEntity(
            title = "کلم پیچ و سیب‌زمینی شیرین",
            ingredients = """
                • ۲ عدد سیب‌زمینی شیرین
                • ۱ دسته کلم پیچ
                • ۱ عدد پیاز
                • ۲ حبه سیر
                • روغن زیتون، ادویه
            """.trimIndent(),
            instructions = """
                ۱. سیب‌زمینی را مکعبی خرد کنید.
                ۲. در فر ۲۰۰ درجه بپزید.
                ۳. کلم پیچ را خرد کنید.
                ۴. پیاز و سیر را تفت دهید.
                ۵. کلم را اضافه کنید.
                ۶. با سیب‌زمینی سرو کنید.
            """.trimIndent(),
            mealType = "dinner",
            region = "americas",
            source = Source.BUILTIN,
        ),
        RecipeEntity(
            title = "خوراک عدس و کدو",
            ingredients = """
                • ۱ پیمانه عدس
                • ۲ عدد کدو
                • ۱ عدد پیاز
                • ۲ حبه سیر
                • ۲ قاشق غذاخوری رب گوجه
                • ادویه، روغن زیتون
            """.trimIndent(),
            instructions = """
                ۱. عدس را بپزید.
                ۲. پیاز و سیر را تفت دهید.
                ۳. رب گوجه اضافه کنید.
                ۴. کدو را اضافه کنید.
                ۵. عدس را اضافه کنید.
                ۶. ۲۰ دقیقه بپزید.
            """.trimIndent(),
            mealType = "dinner",
            region = "europe",
            source = Source.BUILTIN,
        ),
        RecipeEntity(
            title = "سالاد کلم بروکلی و بادام",
            ingredients = """
                • ۲ پیمانه کلم بروکلی
                • نصف پیمانه بادام
                • ۱ عدد پیاز قرمز
                • ۱ عدد لیمو
                • روغن زیتون، نمک، فلفل
            """.trimIndent(),
            instructions = """
                ۱. کلم بروکلی را بخارپز کنید.
                ۲. بادام را تفت دهید.
                ۳. پیاز را خرد کنید.
                ۴. همه را مخلوط کنید.
                ۵. با آبلیمو و روغن زیتون سرو کنید.
            """.trimIndent(),
            mealType = "salad",
            region = "europe",
            source = Source.BUILTIN,
        ),
        RecipeEntity(
            title = "خوراک گل کلم و زردچوبه",
            ingredients = """
                • ۱ عدد گل کلم
                • ۲ قاشق غذاخوری روغن زیتون
                • ۱ قاشق چای‌خوری زردچوبه
                • ۲ حبه سیر
                • نمک، فلفل
                • جعفری
            """.trimIndent(),
            instructions = """
                ۱. گل کلم را به گلچه‌ها تقسیم کنید.
                ۲. با روغن، زردچوبه، سیر، نمک و فلفل مخلوط کنید.
                ۳. در فر ۲۰۰ درجه بپزید.
                ۴. با جعفری سرو کنید.
            """.trimIndent(),
            mealType = "dinner",
            region = "rest_asia",
            source = Source.BUILTIN,
        ),
        RecipeEntity(
            title = "کتلت عدس",
            ingredients = """
                • ۱ پیمانه عدس
                • ۱ عدد پیاز
                • ۲ حبه سیر
                • ۱ عدد تخم‌مرغ
                • ۱ پیمانه آرد سوخاری
                • ادویه، نمک
            """.trimIndent(),
            instructions = """
                ۱. عدس را بپزید و له کنید.
                ۲. پیاز و سیر را تفت دهید.
                ۳. با عدس مخلوط کنید.
                ۴. تخم‌مرغ و آرد سوخاری اضافه کنید.
                ۵. به شکل کتلت درآورید.
                ۶. در فر ۱۸۰ درجه بپزید.
            """.trimIndent(),
            mealType = "dinner",
            region = "rest_asia",
            source = Source.BUILTIN,
        ),
        RecipeEntity(
            title = "خوراک لوبیا چیتی و ذرت",
            ingredients = """
                • ۲ پیمانه لوبیا چیتی
                • ۱ پیمانه ذرت
                • ۲ عدد گوجه‌فرنگی
                • ۱ عدد پیاز
                • ۲ حبه سیر
                • ادویه، روغن زیتون
            """.trimIndent(),
            instructions = """
                ۱. لوبیا را از شب قبل خیس کنید.
                ۲. پیاز و سیر را تفت دهید.
                ۳. گوجه را اضافه کنید.
                ۴. لوبیا و ذرت را اضافه کنید.
                ۵. ادویه اضافه کنید.
                ۶. ۳۰ دقیقه بپزید.
            """.trimIndent(),
            mealType = "dinner",
            region = "americas",
            source = Source.BUILTIN,
        ),
        RecipeEntity(
            title = "پوره سیب‌زمینی شیرین",
            ingredients = """
                • ۴ عدد سیب‌زمینی شیرین
                • ۱ قاشق غذاخوری روغن زیتون
                • ۱ قاشق چای‌خوری دارچین
                • نمک، فلفل
                • گردو (اختیاری)
            """.trimIndent(),
            instructions = """
                ۱. سیب‌زمینی را بپزید.
                ۲. پوست بگیرید و له کنید.
                ۳. روغن زیتون، دارچین، نمک و فلفل اضافه کنید.
                ۴. هم بزنید تا یکدست شود.
                ۵. با گردو سرو کنید.
            """.trimIndent(),
            mealType = "dinner",
            region = "americas",
            source = Source.BUILTIN,
        ),
        RecipeEntity(
            title = "سوپ کلم و لوبیا",
            ingredients = """
                • ۲ پیمانه کلم خردشده
                • ۱ پیمانه لوبیا
                • ۲ عدد هویج
                • ۱ عدد پیاز
                • ۲ عدد گوجه‌فرنگی
                • آب مرغ کم‌چرب
            """.trimIndent(),
            instructions = """
                ۱. پیاز را تفت دهید.
                ۲. هویج و کلم را اضافه کنید.
                ۳. گوجه را اضافه کنید.
                ۴. لوبیا و آب مرغ را اضافه کنید.
                ۵. ۴۰ دقیقه بپزید.
                ۶. گرم سرو کنید.
            """.trimIndent(),
            mealType = "dinner",
            region = "europe",
            source = Source.BUILTIN,
        ),
        RecipeEntity(
            title = "خوراک قارچ و اسفناج",
            ingredients = """
                • ۳۰۰ گرم قارچ
                • ۳ پیمانه اسفناج
                • ۲ حبه سیر
                • ۱ عدد پیاز
                • ۲ قاشق غذاخوری روغن زیتون
                • آبلیمو، نمک، فلفل
            """.trimIndent(),
            instructions = """
                ۱. پیاز و سیر را تفت دهید.
                ۲. قارچ را اضافه کنید.
                ۳. اسفناج را اضافه کنید.
                ۴. آبلیمو، نمک و فلفل اضافه کنید.
                ۵. ۱۰ دقیقه بپزید.
                ۶. سرو کنید.
            """.trimIndent(),
            mealType = "dinner",
            region = "europe",
            source = Source.BUILTIN,
        ),
        RecipeEntity(
            title = "سالاد هویج و زنجبیل",
            ingredients = """
                • ۴ عدد هویج
                • ۱ قاشق غذاخوری زنجبیل رنده‌شده
                • ۱ عدد لیمو
                • ۲ قاشق غذاخوری روغن زیتون
                • عسل، نمک، فلفل
            """.trimIndent(),
            instructions = """
                ۱. هویج را رنده کنید.
                ۲. زنجبیل، آبلیمو، روغن زیتون، عسل، نمک و فلفل را مخلوط کنید.
                ۳. روی هویج بریزید.
                ۴. مخلوط کنید و سرد سرو کنید.
            """.trimIndent(),
            mealType = "salad",
            region = "east_asia",
            source = Source.BUILTIN,
        ),
        RecipeEntity(
            title = "خوراک کلم و سیب",
            ingredients = """
                • ۲ پیمانه کلم قرمز
                • ۲ عدد سیب
                • ۱ عدد پیاز قرمز
                • ۲ قاشق غذاخوری سرکه سیب
                • ۱ قاشق غذاخوری روغن زیتون
                • نمک، فلفل
            """.trimIndent(),
            instructions = """
                ۱. کلم را ریز خرد کنید.
                ۲. سیب و پیاز را برش بزنید.
                ۳. همه را مخلوط کنید.
                ۴. سرکه، روغن، نمک و فلفل اضافه کنید.
                ۵. سرد سرو کنید.
            """.trimIndent(),
            mealType = "salad",
            region = "europe",
            source = Source.BUILTIN,
        ),
        RecipeEntity(
            title = "خوراک کینوآ و سبزیجات",
            ingredients = """
                • ۱ پیمانه کینوآ
                • ۱ عدد کدو
                • ۱ عدد فلفل دلمه
                • ۱ عدد پیاز
                • ۲ حبه سیر
                • روغن زیتون، ادویه
            """.trimIndent(),
            instructions = """
                ۱. کینوآ را بپزید.
                ۲. پیاز و سیر را تفت دهید.
                ۳. کدو و فلفل را اضافه کنید.
                ۴. کینوآ را اضافه کنید.
                ۵. ادویه و روغن زیتون اضافه کنید.
                ۶. سرو کنید.
            """.trimIndent(),
            mealType = "lunch",
            region = "americas",
            source = Source.BUILTIN,
        ),
        RecipeEntity(
            title = "خوراک لوبیا و کلم",
            ingredients = """
                • ۲ پیمانه لوبیا
                • ۲ پیمانه کلم خردشده
                • ۱ عدد پیاز
                • ۲ حبه سیر
                • ۲ قاشق غذاخوری رب گوجه
                • ادویه، روغن زیتون
            """.trimIndent(),
            instructions = """
                ۱. لوبیا را از شب قبل خیس کنید.
                ۲. پیاز و سیر را تفت دهید.
                ۳. رب گوجه اضافه کنید.
                ۴. لوبیا را اضافه کنید.
                ۵. کلم را اضافه کنید.
                ۶. ۳۰ دقیقه بپزید.
            """.trimIndent(),
            mealType = "dinner",
            region = "europe",
            source = Source.BUILTIN,
        ),
        RecipeEntity(
            title = "سالاد نخود و انار",
            ingredients = """
                • ۲ پیمانه نخود
                • ۱ عدد انار
                • ۱ عدد پیاز قرمز
                • ۱ دسته جعفری
                • آبلیمو، روغن زیتون
                • نعنا خشک
            """.trimIndent(),
            instructions = """
                ۱. نخود را بپزید.
                ۲. انار را دانه کنید.
                ۳. پیاز و جعفری را خرد کنید.
                ۴. همه را مخلوط کنید.
                ۵. با آبلیمو و روغن زیتون سرو کنید.
            """.trimIndent(),
            mealType = "salad",
            region = "iran",
            source = Source.BUILTIN,
        ),
        RecipeEntity(
            title = "خوراک بادمجان و نخود",
            ingredients = """
                • ۲ عدد بادمجان
                • ۱ پیمانه نخود
                • ۲ عدد گوجه‌فرنگی
                • ۱ عدد پیاز
                • ۲ حبه سیر
                • ادویه، روغن زیتون
            """.trimIndent(),
            instructions = """
                ۱. بادمجان را کبابی کنید.
                ۲. نخود را بپزید.
                ۳. پیاز و سیر را تفت دهید.
                ۴. گوجه را اضافه کنید.
                ۵. بادمجان و نخود را اضافه کنید.
                ۶. با ادویه سرو کنید.
            """.trimIndent(),
            mealType = "dinner",
            region = "arab",
            source = Source.BUILTIN,
        ),
        RecipeEntity(
            title = "خوراک کدو و عدس",
            ingredients = """
                • ۲ عدد کدو
                • ۱ پیمانه عدس
                • ۱ عدد پیاز
                • ۲ حبه سیر
                • ۲ قاشق غذاخوری رب گوجه
                • ادویه، روغن زیتون
            """.trimIndent(),
            instructions = """
                ۱. عدس را بپزید.
                ۲. پیاز و سیر را تفت دهید.
                ۳. رب گوجه اضافه کنید.
                ۴. کدو را اضافه کنید.
                ۵. عدس را اضافه کنید.
                ۶. ۲۰ دقیقه بپزید.
            """.trimIndent(),
            mealType = "dinner",
            region = "europe",
            source = Source.BUILTIN,
        ),
        RecipeEntity(
            title = "خوراک اسفناج و نخود",
            ingredients = """
                • ۳ پیمانه اسفناج
                • ۱ پیمانه نخود
                • ۱ عدد پیاز
                • ۲ حبه سیر
                • ۱ قاشق چای‌خوری زیره
                • روغن زیتون، آبلیمو
            """.trimIndent(),
            instructions = """
                ۱. پیاز و سیر را تفت دهید.
                ۲. زیره اضافه کنید.
                ۳. نخود را اضافه کنید.
                ۴. اسفناج را اضافه کنید.
                ۵. آبلیمو و روغن زیتون اضافه کنید.
                ۶. ۱۰ دقیقه بپزید.
            """.trimIndent(),
            mealType = "dinner",
            region = "rest_asia",
            source = Source.BUILTIN,
        ),
        RecipeEntity(
            title = "خوراک کلم بروکلی و عدس",
            ingredients = """
                • ۱ عدد کلم بروکلی
                • ۱ پیمانه عدس
                • ۱ عدد پیاز
                • ۲ حبه سیر
                • ۲ قاشق غذاخوری رب گوجه
                • ادویه، روغن زیتون
            """.trimIndent(),
            instructions = """
                ۱. عدس را بپزید.
                ۲. پیاز و سیر را تفت دهید.
                ۳. رب گوجه اضافه کنید.
                ۴. کلم بروکلی را اضافه کنید.
                ۵. عدس را اضافه کنید.
                ۶. ۲۰ دقیقه بپزید.
            """.trimIndent(),
            mealType = "dinner",
            region = "europe",
            source = Source.BUILTIN,
        ),
    )
}