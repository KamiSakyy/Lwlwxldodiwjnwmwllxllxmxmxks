package com.github.rudroid.uitoolkit.listitems;

import androidx.compose.runtime.f1;
import androidx.compose.runtime.v1;
import androidx.compose.ui.layout.v0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class x extends k71.l implements j71.e {
    public final /* synthetic */ f1 s;
    public final /* synthetic */ y3.k t;
    public final /* synthetic */ j71.f u;
    public final /* synthetic */ j71.f v;
    public final /* synthetic */ r1.d w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(f1 f1Var, y3.k kVar, j71.a aVar, j71.f fVar, j71.f fVar2, r1.d dVar) {
        super(2);
        this.s = f1Var;
        this.t = kVar;
        this.u = fVar;
        this.v = fVar2;
        this.w = dVar;
    }

    public final Object s(Object obj, Object obj2) {
        boolean z;
        androidx.compose.runtime.s sVar = (androidx.compose.runtime.s) obj;
        int intValue = ((Number) obj2).intValue() & 3;
        w61.a0 a0Var = w61.a0.a;
        if (intValue == 2 && sVar.C()) {
            sVar.V();
            return a0Var;
        }
        this.s.setValue(a0Var);
        y3.k kVar = this.t;
        kVar.getClass();
        kVar.d();
        sVar.c0(1092767432);
        y3.k kVar2 = (y3.k) kVar.c().s;
        y3.d b = kVar2.b();
        y3.d b2 = kVar2.b();
        y3.d b3 = kVar2.b();
        float f = ih.a.n;
        w1.o oVar = w1.o.a;
        w1.r B = androidx.compose.foundation.layout.b.B(oVar, 0.0f, 0.0f, f, 0.0f, 11);
        j71.f fVar = this.u;
        boolean f2 = sVar.f(fVar) | sVar.f(b2);
        Object N = sVar.N();
        Object obj3 = androidx.compose.runtime.n.a;
        if (f2 || N == obj3) {
            N = new o(fVar, b2);
            sVar.n0(N);
        }
        w1.r a = y3.k.a(B, b, (j71.c) N);
        w1.j jVar = w1.c.r;
        v0 d = androidx.compose.foundation.layout.t.d(jVar, false);
        int hashCode = Long.hashCode(sVar.T);
        v1 l = sVar.l();
        w1.r c = w1.a.c(sVar, a);
        v2.h.o.getClass();
        v2.f fVar2 = v2.g.b;
        sVar.g0();
        if (sVar.S) {
            sVar.k(fVar2);
        } else {
            sVar.q0();
        }
        v2.e eVar = v2.g.f;
        androidx.compose.runtime.t.I(sVar, eVar, d);
        v2.e eVar2 = v2.g.e;
        androidx.compose.runtime.t.I(sVar, eVar2, l);
        Integer valueOf = Integer.valueOf(hashCode);
        v2.e eVar3 = v2.g.g;
        androidx.compose.runtime.t.w(sVar, valueOf, eVar3);
        v2.d dVar = v2.g.h;
        androidx.compose.runtime.t.E(sVar, dVar);
        v2.e eVar4 = v2.g.d;
        androidx.compose.runtime.t.I(sVar, eVar4, c);
        androidx.compose.foundation.layout.y yVar = androidx.compose.foundation.layout.y.a;
        if (fVar == null) {
            sVar.c0(-1263032264);
        } else {
            sVar.c0(1344730345);
            fVar.f(yVar, sVar, 6);
        }
        sVar.q(false);
        sVar.q(true);
        boolean f3 = sVar.f(b) | sVar.f(b3);
        Object N2 = sVar.N();
        if (f3 || N2 == obj3) {
            N2 = new p(b, b3);
            sVar.n0(N2);
        }
        w1.r a2 = y3.k.a(oVar, b2, (j71.c) N2);
        v0 d2 = androidx.compose.foundation.layout.t.d(jVar, false);
        int hashCode2 = Long.hashCode(sVar.T);
        v1 l2 = sVar.l();
        w1.r c2 = w1.a.c(sVar, a2);
        sVar.g0();
        if (sVar.S) {
            sVar.k(fVar2);
        } else {
            sVar.q0();
        }
        androidx.compose.runtime.t.I(sVar, eVar, d2);
        androidx.compose.runtime.t.I(sVar, eVar2, l2);
        f1.e.t(hashCode2, sVar, eVar3, sVar, dVar);
        androidx.compose.runtime.t.I(sVar, eVar4, c2);
        this.w.f(yVar, sVar, 6);
        sVar.q(true);
        w1.r B2 = androidx.compose.foundation.layout.b.B(oVar, f, 0.0f, 0.0f, 0.0f, 14);
        j71.f fVar3 = this.v;
        boolean f4 = sVar.f(fVar3) | sVar.f(b2);
        Object N3 = sVar.N();
        if (f4 || N3 == obj3) {
            N3 = new q(fVar3, b2);
            sVar.n0(N3);
        }
        w1.r a3 = y3.k.a(B2, b3, (j71.c) N3);
        v0 d3 = androidx.compose.foundation.layout.t.d(jVar, false);
        int hashCode3 = Long.hashCode(sVar.T);
        v1 l3 = sVar.l();
        w1.r c3 = w1.a.c(sVar, a3);
        sVar.g0();
        if (sVar.S) {
            sVar.k(fVar2);
        } else {
            sVar.q0();
        }
        androidx.compose.runtime.t.I(sVar, eVar, d3);
        androidx.compose.runtime.t.I(sVar, eVar2, l3);
        f1.e.t(hashCode3, sVar, eVar3, sVar, dVar);
        androidx.compose.runtime.t.I(sVar, eVar4, c3);
        if (fVar3 == null) {
            sVar.c0(1868316176);
            z = false;
        } else {
            z = false;
            sVar.c0(1445741585);
            fVar3.f(yVar, sVar, 6);
        }
        sVar.q(z);
        sVar.q(true);
        sVar.q(z);
        return a0Var;
    }
    public Object a = null;
}
