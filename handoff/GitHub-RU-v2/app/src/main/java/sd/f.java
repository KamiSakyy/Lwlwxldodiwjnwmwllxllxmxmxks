package sd;

import android.text.TextPaint;
import android.text.style.StyleSpan;
import k71.k;

/* loaded from: /home/user/work/p/classes.dex */
public final class f extends StyleSpan {

    /* renamed from: r, reason: collision with root package name */
    public final int f31987r;

    /* renamed from: s, reason: collision with root package name */
    public final Integer f31988s;

    /* renamed from: t, reason: collision with root package name */
    public final boolean f31989t;

    public f(int i, Integer num, boolean z10, boolean z11, boolean z12) {
        super((z11 && z12) ? 3 : z11 ? 1 : z12 ? 2 : 0);
        this.f31987r = i;
        this.f31988s = num;
        this.f31989t = z10;
    }

    @Override // android.text.style.StyleSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        k.g(textPaint, "textPaint");
        super.updateDrawState(textPaint);
        textPaint.setColor(this.f31987r);
        Integer num = this.f31988s;
        if (num != null) {
            textPaint.bgColor = num.intValue();
        }
        textPaint.setUnderlineText(this.f31989t);
    }
}
