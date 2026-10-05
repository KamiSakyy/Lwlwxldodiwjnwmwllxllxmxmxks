package j3;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;

/* loaded from: /home/user/work/p/classes.dex */
public final class e extends MetricAffectingSpan {

    /* renamed from: r, reason: collision with root package name */
    public final float f26976r;

    public e(float f6) {
        this.f26976r = f6;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setLetterSpacing(this.f26976r);
    }

    @Override // android.text.style.MetricAffectingSpan
    public final void updateMeasureState(TextPaint textPaint) {
        textPaint.setLetterSpacing(this.f26976r);
    }
}
