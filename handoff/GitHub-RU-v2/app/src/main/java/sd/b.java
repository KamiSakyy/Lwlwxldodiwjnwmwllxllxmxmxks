package sd;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Layout;
import android.text.style.ForegroundColorSpan;
import android.text.style.LeadingMarginSpan;
import k71.k;
import q4.l;

/* loaded from: /home/user/work/p/classes.dex */
public final class b extends ForegroundColorSpan implements LeadingMarginSpan {

    /* renamed from: r, reason: collision with root package name */
    public int f31979r;

    /* renamed from: s, reason: collision with root package name */
    public int f31980s;

    /* renamed from: t, reason: collision with root package name */
    public int f31981t;

    /* renamed from: u, reason: collision with root package name */
    public int f31982u;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public b(Context context) {
        super(r0.getColor(2131100998, r1));
        Resources resources = context.getResources();
        Resources.Theme theme = context.getTheme();
        ThreadLocal threadLocal = l.f30960a;
        this.f31979r = context.getResources().getColor(2131099737, context.getTheme());
        this.f31980s = context.getResources().getDimensionPixelSize(2131166283);
        this.f31981t = context.getResources().getDimensionPixelSize(2131166282);
        this.f31982u = context.getResources().getDimensionPixelSize(2131165315);
    }

    @Override // android.text.style.LeadingMarginSpan
    public final void drawLeadingMargin(Canvas canvas, Paint paint, int i, int i10, int i11, int i12, int i13, CharSequence charSequence, int i14, int i15, boolean z10, Layout layout) {
        k.g(canvas, "canvas");
        k.g(paint, "paint");
        Paint.Style style = paint.getStyle();
        int color = paint.getColor();
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(this.f31979r);
        int i16 = this.f31981t;
        canvas.drawRoundRect(i, i11 == 0 ? i11 : i11 - (i16 * 2), (this.f31980s * i10) + i, i13, i16, i16, paint);
        paint.setStyle(style);
        paint.setColor(color);
    }

    @Override // android.text.style.LeadingMarginSpan
    public final int getLeadingMargin(boolean z10) {
        return this.f31982u;
    }
}
