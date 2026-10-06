package o31;

import android.animation.TimeInterpolator;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.ViewGroup;
import com.google.android.material.internal.StaticLayoutBuilderCompat$StaticLayoutBuilderCompatException;

/* loaded from: /home/user/work/p/classes4.dex */
public final class d {
    public Typeface A;
    public Typeface B;
    public Typeface C;
    public Typeface D;
    public r31.a E;
    public r31.a F;
    public CharSequence H;
    public CharSequence I;
    public boolean J;
    public float L;
    public float M;
    public float N;
    public float O;
    public float P;
    public int Q;
    public int R;
    public int[] S;
    public boolean T;
    public TextPaint U;
    public TextPaint V;
    public TimeInterpolator W;
    public TimeInterpolator X;
    public float Y;
    public float Z;
    public ViewGroup a;
    public float a0;
    public float b;
    public ColorStateList b0;
    public boolean c;
    public float c0;
    public float d;
    public float d0;
    public float e;
    public float e0;
    public int f;
    public ColorStateList f0;
    public Rect g;
    public float g0;
    public Rect h;
    public float h0;
    public Rect i;
    public float i0;
    public RectF j;
    public StaticLayout j0;
    public float k0;
    public float l0;
    public float m0;
    public CharSequence n0;
    public ColorStateList o;
    public ColorStateList p;
    public int q;
    public float r;
    public float s;
    public float t;
    public float u;
    public float v;
    public boolean v0;
    public float w;
    public Typeface x;
    public Typeface y;
    public Typeface z;
    public int k = 16;
    public int l = 16;
    public float m = 15.0f;
    public float n = 15.0f;
    public TextUtils.TruncateAt G = TextUtils.TruncateAt.END;
    public boolean K = true;
    public int o0 = 1;
    public int p0 = 1;
    public float q0 = 0.0f;
    public float r0 = 1.0f;
    public int s0 = 1;
    public int t0 = -1;
    public int u0 = -1;

    public d(ViewGroup viewGroup) {
        this.a = viewGroup;
        TextPaint textPaint = new TextPaint(129);
        this.U = textPaint;
        this.V = new TextPaint(textPaint);
        this.h = new Rect();
        this.g = new Rect();
        this.j = new RectF();
        float f = this.d;
        this.e = x.i.a(1.0f, f, 0.5f, f);
        k(viewGroup.getContext().getResources().getConfiguration());
    }

    public static int a(int i, float f, int i2) {
        float f2 = 1.0f - f;
        return Color.argb(Math.round((Color.alpha(i2) * f) + (Color.alpha(i) * f2)), Math.round((Color.red(i2) * f) + (Color.red(i) * f2)), Math.round((Color.green(i2) * f) + (Color.green(i) * f2)), Math.round((Color.blue(i2) * f) + (Color.blue(i) * f2)));
    }

    public static float j(float f, float f2, float f3, TimeInterpolator timeInterpolator) {
        if (timeInterpolator != null) {
            f3 = timeInterpolator.getInterpolation(f3);
        }
        return y21.a.a(f, f2, f3);
    }

