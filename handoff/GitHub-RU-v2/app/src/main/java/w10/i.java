package w10;

import aa.w;
import java.util.List;
import k71.k;
import sy.d0Shadow;
import x10.g0;
import x10.k0;
import x10.l;
import x10.l0;
import x10.m;
import x10.m0;
import x10.n;
import x10.n0;
import x10.n1;
import x10.o;
import x10.o0;
import x10.p;
import x10.p0;
import x10.q;
import x10.q0;
import x10.r;
import x10.r0;
import x10.s0;
import x10.t0;
import x10.u0;
import x10.v0;
import x10.w0;
import x10.x0;
import x10.y0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class i implements aa.a {
    public static final i a = new i();
    public static final List b = d0Shadow.n("__typename");

    public final Object a(ea.e eVar, w wVar) {
        k.g(eVar, "reader");
        k.g(wVar, "customScalarAdapters");
        String str = null;
        while (eVar.r0(b) == 0) {
            str = (String) aa.c.a.a(eVar, wVar);
        }
        eVar.s0();
        g0 c = n1.c(eVar, wVar);
        if (str != null) {
            return new v10.j(str, c);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, w wVar, Object obj) {
        v10.j jVar = (v10.j) obj;
        k.g(fVar, "writer");
        k.g(wVar, "customScalarAdapters");
        k.g(jVar, "value");
        fVar.z0("__typename");
        aa.c.a.b(fVar, wVar, jVar.a);
        List list = n1.a;
        g0 g0Var = jVar.b;
        k.g(fVar, "writer");
        k.g(wVar, "customScalarAdapters");
        k.g(g0Var, "value");
        fVar.z0("__typename");
        aa.c.a.b(fVar, wVar, g0Var.a);
        x10.d dVar = g0Var.b;
        if (dVar != null) {
            k0.d(fVar, wVar, dVar);
        }
        x10.e eVar = g0Var.c;
        if (eVar != null) {
            l0.d(fVar, wVar, eVar);
        }
        x10.f fVar2 = g0Var.d;
        if (fVar2 != null) {
            m0.d(fVar, wVar, fVar2);
        }
        x10.g gVar = g0Var.e;
        if (gVar != null) {
            n0.d(fVar, wVar, gVar);
        }
        x10.h hVar = g0Var.f;
        if (hVar != null) {
            o0.d(fVar, wVar, hVar);
        }
        x10.i iVar = g0Var.g;
        if (iVar != null) {
            p0.d(fVar, wVar, iVar);
        }
        x10.j jVar2 = g0Var.h;
        if (jVar2 != null) {
            q0.d(fVar, wVar, jVar2);
        }
        x10.k kVar = g0Var.i;
        if (kVar != null) {
            r0.d(fVar, wVar, kVar);
        }
        l lVar = g0Var.j;
        if (lVar != null) {
            s0.d(fVar, wVar, lVar);
        }
        m mVar = g0Var.k;
        if (mVar != null) {
            t0.d(fVar, wVar, mVar);
        }
        n nVar = g0Var.l;
        if (nVar != null) {
            u0.d(fVar, wVar, nVar);
        }
        o oVar = g0Var.m;
        if (oVar != null) {
            v0.d(fVar, wVar, oVar);
        }
        p pVar = g0Var.n;
        if (pVar != null) {
            w0.d(fVar, wVar, pVar);
        }
        q qVar = g0Var.o;
        if (qVar != null) {
            x0.d(fVar, wVar, qVar);
        }
        r rVar = g0Var.p;
        if (rVar != null) {
            y0.d(fVar, wVar, rVar);
        }
        ja0.a aVar = g0Var.q;
        if (aVar != null) {
            ja0.b.d(fVar, wVar, aVar);
        }
    }
}
