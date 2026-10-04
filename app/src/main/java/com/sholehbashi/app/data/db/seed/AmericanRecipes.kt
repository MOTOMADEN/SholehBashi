package com.sholehbashi.app.data.db.seed

import com.sholehbashi.app.data.Source
import com.sholehbashi.app.data.db.RecipeEntity

object AmericanRecipes {
    val all: List<RecipeEntity> = listOf(
        // ==================== مکزیک — صبحانه ====================
        RecipeEntity(
            title = "هوووس رانچروس",
            ingredients = """
                • ۴ عدد تخم‌مرغ
                • ۴ عدد تورتیلای ذرت
                • ۱ پیمانه لوبیا سیاه
                • ۱ پیمانه سس سالسا
                • ۱ عدد آووکادو
                • پنیر چدار، گشنیز
            """.trimIndent(),
            instructions = """
                ۱. تخم‌مرغ‌ها را هم بزنید و بپزید.
                ۲. تورتیلاها را گرم کنید.
                ۳. لوبیا و تخم‌مرغ را روی آن بچینید.
                ۴. سس سالسا روی آن بریزید.
                ۵. با آووکادو، پنیر و گشنیز سرو کنید.
            """.trimIndent(),
            mealType = "breakfast",
            region = "americas",
            source = Source.BUILTIN,
        ),
        RecipeEntity(
            title = "چیلاکیلز",
            ingredients = """
                • ۶ عدد تورتیلای ذرت
                • ۲ پیمانه سس سالسا ورde
                • ۴ عدد تخم‌مرغ
                • ۱ پیمانه پنیر چدار
                • خامه ترش، گشنیز
            """.trimIndent(),
            instructions = """
                ۱. تورتیلاها را تکه‌تکه کنید.
                ۲. در سس سالسا بخیسانید.
                ۳. در تابه بچینید.
                ۴. تخم‌مرغ‌ها را روی آن بشکنید.
                ۵. پنیر بپاشید.
                ۶. در فر بپزید تا پنیر ذوب شود.
            """.trimIndent(),
            mealType = "breakfast",
            region = "americas",
            source = Source.BUILTIN,
        ),
        RecipeEntity(
            title = "کنچیتا",
            ingredients = """
                • ۵۰۰ گرم گوشت خوک
                • ۱ عدد پرتقال
                • ۲ عدد پیاز
                • ۴ حبه سیر
                • ادویه آچیوته
                • نان بولیلو
            """.trimIndent(),
            instructions = """
                ۱. گوشت را با آب پرتقال، پیاز، سیر و ادویه بپزید.
                ۲. گوشت را ریش‌ریش کنید.
                ۳. در تابه سرخ کنید تا ترد شود.
                ۴. در نان بولیلو با پیاز قرمز و سس سرو کنید.
            """.trimIndent(),
            mealType = "breakfast",
            region = "americas",
            source = Source.BUILTIN,
        ),
        RecipeEntity(
            title = "مولته",
            ingredients = """
                • ۱ عدد نان بولیلو
                • ۱ پیمانه لوبیا
                • ۱۰۰ گرم گوشت
                • ۱۰۰ گرم پنیر
                • آووکادو، سس
            """.trimIndent(),
            instructions = """
                ۱. نان را برش بزنید و تست کنید.
                ۲. لوبیا را روی آن بمالید.
                ۳. گوشت را اضافه کنید.
                ۴. پنیر بپاشید.
                ۵. با آووکادو و سس سرو کنید.
            """.trimIndent(),
            mealType = "breakfast",
            region = "americas",
            source = Source.BUILTIN,
        ),

        // ==================== مکزیک — ناهار و شام ====================
        RecipeEntity(
            title = "تاکو گوشت",
            ingredients = """
                • ۸ عدد نان تاکو
                • ۵۰۰ گرم گوشت چرخ‌کرده
                • ۱ عدد پیاز
                • ۲ قاشق غذاخوری ادویه تاکو
                • گوجه، کاهو، پنیر چدار
                • سس سالسا، خامه ترش
            """.trimIndent(),
            instructions = """
                ۱. پیاز را تفت دهید.
                ۲. گوشت را اضافه کنید و سرخ کنید.
                ۳. ادویه تاکو اضافه کنید.
                ۴. نان تاکو را گرم کنید.
                ۵. گوشت را داخل نان بریزید.
                ۶. با گوجه، کاهو، پنیر، سالسا و خامه سرو کنید.
            """.trimIndent(),
            mealType = "dinner",
            region = "americas",
            source = Source.BUILTIN,
        ),
        RecipeEntity(
            title = "بوریتو",
            ingredients = """
                • ۴ عدد تورتیلای آردی
                • ۵۰۰ گرم گوشت چرخ‌کرده
                • ۱ پیمانه برنج
                • ۱ پیمانه لوبیا
                • پنیر، خامه، سالسا
                • آووکادو
            """.trimIndent(),
            instructions = """
                ۱. گوشت را با ادویه بپزید.
                ۲. برنج و لوبیا را آماده کنید.
                ۳. تورتیلا را گرم کنید.
                ۴. همه مواد را وسط آن بریزید.
                ۵. رول کنید و سرو کنید.
            """.trimIndent(),
            mealType = "lunch",
            region = "americas",
            source = Source.BUILTIN,
        ),
        RecipeEntity(
            title = "کوساديا",
            ingredients = """
                • ۴ عدد تورتیلای آردی
                • ۲۰۰ گرم پنیر چدار
                • ۲۰۰ گرم مرغ پخته
                • ۱ عدد فلفل دلمه
                • ۱ عدد پیاز
                • سس سالسا
            """.trimIndent(),
            instructions = """
                ۱. مرغ، فلفل و پیاز را تفت دهید.
                ۲. تورتیلا را در تابه بگذارید.
                ۳. پنیر و مواد را روی آن بریزید.
                ۴. تورتیلای دوم را روی آن بگذارید.
                ۵. دو طرف را سرخ کنید تا پنیر ذوب شود.
                ۶. برش بزنید و سرو کنید.
            """.trimIndent(),
            mealType = "snack",
            region = "americas",
            source = Source.BUILTIN,
        ),
        RecipeEntity(
            title = "انچیلاداس",
            ingredients = """
                • ۸ عدد تورتیلای ذرت
                • ۵۰۰ گرم مرغ پخته
                • ۲ پیمانه سس انچیلادا
                • ۲۰۰ گرم پنیر
                • خامه ترش، گشنیز
            """.trimIndent(),
            instructions = """
                ۱. مرغ را ریش‌ریش کنید.
                ۲. تورتیلاها را در سس انچیلادا بزنید.
                ۳. مرغ را وسط آن بگذارید.
                ۴. رول کنید و در ظرف بچینید.
                ۵. سس و پنیر روی آن بریزید.
                ۶. در فر ۱۸۰ درجه بپزید.
            """.trimIndent(),
            mealType = "dinner",
            region = "americas",
            source = Source.BUILTIN,
        ),
        RecipeEntity(
            title = "فاهیتا",
            ingredients = """
                • ۵۰۰ گرم مرغ یا گوشت
                • ۲ عدد فلفل دلمه
                • ۱ عدد پیاز
                • ۴ عدد تورتیلای آردی
                • ادویه فاهیتا
                • خامه، گواکاموله
            """.trimIndent(),
            instructions = """
                ۱. مرغ را با ادویه مزه‌دار کنید.
                ۲. در تابه با فلفل و پیاز تفت دهید.
                ۳. تورتیلاها را گرم کنید.
                ۴. مواد را روی تورتیلا بریزید.
                ۵. با خامه و گواکاموله سرو کنید.
            """.trimIndent(),
            mealType = "dinner",
            region = "americas",
            source = Source.BUILTIN,
        ),
        RecipeEntity(
            title = "گواکاموله",
            ingredients = """
                • ۳ عدد آووکادو رسیده
                • ۱ عدد گوجه‌فرنگی
                • ۱ عدد پیاز قرمز
                • ۱ عدد لیمو ترش
                • گشنیز، نمک، فلفل
            """.trimIndent(),
            instructions = """
                ۱. آووکادوها را له کنید.
                ۲. گوجه، پیاز و گشنیز را ریز خرد کنید.
                ۳. با آووکادو مخلوط کنید.
                ۴. آبلیمو، نمک و فلفل اضافه کنید.
                ۵. با چیپس تورتیلا سرو کنید.
            """.trimIndent(),
            mealType = "appetizer",
            region = "americas",
            source = Source.BUILTIN,
        ),
        RecipeEntity(
            title = "ناچوز",
            ingredients = """
                • ۱ بسته چیپس تورتیلا
                • ۲۰۰ گرم پنیر چدار
                • ۱ پیمانه لوبیا
                • ۱ عدد خالاپنیو
                • خامه ترش، سالسا
            """.trimIndent(),
            instructions = """
                ۱. چیپس‌ها را در سینی بریزید.
                ۲. لوبیا و پنیر روی آن بپاشید.
                ۳. در فر بپزید تا پنیر ذوب شود.
                ۴. با خالاپنیو، خامه و سالسا سرو کنید.
            """.trimIndent(),
            mealType = "snack",
            region = "americas",
            source = Source.BUILTIN,
        ),
        RecipeEntity(
            title = "تامال",
            ingredients = """
                • ۲ پیمانه ماسا (آرد ذرت)
                • ۵۰۰ گرم گوشت خوک
                • ۲ پیمانه سس چیلی
                • برگ ذرت
                • ادویه
            """.trimIndent(),
            instructions = """
                ۱. ماسا را با آب و ادویه مخلوط کنید.
                ۲. گوشت را با سس چیلی بپزید.
                ۳. برگ ذرت را باز کنید.
                ۴. ماسا را روی آن پهن کنید.
                ۵. گوشت را وسط آن بگذارید.
                ۶. بپیچید و بخارپز کنید.
            """.trimIndent(),
            mealType = "dinner",
            region = "americas",
            source = Source.BUILTIN,
        ),
        RecipeEntity(
            title = "پوزوله",
            ingredients = """
                • ۵۰۰ گرم گوشت خوک
                • ۲ پیمانه ذرت پوزوله
                • ۳ عدد فلفل خشک
                • ۱ عدد پیاز
                • ۴ حبه سیر
                • کلم، لیمو، رادیش
            """.trimIndent(),
            instructions = """
                ۱. ذرت پوزوله را از شب قبل خیس کنید.
                ۲. فلفل‌ها را خیس کنید و پوره کنید.
                ۳. گوشت را با پیاز و سیر بپزید.
                ۴. ذرت و سس فلفل را اضافه کنید.
                ۵. ۲ ساعت بپزید.
                ۶. با کلم، لیمو و رادیش سرو کنید.
            """.trimIndent(),
            mealType = "dinner",
            region = "americas",
            source = Source.BUILTIN,
        ),
        RecipeEntity(
            title = "الوته",
            ingredients = """
                • ۴ عدد بلال
                • ۳ قاشق غذاخوری مایونز
                • ۱۰۰ گرم پنیر کوتخا
                • ۱ قاشق چای‌خوری فلفل قرمز
                • آبلیمو، گشنیز
            """.trimIndent(),
            instructions = """
                ۱. بلال‌ها را کبابی کنید.
                ۲. مایونز را روی آن بمالید.
                ۳. پنیر بپاشید.
                ۴. فلفل قرمز بپاشید.
                ۵. با آبلیمو و گشنیز سرو کنید.
            """.trimIndent(),
            mealType = "snack",
            region = "americas",
            source = Source.BUILTIN,
        ),

        // ==================== آمریکا — صبحانه ====================
        RecipeEntity(
            title = "پانکیک",
            ingredients = """
                • ۱ پیمانه آرد
                • ۱ پیمانه شیر
                • ۱ عدد تخم‌مرغ
                • ۲ قاشق غذاخوری شکر
                • ۱ قاشق چای‌خوری بیکینگ پودر
                • شربت افرا، کره
            """.trimIndent(),
            instructions = """
                ۱. همه مواد را مخلوط کنید.
                ۲. تابه را گرم کنید.
                ۳. از مخلوط در تابه بریزید.
                ۴. دو طرف را سرخ کنید.
                ۵. با شربت افرا و کره سرو کنید.
            """.trimIndent(),
            mealType = "breakfast",
            region = "americas",
            source = Source.BUILTIN,
        ),
        RecipeEntity(
            title = "وافل",
            ingredients = """
                • ۲ پیمانه آرد
                • ۲ عدد تخم‌مرغ
                • ۱.۵ پیمانه شیر
                • نصف پیمانه کره ذوب‌شده
                • ۲ قاشق غذاخوری شکر
                • وانیل
            """.trimIndent(),
            instructions = """
                ۱. همه مواد را مخلوط کنید.
                ۲. در قالب وافل بریزید.
                ۳. بپزید تا طلایی شود.
                ۴. با شربت افرا، میوه و خامه سرو کنید.
            """.trimIndent(),
            mealType = "breakfast",
            region = "americas",
            source = Source.BUILTIN,
        ),
        RecipeEntity(
            title = "املت غربی",
            ingredients = """
                • ۴ عدد تخم‌مرغ
                • ۱۰۰ گرم ژامبون
                • ۱ عدد فلفل دلمه
                • ۱ عدد پیاز
                • ۱۰۰ گرم پنیر چدار
                • کره
            """.trimIndent(),
            instructions = """
                ۱. ژامبون، فلفل و پیاز را تفت دهید.
                ۲. تخم‌مرغ‌ها را هم بزنید و بریزید.
                ۳. پنیر بپاشید.
                ۴. تا کنید و سرو کنید.
            """.trimIndent(),
            mealType = "breakfast",
            region = "americas",
            source = Source.BUILTIN,
        ),
        RecipeEntity(
            title = "بیگل با خامه پنیر",
            ingredients = """
                • ۲ عدد بیگل
                • ۱۰۰ گرم خامه پنیر
                • ۱۰۰ گرم ماهی دودی
                • ۱ عدد پیاز قرمز
                • کاپاری، لیمو
            """.trimIndent(),
            instructions = """
                ۱. بیگل‌ها را برش بزنید و تست کنید.
                ۲. خامه پنیر را روی آن بمالید.
                ۳. ماهی دودی را اضافه کنید.
                ۴. پیاز، کاپاری و لیمو سرو کنید.
            """.trimIndent(),
            mealType = "breakfast",
            region = "americas",
            source = Source.BUILTIN,
        ),
        RecipeEntity(
            title = "اوتمیل",
            ingredients = """
                • ۱ پیمانه جو دوسر
                • ۲ پیمانه شیر
                • ۲ قاشق غذاخوری شکر
                • دارچین، موز، توت
                • عسل، گردو
            """.trimIndent(),
            instructions = """
                ۱. جو دوسر را با شیر بپزید.
                ۲. شکر و دارچین اضافه کنید.
                ۳. در کاسه بریزید.
                ۴. با موز، توت، عسل و گردو سرو کنید.
            """.trimIndent(),
            mealType = "breakfast",
            region = "americas",
            source = Source.BUILTIN,
        ),

        // ==================== آمریکا — ناهار و شام ====================
        RecipeEntity(
            title = "برگر",
            ingredients = """
                • ۵۰۰ گرم گوشت چرخ‌کرده
                • ۴ عدد نان برگر
                • ۴ برش پنیر چدار
                • کاهو، گوجه، پیاز
                • سس مایونز، خردل، کچاپ
            """.trimIndent(),
            instructions = """
                ۱. گوشت را به شکل برگر درآورید.
                ۲. روی گریل بپزید.
                ۳. پنیر را روی آن بگذارید تا ذوب شود.
                ۴. نان را گرم کنید.
                ۵. همه مواد را لایه‌لایه بچینید.
                ۶. با سیب‌زمینی سرخ‌شده سرو کنید.
            """.trimIndent(),
            mealType = "lunch",
            region = "americas",
            source = Source.BUILTIN,
        ),
        RecipeEntity(
            title = "هات داگ",
            ingredients = """
                • ۴ عدد سوسیس
                • ۴ عدد نان هات داگ
                • ۱ عدد پیاز
                • خردل، کچاپ
                • خیارشور
            """.trimIndent(),
            instructions = """
                ۱. سوسیس‌ها را کباب کنید.
                ۲. نان‌ها را گرم کنید.
                ۳. سوسیس را در نان بگذارید.
                ۴. با پیاز، خردل، کچاپ و خیارشور سرو کنید.
            """.trimIndent(),
            mealType = "snack",
            region = "americas",
            source = Source.BUILTIN,
        ),
        RecipeEntity(
            title = "بیف استروگانف",
            ingredients = """
                • ۵۰۰ گرم گوشت گاو
                • ۳۰۰ گرم قارچ
                • ۲ عدد پیاز
                • ۲ پیمانه خامه
                • ۲ قاشق غذاخوری آرد
                • نودل
            """.trimIndent(),
            instructions = """
                ۱. گوشت را تفت دهید.
                ۲. پیاز و قارچ را اضافه کنید.
                ۳. آرد بپاشید.
                ۴. خامه اضافه کنید.
                ۵. ۲۰ دقیقه بپزید.
                ۶. با نودل سرو کنید.
            """.trimIndent(),
            mealType = "dinner",
            region = "americas",
            source = Source.BUILTIN,
        ),
        RecipeEntity(
            title = "باربیکیو ریبز",
            ingredients = """
                • ۱ کیلو دنده گاو
                • ۲ پیمانه سس باربیکیو
                • ۲ قاشق غذاخوری شکر قهوه‌ای
                • ۱ قاشق غذاخوری پاپریکا
                • سیر، پیاز پودر
            """.trimIndent(),
            instructions = """
                ۱. دنده را با ادویه مزه‌دار کنید.
                ۲. ۱ ساعت استراحت دهید.
                ۳. در فر ۱۶۰ درجه بپزید (۲ ساعت).
                ۴. سس باربیکیو بمالید.
                ۵. ۳۰ دقیقه دیگر بپزید.
                ۶. برش بزنید و سرو کنید.
            """.trimIndent(),
            mealType = "dinner",
            region = "americas",
            source = Source.BUILTIN,
        ),
        RecipeEntity(
            title = "ماکارونی و پنیر",
            ingredients = """
                • ۳۰۰ گرم ماکارونی
                • ۳ پیمانه شیر
                • ۲۰۰ گرم پنیر چدار
                • ۳ قاشق غذاخوری کره
                • ۳ قاشق غذاخوری آرد
                • خردل، نمک، فلفل
            """.trimIndent(),
            instructions = """
                ۱. ماکارونی را بپزید.
                ۲. کره را ذوب کنید و آرد اضافه کنید.
                ۳. شیر را اضافه کنید و هم بزنید.
                ۴. پنیر را اضافه کنید.
                ۵. ماکارونی را اضافه کنید.
                ۶. در فر بپزید تا طلایی شود.
            """.trimIndent(),
            mealType = "dinner",
            region = "americas",
            source = Source.BUILTIN,
        ),
        RecipeEntity(
            title = "کلم Chowder",
            ingredients = """
                • ۵۰۰ گرم کلم
                • ۲۰۰ گرم بیکن
                • ۲ عدد سیب‌زمینی
                • ۱ عدد پیاز
                • ۲ پیمانه شیر
                • آرد، کره
            """.trimIndent(),
            instructions = """
                ۱. بیکن را سرخ کنید.
                ۲. پیاز، سیب‌زمینی و کلم را اضافه کنید.
                ۳. آب اضافه کنید و بپزید.
                ۴. کره و آرد اضافه کنید.
                ۵. شیر اضافه کنید.
                ۶. ۱۵ دقیقه بپزید.
            """.trimIndent(),
            mealType = "dinner",
            region = "americas",
            source = Source.BUILTIN,
        ),
        RecipeEntity(
            title = "کباب مرغ آمریکایی",
            ingredients = """
                • ۵۰۰ گرم مرغ
                • ۱ پیمانه سس باربیکیو
                • ۲ قاشق غذاخوری عسل
                • ۲ قاشق غذاخوری سس سویا
                • ۲ حبه سیر
                • نمک، فلفل
            """.trimIndent(),
            instructions = """
                ۱. مرغ را با سس باربیکیو، عسل، سس سویا و سیر مزه‌دار کنید.
                ۲. ۲ ساعت استراحت دهید.
                ۳. روی گریل کباب کنید.
                ۴. با سس اضافه سرو کنید.
            """.trimIndent(),
            mealType = "dinner",
            region = "americas",
            source = Source.BUILTIN,
        ),
        RecipeEntity(
            title = "کلاب ساندویچ",
            ingredients = """
                • ۳ برش نان تست
                • ۱۰۰ گرم مرغ
                • ۲ برش بیکن
                • ۱ عدد گوجه‌فرنگی
                • کاهو، مایونز
            """.trimIndent(),
            instructions = """
                ۱. نان‌ها را تست کنید.
                ۲. مرغ و بیکن را سرخ کنید.
                ۳. مایونز بمالید.
                ۴. همه مواد را لایه‌لایه بچینید.
                ۵. با خلال دندان محکم کنید.
                ۶. سرو کنید.
            """.trimIndent(),
            mealType = "lunch",
            region = "americas",
            source = Source.BUILTIN,
        ),
        RecipeEntity(
            title = "سیب‌زمینی سرخ‌شده",
            ingredients = """
                • ۴ عدد سیب‌زمینی
                • روغن برای سرخ کردن
                • نمک، فلفل
                • پنیر ذوب‌شده (اختیاری)
            """.trimIndent(),
            instructions = """
                ۱. سیب‌زمینی را خلالی خرد کنید.
                ۲. در آب سرد بخیسانید.
                ۳. خشک کنید.
                ۴. در روغن داغ سرخ کنید.
                ۵. نمک و فلفل بپاشید.
                ۶. با سس سرو کنید.
            """.trimIndent(),
            mealType = "snack",
            region = "americas",
            source = Source.BUILTIN,
        ),
        RecipeEntity(
            title = "چیلی کن کارنه",
            ingredients = """
                • ۵۰۰ گرم گوشت چرخ‌کرده
                • ۲ پیمانه لوبیا قرمز
                • ۱ عدد پیاز
                • ۲ قاشق غذاخوری رب گوجه
                • ۲ قاشق غذاخوری پودر چیلی
                • زیره، سیر
            """.trimIndent(),
            instructions = """
                ۱. پیاز را تفت دهید.
                ۲. گوشت را اضافه کنید.
                ۳. رب گوجه و ادویه اضافه کنید.
                ۴. لوبیا را اضافه کنید.
                ۵. آب اضافه کنید و ۱ ساعت بپزید.
                ۶. با نان ذرت سرو کنید.
            """.trimIndent(),
            mealType = "dinner",
            region = "americas",
            source = Source.BUILTIN,
        ),
        RecipeEntity(
            title = "کورن داگ",
            ingredients = """
                • ۴ عدد سوسیس
                • ۱ پیمانه آرد ذرت
                • ۱ پیمانه آرد
                • ۱ پیمانه شیر
                • ۱ عدد تخم‌مرغ
                • روغن
            """.trimIndent(),
            instructions = """
                ۱. آردها، شیر و تخم‌مرغ را مخلوط کنید.
                ۲. سوسیس‌ها را در خمیر بزنید.
                ۳. در روغن داغ سرخ کنید.
                ۴. با خردل و کچاپ سرو کنید.
            """.trimIndent(),
            mealType = "snack",
            region = "americas",
            source = Source.BUILTIN,
        ),

        // ==================== کانادا ====================
        RecipeEntity(
            title = "پوتین",
            ingredients = """
                • ۴ عدد سیب‌زمینی
                • ۲۰۰ گرم پنیر چدار
                • ۲ پیمانه سس گریوی
                • روغن برای سرخ کردن
            """.trimIndent(),
            instructions = """
                ۱. سیب‌زمینی را خلالی خرد و سرخ کنید.
                ۲. پنیر را روی آن بپاشید.
                ۳. سس گریوی داغ روی آن بریزید.
                ۴. سرو کنید.
            """.trimIndent(),
            mealType = "snack",
            region = "americas",
            source = Source.BUILTIN,
        ),
        RecipeEntity(
            title = "تورتیه کانادایی",
            ingredients = """
                • ۱ عدد خمیر پای
                • ۵۰۰ گرم گوشت چرخ‌کرده
                • ۲ عدد سیب‌زمینی
                • ۱ عدد پیاز
                • ادویه، نمک، فلفل
            """.trimIndent(),
            instructions = """
                ۱. گوشت، سیب‌زمینی و پیاز را مخلوط کنید.
                ۲. ادویه اضافه کنید.
                ۳. در خمیر بپیچید.
                ۴. در فر ۱۸۰ درجه بپزید.
                ۵. با سس سرو کنید.
            """.trimIndent(),
            mealType = "dinner",
            region = "americas",
            source = Source.BUILTIN,
        ),
        RecipeEntity(
            title = "مپل سیроп پانکیک",
            ingredients = """
                • ۲ پیمانه آرد
                • ۲ عدد تخم‌مرغ
                • ۱.۵ پیمانه شیر
                • ۲ قاشق غذاخوری شکر
                • شربت افرا
                • کره
            """.trimIndent(),
            instructions = """
                ۱. همه مواد را مخلوط کنید.
                ۲. در تابه بپزید.
                ۳. با شربت افرا و کره سرو کنید.
            """.trimIndent(),
            mealType = "breakfast",
            region = "americas",
            source = Source.BUILTIN,
        ),
        RecipeEntity(
            title = "نانايمو بار",
            ingredients = """
                • ۲ پیمانه بیسکویت خردشده
                • ۱ پیمانه کره
                • ۲ پیمانه پودر قند
                • ۲ قاشق غذاخوری پودر کاستارد
                • شکلات ذوب‌شده
            """.trimIndent(),
            instructions = """
                ۱. بیسکویت، کره، پودر قند و کاستارد را مخلوط کنید.
                ۲. در قالب پهن کنید.
                ۳. شکلات ذوب‌شده را روی آن بریزید.
                ۴. در یخچال بگذارید.
                ۵. برش بزنید و سرو کنید.
            """.trimIndent(),
            mealType = "dessert",
            region = "americas",
            source = Source.BUILTIN,
        ),

        // ==================== پرو ====================
        RecipeEntity(
            title = "سوویچه",
            ingredients = """
                • ۵۰۰ گرم ماهی سفید
                • ۱ عدد پیاز قرمز
                • ۱ عدد فلفل آخی
                • ۱ عدد لیمو ترش
                • گشنیز، ذرت بو داده
                • سیب‌زمینی شیرین
            """.trimIndent(),
            instructions = """
                ۱. ماهی را مکعبی خرد کنید.
                ۲. آبلیمو، پیاز، فلفل و گشنیز اضافه کنید.
                ۳. ۱۰ دقیقه در یخچال بگذارید.
                ۴. با ذرت و سیب‌زمینی سرو کنید.
            """.trimIndent(),
            mealType = "appetizer",
            region = "americas",
            source = Source.BUILTIN,
        ),
        RecipeEntity(
            title = "لومو سالتادو",
            ingredients = """
                • ۵۰۰ گرم گوشت گاو
                • ۲ عدد پیاز
                • ۲ عدد گوجه‌فرنگی
                • ۲ عدد فلفل
                • سس سویا، سرکه
                • سیب‌زمینی سرخ‌شده
            """.trimIndent(),
            instructions = """
                ۱. گوشت را تفت دهید.
                ۲. پیاز، گوجه و فلفل را اضافه کنید.
                ۳. سس سویا و سرکه اضافه کنید.
                ۴. با سیب‌زمینی سرخ‌شده سرو کنید.
            """.trimIndent(),
            mealType = "dinner",
            region = "americas",
            source = Source.BUILTIN,
        ),
        RecipeEntity(
            title = "آخی د گالینا",
            ingredients = """
                • ۴ عدد مرغ
                • ۲ عدد فلفل آخی
                • ۱ عدد پیاز
                • ۴ حبه سیر
                • زیره، نمک
                • سیب‌زمینی، نان
            """.trimIndent(),
            instructions = """
                ۱. مرغ را با فلفل، پیاز، سیر و ادویه بپزید.
                ۲. سیب‌زمینی را جداگانه بپزید.
                ۳. مرغ را با سس سرو کنید.
                ۴. با نان و سیب‌زمینی سرو کنید.
            """.trimIndent(),
            mealType = "dinner",
            region = "americas",
            source = Source.BUILTIN,
        ),
        RecipeEntity(
            title = "کاوسا",
            ingredients = """
                • ۴ عدد سیب‌زمینی
                • ۱ عدد فلفل آخی
                • ۱ عدد لیمو
                • ۱ عدد آووکادو
                • سس مایونز
            """.trimIndent(),
            instructions = """
                ۱. سیب‌زمینی را بپزید و له کنید.
                ۲. فلفل و لیمو اضافه کنید.
                ۳. در بشقاب بچینید.
                ۴. با آووکادو و مایونز سرو کنید.
            """.trimIndent(),
            mealType = "appetizer",
            region = "americas",
            source = Source.BUILTIN,
        ),
        RecipeEntity(
            title = "آنتیکوچوس",
            ingredients = """
                • ۵۰۰ گرم گوشت گاو
                • ۲ قاشق غذاخوری سس سویا
                • ۱ قاشق غذاخوری سرکه
                • ۲ حبه سیر
                • زیره، فلفل
                • سیب‌زمینی
            """.trimIndent(),
            instructions = """
                ۱. گوشت را نازک برش بزنید.
                ۲. با سس سویا، سرکه، سیر و ادویه مزه‌دار کنید.
                ۳. به سیخ بکشید.
                ۴. روی گریل کباب کنید.
                ۵. با سیب‌زمینی سرو کنید.
            """.trimIndent(),
            mealType = "dinner",
            region = "americas",
            source = Source.BUILTIN,
        ),

        // ==================== برزیل ====================
        RecipeEntity(
            title = "فیجوآدا",
            ingredients = """
                • ۵۰۰ گرم گوشت خوک
                • ۵۰۰ گرم گوشت گاو
                • ۲ پیمانه لوبیا سیاه
                • ۲ عدد پیاز
                • ۴ حبه سیر
                • برگ بو، پرتقال
            """.trimIndent(),
            instructions = """
                ۱. لوبیا را از شب قبل خیس کنید.
                ۲. گوشت‌ها را با پیاز و سیر تفت دهید.
                ۳. لوبیا و آب اضافه کنید.
                ۴. برگ بو اضافه کنید.
                ۵. ۳ ساعت بپزید.
                ۶. با برنج، پرتقال و کلم سرو کنید.
            """.trimIndent(),
            mealType = "dinner",
            region = "americas",
            source = Source.BUILTIN,
        ),
        RecipeEntity(
            title = "موککا",
            ingredients = """
                • ۵۰۰ گرم ماهی
                • ۱ قوطی شیر نارگیل
                • ۲ عدد گوجه‌فرنگی
                • ۱ عدد فلفل دلمه
                • ۱ عدد پیاز
                • گشنیز، لیمو
            """.trimIndent(),
            instructions = """
                ۱. پیاز و فلفل را تفت دهید.
                ۲. گوجه را اضافه کنید.
                ۳. شیر نارگیل را اضافه کنید.
                ۴. ماهی را اضافه کنید.
                ۵. ۲۰ دقیقه بپزید.
                ۶. با گشنیز و لیمو سرو کنید.
            """.trimIndent(),
            mealType = "dinner",
            region = "americas",
            source = Source.BUILTIN,
        ),
        RecipeEntity(
            title = "پائو د کجو",
            ingredients = """
                • ۵۰۰ گرم آرد
                • ۲۵۰ گرم پنیر
                • ۲ عدد تخم‌مرغ
                • ۱ پیمانه شیر
                • ۱ پیمانه روغن
                • نمک
            """.trimIndent(),
            instructions = """
                ۱. همه مواد را مخلوط کنید.
                ۲. خمیر را ورز دهید.
                ۳. به شکل توپ‌های کوچک درآورید.
                ۴. در فر ۱۸۰ درجه بپزید.
                ۵. گرم سرو کنید.
            """.trimIndent(),
            mealType = "breakfast",
            region = "americas",
            source = Source.BUILTIN,
        ),
        RecipeEntity(
            title = "بریگادیرو",
            ingredients = """
                • ۱ قوطی شیر تغلیظ‌شده
                • ۳ قاشق غذاخوری پودر کاکائو
                • ۱ قاشق غذاخوری کره
                • شکلات رنده‌شده
            """.trimIndent(),
            instructions = """
                ۱. شیر تغلیظ‌شده، کاکائو و کره را بپزید.
                ۲. هم بزنید تا غلیظ شود.
                ۳. سرد کنید.
                ۴. به شکل توپ درآورید.
                ۵. در شکلات رنده‌شده بزنید.
            """.trimIndent(),
            mealType = "dessert",
            region = "americas",
            source = Source.BUILTIN,
        ),

        // ==================== آرژانتین ====================
        RecipeEntity(
            title = "آسادو",
            ingredients = """
                • ۱ کیلو گوشت گاو
                • ۲ عدد پیاز
                • ۲ عدد فلفل دلمه
                • نمک درشت
                • چیمیچوری
            """.trimIndent(),
            instructions = """
                ۱. گوشت را با نمک درشت مزه‌دار کنید.
                ۲. روی گریل زغالی بپزید.
                ۳. پیاز و فلفل را کنار آن کباب کنید.
                ۴. با سس چیمیچوری سرو کنید.
            """.trimIndent(),
            mealType = "dinner",
            region = "americas",
            source = Source.BUILTIN,
        ),
        RecipeEntity(
            title = "امپانادا",
            ingredients = """
                • ۱۰ عدد خمیر امپانادا
                • ۵۰۰ گرم گوشت چرخ‌کرده
                • ۱ عدد پیاز
                • ۲ عدد تخم‌مرغ آب‌پز
                • زیتون، ادویه
            """.trimIndent(),
            instructions = """
                ۱. گوشت را با پیاز و ادویه تفت دهید.
                ۲. تخم‌مرغ و زیتون را اضافه کنید.
                ۳. در خمیر بپیچید.
                ۴. در فر ۱۸۰ درجه بپزید.
                ۵. گرم سرو کنید.
            """.trimIndent(),
            mealType = "snack",
            region = "americas",
            source = Source.BUILTIN,
        ),
        RecipeEntity(
            title = "چیمیچوری",
            ingredients = """
                • ۱ دسته جعفری
                • ۱ دسته گشنیز
                • ۴ حبه سیر
                • ۱ عدد فلفل قرمز
                • روغن زیتون، سرکه
                • نمک
            """.trimIndent(),
            instructions = """
                ۱. سبزیجات و سیر را ریز خرد کنید.
                ۲. فلفل را اضافه کنید.
                ۳. روغن زیتون و سرکه اضافه کنید.
                ۴. نمک بزنید.
                ۵. با گوشت کبابی سرو کنید.
            """.trimIndent(),
            mealType = "appetizer",
            region = "americas",
            source = Source.BUILTIN,
        ),
        RecipeEntity(
            title = "دولچه د لچه",
            ingredients = """
                • ۱ لیتر شیر
                • ۱ پیمانه شکر
                • ۱ قاشق چای‌خوری وانیل
                • نصف قاشق چای‌خوری بیکینگ پودر
            """.trimIndent(),
            instructions = """
                ۱. شیر و شکر را بجوشانید.
                ۲. وانیل و بیکینگ پودر اضافه کنید.
                ۳. هم بزنید تا کاراملی شود.
                ۴. در ظرف بریزید و سرد کنید.
                ۵. با نان یا کیک سرو کنید.
            """.trimIndent(),
            mealType = "dessert",
            region = "americas",
            source = Source.BUILTIN,
        ),

        // ==================== کوبا ====================
        RecipeEntity(
            title = "روپا ویخا",
            ingredients = """
                • ۱ کیلو گوشت گاو
                • ۲ عدد پیاز
                • ۴ حبه سیر
                • ۲ پیمانه سس گوجه
                • ۱ پیمانه شراب قرمز
                • ادویه، برگ بو
            """.trimIndent(),
            instructions = """
                ۱. گوشت را با پیاز و سیر تفت دهید.
                ۲. سس گوجه و شراب اضافه کنید.
                ۳. ادویه و برگ بو اضافه کنید.
                ۴. ۲ ساعت با حرارت کم بپزید.
                ۵. گوشت را ریش‌ریش کنید.
                ۶. با برنج سرو کنید.
            """.trimIndent(),
            mealType = "dinner",
            region = "americas",
            source = Source.BUILTIN,
        ),
        RecipeEntity(
            title = "کونگری",
            ingredients = """
                • ۲ پیمانه لوبیا قرمز
                • ۲ پیمانه برنج
                • ۱ عدد پیاز
                • ۲ حبه سیر
                • زیره، اورگانو
                • بیکن
            """.trimIndent(),
            instructions = """
                ۱. لوبیا را از شب قبل خیس کنید.
                ۲. با آب بپزید.
                ۳. پیاز، سیر و بیکن را تفت دهید.
                ۴. ادویه اضافه کنید.
                ۵. با برنج مخلوط کنید.
                ۶. سرو کنید.
            """.trimIndent(),
            mealType = "lunch",
            region = "americas",
            source = Source.BUILTIN,
        ),
        RecipeEntity(
            title = "ساندویچ کوبایی",
            ingredients = """
                • ۱ عدد نان کوبایی
                • ۲۰۰ گرم گوشت خوک
                • ۱۰۰ گرم ژامبون
                • ۱۰۰ گرم پنیر سوئیسی
                • خیارشور، خردل
            """.trimIndent(),
            instructions = """
                ۱. نان را برش بزنید.
                ۲. خردل بمالید.
                ۳. گوشت، ژامبون، پنیر و خیارشور بچینید.
                ۴. در پرس گرم کنید.
                ۵. برش بزنید و سرو کنید.
            """.trimIndent(),
            mealType = "lunch",
            region = "americas",
            source = Source.BUILTIN,
        ),
        RecipeEntity(
            title = "فلان",
            ingredients = """
                • ۱ قوطی شیر تغلیظ‌شده
                • ۳ عدد تخم‌مرغ
                • ۱ پیمانه شکر
                • وانیل، کارامل
            """.trimIndent(),
            instructions = """
                ۱. شکر را کاراملی کنید.
                ۲. در قالب بریزید.
                ۳. شیر، تخم‌مرغ و وانیل را مخلوط کنید.
                ۴. روی کارامل بریزید.
                ۵. در فر بن‌ماری بپزید.
                ۶. سرد کنید و برگردانید.
            """.trimIndent(),
            mealType = "dessert",
            region = "americas",
            source = Source.BUILTIN,
        ),

        // ==================== دسرها و نوشیدنی‌ها ====================
        RecipeEntity(
            title = "براونی",
            ingredients = """
                • ۲۰۰ گرم شکلات تلخ
                • ۱۵۰ گرم کره
                • ۳ عدد تخم‌مرغ
                • ۱ پیمانه شکر
                • ۱ پیمانه آرد
                • وانیل، نمک
            """.trimIndent(),
            instructions = """
                ۱. شکلات و کره را ذوب کنید.
                ۲. تخم‌مرغ و شکر را اضافه کنید.
                ۳. آرد، وانیل و نمک را اضافه کنید.
                ۴. در قالب بریزید.
                ۵. در فر ۱۸۰ درجه بپزید.
                ۶. برش بزنید و سرو کنید.
            """.trimIndent(),
            mealType = "dessert",
            region = "americas",
            source = Source.BUILTIN,
        ),
        RecipeEntity(
            title = "چیزکیک نیویورکی",
            ingredients = """
                • ۲۰۰ گرم بیسکویت
                • ۱۰۰ گرم کره
                • ۵۰۰ گرم خامه پنیر
                • ۱ پیمانه شکر
                • ۳ عدد تخم‌مرغ
                • وانیل
            """.trimIndent(),
            instructions = """
                ۱. بیسکویت و کره را مخلوط کنید.
                ۲. در قالب پهن کنید.
                ۳. خامه پنیر، شکر، تخم‌مرغ و وانیل را مخلوط کنید.
                ۴. روی بیسکویت بریزید.
                ۵. در فر ۱۶۰ درجه بپزید.
                ۶. سرد کنید و سرو کنید.
            """.trimIndent(),
            mealType = "dessert",
            region = "americas",
            source = Source.BUILTIN,
        ),
        RecipeEntity(
            title = "پای کدو",
            ingredients = """
                • ۱ عدد خمیر پای
                • ۲ پیمانه پوره کدو
                • ۱ پیمانه شکر
                • ۲ عدد تخم‌مرغ
                • ادویه پای، شیر تغلیظ‌شده
            """.trimIndent(),
            instructions = """
                ۱. خمیر را در قالب پهن کنید.
                ۲. پوره کدو، شکر، تخم‌مرغ و ادویه را مخلوط کنید.
                ۳. شیر تغلیظ‌شده اضافه کنید.
                ۴. روی خمیر بریزید.
                ۵. در فر ۱۸۰ درجه بپزید.
                ۶. سرد سرو کنید.
            """.trimIndent(),
            mealType = "dessert",
            region = "americas",
            source = Source.BUILTIN,
        ),
        RecipeEntity(
            title = "کوکی شکلاتی",
            ingredients = """
                • ۲ پیمانه آرد
                • ۱ پیمانه کره
                • ۱ پیمانه شکر
                • ۱ پیمانه شکر قهوه‌ای
                • ۲ عدد تخم‌مرغ
                • ۲۰۰ گرم شکلات چیپسی
            """.trimIndent(),
            instructions = """
                ۱. کره و شکرها را بزنید.
                ۲. تخم‌مرغ‌ها را اضافه کنید.
                ۳. آرد را اضافه کنید.
                ۴. شکلات چیپسی را اضافه کنید.
                ۵. توپ‌های کوچک درست کنید.
                ۶. در فر ۱۸۰ درجه بپزید.
            """.trimIndent(),
            mealType = "dessert",
            region = "americas",
            source = Source.BUILTIN,
        ),
        RecipeEntity(
            title = "اسموتی توت‌فرنگی",
            ingredients = """
                • ۱ پیمانه توت‌فرنگی
                • ۱ عدد موز
                • ۱ پیمانه شیر
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
            region = "americas",
            source = Source.BUILTIN,
        ),
        RecipeEntity(
            title = "لموناد",
            ingredients = """
                • ۴ عدد لیمو
                • ۱ پیمانه شکر
                • ۴ پیمانه آب
                • یخ، نعنا
            """.trimIndent(),
            instructions = """
                ۱. لیموها را آب بگیرید.
                ۲. شکر را در آب حل کنید.
                ۳. آبلیمو را اضافه کنید.
                ۴. یخ و نعنا اضافه کنید.
                ۵. سرد سرو کنید.
            """.trimIndent(),
            mealType = "snack",
            region = "americas",
            source = Source.BUILTIN,
        ),
        RecipeEntity(
            title = "سیب‌زمینی شیرین پوره",
            ingredients = """
                • ۴ عدد سیب‌زمینی شیرین
                • ۱۰۰ گرم کره
                • نصف پیمانه شیر
                • شکر قهوه‌ای، دارچین
            """.trimIndent(),
            instructions = """
                ۱. سیب‌زمینی را بپزید.
                ۲. پوست بگیرید و له کنید.
                ۳. کره و شیر اضافه کنید.
                ۴. شکر و دارچین اضافه کنید.
                ۵. هم بزنید و سرو کنید.
            """.trimIndent(),
            mealType = "dinner",
            region = "americas",
            source = Source.BUILTIN,
        ),
        RecipeEntity(
            title = "کورن برید",
            ingredients = """
                • ۲ پیمانه آرد ذرت
                • ۱ پیمانه آرد
                • ۱ پیمانه شیر
                • ۲ عدد تخم‌مرغ
                • نصف پیمانه کره
                • بیکینگ پودر، نمک
            """.trimIndent(),
            instructions = """
                ۱. همه مواد را مخلوط کنید.
                ۲. در قالب بریزید.
                ۳. در فر ۲۰۰ درجه بپزید.
                ۴. برش بزنید و سرو کنید.
                ۵. با کره سرو کنید.
            """.trimIndent(),
            mealType = "breakfast",
            region = "americas",
            source = Source.BUILTIN,
        ),
        RecipeEntity(
            title = "بانانا برید",
            ingredients = """
                • ۳ عدد موز رسیده
                • ۱ پیمانه شکر
                • ۱۰۰ گرم کره
                • ۲ عدد تخم‌مرغ
                • ۲ پیمانه آرد
                • بیکینگ پودر، وانیل
            """.trimIndent(),
            instructions = """
                ۱. موزها را له کنید.
                ۲. کره و شکر اضافه کنید.
                ۳. تخم‌مرغ‌ها را اضافه کنید.
                ۴. آرد، بیکینگ پودر و وانیل اضافه کنید.
                ۵. در قالب بریزید.
                ۶. در فر ۱۸۰ درجه بپزید.
            """.trimIndent(),
            mealType = "snack",
            region = "americas",
            source = Source.BUILTIN,
        ),
    )
}