    public static boolean m(Rect rect, int i, int i2, int i3, int i4) {
        return rect.left == i && rect.top == i2 && rect.right == i3 && rect.bottom == i4;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x000b, code lost:
    
        if (r3 > 1.0f) goto L4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void A(float f) {
        float f2 = f >= 0.0f ? 1.0f : 0.0f;
        f = f2;
        if (f != this.b) {
            this.b = f;
            b();
        }
    }

    public final void B(CharSequence charSequence) {
        if (charSequence == null || !TextUtils.equals(this.H, charSequence)) {
            this.H = charSequence;
            this.I = null;
            l(false);
        }
    }

    public final boolean C() {
        return this.p0 == 1;
    }

    public final void b() {
        float f;
        float f2 = this.b;
        boolean z = this.c;
        Rect rect = this.h;
        Rect rect2 = this.g;
        RectF rectF = this.j;
        if (z) {
            if (f2 < this.e) {
                rect = rect2;
            }
            rectF.set(rect);
        } else {
            rectF.left = j(rect2.left, rect.left, f2, this.W);
            rectF.top = j(this.r, this.s, f2, this.W);
            rectF.right = j(rect2.right, rect.right, f2, this.W);
            rectF.bottom = j(rect2.bottom, rect.bottom, f2, this.W);
        }
        boolean z2 = this.c;
        ViewGroup viewGroup = this.a;
        if (!z2) {
            this.v = j(this.t, this.u, f2, this.W);
            this.w = j(this.r, this.s, f2, this.W);
            d(f2, false);
            viewGroup.postInvalidateOnAnimation();
            f = f2;
        } else if (f2 < this.e) {
            this.v = this.t;
            this.w = this.r;
            d(0.0f, false);
            viewGroup.postInvalidateOnAnimation();
            f = 0.0f;
        } else {
            this.v = this.u;
            this.w = this.s - Math.max(0, this.f);
            d(1.0f, false);
            viewGroup.postInvalidateOnAnimation();
            f = 1.0f;
        }
        p6.a aVar = y21.a.b;
        this.l0 = 1.0f - j(0.0f, 1.0f, 1.0f - f2, aVar);
        viewGroup.postInvalidateOnAnimation();
        this.m0 = j(1.0f, 0.0f, f2, aVar);
        viewGroup.postInvalidateOnAnimation();
        ColorStateList colorStateList = this.p;
        ColorStateList colorStateList2 = this.o;
        TextPaint textPaint = this.U;
        if (colorStateList != colorStateList2) {
            textPaint.setColor(a(h(colorStateList2), f, h(this.p)));
        } else {
            textPaint.setColor(h(colorStateList));
        }
        float f3 = this.g0;
        float f4 = this.h0;
        if (f3 != f4) {
            textPaint.setLetterSpacing(j(f4, f3, f2, aVar));
        } else {
            textPaint.setLetterSpacing(f3);
        }
        this.N = y21.a.a(this.c0, this.Y, f2);
        this.O = y21.a.a(this.d0, this.Z, f2);
        this.P = y21.a.a(this.e0, this.a0, f2);
        int a = a(h(this.f0), f2, h(this.b0));
        this.Q = a;
        textPaint.setShadowLayer(this.N, this.O, this.P, a);
        if (this.c) {
            int alpha = textPaint.getAlpha();
            float f5 = this.e;
            textPaint.setAlpha((int) ((f2 <= f5 ? y21.a.b(1.0f, 0.0f, this.d, f5, f2) : y21.a.b(0.0f, 1.0f, f5, 1.0f, f2)) * alpha));
            if (Build.VERSION.SDK_INT >= 31) {
                float f6 = this.N;
                float f7 = this.O;
                float f8 = this.P;
                int i = this.Q;
                textPaint.setShadowLayer(f6, f7, f8, r4.a.f(i, (Color.alpha(i) * textPaint.getAlpha()) / 255));
            }
        }
        viewGroup.postInvalidateOnAnimation();
    }

    public final boolean c(CharSequence charSequence) {
        boolean z = this.a.getLayoutDirection() == 1;
        if (this.K) {
            return (z ? y4.f.d : y4.f.c).e(charSequence.length(), charSequence);
        }
        return z;
    }

    public final void d(float f, boolean z) {

        Object r7 = null;
        float f2;
        Typeface typeface;
        float f3;
        if (this.H == null) {
            return;
        }
        float width = this.h.width();
        float width2 = this.g.width();
        if (Math.abs(f - 1.0f) < 1.0E-5f) {
            f2 = C() ? this.n : this.m;
            f3 = C() ? this.g0 : this.h0;
            this.L = C() ? 1.0f : j(this.m, this.n, f, this.X) / this.m;
            if (!C()) {
                width = width2;
            }
            typeface = this.x;
            width2 = width;
        } else {
            f2 = this.m;
            float f4 = this.h0;
            typeface = this.A;
            if (Math.abs(f - 0.0f) < 1.0E-5f) {
                this.L = 1.0f;
            } else {
                this.L = j(this.m, this.n, f, this.X) / this.m;
            }
            float f5 = this.n / this.m;
            float f6 = width2 * f5;
            if (!z && !this.c && f6 > width && C()) {
                width2 = Math.min(width / f5, width2);
            }
            f3 = f4;
        }
        int i = f < 0.5f ? this.o0 : this.p0;
        TextPaint textPaint = this.U;
        if (width2 > 0.0f) {
            boolean z2 = this.M != f2;
            boolean z3 = this.i0 != f3;
            boolean z4 = this.D != typeface;
            StaticLayout staticLayout = this.j0;
            boolean z5 = z2 || z3 || (staticLayout != null && (width2 > ((float) staticLayout.getWidth()) ? 1 : (width2 == ((float) staticLayout.getWidth()) ? 0 : -1)) != 0) || z4 || (this.R != i) || this.T;
            this.M = f2;
            this.i0 = f3;
            this.D = typeface;
            this.T = false;
            this.R = i;
            textPaint.setLinearText(this.L != 1.0f);
            r7 = z5;
        }
        if (this.I == null || r7) {
            textPaint.setTextSize(this.M);
            textPaint.setTypeface(this.D);
            textPaint.setLetterSpacing(this.i0);
            boolean c = c(this.H);
            this.J = c;
            StaticLayout e = e(((this.o0 > 1 || this.p0 > 1) && (!c || this.c)) ? i : 1, textPaint, this.H, width2 * (C() ? 1.0f : this.L), this.J);
            this.j0 = e;
            this.I = e.getText();
        }
    }

    public final StaticLayout e(int i, TextPaint textPaint, CharSequence charSequence, float f, boolean z) {
        Layout.Alignment alignment;
        StaticLayout staticLayout = null;
        try {
            if (i == 1) {
                alignment = Layout.Alignment.ALIGN_NORMAL;
            } else {
                int absoluteGravity = Gravity.getAbsoluteGravity(this.k, this.J ? 1 : 0) & 7;
                alignment = absoluteGravity != 1 ? absoluteGravity != 5 ? this.J ? Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL : this.J ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_CENTER;
            }
            j jVar = new j(charSequence, textPaint, (int) f);
            jVar.l = this.G;
            jVar.k = z;
            jVar.e = alignment;
            jVar.j = false;
            jVar.f = i;
            float f2 = this.q0;
            float f3 = this.r0;
            jVar.g = f2;
            jVar.h = f3;
            jVar.i = this.s0;
            jVar.m = null;
            staticLayout = jVar.a();
        } catch (StaticLayoutBuilderCompat$StaticLayoutBuilderCompatException e) {
            e.getCause().getMessage();
        }
        staticLayout.getClass();
        return staticLayout;
    }

    public final void f(Canvas canvas) {
        int save = canvas.save();
        if (this.I != null) {
            RectF rectF = this.j;
            if (rectF.width() <= 0.0f || rectF.height() <= 0.0f) {
                return;
            }
            float f = this.M;
            TextPaint textPaint = this.U;
            textPaint.setTextSize(f);
            float f2 = this.v;
            float f3 = this.w;
            float f4 = this.L;
            if (f4 != 1.0f && !this.c) {
                canvas.scale(f4, f4, f2, f3);
            }
            if ((this.o0 > 1 || this.p0 > 1) && ((!this.J || this.c) && C() && (!this.c || this.b > this.e))) {
                float lineStart = this.v - this.j0.getLineStart(0);
                int alpha = textPaint.getAlpha();
                canvas.translate(lineStart, f3);
                if (!this.c) {
                    textPaint.setAlpha((int) (this.m0 * alpha));
                    if (Build.VERSION.SDK_INT >= 31) {
                        float f5 = this.N;
                        float f6 = this.O;
                        float f7 = this.P;
                        int i = this.Q;
                        textPaint.setShadowLayer(f5, f6, f7, r4.a.f(i, (Color.alpha(i) * textPaint.getAlpha()) / 255));
                    }
                    this.j0.draw(canvas);
                }
                if (!this.c) {
                    textPaint.setAlpha((int) (this.l0 * alpha));
                }
                int i2 = Build.VERSION.SDK_INT;
                if (i2 >= 31) {
                    float f8 = this.N;
                    float f9 = this.O;
                    float f10 = this.P;
                    int i3 = this.Q;
                    textPaint.setShadowLayer(f8, f9, f10, r4.a.f(i3, (Color.alpha(i3) * textPaint.getAlpha()) / 255));
                }
                int lineBaseline = this.j0.getLineBaseline(0);
                CharSequence charSequence = this.n0;
                float f12 = lineBaseline;
                canvas.drawText(charSequence, 0, charSequence.length(), 0.0f, f12, textPaint);
                if (i2 >= 31) {
                    textPaint.setShadowLayer(this.N, this.O, this.P, this.Q);
                }
                if (!this.c) {
                    String trim = this.n0.toString().trim();
                    if (trim.endsWith("…")) {
                        trim = trim.substring(0, trim.length() - 1);
                    }
                    String str = trim;
                    textPaint.setAlpha(alpha);
                    canvas.drawText(str, 0, Math.min(this.j0.getLineEnd(0), str.length()), 0.0f, f12, (Paint) textPaint);
                }
                canvas = canvas;
            } else {
                canvas.translate(f2, f3);
                this.j0.draw(canvas);
            }
            canvas.restoreToCount(save);
        }
    }

    public final float g() {
        int i = this.t0;
        if (i != -1) {
            return i;
        }
        float f = this.n;
        TextPaint textPaint = this.V;
        textPaint.setTextSize(f);
        textPaint.setTypeface(this.x);
        textPaint.setLetterSpacing(this.g0);
        return -textPaint.ascent();
    }

    public final int h(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return 0;
        }
        int[] iArr = this.S;
        return iArr != null ? colorStateList.getColorForState(iArr, 0) : colorStateList.getDefaultColor();
    }

