package j3;

import android.graphics.Paint;
import android.text.style.LineHeightSpan;

/* loaded from: /home/user/work/p/classes.dex */
public final class g implements LineHeightSpan {

    /* renamed from: r, reason: collision with root package name */
    public float f26978r;

    public g(float f6) {
        this.f26978r = f6;
    }

    @Override // android.text.style.LineHeightSpan
    public final void chooseHeight(CharSequence charSequence, int i, int i10, int i11, int i12, Paint.FontMetricsInt fontMetricsInt) {
        if (fontMetricsInt.descent - fontMetricsInt.ascent <= 0) {
            return;
        }
        int ceil = (int) Math.ceil(fontMetricsInt.descent * ((r4 * 1.0f) / r3));
        fontMetricsInt.descent = ceil;
        fontMetricsInt.ascent = ceil - ((int) Math.ceil(this.f26978r));
    }
}
