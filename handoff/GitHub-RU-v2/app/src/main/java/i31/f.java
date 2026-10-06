package i31;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import com.google.android.material.chip.Chip;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import o31.l;
import o31.m;
import o31.o;
import u31.n;
import u31.p;

/* loaded from: /home/user/work/p/classes4.dex */
public final class f extends u31.j implements Drawable.Callback, l {
    public static final int[] g1 = {R.attr.state_enabled};
    public static final ShapeDrawable h1 = new ShapeDrawable(new OvalShape());
    public float A0;
    public float B0;
    public float C0;
    public float D0;
    public float E0;
    public Context F0;
    public Paint G0;
    public Paint.FontMetrics H0;
    public RectF I0;
    public PointF J0;
    public Path K0;
    public m L0;
    public int M0;
    public int N0;
    public int O0;
    public int P0;
    public int Q0;
    public int R0;
    public boolean S0;
    public int T0;
    public int U0;
    public ColorFilter V0;
    public PorterDuffColorFilter W0;
    public ColorStateList X0;
    public ColorStateList Y;
    public PorterDuff.Mode Y0;
    public ColorStateList Z;
    public int[] Z0;
    public float a0;
    public ColorStateList a1;
    public float b0;
    public WeakReference b1;
    public ColorStateList c0;
    public TextUtils.TruncateAt c1;
    public float d0;
    public boolean d1;
    public ColorStateList e0;
    public int e1;
    public CharSequence f0;
    public boolean f1;
    public boolean g0;
    public Drawable h0;
    public ColorStateList i0;
    public float j0;
    public boolean k0;
    public boolean l0;
    public Drawable m0;
    public RippleDrawable n0;
    public ColorStateList o0;
    public float p0;
    public SpannableStringBuilder q0;
    public boolean r0;
    public boolean s0;
    public Drawable t0;
    public ColorStateList u0;
    public y21.b v0;
    public y21.b w0;
    public float x0;
    public float y0;
    public float z0;

