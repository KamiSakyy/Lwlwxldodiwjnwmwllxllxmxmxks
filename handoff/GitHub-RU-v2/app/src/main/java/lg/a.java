package lg;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import k71.k;

/* loaded from: /home/user/work/p/classes3.dex */
public final class a extends MetricAffectingSpan {
    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        k.g(textPaint, "paint");
        textPaint.setTypeface(null);
    }

    @Override // android.text.style.MetricAffectingSpan
    public final void updateMeasureState(TextPaint textPaint) {
        k.g(textPaint, "paint");
        textPaint.setTypeface(null);
    }
    public Object c(Object, Object) { return null; }
    public Object d(Object, Object) { return null; }
}
