package j3;

import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;

/* loaded from: /home/user/work/p/classes.dex */
public final class b extends MetricAffectingSpan {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f26973r;

    /* renamed from: s, reason: collision with root package name */
    public final Object f26974s;

    public /* synthetic */ b(int i, Object obj) {
        this.f26973r = i;
        this.f26974s = obj;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        switch (this.f26973r) {
            case k5.f.J /* 0 */:
                textPaint.setFontFeatureSettings((String) this.f26974s);
                break;
            default:
                textPaint.setTypeface((Typeface) this.f26974s);
                break;
        }
    }

    @Override // android.text.style.MetricAffectingSpan
    public final void updateMeasureState(TextPaint textPaint) {
        switch (this.f26973r) {
            case k5.f.J /* 0 */:
                textPaint.setFontFeatureSettings((String) this.f26974s);
                break;
            default:
                textPaint.setTypeface((Typeface) this.f26974s);
                break;
        }
    }
}