    public final float i() {
        float f = this.m;
        TextPaint textPaint = this.V;
        textPaint.setTextSize(f);
        textPaint.setTypeface(this.A);
        textPaint.setLetterSpacing(this.h0);
        return textPaint.descent() + (-textPaint.ascent());
    }

    public final void k(Configuration configuration) {
        if (Build.VERSION.SDK_INT >= 31) {
            Typeface typeface = this.z;
            if (typeface != null) {
                this.y = a5.n.f(configuration, typeface);
            }
            Typeface typeface2 = this.C;
            if (typeface2 != null) {
                this.B = a5.n.f(configuration, typeface2);
            }
            Typeface typeface3 = this.y;
            if (typeface3 == null) {
                typeface3 = this.z;
            }
            this.x = typeface3;
            Typeface typeface4 = this.B;
            if (typeface4 == null) {
                typeface4 = this.C;
            }
            this.A = typeface4;
            l(true);
        }
    }

    public final void l(boolean z) {
        float measureText;
        ViewGroup viewGroup = this.a;
        if ((viewGroup.getHeight() <= 0 || viewGroup.getWidth() <= 0) && !z) {
            return;
        }
        d(1.0f, z);
        CharSequence charSequence = this.I;
        TextPaint textPaint = this.U;
        if (charSequence != null && this.j0 != null) {
            this.n0 = C() ? TextUtils.ellipsize(this.I, textPaint, this.j0.getWidth(), this.G) : this.I;
        }
        CharSequence charSequence2 = this.n0;
        if (charSequence2 != null) {
            this.k0 = textPaint.measureText(charSequence2, 0, charSequence2.length());
        } else {
            this.k0 = 0.0f;
        }
        int absoluteGravity = Gravity.getAbsoluteGravity(this.l, this.J ? 1 : 0);
        Rect rect = this.i;
        Rect rect2 = this.h;
        if (rect == null) {
            rect = rect2;
        }
        int i = absoluteGravity & 112;
        if (i == 48) {
            this.s = rect.top;
        } else if (i != 80) {
            this.s = rect.centerY() - ((textPaint.descent() - textPaint.ascent()) / 2.0f);
        } else {
            this.s = textPaint.ascent() + rect.bottom;
        }
        int i2 = absoluteGravity & 8388615;
        if (i2 == 1) {
            this.u = rect.centerX() - (this.k0 / 2.0f);
        } else if (i2 != 5) {
            this.u = rect.left;
        } else {
            this.u = rect.right - this.k0;
        }
        if (this.k0 <= rect2.width()) {
            float f = this.u;
            float max = Math.max(0.0f, rect2.left - f) + f;
            this.u = max;
            this.u = Math.min(0.0f, rect2.right - (this.k0 + max)) + max;
        }
        float f2 = this.n;
        TextPaint textPaint2 = this.V;
        textPaint2.setTextSize(f2);
        textPaint2.setTypeface(this.x);
        textPaint2.setLetterSpacing(this.g0);
        if (textPaint2.descent() + (-textPaint2.ascent()) <= rect2.height()) {
            float f3 = this.s;
            float max2 = Math.max(0.0f, rect2.top - f3) + f3;
            this.s = max2;
            this.s = Math.min(0.0f, rect2.bottom - (g() + max2)) + max2;
        }
        d(0.0f, z);
        float height = this.j0 != null ? r15.getHeight() : 0.0f;
        StaticLayout staticLayout = this.j0;
        if (staticLayout == null || this.o0 <= 1) {
            CharSequence charSequence3 = this.I;
            measureText = charSequence3 != null ? textPaint.measureText(charSequence3, 0, charSequence3.length()) : 0.0f;
        } else {
            measureText = staticLayout.getWidth();
        }
        StaticLayout staticLayout2 = this.j0;
        this.q = staticLayout2 != null ? staticLayout2.getLineCount() : 0;
        int absoluteGravity2 = Gravity.getAbsoluteGravity(this.k, this.J ? 1 : 0);
        int i3 = absoluteGravity2 & 112;
        Rect rect3 = this.g;
        if (i3 == 48) {
            this.r = rect3.top;
        } else if (i3 != 80) {
            this.r = rect3.centerY() - (height / 2.0f);
        } else {
            this.r = (rect3.bottom - height) + (this.v0 ? textPaint.descent() : 0.0f);
        }
        int i4 = absoluteGravity2 & 8388615;
        if (i4 == 1) {
            this.t = rect3.centerX() - (measureText / 2.0f);
        } else if (i4 != 5) {
            this.t = rect3.left;
        } else {
            this.t = rect3.right - measureText;
        }
        d(this.b, false);
        viewGroup.postInvalidateOnAnimation();
        b();
    }

