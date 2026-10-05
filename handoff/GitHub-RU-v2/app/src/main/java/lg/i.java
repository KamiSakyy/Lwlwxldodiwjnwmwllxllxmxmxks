package lg;

import android.content.Context;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import k71.k;
import t71.p;
import t71.w;

/* loaded from: /home/user/work/p/classes3.dex */
public final class i {
    public static final int a(SpannableStringBuilder spannableStringBuilder, int i, int i2, int i3) {
        int i4 = i2 + i3;
        spannableStringBuilder.insert(i, (CharSequence) w.B(" ", i3));
        spannableStringBuilder.insert(i4, (CharSequence) w.B(" ", i3));
        for (Object obj : spannableStringBuilder.getSpans(i, i4, Object.class)) {
            int spanStart = spannableStringBuilder.getSpanStart(obj);
            int spanEnd = spannableStringBuilder.getSpanEnd(obj);
            spannableStringBuilder.removeSpan(obj);
            spannableStringBuilder.setSpan(obj, spanStart + i3, spanEnd, 17);
        }
        return i3 * 2;
    }

    public static final void b(SpannableString spannableString, Context context, String str, int i) {
        k.g(str, "substring");
        int R = p.R(spannableString, str, 0, false, 6);
        spannableString.setSpan(new ForegroundColorSpan(context.getColor(i)), R, str.length() + R, 33);
    }
}
