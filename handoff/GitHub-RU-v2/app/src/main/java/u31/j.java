package u31;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.StateSet;
import java.util.BitSet;
import java.util.Objects;

/* loaded from: /home/user/work/p/classes4.dex */
public class j extends Drawable implements y {
    public static final Paint W;
    public static final i[] X;
    public Path A;
    public RectF B;
    public RectF C;
    public Region D;
    public Region E;
    public Paint F;
    public Paint G;
    public t31.a H;
    public g I;
    public p J;
    public PorterDuffColorFilter K;
    public PorterDuffColorFilter L;
    public int M;
    public RectF N;
    public boolean O;
    public boolean P;
    public n Q;
    public t5.f R;
    public t5.e[] S;
    public float[] T;
    public float[] U;
    public c5.b V;
    public g r;
    public h s;
    public w[] t;
    public w[] u;
    public BitSet v;
    public boolean w;
    public boolean x;
    public Matrix y;
    public Path z;

    static {
        Paint paint = new Paint(1);
        W = paint;
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        X = new i[4];
        int i = 0;
        while (true) {
            i[] iVarArr = X;
            if (i >= iVarArr.length) {
                return;
            }
            iVarArr[i] = new i(i);
            i++;
        }
    }

    public j() {
        this(new n());
    }

    public static float c(RectF rectF, n nVar, float[] fArr) {
        if (fArr == null) {
            if (nVar.f(rectF)) {
                return nVar.e.a(rectF);
            }
            return -1.0f;
        }
        if (fArr.length > 1) {
            float f = fArr[0];
            for (int i = 1; i < fArr.length; i++) {
                if (fArr[i] != f) {
                    return -1.0f;
                }
            }
        }
        if (nVar.e()) {
            return fArr[0];
        }
        return -1.0f;
    }

    public final void b(RectF rectF, Path path) {
        h hVar = this.s;
        this.J.a(hVar.a, this.T, hVar.j, rectF, this.I, path);
        if (this.s.i != 1.0f) {
            Matrix matrix = this.y;
            matrix.reset();
            float f = this.s.i;
            matrix.setScale(f, f, rectF.width() / 2.0f, rectF.height() / 2.0f);
            path.transform(matrix);
        }
        path.computeBounds(this.N, true);
    }