    public final void n(ColorStateList colorStateList) {
        if (this.p == colorStateList && this.o == colorStateList) {
            return;
        }
        this.p = colorStateList;
        this.o = colorStateList;
        l(false);
    }

    public final void o(int i, int i2, int i3, int i4) {
        Rect rect = this.h;
        if (m(rect, i, i2, i3, i4)) {
            return;
        }
        rect.set(i, i2, i3, i4);
        this.T = true;
    }

    public final void p(int i, int i2, int i3, int i4) {
        if (this.i == null) {
            this.i = new Rect(i, i2, i3, i4);
            this.T = true;
        }
        if (m(this.i, i, i2, i3, i4)) {
            return;
        }
        this.i.set(i, i2, i3, i4);
        this.T = true;
    }

    public final void q(int i) {
        ViewGroup viewGroup = this.a;
        r31.d dVar = new r31.d(viewGroup.getContext(), i);
        ColorStateList colorStateList = dVar.k;
        if (colorStateList != null) {
            this.p = colorStateList;
        }
        float f = dVar.l;
        if (f != 0.0f) {
            this.n = f;
        }
        ColorStateList colorStateList2 = dVar.a;
        if (colorStateList2 != null) {
            this.b0 = colorStateList2;
        }
        this.Z = dVar.f;
        this.a0 = dVar.g;
        this.Y = dVar.h;
        this.g0 = dVar.j;
        r31.a aVar = this.F;
        if (aVar != null) {
            aVar.c = true;
        }
        c cVar = new c(this, 0);
        dVar.a();
        this.F = new r31.a(cVar, dVar.p);
        dVar.b(viewGroup.getContext(), this.F);
        l(false);
    }