    public f(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 2130968806, 2132018470);
        this.b0 = -1.0f;
        this.G0 = new Paint(1);
        this.H0 = new Paint.FontMetrics();
        this.I0 = new RectF();
        this.J0 = new PointF();
        this.K0 = new Path();
        this.U0 = 255;
        this.Y0 = PorterDuff.Mode.SRC_IN;
        this.b1 = new WeakReference(null);
        m(context);
        this.F0 = context;
        m mVar = new m(this);
        this.L0 = mVar;
        this.f0 = "";
        mVar.a.density = context.getResources().getDisplayMetrics().density;
        int[] iArr = g1;
        setState(iArr);
        W(iArr);
        this.d1 = true;
        h1.setTint(-1);
    }

    public static boolean D(ColorStateList colorStateList) {
        return colorStateList != null && colorStateList.isStateful();
    }

    public static boolean E(Drawable drawable) {
        return drawable != null && drawable.isStateful();
    }

    public static void f0(Drawable drawable) {
        if (drawable != null) {
            drawable.setCallback(null);
        }
    }

    public final float A() {
        if (!d0() && !c0()) {
            return 0.0f;
        }
        float f = this.y0;
        Drawable drawable = this.S0 ? this.t0 : this.h0;
        float f2 = this.j0;
        if (f2 <= 0.0f && drawable != null) {
            f2 = drawable.getIntrinsicWidth();
        }
        return f2 + f + this.z0;
    }

    public final float B() {
        if (e0()) {
            return this.C0 + this.p0 + this.D0;
        }
        return 0.0f;
    }

    public final float C() {
        return this.f1 ? k() : this.b0;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [android.view.View, com.google.android.material.chip.Chip] */
    public final void F() {
        e eVar = (e) this.b1.get();
        if (eVar != null) {
            com.google.android.material.chip.Chip r0 = (com.google.android.material.chip.Chip) ((Chip) eVar);
            r0.b(r0.H);
            r0.requestLayout();
            r0.invalidateOutline();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x014b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean G(int[] iArr, int[] iArr2) {
        int i;
        int colorForState;
        int[] state;
        boolean z;
        boolean z2;
        int colorForState2;
        ColorStateList colorStateList;
        boolean onStateChange = super.onStateChange(iArr);
        ColorStateList colorStateList2 = this.Y;
        int d = d(colorStateList2 != null ? colorStateList2.getColorForState(iArr, this.M0) : 0);
        boolean z3 = true;
        if (this.M0 != d) {
            this.M0 = d;
            onStateChange = true;
        }
        ColorStateList colorStateList3 = this.Z;
        int d2 = d(colorStateList3 != null ? colorStateList3.getColorForState(iArr, this.N0) : 0);
        if (this.N0 != d2) {
            this.N0 = d2;
            onStateChange = true;
        }
        int d3 = r4.a.d(d2, d);
        if ((this.O0 != d3) | (this.s.d == null)) {
            this.O0 = d3;
            q(ColorStateList.valueOf(d3));
            onStateChange = true;
        }
        ColorStateList colorStateList4 = this.c0;
        int colorForState3 = colorStateList4 != null ? colorStateList4.getColorForState(iArr, this.P0) : 0;
        if (this.P0 != colorForState3) {
            this.P0 = colorForState3;
            onStateChange = true;
        }
        if (this.a1 != null) {
            boolean z4 = false;
            boolean z5 = false;
            for (int i2 : iArr) {
                if (i2 == 16842910) {
                    z4 = true;
                } else if (i2 == 16842908 || i2 == 16842919 || i2 == 16843623) {
                    z5 = true;
                }
            }
            if (z4 && z5) {
                i = this.a1.getColorForState(iArr, this.Q0);
                if (this.Q0 != i) {
                    this.Q0 = i;
                }
                r31.d dVar = this.L0.g;
                colorForState = (dVar != null || (colorStateList = dVar.k) == null) ? 0 : colorStateList.getColorForState(iArr, this.R0);
                if (this.R0 != colorForState) {
                    this.R0 = colorForState;
                    onStateChange = true;
                }
                state = getState();
                if (state != null) {
                    int length = state.length;
                    int i3 = 0;
                    while (true) {
                        if (i3 >= length) {
                            break;
                        }
                        if (state[i3] != 16842912) {
                            i3++;
                        } else if (this.r0) {
                            z = true;
                        }
                    }
                }
                z = false;
                if (this.S0 != z || this.t0 == null) {
                    z2 = false;
                } else {
                    float A = A();
                    this.S0 = z;
                    if (A != A()) {
                        onStateChange = true;
                        z2 = true;
                    } else {
                        z2 = false;
                        onStateChange = true;
                    }
                }
                ColorStateList colorStateList5 = this.X0;
                colorForState2 = colorStateList5 == null ? colorStateList5.getColorForState(iArr, this.T0) : 0;
                if (this.T0 == colorForState2) {
                    this.T0 = colorForState2;
                    ColorStateList colorStateList6 = this.X0;
                    PorterDuff.Mode mode = this.Y0;
                    this.W0 = (colorStateList6 == null || mode == null) ? null : new PorterDuffColorFilter(colorStateList6.getColorForState(getState(), 0), mode);
                } else {
                    z3 = onStateChange;
                }
                if (E(this.h0)) {
                    z3 |= this.h0.setState(iArr);
                }
                if (E(this.t0)) {
                    z3 |= this.t0.setState(iArr);
                }
                if (E(this.m0)) {
                    int[] iArr3 = new int[iArr.length + iArr2.length];
                    System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
                    System.arraycopy(iArr2, 0, iArr3, iArr.length, iArr2.length);
                    z3 |= this.m0.setState(iArr3);
                }
                if (E(this.n0)) {
                    z3 |= this.n0.setState(iArr2);
                }
                if (z3) {
                    invalidateSelf();
                }
                if (z2) {
                    F();
                }
                return z3;
            }
        }
        i = 0;
        if (this.Q0 != i) {
        }
        r31.d dVar2 = this.L0.g;
        if (dVar2 != null) {
        }
        if (this.R0 != colorForState) {
        }
        state = getState();
        if (state != null) {
        }
        z = false;
        if (this.S0 != z) {
        }
        z2 = false;
        ColorStateList colorStateList52 = this.X0;
        if (colorStateList52 == null) {
        }
        if (this.T0 == colorForState2) {
        }
        if (E(this.h0)) {
        }
        if (E(this.t0)) {
        }
        if (E(this.m0)) {
        }
        if (E(this.n0)) {
        }
        if (z3) {
        }
        if (z2) {
        }
        return z3;
    }

    public final void H(boolean z) {
        if (this.r0 != z) {
            this.r0 = z;
            float A = A();
            if (!z && this.S0) {
                this.S0 = false;
            }
            float A2 = A();
            invalidateSelf();
            if (A != A2) {
                F();
            }
        }
    }

    public final void I(Drawable drawable) {
        if (this.t0 != drawable) {
            float A = A();
            this.t0 = drawable;
            float A2 = A();
            f0(this.t0);
            y(this.t0);
            invalidateSelf();
            if (A != A2) {
                F();
            }
        }
    }

    public final void J(ColorStateList colorStateList) {
        Drawable drawable;
        if (this.u0 != colorStateList) {
            this.u0 = colorStateList;
            if (this.s0 && (drawable = this.t0) != null && this.r0) {
                drawable.setTintList(colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void K(boolean z) {
        if (this.s0 != z) {
            boolean c0 = c0();
            this.s0 = z;
            boolean c02 = c0();
            if (c0 != c02) {
                if (c02) {
                    y(this.t0);
                } else {
                    f0(this.t0);
                }
                invalidateSelf();
                F();
            }
        }
    }

    public final void L(float f) {
        if (this.b0 != f) {
            this.b0 = f;
            u31.m g = this.s.a.g();
            g.e = new u31.a(f);
            g.f = new u31.a(f);
            g.g = new u31.a(f);
            g.h = new u31.a(f);
            setShapeAppearanceModel(g.a());
        }
    }

    public final void M(Drawable drawable) {
        Drawable drawable2 = this.h0;
        if (drawable2 == null) {
            drawable2 = null;
        } else if (drawable2 instanceof s4.a) {
            drawable2 = null;
        }
        if (drawable2 != drawable) {
            float A = A();
            this.h0 = drawable != null ? drawable.mutate() : null;
            float A2 = A();
            f0(drawable2);
            if (d0()) {
                y(this.h0);
            }
            invalidateSelf();
            if (A != A2) {
                F();
            }
        }
    }

    public final void N(float f) {
        if (this.j0 != f) {
            float A = A();
            this.j0 = f;
            float A2 = A();
            invalidateSelf();
            if (A != A2) {
                F();
            }
        }
    }

    public final void O(ColorStateList colorStateList) {
        this.k0 = true;
        if (this.i0 != colorStateList) {
            this.i0 = colorStateList;
            if (d0()) {
                this.h0.setTintList(colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void P(boolean z) {
        if (this.g0 != z) {
            boolean d0 = d0();
            this.g0 = z;
            boolean d02 = d0();
            if (d0 != d02) {
                if (d02) {
                    y(this.h0);
                } else {
                    f0(this.h0);
                }
                invalidateSelf();
                F();
            }
        }
    }

    public final void Q(ColorStateList colorStateList) {
        if (this.c0 != colorStateList) {
            this.c0 = colorStateList;
            if (this.f1) {
                u31.h hVar = this.s;
                if (hVar.e != colorStateList) {
                    hVar.e = colorStateList;
                    onStateChange(getState());
                }
            }
            onStateChange(getState());
        }
    }

    public final void R(float f) {
        if (this.d0 != f) {
            this.d0 = f;
            this.G0.setStrokeWidth(f);
            if (this.f1) {
                this.s.k = f;
                invalidateSelf();
            }
            invalidateSelf();
        }
    }

    public final void S(Drawable drawable) {
        Drawable drawable2 = this.m0;
        if (drawable2 == null) {
            drawable2 = null;
        } else if (drawable2 instanceof s4.a) {
            drawable2 = null;
        }
        if (drawable2 != drawable) {
            float B = B();
            this.m0 = drawable != null ? drawable.mutate() : null;
            this.n0 = new RippleDrawable(s31.a.b(this.e0), this.m0, h1);
            float B2 = B();
            f0(drawable2);
            if (e0()) {
                y(this.m0);
            }
            invalidateSelf();
            if (B != B2) {
                F();
            }
        }
    }

    public final void T(float f) {
        if (this.D0 != f) {
            this.D0 = f;
            invalidateSelf();
            if (e0()) {
                F();
            }
        }
    }

    public final void U(float f) {
        if (this.p0 != f) {
            this.p0 = f;
            invalidateSelf();
            if (e0()) {
                F();
            }
        }
    }

    public final void V(float f) {
        if (this.C0 != f) {
            this.C0 = f;
            invalidateSelf();
            if (e0()) {
                F();
            }
        }
    }

    public final boolean W(int[] iArr) {
        if (Arrays.equals(this.Z0, iArr)) {
            return false;
        }
        this.Z0 = iArr;
        if (e0()) {
            return G(getState(), iArr);
        }
        return false;
    }

    public final void X(ColorStateList colorStateList) {
        if (this.o0 != colorStateList) {
            this.o0 = colorStateList;
            if (e0()) {
                this.m0.setTintList(colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void Y(boolean z) {
        if (this.l0 != z) {
            boolean e0 = e0();
            this.l0 = z;
            boolean e02 = e0();
            if (e0 != e02) {
                if (e02) {
                    y(this.m0);
                } else {
                    f0(this.m0);
                }
                invalidateSelf();
                F();
            }
        }
    }

    public final void Z(float f) {
        if (this.z0 != f) {
            float A = A();
            this.z0 = f;
            float A2 = A();
            invalidateSelf();
            if (A != A2) {
                F();
            }
        }
    }

    @Override // o31.l
    public final void a() {
        F();
        invalidateSelf();
    }

    public final void a0(float f) {
        if (this.y0 != f) {
            float A = A();
            this.y0 = f;
            float A2 = A();
            invalidateSelf();
            if (A != A2) {
                F();
            }
        }
    }

    public final void b0(ColorStateList colorStateList) {
        if (this.e0 != colorStateList) {
            this.e0 = colorStateList;
            this.a1 = null;
            onStateChange(getState());
        }
    }

    public final boolean c0() {
        return this.s0 && this.t0 != null && this.S0;
    }

    public final boolean d0() {
        return this.g0 && this.h0 != null;
    }

    @Override // u31.j, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        int i;
        Canvas canvas2;
        int i2;
        float f;
        float f2;
        int i3;
        Rect bounds = getBounds();
        if (bounds.isEmpty() || (i = this.U0) == 0) {
            return;
        }
        if (i < 255) {
            canvas2 = canvas;
            i2 = canvas2.saveLayerAlpha(bounds.left, bounds.top, bounds.right, bounds.bottom, i);
        } else {
            canvas2 = canvas;
            i2 = 0;
        }
        boolean z = this.f1;
        Paint paint = this.G0;
        RectF rectF = this.I0;
        if (!z) {
            paint.setColor(this.M0);
            paint.setStyle(Paint.Style.FILL);
            rectF.set(bounds);
            canvas2.drawRoundRect(rectF, C(), C(), paint);
        }
        if (!this.f1) {
            paint.setColor(this.N0);
            paint.setStyle(Paint.Style.FILL);
            ColorFilter colorFilter = this.V0;
            if (colorFilter == null) {
                colorFilter = this.W0;
            }
            paint.setColorFilter(colorFilter);
            rectF.set(bounds);
            canvas2.drawRoundRect(rectF, C(), C(), paint);
        }
        if (this.f1) {
            super.draw(canvas);
        }
        if (this.d0 > 0.0f && !this.f1) {
            paint.setColor(this.P0);
            paint.setStyle(Paint.Style.STROKE);
            if (!this.f1) {
                ColorFilter colorFilter2 = this.V0;
                if (colorFilter2 == null) {
                    colorFilter2 = this.W0;
                }
                paint.setColorFilter(colorFilter2);
            }
            float f3 = bounds.left;
            float f4 = this.d0 / 2.0f;
            rectF.set(f3 + f4, bounds.top + f4, bounds.right - f4, bounds.bottom - f4);
            float f5 = this.b0 - (this.d0 / 2.0f);
            canvas2.drawRoundRect(rectF, f5, f5, paint);
        }
        paint.setColor(this.Q0);
        paint.setStyle(Paint.Style.FILL);
        rectF.set(bounds);
        if (this.f1) {
            RectF rectF2 = new RectF(bounds);
            u31.h hVar = this.s;
            n nVar = hVar.a;
            float[] fArr = this.T;
            float f6 = hVar.j;
            u31.g gVar = this.I;
            p pVar = this.J;
            f = 2.0f;
            Path path = this.K0;
            pVar.a(nVar, fArr, f6, rectF2, gVar, path);
            f(canvas2, paint, path, this.s.a, this.T, h());
        } else {
            canvas2.drawRoundRect(rectF, C(), C(), paint);
            f = 2.0f;
        }
        if (d0()) {
            z(bounds, rectF);
            float f7 = rectF.left;
            float f8 = rectF.top;
            canvas2.translate(f7, f8);
            this.h0.setBounds(0, 0, (int) rectF.width(), (int) rectF.height());
            this.h0.draw(canvas2);
            canvas2.translate(-f7, -f8);
        }
        if (c0()) {
            z(bounds, rectF);
            float f9 = rectF.left;
            float f10 = rectF.top;
            canvas2.translate(f9, f10);
            this.t0.setBounds(0, 0, (int) rectF.width(), (int) rectF.height());
            this.t0.draw(canvas2);
            canvas2.translate(-f9, -f10);
        }
        if (this.d1 && this.f0 != null) {
            PointF pointF = this.J0;
            pointF.set(0.0f, 0.0f);
            Paint.Align align = Paint.Align.LEFT;
            CharSequence charSequence = this.f0;
            m mVar = this.L0;
            if (charSequence != null) {
                float A = A() + this.x0 + this.A0;
                if (getLayoutDirection() == 0) {
                    pointF.x = bounds.left + A;
                } else {
                    pointF.x = bounds.right - A;
                    align = Paint.Align.RIGHT;
                }
                float centerY = bounds.centerY();
                TextPaint textPaint = mVar.a;
                Paint.FontMetrics fontMetrics = this.H0;
                textPaint.getFontMetrics(fontMetrics);
                pointF.y = centerY - ((fontMetrics.descent + fontMetrics.ascent) / f);
            }
            rectF.setEmpty();
            if (this.f0 != null) {
                float A2 = A() + this.x0 + this.A0;
                float B = B() + this.E0 + this.B0;
                if (getLayoutDirection() == 0) {
                    rectF.left = bounds.left + A2;
                    rectF.right = bounds.right - B;
                } else {
                    rectF.left = bounds.left + B;
                    rectF.right = bounds.right - A2;
                }
                rectF.top = bounds.top;
                rectF.bottom = bounds.bottom;
            }
            r31.d dVar = mVar.g;
            TextPaint textPaint2 = mVar.a;
            if (dVar != null) {
                textPaint2.drawableState = getState();
                mVar.g.d(this.F0, textPaint2, mVar.b);
            }
            textPaint2.setTextAlign(align);
            String charSequence2 = this.f0.toString();
            if (mVar.e) {
                mVar.a(charSequence2);
                f2 = mVar.c;
            } else {
                f2 = mVar.c;
            }
            boolean z2 = Math.round(f2) > Math.round(rectF.width());
            if (z2) {
                int save = canvas2.save();
                canvas2.clipRect(rectF);
                i3 = save;
            } else {
                i3 = 0;
            }
            CharSequence charSequence3 = this.f0;
            if (z2 && this.c1 != null) {
                charSequence3 = TextUtils.ellipsize(charSequence3, textPaint2, rectF.width(), this.c1);
            }
            canvas.drawText(charSequence3, 0, charSequence3.length(), pointF.x, pointF.y, textPaint2);
            canvas2 = canvas;
            if (z2) {
                canvas2.restoreToCount(i3);
            }
        }
        if (e0()) {
            rectF.setEmpty();
            if (e0()) {
                float f12 = this.E0 + this.D0;
                if (getLayoutDirection() == 0) {
                    float f13 = bounds.right - f12;
                    rectF.right = f13;
                    rectF.left = f13 - this.p0;
                } else {
                    float f14 = bounds.left + f12;
                    rectF.left = f14;
                    rectF.right = f14 + this.p0;
                }
                float exactCenterY = bounds.exactCenterY();
                float f15 = this.p0;
                float f16 = exactCenterY - (f15 / f);
                rectF.top = f16;
                rectF.bottom = f16 + f15;
            }
            float f17 = rectF.left;
            float f18 = rectF.top;
            canvas2.translate(f17, f18);
            this.m0.setBounds(0, 0, (int) rectF.width(), (int) rectF.height());
            this.n0.setBounds(this.m0.getBounds());
            this.n0.jumpToCurrentState();
            this.n0.draw(canvas2);
            canvas2.translate(-f17, -f18);
        }
        if (this.U0 < 255) {
            canvas2.restoreToCount(i2);
        }
    }

    public final boolean e0() {
        return this.l0 && this.m0 != null;
    }

    @Override // u31.j, android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.U0;
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        return this.V0;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return (int) this.a0;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        float f;
        float A = A() + this.x0 + this.A0;
        String charSequence = this.f0.toString();
        m mVar = this.L0;
        if (mVar.e) {
            mVar.a(charSequence);
            f = mVar.c;
        } else {
            f = mVar.c;
        }
        return Math.min(Math.round(B() + f + A + this.B0 + this.E0), this.e1);
    }

    @Override // u31.j, android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // u31.j, android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        Outline outline2;
        if (this.f1) {
            super.getOutline(outline);
            return;
        }
        Rect bounds = getBounds();
        if (bounds.isEmpty()) {
            outline2 = outline;
            outline2.setRoundRect(0, 0, getIntrinsicWidth(), (int) this.a0, this.b0);
        } else {
            outline.setRoundRect(bounds, this.b0);
            outline2 = outline;
        }
        outline2.setAlpha(this.U0 / 255.0f);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // u31.j, android.graphics.drawable.Drawable
    public final boolean isStateful() {
        ColorStateList colorStateList;
        if (D(this.Y) || D(this.Z) || D(this.c0)) {
            return true;
        }
        r31.d dVar = this.L0.g;
        if (dVar == null || (colorStateList = dVar.k) == null || !colorStateList.isStateful()) {
            return (this.s0 && this.t0 != null && this.r0) || E(this.h0) || E(this.t0) || D(this.X0);
        }
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLayoutDirectionChanged(int i) {
        boolean onLayoutDirectionChanged = super.onLayoutDirectionChanged(i);
        if (d0()) {
            onLayoutDirectionChanged |= this.h0.setLayoutDirection(i);
        }
        if (c0()) {
            onLayoutDirectionChanged |= this.t0.setLayoutDirection(i);
        }
        if (e0()) {
            onLayoutDirectionChanged |= this.m0.setLayoutDirection(i);
        }
        if (!onLayoutDirectionChanged) {
            return true;
        }
        invalidateSelf();
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i) {
        boolean onLevelChange = super.onLevelChange(i);
        if (d0()) {
            onLevelChange |= this.h0.setLevel(i);
        }
        if (c0()) {
            onLevelChange |= this.t0.setLevel(i);
        }
        if (e0()) {
            onLevelChange |= this.m0.setLevel(i);
        }
        if (onLevelChange) {
            invalidateSelf();
        }
        return onLevelChange;
    }

    @Override // u31.j, android.graphics.drawable.Drawable, o31.l
    public final boolean onStateChange(int[] iArr) {
        if (this.f1) {
            super.onStateChange(iArr);
        }
        return G(iArr, this.Z0);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j);
        }
    }

    @Override // u31.j, android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        if (this.U0 != i) {
            this.U0 = i;
            invalidateSelf();
        }
    }

    @Override // u31.j, android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        if (this.V0 != colorFilter) {
            this.V0 = colorFilter;
            invalidateSelf();
        }
    }

    @Override // u31.j, android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        if (this.X0 != colorStateList) {
            this.X0 = colorStateList;
            onStateChange(getState());
        }
    }

    @Override // u31.j, android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        if (this.Y0 != mode) {
            this.Y0 = mode;
            ColorStateList colorStateList = this.X0;
            this.W0 = (colorStateList == null || mode == null) ? null : new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        if (d0()) {
            visible |= this.h0.setVisible(z, z2);
        }
        if (c0()) {
            visible |= this.t0.setVisible(z, z2);
        }
        if (e0()) {
            visible |= this.m0.setVisible(z, z2);
        }
        if (visible) {
            invalidateSelf();
        }
        return visible;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.unscheduleDrawable(this, runnable);
        }
    }

    public final void y(Drawable drawable) {
        if (drawable == null) {
            return;
        }
        drawable.setCallback(this);
        drawable.setLayoutDirection(getLayoutDirection());
        drawable.setLevel(getLevel());
        drawable.setVisible(isVisible(), false);
        if (drawable == this.m0) {
            if (drawable.isStateful()) {
                drawable.setState(this.Z0);
            }
            drawable.setTintList(this.o0);
            return;
        }
        Drawable drawable2 = this.h0;
        if (drawable == drawable2 && this.k0) {
            drawable2.setTintList(this.i0);
        }
        if (drawable.isStateful()) {
            drawable.setState(getState());
        }
    }

    public final void z(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (d0() || c0()) {
            float f = this.x0 + this.y0;
            Drawable drawable = this.S0 ? this.t0 : this.h0;
            float f2 = this.j0;
            if (f2 <= 0.0f && drawable != null) {
                f2 = drawable.getIntrinsicWidth();
            }
            if (getLayoutDirection() == 0) {
                float f3 = rect.left + f;
                rectF.left = f3;
                rectF.right = f3 + f2;
            } else {
                float f4 = rect.right - f;
                rectF.right = f4;
                rectF.left = f4 - f2;
            }
            Drawable drawable2 = this.S0 ? this.t0 : this.h0;
            float f5 = this.j0;
            if (f5 <= 0.0f && drawable2 != null) {
                f5 = (float) Math.ceil(o.d(this.F0, 24));
                if (drawable2.getIntrinsicHeight() <= f5) {
                    f5 = drawable2.getIntrinsicHeight();
                }
            }
            float exactCenterY = rect.exactCenterY() - (f5 / 2.0f);
            rectF.top = exactCenterY;
            rectF.bottom = exactCenterY + f5;
        }
    }
    public Object a = null;
}