    public final int d(int i) {
        h hVar = this.s;
        float f = hVar.n + 0.0f + hVar.m;
        m31.a aVar = hVar.c;
        return aVar != null ? aVar.a(i, f) : i;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Paint paint;
        PorterDuffColorFilter porterDuffColorFilter = this.K;
        Paint paint2 = this.F;
        paint2.setColorFilter(porterDuffColorFilter);
        int alpha = paint2.getAlpha();
        int i = this.s.l;
        paint2.setAlpha(((i + (i >>> 7)) * alpha) >>> 8);
        PorterDuffColorFilter porterDuffColorFilter2 = this.L;
        Paint paint3 = this.G;
        paint3.setColorFilter(porterDuffColorFilter2);
        paint3.setStrokeWidth(this.s.k);
        int alpha2 = paint3.getAlpha();
        int i2 = this.s.l;
        paint3.setAlpha(((i2 + (i2 >>> 7)) * alpha2) >>> 8);
        Paint.Style style = this.s.q;
        if (style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.FILL) {
            boolean z = this.w;
            paint = paint2;
            Path path = this.z;
            if (z) {
                b(h(), path);
                this.w = false;
            }
            h hVar = this.s;
            hVar.getClass();
            if (hVar.o > 0 && !n() && !path.isConvex() && Build.VERSION.SDK_INT < 29) {
                canvas.save();
                double d = 0;
                canvas.translate((int) (Math.sin(Math.toRadians(d)) * this.s.p), (int) (Math.cos(Math.toRadians(d)) * this.s.p));
                if (this.O) {
                    RectF rectF = this.N;
                    int width = (int) (rectF.width() - getBounds().width());
                    int height = (int) (rectF.height() - getBounds().height());
                    if (width < 0 || height < 0) {
                        throw new IllegalStateException("Invalid shadow bounds. Check that the treatments result in a valid path.");
                    }
                    Bitmap createBitmap = Bitmap.createBitmap((this.s.o * 2) + ((int) rectF.width()) + width, (this.s.o * 2) + ((int) rectF.height()) + height, Bitmap.Config.ARGB_8888);
                    Canvas canvas2 = new Canvas(createBitmap);
                    float f = (getBounds().left - this.s.o) - width;
                    float f2 = (getBounds().top - this.s.o) - height;
                    canvas2.translate(-f, -f2);
                    e(canvas2);
                    canvas.drawBitmap(createBitmap, f, f2, (Paint) null);
                    createBitmap.recycle();
                    canvas.restore();
                } else {
                    e(canvas);
                    canvas.restore();
                }
            }
            f(canvas, paint, path, this.s.a, this.T, h());
        } else {
            paint = paint2;
        }
        if (l()) {
            if (this.x) {
                n nVar = this.s.a;
                m g = nVar.g();
                d dVar = nVar.e;
                g gVar = this.r;
                g.e = gVar.a(dVar);
                g.f = gVar.a(nVar.f);
                g.h = gVar.a(nVar.h);
                g.g = gVar.a(nVar.g);
                this.Q = g.a();
                float[] fArr = this.T;
                if (fArr != null) {
                    if (this.U == null) {
                        this.U = new float[fArr.length];
                    }
                    float j = j();
                    int i3 = 0;
                    while (true) {
                        float[] fArr2 = this.T;
                        if (i3 >= fArr2.length) {
                            break;
                        }
                        this.U[i3] = Math.max(0.0f, fArr2[i3] - j);
                        i3++;
                    }
                } else {
                    this.U = null;
                }
                n nVar2 = this.Q;
                float[] fArr3 = this.U;
                float f3 = this.s.j;
                RectF h = h();
                RectF rectF2 = this.C;
                rectF2.set(h);
                float j2 = j();
                rectF2.inset(j2, j2);
                this.J.a(nVar2, fArr3, f3, rectF2, null, this.A);
                this.x = false;
            }
            g(canvas);
        }
        paint.setAlpha(alpha);
        paint3.setAlpha(alpha2);
    }

    public final void e(Canvas canvas) {
        this.v.cardinality();
        int i = this.s.p;
        Path path = this.z;
        t31.a aVar = this.H;
        if (i != 0) {
            canvas.drawPath(path, aVar.a);
        }
        for (int i2 = 0; i2 < 4; i2++) {
            w wVar = this.t[i2];
            int i3 = this.s.o;
            Matrix matrix = w.b;
            wVar.a(matrix, aVar, i3, canvas);
            this.u[i2].a(matrix, aVar, this.s.o, canvas);
        }
        if (this.O) {
            double d = 0;
            int sin = (int) (Math.sin(Math.toRadians(d)) * this.s.p);
            int cos = (int) (Math.cos(Math.toRadians(d)) * this.s.p);
            canvas.translate(-sin, -cos);
            canvas.drawPath(path, W);
            canvas.translate(sin, cos);
        }
    }

    public final void f(Canvas canvas, Paint paint, Path path, n nVar, float[] fArr, RectF rectF) {
        float c = c(rectF, nVar, fArr);
        if (c < 0.0f) {
            canvas.drawPath(path, paint);
        } else {
            float f = c * this.s.j;
            canvas.drawRoundRect(rectF, f, f, paint);
        }
    }

