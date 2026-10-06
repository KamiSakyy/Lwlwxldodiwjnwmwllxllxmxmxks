package f31;

import a5.j1;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.material.card.MaterialCardView;
import sy.u;
import u31.e;
import u31.j;
import u31.l;
import u31.m;
import u31.n;
import v2.t;

/* loaded from: /home/user/work/p/classes4.dex */
public final class c {
    public static final double y = Math.cos(Math.toRadians(45.0d));
    public static final ColorDrawable z;
    public MaterialCardView a;
    public j c;
    public j d;
    public int e;
    public int f;
    public int g;
    public int h;
    public Drawable i;
    public Drawable j;
    public ColorStateList k;
    public ColorStateList l;
    public n m;
    public ColorStateList n;
    public RippleDrawable o;
    public LayerDrawable p;
    public j q;
    public boolean s;
    public ValueAnimator t;
    public TimeInterpolator u;
    public int v;
    public int w;
    public final Rect b = new Rect();
    public boolean r = false;
    public float x = 0.0f;

    static {
        z = Build.VERSION.SDK_INT <= 28 ? new ColorDrawable() : null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public c(MaterialCardView materialCardView, AttributeSet attributeSet) {
        this.a = materialCardView;
        j jVar = new j(materialCardView.getContext(), attributeSet, 2130969471, 2132018468);
        this.c = jVar;
        jVar.m(materialCardView.getContext());
        jVar.s();
        m g = jVar.s.a.g();
        TypedArray obtainStyledAttributes = materialCardView.getContext().obtainStyledAttributes(attributeSet, v.a.a, 2130969471, 2132017471);
        if (obtainStyledAttributes.hasValue(3)) {
            float dimension = obtainStyledAttributes.getDimension(3, 0.0f);
            g.e = new u31.a(dimension);
            g.f = new u31.a(dimension);
            g.g = new u31.a(dimension);
            g.h = new u31.a(dimension);
        }
        this.d = new j();
        h(g.a());
        this.u = k41.b.K(materialCardView.getContext(), 2130969552, y21.a.a);
        this.v = k41.b.J(2130969542, 300, materialCardView.getContext());
        this.w = k41.b.J(2130969541, 300, materialCardView.getContext());
        obtainStyledAttributes.recycle();
    }

    public static float b(u uVar, float f) {
        if (uVar instanceof l) {
            return (float) ((1.0d - y) * f);
        }
        if (uVar instanceof e) {
            return f / 2.0f;
        }
        return 0.0f;
    }

    public final float a() {
        u uVar = this.m.a;
        j jVar = this.c;
        float b = b(uVar, jVar.k());
        u uVar2 = this.m.b;
        float[] fArr = jVar.T;
        float max = Math.max(b, b(uVar2, fArr != null ? fArr[0] : jVar.s.a.f.a(jVar.h())));
        u uVar3 = this.m.c;
        float[] fArr2 = jVar.T;
        float b2 = b(uVar3, fArr2 != null ? fArr2[1] : jVar.s.a.g.a(jVar.h()));
        u uVar4 = this.m.d;
        float[] fArr3 = jVar.T;
        return Math.max(max, Math.max(b2, b(uVar4, fArr3 != null ? fArr3[2] : jVar.s.a.h.a(jVar.h()))));
    }

    public final LayerDrawable c() {
        if (this.o == null) {
            this.q = new j(this.m);
            this.o = new RippleDrawable(this.k, null, this.q);
        }
        if (this.p == null) {
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{this.o, this.d, this.j});
            this.p = layerDrawable;
            layerDrawable.setId(2, 2131363057);
        }
        return this.p;
    }

    public final b d(Drawable drawable) {
        int i;
        int i2;
        if (this.a.getUseCompatPadding()) {
            int ceil = (int) Math.ceil((r0.getMaxCardElevation() * 1.5f) + (i() ? a() : 0.0f));
            i = (int) Math.ceil(r0.getMaxCardElevation() + (i() ? a() : 0.0f));
            i2 = ceil;
        } else {
            i = 0;
            i2 = 0;
        }
        return new b(drawable, i, i2, i, i2);
    }

