package mc0;

import aa.w;
import java.util.List;
import k71.k;
import nc0.g0;
import nc0.k0;
import nc0.l;
import nc0.l0;
import nc0.m;
import nc0.m0;
import nc0.n;
import nc0.n0;
import nc0.n1;
import nc0.o;
import nc0.o0;
import nc0.p;
import nc0.p0;
import nc0.q;
import nc0.q0;
import nc0.r;
import nc0.r0;
import nc0.s0;
import nc0.t0;
import nc0.u0;
import nc0.v0;
import nc0.w0;
import nc0.x0;
import nc0.y0;
import sy.d0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class i implements aa.a {
    public static final i a = new i();
    public static final List b = d0.n("__typename");

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
            return new lc0.j(str, c);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, w wVar, Object obj) {
        lc0.j jVar = (lc0.j) obj;
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
        nc0.d dVar = g0Var.b;
        if (dVar != null) {
            k0.d(fVar, wVar, dVar);
        }
        nc0.e eVar = g0Var.c;
        if (eVar != null) {
            l0.d(fVar, wVar, eVar);
        }
        nc0.f fVar2 = g0Var.d;
        if (fVar2 != null) {
            m0.d(fVar, wVar, fVar2);
        }
        nc0.g gVar = g0Var.e;
        if (gVar != null) {
            n0.d(fVar, wVar, gVar);
        }
        nc0.h hVar = g0Var.f;
        if (hVar != null) {
            o0.d(fVar, wVar, hVar);
        }
        nc0.i iVar = g0Var.g;
        if (iVar != null) {
            p0.d(fVar, wVar, iVar);
        }
        nc0.j jVar2 = g0Var.h;
        if (jVar2 != null) {
            q0.d(fVar, wVar, jVar2);
        }
        nc0.k kVar = g0Var.i;
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
        bl0.a aVar = g0Var.q;
        if (aVar != null) {
            bl0.b.d(fVar, wVar, aVar);
        }
    }
}
