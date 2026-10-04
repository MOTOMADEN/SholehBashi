-keepattributes *Annotation*, InnerClasses
-dontnote kotlinx.serialization.AnnotationsKt

# kotlinx.serialization: models used by the API layer
-keep,includedescriptorclasses class com.sholehbashi.app.data.api.**$$serializer { *; }
-keepclassmembers class com.sholehbashi.app.data.api.** {
    *** Companion;
}
-keepclasseswithmembers class com.sholehbashi.app.data.api.** {
    kotlinx.serialization.KSerializer serializer(...);
}