    public final void e(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        if (this.p != null) {
            w.a aVar = this.a;
            if (aVar.getUseCompatPadding()) {
                i3 = (int) Math.ceil(((aVar.getMaxCardElevation() * 1.5f) + (i() ? a() : 0.0f)) * 2.0f);
                i4 = (int) Math.ceil((aVar.getMaxCardElevation() + (i() ? a() : 0.0f)) * 2.0f);
            } else {
                i3 = 0;
                i4 = 0;
            }
            int i7 = this.g;
            int i8 = (i7 & 8388613) == 8388613 ? ((i - this.e) - this.f) - i4 : this.e;
            int i9 = (i7 & 80) == 80 ? this.e : ((i2 - this.e) - this.f) - i3;
            int i10 = (i7 & 8388613) == 8388613 ? this.e : ((i - this.e) - this.f) - i4;
            int i12 = (i7 & 80) == 80 ? ((i2 - this.e) - this.f) - i3 : this.e;
            if (aVar.getLayoutDirection() == 1) {
                i6 = i10;
                i5 = i8;
            } else {
                i5 = i10;
                i6 = i8;
            }
            this.p.setLayerInset(2, i6, i12, i5, i9);
        }
    }

    public final void f(boolean z2, boolean z3) {
        Drawable drawable = this.j;
        if (drawable != null) {
            if (!z3) {
                drawable.setAlpha(z2 ? 255 : 0);
                this.x = z2 ? 1.0f : 0.0f;
                return;
            }
            float f = z2 ? 1.0f : 0.0f;
            float f2 = z2 ? 1.0f - this.x : this.x;
            ValueAnimator valueAnimator = this.t;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.t = null;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.x, f);
            this.t = ofFloat;
            ofFloat.addUpdateListener(new j1(1, this));
            this.t.setInterpolator(this.u);
            this.t.setDuration((long) ((z2 ? this.v : this.w) * f2));
            this.t.start();
        }
    }

    public final void g(Drawable drawable) {
        if (drawable != null) {
            Drawable mutate = drawable.mutate();
            this.j = mutate;
            mutate.setTintList(this.l);
            f(this.a.A, false);
        } else {
            this.j = z;
        }
        LayerDrawable layerDrawable = this.p;
        if (layerDrawable != null) {
            layerDrawable.setDrawableByLayerId(2131363057, this.j);
        }
    }

    public final void h(n nVar) {
        this.m = nVar;
        j jVar = this.c;
        jVar.setShapeAppearanceModel(nVar);
        jVar.O = !jVar.n();
        j jVar2 = this.d;
        if (jVar2 != null) {
            jVar2.setShapeAppearanceModel(nVar);
        }
        j jVar3 = this.q;
        if (jVar3 != null) {
            jVar3.setShapeAppearanceModel(nVar);
        }
    }

    public final boolean i() {
        MaterialCardView materialCardView = this.a;
        return materialCardView.getPreventCornerOverlap() && this.c.n() && materialCardView.getUseCompatPadding();
    }

    public final boolean j() {
        w.a aVar = this.a;
        if (aVar.isClickable()) {
            return true;
        }
        while (aVar.isDuplicateParentStateEnabled() && (aVar.getParent() instanceof View)) {
            aVar = (View) aVar.getParent();
        }
        return aVar.isClickable();
    }

    public final void k() {
        Drawable drawable = this.i;
        Drawable c = j() ? c() : this.d;
        this.i = c;
        if (drawable != c) {
            w.a aVar = this.a;
            if (aVar.getForeground() instanceof InsetDrawable) {
                ((InsetDrawable) aVar.getForeground()).setDrawable(c);
            } else {
                aVar.setForeground(d(c));
            }
        }
    }

    public final void l() {
        MaterialCardView materialCardView = this.a;
        float f = 0.0f;
        float a = ((!materialCardView.getPreventCornerOverlap() || this.c.n()) && !i()) ? 0.0f : a();
        if (materialCardView.getPreventCornerOverlap() && materialCardView.getUseCompatPadding()) {
            f = (float) ((1.0d - y) * materialCardView.getCardViewRadius());
        }
        int i = (int) (a - f);
        Rect rect = this.b;
        ((w.a) materialCardView).t.set(rect.left + i, rect.top + i, rect.right + i, rect.bottom + i);
        t tVar = ((w.a) materialCardView).v;
        if (!((w.a) tVar.t).getUseCompatPadding()) {
            tVar.m(0, 0, 0, 0);
            return;
        }
        w.b bVar = (Drawable) tVar.s;
        float f2 = bVar.e;
        float f3 = bVar.a;
        int ceil = (int) Math.ceil(w.c.a(f2, f3, r1.getPreventCornerOverlap()));
        int ceil2 = (int) Math.ceil(w.c.b(f2, f3, r1.getPreventCornerOverlap()));
        tVar.m(ceil, ceil2, ceil, ceil2);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [android.view.View, com.google.android.material.card.MaterialCardView] */
    public final void m() {
        boolean z2 = this.r;
        MaterialCardView r1 = this.a;
        if (!z2) {
            r1.setBackgroundInternal(d(this.c));
        }
        r1.setForeground(d(this.i));
    }
}
