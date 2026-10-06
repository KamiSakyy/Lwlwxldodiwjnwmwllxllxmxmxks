package com.github.rudroid.starredreposandlists;

import com.github.rudroid.starredreposandlists.h;
import com.google.android.gms.internal.measurement.i4;
import f1.ub;

/* loaded from: /home/user/work/p/classes3.dex */
public final class o extends k71.l implements j71.e {
    public final /* synthetic */ androidx.compose.runtime.f1 s;
    public final /* synthetic */ y3.k t;
    public final /* synthetic */ h.d u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(androidx.compose.runtime.f1 f1Var, y3.k kVar, j71.a aVar, h.d dVar) {
        super(2);
        this.s = f1Var;
        this.t = kVar;
        this.u = dVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x011b, code lost:
    
        if (r4 == r3) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object s(Object obj, Object obj2) {
        Object obj3;
        androidx.compose.runtime.s sVar = (androidx.compose.runtime.s) obj;
        int intValue = ((Number) obj2).intValue();
        h.d dVar = this.u;
        String str = dVar.t;
        int i = intValue & 3;
        w61.a0 a0Var = w61.a0.a;
        if (i == 2 && sVar.C()) {
            sVar.V();
            return a0Var;
        }
        this.s.setValue(a0Var);
        y3.k kVar = this.t;
        kVar.getClass();
        kVar.d();
        sVar.c0(-48199348);
        y3.k kVar2 = (y3.k) kVar.c().s;
        y3.d b = kVar2.b();
        y3.d b2 = kVar2.b();
        int i2 = dVar.u;
        boolean f = sVar.f(str);
        Object N = sVar.N();
        Object obj4 = androidx.compose.runtime.n.a;
        if (f || N == obj4) {
            N = com.github.rudroid.utilities.g0.a(str);
            sVar.n0(N);
        }
        com.github.rudroid.utilities.d0 d0Var = (com.github.rudroid.utilities.d0) N;
        long j = ih.d.b(sVar).b;
        w1.o oVar = w1.o.a;
        d2.l0 l0Var = d2.a0.b;
        w1.r f2 = f0.o.f(oVar, j, l0Var);
        float f3 = ih.a.n;
        w1.r B = androidx.compose.foundation.layout.b.B(f2, f3, f3, 0.0f, f3, 4);
        boolean f4 = sVar.f(b2);
        Object N2 = sVar.N();
        if (f4 || N2 == obj4) {
            N2 = new p(b2);
            sVar.n0(N2);
        }
        ub.c(d0Var.a, y3.k.a(B, b, (j71.c) N2), 0L, 0L, (k3.i) null, 0L, (r3.k) null, 0L, 2, false, 1, 0, d0Var.b, (j71.c) null, (g3.q0) null, sVar, 0, 24960, 438268);
        String n0 = i4.n0(2131820625, i2, new Object[]{Integer.valueOf(i2)}, sVar);
        w1.r B2 = androidx.compose.foundation.layout.b.B(f0.o.f(oVar, ih.d.b(sVar).b, l0Var), 0.0f, f3, f3, f3, 1);
        boolean f5 = sVar.f(b);
        Object N3 = sVar.N();
        if (f5) {
            obj3 = obj4;
        } else {
            obj3 = obj4;
        }
        N3 = new q(b);
        sVar.n0(N3);
        w1.r a = com.github.rudroid.uitoolkit.utils.x.a(y3.k.a(B2, b2, (j71.c) N3), 0.8f);
        boolean f6 = sVar.f(n0);
        Object N4 = sVar.N();
        if (f6 || N4 == obj3) {
            N4 = new r(n0);
            sVar.n0(N4);
        }
        ub.b(String.valueOf(i2), d3.q.b(a, false, (j71.c) N4), ih.d.b(sVar).v, 0L, (k3.s) null, 0L, (r3.k) null, 0L, 2, false, 1, 0, (j71.c) null, (g3.q0) null, sVar, 0, 24960, 241656);
        sVar.q(false);
        return a0Var;
    }
    public Object e(Object p1, Object p2) { return null; }
    public Object f(Object p1, Object p2, Object p3, Object p4, Object p5) { return null; }
    public Object e(Object, Object) { return null; }
    public Object f(long, Object, Object, Object, int) { return null; }
}
