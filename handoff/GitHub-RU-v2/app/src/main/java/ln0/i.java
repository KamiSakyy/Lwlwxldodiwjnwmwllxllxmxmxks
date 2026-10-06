package ln0;

import aa.w;
import java.util.List;
import k71.k;
import mn0.g0;
import mn0.k0;
import mn0.l;
import mn0.l0;
import mn0.m;
import mn0.m0;
import mn0.n;
import mn0.n0;
import mn0.n1;
import mn0.o;
import mn0.o0;
import mn0.p;
import mn0.p0;
import mn0.q;
import mn0.q0;
import mn0.r;
import mn0.r0;
import mn0.s0;
import mn0.t0;
import mn0.u0;
import mn0.v0;
import mn0.w0;
import mn0.x0;
import mn0.y0;
import sy.d0Shadow;

/* loaded from: /home/user/work/p/classes4.dex */
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
            return new kn0.j(str, c);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, w wVar, Object obj) {
        kn0.j jVar = (kn0.j) obj;
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
        mn0.d dVar = g0Var.b;
        if (dVar != null) {
            k0.d(fVar, wVar, dVar);
        }
        mn0.e eVar = g0Var.c;
        if (eVar != null) {
            l0.d(fVar, wVar, eVar);
        }
        mn0.f fVar2 = g0Var.d;
        if (fVar2 != null) {
            m0.d(fVar, wVar, fVar2);
        }
        mn0.g gVar = g0Var.e;
        if (gVar != null) {
            n0.d(fVar, wVar, gVar);
        }
        mn0.h hVar = g0Var.f;
        if (hVar != null) {
            o0.d(fVar, wVar, hVar);
        }
        mn0.i iVar = g0Var.g;
        if (iVar != null) {
            p0.d(fVar, wVar, iVar);
        }
        mn0.j jVar2 = g0Var.h;
        if (jVar2 != null) {
            q0.d(fVar, wVar, jVar2);
        }
        mn0.k kVar = g0Var.i;
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
        kw0.a aVar = g0Var.q;
        if (aVar != null) {
            kw0.b.d(fVar, wVar, aVar);
        }
    }
}
