package com.sholehbashi.app.data.db.seed

import com.sholehbashi.app.data.Source
import com.sholehbashi.app.data.db.RecipeEntity

object AfricanRecipes {
    val all: List<RecipeEntity> = listOf(
        // ==================== مراکش — صبحانه ====================
        RecipeEntity(
            title = "بغریر",
            ingredients = """
                • ۲ پیمانه آرد
                • ۱ پیمانه سمولینا
                • ۱ قاشق چای‌خوری خمیرمایه
                • ۱ قاشق چای‌خوری بیکینگ پودر
                • نمک
                • عسل، کره
            """.trimIndent(),
            instructions = """
                ۱. همه مواد را با آب مخلوط کنید.
                ۲. ۳۰ دقیقه استراحت دهید.
                ۳. در تابه داغ دایره‌های کوچک بپزید.
                ۴. حباب‌ها که ظاهر شد، برگردانید.
                ۵. با عسل و کره سرو کنید.
            """.trimIndent(),
            mealType = "breakfast",
            region = "africa",
            source = Source.BUILTIN,
        ),
        RecipeEntity(
            title = "مسمن",
            ingredients = """
                • ۳ پیمانه آرد
                • ۱ پیمانه آب
                • نصف پیمانه روغن
                • نمک
                • عسل، پنیر
            """.trimIndent(),
            instructions = """
                ۱. آرد، آب و نمک را مخلوط کنید.
                ۲. خمیر را ورز دهید.
                ۳. به توپ‌های کوچک تقسیم کنید.
                ۴. با روغن باز کنید و تا کنید.
                ۵. در تابه بپزید.
                ۶. با عسل و پنیر سرو کنید.
            """.trimIndent(),
            mealType = "breakfast",
            region = "africa",
            source = Source.BUILTIN,
        ),
        RecipeEntity(
            title = "حریره مراکشی",
            ingredients = """
                • ۱ پیمانه آرد
                • ۴ پیمانه آب
                • ۱ قاشق چای‌خوری زعفران
                • دارچین، شکر
                • کره
            """.trimIndent(),
            instructions = """
                ۱. آرد را با کمی آب سرد حل کنید.
                ۲. آب جوش را اضافه کنید و هم بزنید.
                ۳. زعفران، دارچین و شکر اضافه کنید.
                ۴. ۲۰ دقیقه بپزید.
                ۵. با کره سرو کنید.
            """.trimIndent(),
            mealType = "breakfast",
            region = "africa",
            source = Source.BUILTIN,
        ),
        RecipeEntity(
            title = "شakshuka مراکشی",
            ingredients = """
                • ۴ عدد تخم‌مرغ
                • ۴ عدد گوجه‌فرنگی
                • ۱ عدد فلفل دلمه
                • ۱ عدد پیاز
                • ۲ حبه سیر
                • زیره، پاپریکا، روغن زیتون
            """.trimIndent(),
            instructions = """
                ۱. پیاز و فلفل را تفت دهید.
                ۲. سیر را اضافه کنید.
                ۳. گوجه را اضافه کنید و بپزید.
                ۴. ادویه‌ها را اضافه کنید.
                ۵. تخم‌مرغ‌ها را روی سس بشکنید.
                ۶. درب را بگذارید تا بپزد.
                ۷. با نان سرو کنید.
            """.trimIndent(),
            mealType = "breakfast",
            region = "africa",
            source = Source.BUILTIN,
        ),

        // ==================== مراکش — ناهار و شام ====================
        RecipeEntity(
            title = "تاجین مرغ",
            ingredients = """
                • ۵۰۰ گرم مرغ
                • ۲ عدد پیاز
                • ۳ حبه سیر
                • ۱ قاشق چای‌خوری زنجبیل
                • ۱ قاشق چای‌خوری زردچوبه
                • زیتون، لیمو ترشی
                • گشنیز، جعفری
            """.trimIndent(),
            instructions = """
                ۱. پیاز و سیر را تفت دهید.
                ۲. مرغ را اضافه کنید و سرخ کنید.
                ۳. ادویه‌ها را اضافه کنید.
                ۴. آب اضافه کنید و بپزید.
                ۵. زیتون و لیمو ترشی اضافه کنید.
                ۶. ۱ ساعت با حرارت کم بپزید.
                ۷. با گشنیز و جعفری سرو کنید.
            """.trimIndent(),
            mealType = "dinner",
            region = "africa",
            source = Source.BUILTIN,
        ),
        RecipeEntity(
            title = "کوسکوس",
            ingredients = """
                • ۲ پیمانه کوسکوس
                • ۵۰۰ گرم گوشت گوسفندی
                • ۲ عدد هویج
                • ۲ عدد کدو
                • ۱ پیمانه نخود
                • ادویه، زردچوبه، دارچین
            """.trimIndent(),
            instructions = """
                ۱. گوشت را با ادویه بپزید.
                ۲. سبزیجات را اضافه کنید.
                ۳. نخود را اضافه کنید.
                ۴. کوسکوس را بخارپز کنید.
                ۵. گوشت و سبزی را روی کوسکوس بریزید.
                ۶. با آب گوشت سرو کنید.
            """.trimIndent(),
            mealType = "dinner",
            region = "africa",
            source = Source.BUILTIN,
        ),
        RecipeEntity(
            title = "حریره (هریسه)",
            ingredients = """
                • ۱ پیمانه گندم
                • ۵۰۰ گرم گوشت گوسفندی
                • ۱ عدد پیاز
                • ۱ قاشق چای‌خوری دارچین
                • کره، شکر
            """.trimIndent(),
            instructions = """
                ۱. گندم را از شب قبل خیس کنید.
                ۲. با گوشت و پیاز بپزید.
                ۳. با گوشت‌کوب برقی بکوبید.
                ۴. دارچین و کره اضافه کنید.
                ۵. با شکر سرو کنید.
            """.trimIndent(),
            mealType = "dinner",
            region = "africa",
            source = Source.BUILTIN,
        ),
        RecipeEntity(
            title = "پاستیلا",
            ingredients = """
                • ۵۰۰ گرم مرغ
                • ۲۰۰ گرم بادام
                • ۱ عدد پیاز
                • ۴ عدد تخم‌مرغ
                • ۵۰۰ گرم خمیر ورق
                • دارچین، شکر، زعفران
            """.trimIndent(),
            instructions = """
                ۱. مرغ را با پیاز و ادویه بپزید.
                ۲. ریش‌ریش کنید.
                ۳. تخم‌مرغ‌ها را اضافه کنید.
                ۴. بادام را تفت دهید.
                ۵. در خمیر لایه‌لایه بپیچید.
                ۶. در فر ۱۸۰ درجه بپزید.
                ۷. با دارچین و شکر سرو کنید.
            """.trimIndent(),
            mealType = "dinner",
            region = "africa",
            source = Source.BUILTIN,
        ),
        RecipeEntity(
            title = "طاجین ماهی",
            ingredients = """
                • ۵۰۰ گرم ماهی
                • ۲ عدد گوجه‌فرنگی
                • ۲ عدد فلفل دلمه
                • ۱ عدد پیاز
                • ۳ حبه سیر
                • زیتون، لیمو، گشنیز
            """.trimIndent(),
            instructions = """
                ۱. پیاز، سیر و فلفل را تفت دهید.
                ۲. گوجه را اضافه کنید.
                ۳. ماهی را اضافه کنید.
                ۴. ادویه اضافه کنید.
                ۵. زیتون و لیمو اضافه کنید.
                ۶. ۳۰ دقیقه بپزید.
                ۷. با گشنیز سرو کنید.
            """.trimIndent(),
            mealType = "dinner",
            region = "africa",
            source = Source.BUILTIN,
        ),
        RecipeEntity(
            title = "شرموله",
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
                ۴. در تابه سرخ کنید.
                ۵. با سس سرو کنید.
            """.trimIndent(),
            mealType = "dinner",
            region = "africa",
            source = Source.BUILTIN,
        ),
        RecipeEntity(
            title = "سالاد زعلوک",
            ingredients = """
                • ۱ عدد بادمجان
                • ۲ عدد گوجه‌فرنگی
                • ۲ حبه سیر
                • ۱ عدد فلفل سبز
                • گشنیز، زیره
                • روغن زیتون، آبلیمو
            """.trimIndent(),
            instructions = """
                ۱. بادمجان را کبابی کنید.
                ۲. گوجه را ریز خرد کنید.
                ۳. سیر و فلفل را خرد کنید.
                ۴. همه را مخلوط کنید.
                ۵. با روغن زیتون و آبلیمو سرو کنید.
            """.trimIndent(),
            mealType = "salad",
            region = "africa",
            source = Source.BUILTIN,
        ),
        RecipeEntity(
            title = "حریره عدس مراکشی",
            ingredients = """
                • ۱ پیمانه عدس
                • ۱ عدد پیاز
                • ۲ عدد گوجه‌فرنگی
                • ۲ حبه سیر
                • زیره، زردچوبه، زنجبیل
                • گشنیز، لیمو
            """.trimIndent(),
            instructions = """
                ۱. پیاز و سیر را تفت دهید.
                ۲. ادویه‌ها را اضافه کنید.
                ۳. گوجه را اضافه کنید.
                ۴. عدس را اضافه کنید.
                ۵. آب اضافه کنید و ۳۰ دقیقه بپزید.
                ۶. با گشنیز و لیمو سرو کنید.
            """.trimIndent(),
            mealType = "dinner",
            region = "africa",
            source = Source.BUILTIN,
        ),

        // ==================== مصر ====================
        RecipeEntity(
            title = "کوشاری",
            ingredients = """
                • ۲ پیمانه برنج
                • ۱ پیمانه عدس
                • ۱ پیمانه ماکارونی
                • ۱ پیمانه نخود
                • ۲ عدد پیاز
                • سس گوجه، سس سیر
            """.trimIndent(),
            instructions = """
                ۱. برنج، عدس و ماکارونی را جداگانه بپزید.
                ۲. پیاز را سرخ کنید.
                ۳. نخود را بپزید.
                ۴. همه را لایه‌لایه در کاسه بچینید.
                ۵. سس گوجه و سیر روی آن بریزید.
                ۶. با پیاز سرخ‌شده سرو کنید.
            """.trimIndent(),
            mealType = "lunch",
            region = "africa",
            source = Source.BUILTIN,
        ),
        RecipeEntity(
            title = "ملوخیه مصری",
            ingredients = """
                • ۵۰۰ گرم مرغ
                • ۲ پیمانه برگ ملوخیه
                • ۱ عدد پیاز
                • ۴ حبه سیر
                • ۱ قاشق چای‌خوری گشنیز خشک
                • نمک، فلفل
            """.trimIndent(),
            instructions = """
                ۱. مرغ را با پیاز بپزید.
                ۲. برگ ملوخیه را خرد کنید.
                ۳. سیر و گشنیز را تفت دهید.
                ۴. ملوخیه را اضافه کنید.
                ۵. با آب مرغ بپزید.
                ۶. مرغ را اضافه کنید.
                ۷. با برنج سفید سرو کنید.
            """.trimIndent(),
            mealType = "dinner",
            region = "africa",
            source = Source.BUILTIN,
        ),
        RecipeEntity(
            title = "فول مدمس مصری",
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
                ۲. با آب بپزید تا نرم شود.
                ۳. سیر، پیاز و گوجه را خرد کنید.
                ۴. با فول مخلوط کنید و له کنید.
                ۵. آبلیمو، زیره و نمک اضافه کنید.
                ۶. با روغن زیتون سرو کنید.
            """.trimIndent(),
            mealType = "breakfast",
            region = "africa",
            source = Source.BUILTIN,
        ),
        RecipeEntity(
            title = "کباب مصری (کوفته)",
            ingredients = """
                • ۵۰۰ گرم گوشت چرخ‌کرده
                • ۱ عدد پیاز
                • ۲ حبه سیر
                • ۱ دسته جعفری
                • ادویه، نمک، فلفل
                • روغن
            """.trimIndent(),
            instructions = """
                ۱. پیاز و سیر را رنده کنید.
                ۲. با گوشت مخلوط کنید.
                ۳. جعفری خردشده و ادویه اضافه کنید.
                ۴. ۳۰ دقیقه استراحت دهید.
                ۵. به سیخ بکشید.
                ۶. روی گریل کباب کنید.
            """.trimIndent(),
            mealType = "dinner",
            region = "africa",
            source = Source.BUILTIN,
        ),
        RecipeEntity(
            title = "محشی مصری",
            ingredients = """
                • ۸ عدد فلفل دلمه
                • ۱ پیمانه برنج
                • ۳۰۰ گرم گوشت چرخ‌کرده
                • ۱ عدد پیاز
                • ۲ قاشق غذاخوری رب گوجه
                • ادویه
            """.trimIndent(),
            instructions = """
                ۱. برنج، گوشت و پیاز را مخلوط کنید.
                ۲. ادویه اضافه کنید.
                ۳. فلفل‌ها را پر کنید.
                ۴. در قابلمه بچینید.
                ۵. سس گوجه اضافه کنید.
                ۶. ۱ ساعت بپزید.
            """.trimIndent(),
            mealType = "lunch",
            region = "africa",
            source = Source.BUILTIN,
        ),
        RecipeEntity(
            title = "ام علی مصری",
            ingredients = """
                • ۱ پیمانه شیر
                • ۱ پیمانه خامه
                • ۱ پیمانه نان خشک
                • ۱ پیمانه مغزها
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
            region = "africa",
            source = Source.BUILTIN,
        ),

        // ==================== اتیوپی ====================
        RecipeEntity(
            title = "دورو وات",
            ingredients = """
                • ۵۰۰ گرم مرغ
                • ۲ عدد پیاز بزرگ
                • ۴ قاشق غذاخوری رب بربری
                • ۱۰۰ گرم کره
                • ۲ حبه سیر
                • زنجبیل، ادویه
            """.trimIndent(),
            instructions = """
                ۱. پیاز را با کره تفت دهید تا کاراملی شود.
                ۲. رب بربری را اضافه کنید.
                ۳. سیر و زنجبیل را اضافه کنید.
                ۴. مرغ را اضافه کنید.
                ۵. آب اضافه کنید و ۱ ساعت بپزید.
                ۶. با اینجرا سرو کنید.
            """.trimIndent(),
            mealType = "dinner",
            region = "africa",
            source = Source.BUILTIN,
        ),
        RecipeEntity(
            title = "اینجرا",
            ingredients = """
                • ۲ پیمانه آرد تف
                • ۳ پیمانه آب
                • ۱ قاشق چای‌خوری خمیرمایه
                • نمک
            """.trimIndent(),
            instructions = """
                ۱. آرد و آب را مخلوط کنید.
                ۲. خمیرمایه اضافه کنید.
                ۳. ۳ روز تخمیر دهید.
                ۴. در تابه بزرگ بریزید.
                ۵. دو طرف را بپزید.
                ۶. با خورش سرو کنید.
            """.trimIndent(),
            mealType = "lunch",
            region = "africa",
            source = Source.BUILTIN,
        ),
        RecipeEntity(
            title = "میسیر وات",
            ingredients = """
                • ۱ پیمانه عدس قرمز
                • ۲ عدد پیاز
                • ۳ قاشق غذاخوری رب بربری
                • ۳ حبه سیر
                • زنجبیل، ادویه
                • کره
            """.trimIndent(),
            instructions = """
                ۱. پیاز را با کره تفت دهید.
                ۲. رب بربری اضافه کنید.
                ۳. سیر و زنجبیل اضافه کنید.
                ۴. عدس را اضافه کنید.
                ۵. آب اضافه کنید و ۳۰ دقیقه بپزید.
                ۶. با اینجرا سرو کنید.
            """.trimIndent(),
            mealType = "dinner",
            region = "africa",
            source = Source.BUILTIN,
        ),
        RecipeEntity(
            title = "شیرو",
            ingredients = """
                • ۱ پیمانه نخود
                • ۱ پیمانه لوبیا
                • ۲ عدد پیاز
                • ۳ قاشق غذاخوری رب بربری
                • ۳ حبه سیر
                • زنجبیل
            """.trimIndent(),
            instructions = """
                ۱. حبوبات را از شب قبل خیس کنید.
                ۲. پیاز را تفت دهید.
                ۳. رب بربری، سیر و زنجبیل اضافه کنید.
                ۴. حبوبات را اضافه کنید.
                ۵. آب اضافه کنید و ۱ ساعت بپزید.
                ۶. با اینجرا سرو کنید.
            """.trimIndent(),
            mealType = "lunch",
            region = "africa",
            source = Source.BUILTIN,
        ),
        RecipeEntity(
            title = "کیتفو",
            ingredients = """
                • ۵۰۰ گرم گوشت گاو
                • ۲ عدد پیاز
                • ۱۰۰ گرم کره
                • ۲ قاشق غذاخوری رب بربری
                • ۲ حبه سیر
                • زنجبیل
            """.trimIndent(),
            instructions = """
                ۱. پیاز را با کره تفت دهید.
                ۲. رب بربری اضافه کنید.
                ۳. گوشت را اضافه کنید.
                ۴. سیر و زنجبیل اضافه کنید.
                ۵. آب اضافه کنید و ۱ ساعت بپزید.
                ۶. با اینجرا سرو کنید.
            """.trimIndent(),
            mealType = "dinner",
            region = "africa",
            source = Source.BUILTIN,
        ),
        RecipeEntity(
            title = "دابو",
            ingredients = """
                • ۳ پیمانه آرد
                • ۱ پیمانه آب
                • ۱ قاشق چای‌خوری خمیرمایه
                • نمک
            """.trimIndent(),
            instructions = """
                ۱. آرد، آب و خمیرمایه را مخلوط کنید.
                ۲. خمیر را ورز دهید.
                ۳. ۱ ساعت استراحت دهید.
                ۴. در قالب بریزید.
                ۵. در فر ۲۰۰ درجه بپزید.
                ۶. با خورش سرو کنید.
            """.trimIndent(),
            mealType = "breakfast",
            region = "africa",
            source = Source.BUILTIN,
        ),
        RecipeEntity(
            title = "بربری اتیوپیایی",
            ingredients = """
                • ۱ پیمانه فلفل خشک
                • ۲ عدد پیاز
                • ۴ حبه سیر
                • زنجبیل، هل، دارچین
                • روغن، نمک
            """.trimIndent(),
            instructions = """
                ۱. فلفل‌ها را خیس کنید.
                ۲. پیاز، سیر و زنجبیل را تفت دهید.
                ۳. ادویه‌ها را اضافه کنید.
                ۴. فلفل را اضافه کنید.
                ۵. با روغن مخلوط کنید.
                ۶. در ظرف نگه دارید.
            """.trimIndent(),
            mealType = "appetizer",
            region = "africa",
            source = Source.BUILTIN,
        ),

        // ==================== نیجریه ====================
        RecipeEntity(
            title = "جولاف رایس",
            ingredients = """
                • ۲ پیمانه برنج
                • ۲ پیمانه سس گوجه
                • ۱ عدد پیاز
                • ۲ عدد فلفل دلمه
                • ۱ قاشق چای‌خوری زردچوبه
                • آب مرغ
            """.trimIndent(),
            instructions = """
                ۱. پیاز و فلفل را تفت دهید.
                ۲. سس گوجه اضافه کنید.
                ۳. زردچوبه اضافه کنید.
                ۴. برنج را اضافه کنید.
                ۵. آب مرغ اضافه کنید.
                ۶. بپزید تا برنج نرم شود.
            """.trimIndent(),
            mealType = "lunch",
            region = "africa",
            source = Source.BUILTIN,
        ),
        RecipeEntity(
            title = "اگوسی سوپ",
            ingredients = """
                • ۵۰۰ گرم گوشت گاو
                • ۱ پیمانه دانه کدو
                • ۲ عدد گوجه‌فرنگی
                • ۱ عدد پیاز
                • ۲ عدد فلفل
                • روغن نخل
            """.trimIndent(),
            instructions = """
                ۱. گوشت را با پیاز بپزید.
                ۲. دانه کدو را آسیاب کنید.
                ۳. گوجه و فلفل را پوره کنید.
                ۴. به گوشت اضافه کنید.
                ۵. دانه کدو را اضافه کنید.
                ۶. روغن نخل اضافه کنید.
                ۷. ۳۰ دقیقه بپزید.
            """.trimIndent(),
            mealType = "dinner",
            region = "africa",
            source = Source.BUILTIN,
        ),
        RecipeEntity(
            title = "پف پف",
            ingredients = """
                • ۱ پیمانه آرد
                • ۱ قاشق چای‌خوری خمیرمایه
                • نصف پیمانه شکر
                • نصف پیمانه آب گرم
                • روغن برای سرخ کردن
            """.trimIndent(),
            instructions = """
                ۱. خمیرمایه و شکر را در آب گرم حل کنید.
                ۲. آرد را اضافه کنید.
                ۳. خمیر را ورز دهید.
                ۴. ۱ ساعت استراحت دهید.
                ۵. به توپ‌های کوچک درآورید.
                ۶. در روغن داغ سرخ کنید.
            """.trimIndent(),
            mealType = "snack",
            region = "africa",
            source = Source.BUILTIN,
        ),
        RecipeEntity(
            title = "آکارا",
            ingredients = """
                • ۲ پیمانه لوبیا چشم‌بلبلی
                • ۱ عدد پیاز
                • ۲ عدد فلفل
                • نمک
                • روغن
            """.trimIndent(),
            instructions = """
                ۱. لوبیا را از شب قبل خیس کنید.
                ۲. پوست بگیرید.
                ۳. با پیاز و فلفل پوره کنید.
                ۴. نمک اضافه کنید.
                ۵. در روغن داغ سرخ کنید.
                ۶. با نان سرو کنید.
            """.trimIndent(),
            mealType = "breakfast",
            region = "africa",
            source = Source.BUILTIN,
        ),
        RecipeEntity(
            title = "اگوسی وات",
            ingredients = """
                • ۵۰۰ گرم مرغ
                • ۲ عدد گوجه‌فرنگی
                • ۱ عدد پیاز
                • ۱ پیمانه دانه کدو
                • ۲ عدد فلفل
                • برگ سبزی
            """.trimIndent(),
            instructions = """
                ۱. مرغ را با پیاز بپزید.
                ۲. گوجه و فلفل را پوره کنید.
                ۳. به مرغ اضافه کنید.
                ۴. دانه کدو را اضافه کنید.
                ۵. ۳۰ دقیقه بپزید.
                ۶. با برگ سبزی سرو کنید.
            """.trimIndent(),
            mealType = "dinner",
            region = "africa",
            source = Source.BUILTIN,
        ),
        RecipeEntity(
            title = "مoin moin",
            ingredients = """
                • ۲ پیمانه لوبیا چشم‌بلبلی
                • ۱ عدد پیاز
                • ۲ عدد فلفل دلمه
                • ۲ عدد تخم‌مرغ
                • روغن نخل
                • نمک
            """.trimIndent(),
            instructions = """
                ۱. لوبیا را از شب قبل خیس کنید.
                ۲. پوست بگیرید.
                ۳. با پیاز و فلفل پوره کنید.
                ۴. تخم‌مرغ و روغن اضافه کنید.
                ۵. در قالب بریزید.
                ۶. بخارپز کنید (۴۵ دقیقه).
            """.trimIndent(),
            mealType = "breakfast",
            region = "africa",
            source = Source.BUILTIN,
        ),

        // ==================== آفریقای جنوبی ====================
        RecipeEntity(
            title = "بوبوتی",
            ingredients = """
                • ۵۰۰ گرم گوشت چرخ‌کرده
                • ۲ عدد پیاز
                • ۲ عدد سیب‌زمینی
                • ۲ قاشق غذاخوری رب گوجه
                • ۱ قاشق چای‌خوری زردچوبه
                • ۴ عدد تخم‌مرغ
            """.trimIndent(),
            instructions = """
                ۱. پیاز را تفت دهید.
                ۲. گوشت را اضافه کنید.
                ۳. ادویه و رب گوجه اضافه کنید.
                ۴. سیب‌زمینی را اضافه کنید.
                ۵. تخم‌مرغ‌ها را هم بزنید و بریزید.
                ۶. در فر بپزید تا طلایی شود.
            """.trimIndent(),
            mealType = "dinner",
            region = "africa",
            source = Source.BUILTIN,
        ),
        RecipeEntity(
            title = "چاکالاکا",
            ingredients = """
                • ۱ پیمانه لوبیا
                • ۱ عدد پیاز
                • ۲ عدد گوجه‌فرنگی
                • ۲ عدد فلفل
                • ادویه کاری
                • روغن
            """.trimIndent(),
            instructions = """
                ۱. لوبیا را از شب قبل خیس کنید.
                ۲. پیاز، گوجه و فلفل را تفت دهید.
                ۳. ادویه کاری اضافه کنید.
                ۴. لوبیا را اضافه کنید.
                ۵. آب اضافه کنید و ۱ ساعت بپزید.
                ۶. با نان سرو کنید.
            """.trimIndent(),
            mealType = "lunch",
            region = "africa",
            source = Source.BUILTIN,
        ),
        RecipeEntity(
            title = "برایی",
            ingredients = """
                • ۵۰۰ گرم گوشت گاو
                • ۲ قاشق غذاخوری آبلیمو
                • ۲ حبه سیر
                • ادویه برایی
                • نان، سالاد
            """.trimIndent(),
            instructions = """
                ۱. گوشت را برش بزنید.
                ۲. با آبلیمو، سیر و ادویه مزه‌دار کنید.
                ۳. ۲ ساعت استراحت دهید.
                ۴. روی گریل کباب کنید.
                ۵. در نان با سالاد سرو کنید.
            """.trimIndent(),
            mealType = "dinner",
            region = "africa",
            source = Source.BUILTIN,
        ),
        RecipeEntity(
            title = "پوتی",
            ingredients = """
                • ۵۰۰ گرم گوشت گاو
                • ۲ عدد سیب‌زمینی
                • ۲ عدد هویج
                • ۱ عدد پیاز
                • ۲ پیمانه آب مرغ
                • ادویه
            """.trimIndent(),
            instructions = """
                ۱. گوشت را تفت دهید.
                ۲. پیاز، هویج و سیب‌زمینی را اضافه کنید.
                ۳. آب مرغ اضافه کنید.
                ۴. ادویه اضافه کنید.
                ۵. ۲ ساعت بپزید.
                ۶. با نان سرو کنید.
            """.trimIndent(),
            mealType = "dinner",
            region = "africa",
            source = Source.BUILTIN,
        ),
        RecipeEntity(
            title = "ملک ترت",
            ingredients = """
                • ۱ عدد خمیر پای
                • ۲ عدد سیب
                • ۱ پیمانه شکر
                • ۱ قاشق چای‌خوری دارچین
                • ۲ عدد تخم‌مرغ
                • ۱ پیمانه شیر
            """.trimIndent(),
            instructions = """
                ۱. خمیر را در قالب پهن کنید.
                ۲. سیب‌ها را برش بزنید و بچینید.
                ۳. شکر و دارچین بپاشید.
                ۴. تخم‌مرغ و شیر را مخلوط و بریزید.
                ۵. در فر ۱۸۰ درجه بپزید.
                ۶. سرد سرو کنید.
            """.trimIndent(),
            mealType = "dessert",
            region = "africa",
            source = Source.BUILTIN,
        ),
        RecipeEntity(
            title = "کوئک کوئک",
            ingredients = """
                • ۲ پیمانه آرد
                • ۱ قاشق غذاخوری بیکینگ پودر
                • ۱ قاشق چای‌خوری نمک
                • ۱ پیمانه آب
                • روغن برای سرخ کردن
                • شکر
            """.trimIndent(),
            instructions = """
                ۱. آرد، بیکینگ پودر و نمک را مخلوط کنید.
                ۲. آب اضافه کنید تا خمیر شود.
                ۳. ۳۰ دقیقه استراحت دهید.
                ۴. به توپ‌های کوچک درآورید.
                ۵. در روغن داغ سرخ کنید.
                ۶. در شکر بزنید.
            """.trimIndent(),
            mealType = "dessert",
            region = "africa",
            source = Source.BUILTIN,
        ),

        // ==================== تونس و الجزایر ====================
        RecipeEntity(
            title = "بریک",
            ingredients = """
                • ۴ عدد خمیر بریک
                • ۴ عدد تخم‌مرغ
                • ۲۰۰ گرم تن ماهی
                • ۱ عدد پیاز
                • جعفری، لیمو
                • روغن
            """.trimIndent(),
            instructions = """
                ۱. خمیر را باز کنید.
                ۲. تن ماهی، پیاز و جعفری را مخلوط کنید.
                ۳. وسط خمیر بگذارید.
                ۴. تخم‌مرغ را روی آن بشکنید.
                ۵. تا کنید و سرخ کنید.
                ۶. با لیمو سرو کنید.
            """.trimIndent(),
            mealType = "breakfast",
            region = "africa",
            source = Source.BUILTIN,
        ),
        RecipeEntity(
            title = "لblebi",
            ingredients = """
                • ۲ پیمانه نخود
                • ۳ حبه سیر
                • ۱ عدد لیمو
                • زیره، پاپریکا
                • روغن زیتون
                • نان
            """.trimIndent(),
            instructions = """
                ۱. نخود را از شب قبل خیس کنید.
                ۲. بپزید تا نرم شود.
                ۳. سیر، لیمو، زیره و پاپریکا اضافه کنید.
                ۴. روغن زیتون اضافه کنید.
                ۵. در کاسه بریزید.
                ۶. با نان سرو کنید.
            """.trimIndent(),
            mealType = "breakfast",
            region = "africa",
            source = Source.BUILTIN,
        ),
        RecipeEntity(
            title = "کوسکسی تونسی",
            ingredients = """
                • ۲ پیمانه کوسکوس
                • ۵۰۰ گرم ماهی
                • ۲ عدد گوجه‌فرنگی
                • ۱ عدد پیاز
                • ۲ عدد فلفل
                • ادویه هریسه
            """.trimIndent(),
            instructions = """
                ۱. پیاز و فلفل را تفت دهید.
                ۲. گوجه را اضافه کنید.
                ۳. ماهی را اضافه کنید.
                ۴. ادویه هریسه اضافه کنید.
                ۵. کوسکوس را بخارپز کنید.
                ۶. ماهی و سس را روی آن بریزید.
            """.trimIndent(),
            mealType = "dinner",
            region = "africa",
            source = Source.BUILTIN,
        ),
        RecipeEntity(
            title = "حریره تونسی",
            ingredients = """
                • ۱ پیمانه آرد
                • ۴ پیمانه آب
                • ۱ قاشق چای‌خوری زعفران
                • دارچین، شکر
                • کره
            """.trimIndent(),
            instructions = """
                ۱. آرد را با کمی آب سرد حل کنید.
                ۲. آب جوش را اضافه کنید و هم بزنید.
                ۳. زعفران، دارچین و شکر اضافه کنید.
                ۴. ۲۰ دقیقه بپزید.
                ۵. با کره سرو کنید.
            """.trimIndent(),
            mealType = "breakfast",
            region = "africa",
            source = Source.BUILTIN,
        ),
        RecipeEntity(
            title = "طاجین مرغ و زیتون",
            ingredients = """
                • ۵۰۰ گرم مرغ
                • ۲ عدد پیاز
                • ۳ حبه سیر
                • ۱ قاشق چای‌خوری زنجبیل
                • ۱ قاشق چای‌خوری زردچوبه
                • زیتون، لیمو ترشی
            """.trimIndent(),
            instructions = """
                ۱. پیاز و سیر را تفت دهید.
                ۲. مرغ را اضافه کنید.
                ۳. ادویه‌ها را اضافه کنید.
                ۴. آب اضافه کنید و بپزید.
                ۵. زیتون و لیمو ترشی اضافه کنید.
                ۶. ۱ ساعت بپزید.
                ۷. سرو کنید.
            """.trimIndent(),
            mealType = "dinner",
            region = "africa",
            source = Source.BUILTIN,
        ),

        // ==================== غذاهای گیاهی و دسرهای آفریقایی ====================
        RecipeEntity(
            title = "کاری نخود آفریقایی",
            ingredients = """
                • ۲ پیمانه نخود
                • ۱ قوطی شیر نارگیل
                • ۲ قاشق غذاخوری خمیر کاری
                • ۱ عدد پیاز
                • ۲ عدد سیب‌زمینی
                • ادویه
            """.trimIndent(),
            instructions = """
                ۱. نخود را از شب قبل خیس کنید.
                ۲. پیاز را تفت دهید.
                ۳. خمیر کاری را اضافه کنید.
                ۴. شیر نارگیل اضافه کنید.
                ۵. نخود و سیب‌زمینی را اضافه کنید.
                ۶. ۱ ساعت بپزید.
                ۷. با برنج سرو کنید.
            """.trimIndent(),
            mealType = "dinner",
            region = "africa",
            source = Source.BUILTIN,
        ),
        RecipeEntity(
            title = "سالاد مراکشی",
            ingredients = """
                • ۲ عدد گوجه‌فرنگی
                • ۱ عدد خیار
                • ۱ عدد پیاز قرمز
                • ۱۰۰ گرم زیتون
                • ۱ عدد لیمو
                • روغن زیتون، نعنا
            """.trimIndent(),
            instructions = """
                ۱. سبزیجات را خرد کنید.
                ۲. زیتون را اضافه کنید.
                ۳. لیمو، روغن زیتون و نعنا اضافه کنید.
                ۴. مخلوط کنید و سرد سرو کنید.
            """.trimIndent(),
            mealType = "salad",
            region = "africa",
            source = Source.BUILTIN,
        ),
        RecipeEntity(
            title = "زعلوک بادمجان",
            ingredients = """
                • ۱ عدد بادمجان
                • ۲ عدد گوجه‌فرنگی
                • ۲ حبه سیر
                • ۱ عدد فلفل سبز
                • گشنیز، زیره
                • روغن زیتون، آبلیمو
            """.trimIndent(),
            instructions = """
                ۱. بادمجان را کبابی کنید.
                ۲. گوجه را ریز خرد کنید.
                ۳. سیر و فلفل را خرد کنید.
                ۴. همه را مخلوط کنید.
                ۵. با روغن زیتون و آبلیمو سرو کنید.
            """.trimIndent(),
            mealType = "salad",
            region = "africa",
            source = Source.BUILTIN,
        ),
        RecipeEntity(
            title = "باقلا مراکشی",
            ingredients = """
                • ۲ پیمانه باقلا
                • ۳ حبه سیر
                • ۱ عدد لیمو
                • زیره، پاپریکا
                • روغن زیتون
                • گشنیز
            """.trimIndent(),
            instructions = """
                ۱. باقلا را از شب قبل خیس کنید.
                ۲. بپزید تا نرم شود.
                ۳. سیر، لیمو، زیره و پاپریکا اضافه کنید.
                ۴. روغن زیتون اضافه کنید.
                ۵. با گشنیز سرو کنید.
            """.trimIndent(),
            mealType = "appetizer",
            region = "africa",
            source = Source.BUILTIN,
        ),
        RecipeEntity(
            title = "دسر خرما و نارگیل",
            ingredients = """
                • ۲ پیمانه خرما
                • ۱ پیمانه نارگیل رنده‌شده
                • ۱ قاشق غذاخوری کره
                • ۱ قاشق چای‌خوری دارچین
                • عسل
            """.trimIndent(),
            instructions = """
                ۱. خرماها را هسته بگیرید و له کنید.
                ۲. کره اضافه کنید.
                ۳. نارگیل و دارچین اضافه کنید.
                ۴. به شکل توپ درآورید.
                ۵. در نارگیل بزنید.
                ۶. با عسل سرو کنید.
            """.trimIndent(),
            mealType = "dessert",
            region = "africa",
            source = Source.BUILTIN,
        ),
        RecipeEntity(
            title = "کیک هویج آفریقایی",
            ingredients = """
                • ۲ پیمانه آرد
                • ۱ پیمانه شکر
                • ۱ پیمانه هویج رنده‌شده
                • ۳ عدد تخم‌مرغ
                • ۱ پیمانه روغن
                • دارچین، جوز هندی
            """.trimIndent(),
            instructions = """
                ۱. تخم‌مرغ و شکر را بزنید.
                ۲. روغن اضافه کنید.
                ۳. آرد و ادویه اضافه کنید.
                ۴. هویج را اضافه کنید.
                ۵. در قالب بریزید.
                ۶. در فر ۱۸۰ درجه بپزید.
            """.trimIndent(),
            mealType = "dessert",
            region = "africa",
            source = Source.BUILTIN,
        ),
        RecipeEntity(
            title = "حلوا کنجد آفریقایی",
            ingredients = """
                • ۲ پیمانه ارده
                • ۱ پیمانه شکر
                • نصف پیمانه آب
                • ۱ قاشق چای‌خوری وانیل
                • خلال بادام
            """.trimIndent(),
            instructions = """
                ۱. شکر و آب را بجوشانید.
                ۲. وانیل اضافه کنید.
                ۳. ارده را در تابه گرم کنید.
                ۴. شربت را اضافه کنید.
                ۵. هم بزنید تا یکدست شود.
                ۶. با خلال بادام تزیین کنید.
            """.trimIndent(),
            mealType = "dessert",
            region = "africa",
            source = Source.BUILTIN,
        ),
        RecipeEntity(
            title = "آب انبه و نعنا",
            ingredients = """
                • ۲ عدد انبه رسیده
                • ۴ پیمانه آب
                • ۲ قاشق غذاخوری شکر
                • ۱ عدد لیمو
                • نعنا تازه
                • یخ
            """.trimIndent(),
            instructions = """
                ۱. انبه‌ها را پوست بگیرید و خرد کنید.
                ۲. با آب پوره کنید.
                ۳. شکر و آبلیمو اضافه کنید.
                ۴. نعنا و یخ اضافه کنید.
                ۵. سرد سرو کنید.
            """.trimIndent(),
            mealType = "snack",
            region = "africa",
            source = Source.BUILTIN,
        ),
        RecipeEntity(
            title = "شربت تمر هندی",
            ingredients = """
                • ۲۰۰ گرم تمر هندی
                • ۱ پیمانه شکر
                • ۴ پیمانه آب
                • ۱ قاشق چای‌خوری زیره
                • نمک
                • یخ
            """.trimIndent(),
            instructions = """
                ۱. تمر هندی را در آب خیس کنید.
                ۲. صاف کنید.
                ۳. شکر، زیره و نمک اضافه کنید.
                ۴. هم بزنید تا حل شود.
                ۵. یخ اضافه کنید.
                ۶. سرد سرو کنید.
            """.trimIndent(),
            mealType = "snack",
            region = "africa",
            source = Source.BUILTIN,
        ),
        RecipeEntity(
            title = "پودینگ نارگیل آفریقایی",
            ingredients = """
                • ۲ پیمانه شیر نارگیل
                • ۲ قاشق غذاخوری نشاسته
                • ۳ قاشق غذاخوری شکر
                • وانیل
                • نارگیل رنده‌شده
            """.trimIndent(),
            instructions = """
                ۱. شیر نارگیل را بجوشانید.
                ۲. نشاسته را حل کنید و اضافه کنید.
                ۳. شکر و وانیل اضافه کنید.
                ۴. هم بزنید تا غلیظ شود.
                ۵. در ظرف بریزید.
                ۶. با نارگیل تزیین کنید.
            """.trimIndent(),
            mealType = "dessert",
            region = "africa",
            source = Source.BUILTIN,
        ),
    )
}