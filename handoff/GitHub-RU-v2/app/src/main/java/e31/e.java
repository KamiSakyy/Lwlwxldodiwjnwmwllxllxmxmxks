package e31;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.view.View;
import com.google.android.material.button.MaterialButton;
import q.o;
import t5.f;
import u31.a0;
import u31.h;
import u31.j;
import u31.n;
import u31.y;

/* loaded from: /home/user/work/p/classes4.dex */
public final class e {
    public final MaterialButton a;
    public n b;
    public a0 c;
    public f d;
    public c5.b e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;
    public PorterDuff.Mode l;
    public ColorStateList m;
    public ColorStateList n;
    public ColorStateList o;
    public j p;
    public boolean t;
    public RippleDrawable v;
    public int w;
    public boolean q = false;
    public boolean r = false;
    public boolean s = false;
    public boolean u = true;

    public e(MaterialButton materialButton, n nVar) {
        this.a = materialButton;
        this.b = nVar;
    }

    public final j a(boolean z) {
        RippleDrawable rippleDrawable = this.v;
        if (rippleDrawable == null || rippleDrawable.getNumberOfLayers() <= 0) {
            return null;
        }
        return (j) ((LayerDrawable) ((InsetDrawable) this.v.getDrawable(0)).getDrawable()).getDrawable(!z ? 1 : 0);
    }

    public final void b(int i, int i2) {
        o oVar = this.a;
        int paddingStart = oVar.getPaddingStart();
        int paddingTop = oVar.getPaddingTop();
        int paddingEnd = oVar.getPaddingEnd();
        int paddingBottom = oVar.getPaddingBottom();
        int i3 = this.h;
        int i4 = this.i;
        this.i = i2;
        this.h = i;
        if (!this.r) {
            c();
        }
        oVar.setPaddingRelative(paddingStart, (paddingTop + i) - i3, paddingEnd, (paddingBottom + i2) - i4);
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [android.view.View, com.google.android.material.button.MaterialButton] */
    public final void c() {
        j jVar = new j(this.b);
        a0 a0Var = this.c;
        if (a0Var != null) {
            jVar.t(a0Var);
        }
        f fVar = this.d;
        if (fVar != null) {
            jVar.o(fVar);
        }
        c5.b bVar = this.e;
        if (bVar != null) {
            jVar.V = bVar;
        }
        MaterialButton r1 = this.a;
        jVar.m(r1.getContext());
        jVar.setTintList(this.m);
        PorterDuff.Mode mode = this.l;
        if (mode != null) {
            jVar.setTintMode(mode);
        }
        float f = this.k;
        ColorStateList colorStateList = this.n;
        jVar.s.k = f;
        jVar.invalidateSelf();
        h hVar = jVar.s;
        if (hVar.e != colorStateList) {
            hVar.e = colorStateList;
            jVar.onStateChange(jVar.getState());
        }
        j jVar2 = new j(this.b);
        a0 a0Var2 = this.c;
        if (a0Var2 != null) {
            jVar2.t(a0Var2);
        }
        f fVar2 = this.d;
        if (fVar2 != null) {
            jVar2.o(fVar2);
        }
        jVar2.setTint(0);
        float f2 = this.k;
        int n = this.q ? a.a.n((View) r1, 2130968896) : 0;
        jVar2.s.k = f2;
        jVar2.invalidateSelf();
        ColorStateList valueOf = ColorStateList.valueOf(n);
        h hVar2 = jVar2.s;
        if (hVar2.e != valueOf) {
            hVar2.e = valueOf;
            jVar2.onStateChange(jVar2.getState());
        }
        j jVar3 = new j(this.b);
        this.p = jVar3;
        a0 a0Var3 = this.c;
        if (a0Var3 != null) {
            jVar3.t(a0Var3);
        }
        f fVar3 = this.d;
        if (fVar3 != null) {
            this.p.o(fVar3);
        }
        this.p.setTint(-1);
        RippleDrawable rippleDrawable = new RippleDrawable(s31.a.b(this.o), new InsetDrawable((Drawable) new LayerDrawable(new Drawable[]{jVar2, jVar}), this.f, this.h, this.g, this.i), this.p);
        this.v = rippleDrawable;
        r1.setInternalBackground(rippleDrawable);
        j a = a(false);
        if (a != null) {
            a.p(this.w);
            a.setState(r1.getDrawableState());
        }
    }

    public final void d() {
        j a = a(false);
        if (a != null) {
            a0 a0Var = this.c;
            if (a0Var != null) {
                a.t(a0Var);
            } else {
                a.setShapeAppearanceModel(this.b);
            }
            f fVar = this.d;
            if (fVar != null) {
                a.o(fVar);
            }
        }
        j a2 = a(true);
        if (a2 != null) {
            a0 a0Var2 = this.c;
            if (a0Var2 != null) {
                a2.t(a0Var2);
            } else {
                a2.setShapeAppearanceModel(this.b);
            }
            f fVar2 = this.d;
            if (fVar2 != null) {
                a2.o(fVar2);
            }
        }
        RippleDrawable rippleDrawable = this.v;
        y yVar = (rippleDrawable == null || rippleDrawable.getNumberOfLayers() <= 1) ? null : this.v.getNumberOfLayers() > 2 ? (y) this.v.getDrawable(2) : (y) this.v.getDrawable(1);
        if (yVar != null) {
            yVar.setShapeAppearanceModel(this.b);
            if (yVar instanceof j) {
                j jVar = (j) yVar;
                a0 a0Var3 = this.c;
                if (a0Var3 != null) {
                    jVar.t(a0Var3);
                }
                f fVar3 = this.d;
                if (fVar3 != null) {
                    jVar.o(fVar3);
                }
            }
        }
    }

    public final void e() {
        j a = a(false);
        j a2 = a(true);
        if (a != null) {
            float f = this.k;
            ColorStateList colorStateList = this.n;
            a.s.k = f;
            a.invalidateSelf();
            h hVar = a.s;
            if (hVar.e != colorStateList) {
                hVar.e = colorStateList;
                a.onStateChange(a.getState());
            }
            if (a2 != null) {
                float f2 = this.k;
                int n = this.q ? a.a.n(this.a, 2130968896) : 0;
                a2.s.k = f2;
                a2.invalidateSelf();
                ColorStateList valueOf = ColorStateList.valueOf(n);
                h hVar2 = a2.s;
                if (hVar2.e != valueOf) {
                    hVar2.e = valueOf;
                    a2.onStateChange(a2.getState());
                }
            }
        }
    }
}
