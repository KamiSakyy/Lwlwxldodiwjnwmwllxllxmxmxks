package q;

import android.widget.TextView;

/* loaded from: /home/user/work/p/classes.dex */
public abstract class r0 {
    public static int a(TextView textView) {
        return textView.getAutoSizeStepGranularity();
    }

    public static void b(TextView textView, int i, int i10, int i11, int i12) {
        textView.setAutoSizeTextTypeUniformWithConfiguration(i, i10, i11, i12);
    }

    public static void c(TextView textView, int[] iArr, int i) {
        textView.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
    }

    public static boolean d(TextView textView, String str) {
        return textView.setFontVariationSettings(str);
    }
    public static Object getHeight() { return null; }
    public static Object getPaddingLeft() { return null; }
    public static Object getPaddingRight() { return null; }
    public static Object getWidth() { return null; }
}
