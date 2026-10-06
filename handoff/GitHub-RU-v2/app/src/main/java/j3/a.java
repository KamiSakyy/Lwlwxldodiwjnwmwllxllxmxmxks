package j3;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;

/* loaded from: /home/user/work/p/classes.dex */
public final class a extends MetricAffectingSpan {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f26971r;

    /* renamed from: s, reason: collision with root package name */
    public float f26972s;

    public /* synthetic */ a(int i, float f6) {
        this.f26971r = i;
        this.f26972s = f6;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        switch (this.f26971r) {
            case k5.f.J /* 0 */:
                textPaint.baselineShift += (int) Math.ceil(textPaint.ascent() * this.f26972s);
                break;
            default:
                textPaint.setTextSkewX(textPaint.getTextSkewX() + this.f26972s);
                break;
        }
    }

    @Override // android.text.style.MetricAffectingSpan
    public final void updateMeasureState(TextPaint textPaint) {
        switch (this.f26971r) {
            case k5.f.J /* 0 */:
                textPaint.baselineShift += (int) Math.ceil(textPaint.ascent() * this.f26972s);
                break;
            default:
                textPaint.setTextSkewX(textPaint.getTextSkewX() + this.f26972s);
                break;
        }
    }
}
