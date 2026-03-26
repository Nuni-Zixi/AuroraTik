// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    alias(libs.plugins.android.application) apply false
    alias(libs.plugins.kotlin.android) apply false
}
# 保护 Xposed 入口类不被混淆
-keepattributes Signature, [*Annotation*]
-keep class de.robv.android.xposed.** { *; }
-keep class me.dartcv.auroratik.MainHook { *; }