    public final void r(ColorStateList colorStateList) {
        if (this.p != colorStateList) {
            this.p = colorStateList;
            l(false);
        }
    }

    public final void s(int i) {
        if (this.l != i) {
            this.l = i;
            l(false);
        }
    }

    public final boolean t(Typeface typeface) {
        r31.a aVar = this.F;
        if (aVar != null) {
            aVar.c = true;
        }
        if (this.z == typeface) {
            return false;
        }
        this.z = typeface;
        Typeface f = a5.n.f(this.a.getContext().getResources().getConfiguration(), typeface);
        this.y = f;
        if (f == null) {
            f = this.z;
        }
        this.x = f;
        return true;
    }

    public final void u(boolean z, int i, int i2, int i3, int i4) {
        Rect rect = this.g;
        if (m(rect, i, i2, i3, i4) && z == this.v0) {
            return;
        }
        rect.set(i, i2, i3, i4);
        this.T = true;
        this.v0 = z;
    }

    public final void v(int i) {
        if (i != this.o0) {
            this.o0 = i;
            l(false);
        }
    }

    public final void w(int i) {
        ViewGroup viewGroup = this.a;
        r31.d dVar = new r31.d(viewGroup.getContext(), i);
        ColorStateList colorStateList = dVar.k;
        if (colorStateList != null) {
            this.o = colorStateList;
        }
        float f = dVar.l;
        if (f != 0.0f) {
            this.m = f;
        }
        ColorStateList colorStateList2 = dVar.a;
        if (colorStateList2 != null) {
            this.f0 = colorStateList2;
        }
        this.d0 = dVar.f;
        this.e0 = dVar.g;
        this.c0 = dVar.h;
        this.h0 = dVar.j;
        r31.a aVar = this.E;
        if (aVar != null) {
            aVar.c = true;
        }
        c cVar = new c(this, 1);
        dVar.a();
        this.E = new r31.a(cVar, dVar.p);
        dVar.b(viewGroup.getContext(), this.E);
        l(false);
    }

    public final void x(int i) {
        if (this.k != i) {
            this.k = i;
            l(false);
        }
    }

    public final void y(float f) {
        if (this.m != f) {
            this.m = f;
            l(false);
        }
    }

    public final boolean z(Typeface typeface) {
        r31.a aVar = this.E;
        if (aVar != null) {
            aVar.c = true;
        }
        if (this.C == typeface) {
            return false;
        }
        this.C = typeface;
        Typeface f = a5.n.f(this.a.getContext().getResources().getConfiguration(), typeface);
        this.B = f;
        if (f == null) {
            f = this.C;
        }
        this.A = f;
        return true;
    }
}
