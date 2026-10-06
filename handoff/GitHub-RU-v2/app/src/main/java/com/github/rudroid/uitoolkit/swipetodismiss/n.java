package com.github.rudroid.uitoolkit.swipetodismiss;

import a0.f1;
import androidx.compose.runtime.l1;
import androidx.compose.runtime.p1;
import f0.j1;

/* loaded from: /home/user/work/p/classes3.dex */
public final class n<T> {
    public static final a Companion = new a();
    public j71.c a;
    public com.github.rudroid.projects.triagesheet.singleselectionvaluepicker.j b;
    public j71.c c;
    public a0 d;
    public x e;
    public p1 f;
    public androidx.compose.runtime.g0 g;
    public androidx.compose.runtime.g0 h;
    public l1 i;
    public l1 j;
    public p1 k;
    public p1 l;
    public u m;

    public static final class a {
    }

    public n(h0 h0Var, j71.c cVar, com.github.rudroid.projects.triagesheet.singleselectionvaluepicker.j jVar, j71.c cVar2) {
        f1 f1Var = b.a;
        this.a = cVar;
        this.b = jVar;
        this.c = cVar2;
        this.d = new a0();
        this.e = new x(this);
        this.f = androidx.compose.runtime.t.B(h0Var);
        this.g = androidx.compose.runtime.t.s(new m(this, 0));
        this.h = androidx.compose.runtime.t.s(new m(this, 1));
        this.i = new l1(Float.NaN);
        androidx.compose.runtime.t.r(androidx.compose.runtime.i.x, new m(this, 2));
        this.j = new l1(0.0f);
        this.k = androidx.compose.runtime.t.B((Object) null);
        this.l = androidx.compose.runtime.t.B(new d0(x61.s.r));
        this.m = new u(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(j1 j1Var, j71.f fVar, c71.c cVar) {
        o oVar;
        int i;
        l1 l1Var;
        j71.c cVar2;
        Object c;
        try {
            if (cVar instanceof o) {
                oVar = (o) cVar;
                int i2 = oVar.w;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    oVar.w = i2 - Integer.MIN_VALUE;
                    Object obj = oVar.u;
                    b71.a aVar = b71.a.r;
                    i = oVar.w;
                    l1Var = this.i;
                    cVar2 = this.c;
                    if (i != 0) {
                        sy.y.j(obj);
                        a0 a0Var = this.d;
                        q qVar = new q(null, this, fVar);
                        oVar.w = 1;
                        a0Var.getClass();
                        if (v71.b0.k(new b0(j1Var, a0Var, qVar, null), oVar) == aVar) {
                            return aVar;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        sy.y.j(obj);
                    }
                    if (c != null && Math.abs(l1Var.y() - d().d(c)) <= 0.5f && ((Boolean) cVar2.k(c)).booleanValue()) {
                        f(c);
                    }
                    return w61.a0.a;
                }
            }
            if (i != 0) {
            }
            if (c != null) {
                f(c);
            }
            return w61.a0.a;
        } finally {
            c = d().c(l1Var.y());
            if (c != null && Math.abs(l1Var.y() - d().d(c)) <= 0.5f && ((Boolean) cVar2.k(c)).booleanValue()) {
                f(c);
            }
        }
        oVar = new o(this, cVar);
        Object obj2 = oVar.u;
        b71.a aVar2 = b71.a.r;
        i = oVar.w;
        l1Var = this.i;
        cVar2 = this.c;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(Object obj, j1 j1Var, j71.g gVar, c71.c cVar) {
        r rVar;
        int i;
        l1 l1Var;
        j71.c cVar2;
        Object c;
        try {
            if (cVar instanceof r) {
                rVar = (r) cVar;
                int i2 = rVar.w;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    rVar.w = i2 - Integer.MIN_VALUE;
                    Object obj2 = rVar.u;
                    b71.a aVar = b71.a.r;
                    i = rVar.w;
                    l1Var = this.i;
                    cVar2 = this.c;
                    if (i != 0) {
                        sy.y.j(obj2);
                        if (!d().e(obj)) {
                            f(obj);
                            return w61.a0.a;
                        }
                        a0 a0Var = this.d;
                        t tVar = new t(this, obj, gVar, null);
                        rVar.w = 1;
                        a0Var.getClass();
                        if (v71.b0.k(new b0(j1Var, a0Var, tVar, null), rVar) == aVar) {
                            return aVar;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        sy.y.j(obj2);
                    }
                    if (c != null && Math.abs(l1Var.y() - d().d(c)) <= 0.5f && ((Boolean) cVar2.k(c)).booleanValue()) {
                        f(c);
                    }
                    return w61.a0.a;
                }
            }
            if (i != 0) {
            }
            if (c != null) {
                f(c);
            }
            return w61.a0.a;
        } finally {
            g(null);
            c = d().c(l1Var.y());
            if (c != null && Math.abs(l1Var.y() - d().d(c)) <= 0.5f && ((Boolean) cVar2.k(c)).booleanValue()) {
                f(c);
            }
        }
        rVar = new r(this, cVar);
        Object obj22 = rVar.u;
        b71.a aVar2 = b71.a.r;
        i = rVar.w;
        l1Var = this.i;
        cVar2 = this.c;
    }

    public final Object c(float f, float f2, Object obj) {
        y d = d();
        float d2 = d.d(obj);
        float floatValue = ((Number) this.b.a()).floatValue();
        if (d2 != f && !Float.isNaN(d2)) {
            j71.c cVar = this.a;
            if (d2 < f) {
                if (f2 >= floatValue) {
                    Object b = d.b(f, true);
                    k71.k.d(b);
                    return b;
                }
                Object b2 = d.b(f, true);
                k71.k.d(b2);
                if (f >= Math.abs(Math.abs(((Number) cVar.k(Float.valueOf(Math.abs(d.d(b2) - d2)))).floatValue()) + d2)) {
                    return b2;
                }
            } else {
                if (f2 <= (-floatValue)) {
                    Object b3 = d.b(f, false);
                    k71.k.d(b3);
                    return b3;
                }
                Object b4 = d.b(f, false);
                k71.k.d(b4);
                float abs = Math.abs(d2 - Math.abs(((Number) cVar.k(Float.valueOf(Math.abs(d2 - d.d(b4))))).floatValue()));
                if (f >= 0.0f ? f <= abs : Math.abs(f) >= abs) {
                    return b4;
                }
            }
        }
        return obj;
    }

    public final y d() {
        return (y) this.l.getValue();
    }

    public final float e() {
        l1 l1Var = this.i;
        if (Float.isNaN(l1Var.y())) {
            throw new IllegalStateException("The offset was read before being initialized. Did you access the offset in a phase before layout, like effects or composition?");
        }
        return l1Var.y();
    }

    public final void f(Object obj) {
        this.f.setValue(obj);
    }

    public final void g(Object obj) {
        this.k.setValue(obj);
    }


}