    public void g(Canvas canvas) {
        n nVar = this.Q;
        float[] fArr = this.U;
        RectF h = h();
        RectF rectF = this.C;
        rectF.set(h);
        float j = j();
        rectF.inset(j, j);
        f(canvas, this.G, this.A, nVar, fArr, rectF);
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.s.l;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        return this.s;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        this.s.getClass();
        RectF h = h();
        if (h.isEmpty()) {
            return;
        }
        float c = c(h, this.s.a, this.T);
        if (c >= 0.0f) {
            outline.setRoundRect(getBounds(), c * this.s.j);
            return;
        }
        boolean z = this.w;
        Path path = this.z;
        if (z) {
            b(h, path);
            this.w = false;
        }
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            l31.b.a(outline, path);
            return;
        }
        if (i >= 29) {
            try {
                l31.a.a(outline, path);
            } catch (IllegalArgumentException unused) {
            }
        } else if (path.isConvex()) {
            l31.a.a(outline, path);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        Rect rect2 = this.s.h;
        if (rect2 == null) {
            return super.getPadding(rect);
        }
        rect.set(rect2);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final Region getTransparentRegion() {
        Rect bounds = getBounds();
        Region region = this.D;
        region.set(bounds);
        RectF h = h();
        Path path = this.z;
        b(h, path);
        Region region2 = this.E;
        region2.setPath(path, region);
        region.op(region2, Region.Op.DIFFERENCE);
        return region;
    }

    public final RectF h() {
        Rect bounds = getBounds();
        RectF rectF = this.B;
        rectF.set(bounds);
        return rectF;
    }

    public final float i() {
        float[] fArr = this.T;
        if (fArr != null) {
            return (((fArr[3] + fArr[2]) - fArr[1]) - fArr[0]) / 2.0f;
        }
        RectF h = h();
        n nVar = this.s.a;
        p pVar = this.J;
        pVar.getClass();
        float a = nVar.e.a(h);
        n nVar2 = this.s.a;
        pVar.getClass();
        float a2 = nVar2.h.a(h) + a;
        n nVar3 = this.s.a;
        pVar.getClass();
        float a3 = a2 - nVar3.g.a(h);
        n nVar4 = this.s.a;
        pVar.getClass();
        return (a3 - nVar4.f.a(h)) / 2.0f;
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        this.w = true;
        this.x = true;
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        if (super.isStateful()) {
            return true;
        }
        ColorStateList colorStateList = this.s.f;
        if (colorStateList != null && colorStateList.isStateful()) {
            return true;
        }
        this.s.getClass();
        ColorStateList colorStateList2 = this.s.e;
        if (colorStateList2 != null && colorStateList2.isStateful()) {
            return true;
        }
        ColorStateList colorStateList3 = this.s.d;
        if (colorStateList3 != null && colorStateList3.isStateful()) {
            return true;
        }
        a0 a0Var = this.s.b;
        return a0Var != null && a0Var.d();
    }

    public final float j() {
        if (l()) {
            return this.G.getStrokeWidth() / 2.0f;
        }
        return 0.0f;
    }

    public final float k() {
        float[] fArr = this.T;
        return fArr != null ? fArr[3] : this.s.a.e.a(h());
    }

    public final boolean l() {
        Paint.Style style = this.s.q;
        return (style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.STROKE) && this.G.getStrokeWidth() > 0.0f;
    }

    public final void m(Context context) {
        this.s.c = new m31.a(context);
        x();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        this.s = new h(this.s);
        return this;
    }

    public final boolean n() {
        if (!this.s.a.f(h())) {
            float[] fArr = this.T;
            if (fArr != null) {
                if (fArr.length > 1) {
                    float f = fArr[0];
                    for (int i = 1; i < fArr.length; i++) {
                        if (fArr[i] != f) {
                            break;
                        }
                    }
                }
                if (this.s.a.e()) {
                }
            }
            return false;
        }
        return true;
    }

    public final void o(t5.f fVar) {
        if (this.R == fVar) {
            return;
        }
        this.R = fVar;
        int i = 0;
        while (true) {
            t5.e[] eVarArr = this.S;
            if (i >= eVarArr.length) {
                v(getState(), true);
                invalidateSelf();
                return;
            }
            if (eVarArr[i] == null) {
                eVarArr[i] = new t5.e(this, X[i]);
            }
            t5.e eVar = eVarArr[i];
            t5.f fVar2 = new t5.f();
            fVar2.a((float) fVar.b);
            double d = fVar.a;
            fVar2.b((float) (d * d));
            eVar.m = fVar2;
            i++;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        this.w = true;
        this.x = true;
        super.onBoundsChange(rect);
        if (this.s.b != null && !rect.isEmpty()) {
            v(getState(), this.P);
        }
        this.P = rect.isEmpty();
    }

    @Override // android.graphics.drawable.Drawable, o31.l
    public boolean onStateChange(int[] iArr) {
        if (this.s.b != null) {
            v(iArr, false);
        }
        boolean z = u(iArr) || w();
        if (z) {
            invalidateSelf();
        }
        return z;
    }

    public final void p(float f) {
        h hVar = this.s;
        if (hVar.n != f) {
            hVar.n = f;
            x();
        }
    }

    public final void q(ColorStateList colorStateList) {
        h hVar = this.s;
        if (hVar.d != colorStateList) {
            hVar.d = colorStateList;
            onStateChange(getState());
        }
    }

    public final void r(float f) {
        h hVar = this.s;
        if (hVar.j != f) {
            hVar.j = f;
            this.w = true;
            this.x = true;
            invalidateSelf();
        }
    }

    public final void s() {
        this.H.a(-12303292);
        this.s.getClass();
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        h hVar = this.s;
        if (hVar.l != i) {
            hVar.l = i;
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.s.getClass();
        super.invalidateSelf();
    }

    @Override // u31.y
    public final void setShapeAppearanceModel(n nVar) {
        h hVar = this.s;
        hVar.a = nVar;
        hVar.b = null;
        this.T = null;
        this.U = null;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i) {
        setTintList(ColorStateList.valueOf(i));
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        this.s.f = colorStateList;
        w();
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        h hVar = this.s;
        if (hVar.g != mode) {
            hVar.g = mode;
            w();
            super.invalidateSelf();
        }
    }

    public final void t(a0 a0Var) {
        h hVar = this.s;
        if (hVar.b != a0Var) {
            hVar.b = a0Var;
            v(getState(), true);
            invalidateSelf();
        }
    }

    public final boolean u(int[] iArr) {
        boolean z;
        Paint paint;
        int color;
        int colorForState;
        Paint paint2;
        int color2;
        int colorForState2;
        if (this.s.d == null || color2 == (colorForState2 = this.s.d.getColorForState(iArr, (color2 = (paint2 = this.F).getColor())))) {
            z = false;
        } else {
            paint2.setColor(colorForState2);
            z = true;
        }
        if (this.s.e == null || color == (colorForState = this.s.e.getColorForState(iArr, (color = (paint = this.G).getColor())))) {
            return z;
        }
        paint.setColor(colorForState);
        return true;
    }

    public final void v(int[] iArr, boolean z) {
        n a;
        int i;
        RectF h = h();
        if (this.s.b == null || h.isEmpty()) {
            return;
        }
        boolean z2 = z | (this.R == null);
        if (this.T == null) {
            this.T = new float[4];
        }
        a0 a0Var = this.s.b;
        n[] nVarArr = a0Var.d;
        int i2 = a0Var.a;
        int[][] iArr2 = a0Var.c;
        z zVar = a0Var.h;
        z zVar2 = a0Var.g;
        z zVar3 = a0Var.f;
        z zVar4 = a0Var.e;
        int i3 = 0;
        while (true) {
            if (i3 >= i2) {
                i3 = -1;
                break;
            } else if (StateSet.stateSetMatches(iArr2[i3], iArr)) {
                break;
            } else {
                i3++;
            }
        }
        if (i3 < 0) {
            int[] iArr3 = StateSet.WILD_CARD;
            int i4 = 0;
            while (true) {
                if (i4 >= i2) {
                    i = -1;
                    break;
                } else {
                    if (StateSet.stateSetMatches(iArr2[i4], iArr3)) {
                        i = i4;
                        break;
                    }
                    i4++;
                }
            }
            i3 = i;
        }
        if (zVar4 == null && zVar3 == null && zVar2 == null && zVar == null) {
            a = nVarArr[i3];
        } else {
            m g = nVarArr[i3].g();
            if (zVar4 != null) {
                g.e = zVar4.c(iArr);
            }
            if (zVar3 != null) {
                g.f = zVar3.c(iArr);
            }
            if (zVar2 != null) {
                g.h = zVar2.c(iArr);
            }
            if (zVar != null) {
                g.g = zVar.c(iArr);
            }
            a = g.a();
        }
        int i5 = 0;
        while (i5 < 4) {
            this.J.getClass();
            float a2 = (i5 != 1 ? i5 != 2 ? i5 != 3 ? a.f : a.e : a.h : a.g).a(h);
            if (z2) {
                this.T[i5] = a2;
            }
            t5.e[] eVarArr = this.S;
            t5.e eVar = eVarArr[i5];
            if (eVar != null) {
                eVar.a(a2);
                if (z2) {
                    eVarArr[i5].d();
                }
            }
            i5++;
        }
        if (z2) {
            invalidateSelf();
        }
    }

    public final boolean w() {
        PorterDuffColorFilter porterDuffColorFilter;
        PorterDuffColorFilter porterDuffColorFilter2 = this.K;
        PorterDuffColorFilter porterDuffColorFilter3 = this.L;
        h hVar = this.s;
        ColorStateList colorStateList = hVar.f;
        PorterDuff.Mode mode = hVar.g;
        if (colorStateList == null || mode == null) {
            int color = this.F.getColor();
            int d = d(color);
            this.M = d;
            porterDuffColorFilter = d != color ? new PorterDuffColorFilter(d, PorterDuff.Mode.SRC_IN) : null;
        } else {
            int d2 = d(colorStateList.getColorForState(getState(), 0));
            this.M = d2;
            porterDuffColorFilter = new PorterDuffColorFilter(d2, mode);
        }
        this.K = porterDuffColorFilter;
        this.s.getClass();
        this.L = null;
        this.s.getClass();
        return (Objects.equals(porterDuffColorFilter2, this.K) && Objects.equals(porterDuffColorFilter3, this.L)) ? false : true;
    }

    public final void x() {
        h hVar = this.s;
        float f = hVar.n + 0.0f;
        hVar.o = (int) Math.ceil(0.75f * f);
        this.s.p = (int) Math.ceil(f * 0.25f);
        w();
        super.invalidateSelf();
    }

    public j(Context context, AttributeSet attributeSet, int i, int i2) {
        this(n.c(context, attributeSet, i, i2).a());
    }

    public j(n nVar) {
        this(new h(nVar));
    }

    public j(h hVar) {
        p pVar;
        this.r = new g(this);
        this.t = new w[4];
        this.u = new w[4];
        this.v = new BitSet(8);
        this.y = new Matrix();
        this.z = new Path();
        this.A = new Path();
        this.B = new RectF();
        this.C = new RectF();
        this.D = new Region();
        this.E = new Region();
        Paint paint = new Paint(1);
        this.F = paint;
        Paint paint2 = new Paint(1);
        this.G = paint2;
        this.H = new t31.a();
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            pVar = o.a;
        } else {
            pVar = new p();
        }
        this.J = pVar;
        this.N = new RectF();
        this.O = true;
        this.P = true;
        this.S = new t5.e[4];
        this.s = hVar;
        paint2.setStyle(Paint.Style.STROKE);
        paint.setStyle(Paint.Style.FILL);
        w();
        u(getState());
        this.I = new g(this);
    }
}
