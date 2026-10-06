package lo;

import aa.w;
import java.util.List;
import k71.k;
import mo.h0;
import mo.l;
import mo.l0;
import mo.m;
import mo.m0;
import mo.n;
import mo.n0;
import mo.o;
import mo.o0;
import mo.p;
import mo.p0;
import mo.p1;
import mo.q;
import mo.q0;
import mo.r;
import mo.s0;
import mo.t0;
import mo.u0;
import mo.v0;
import mo.w0;
import mo.x0;
import mo.y0;
import mo.z0;
import sy.d0Shadow;

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
        h0 c = p1.c(eVar, wVar);
        if (str != null) {
            return new ko.j(str, c);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, w wVar, Object obj) {
        ko.j jVar = (ko.j) obj;
        k.g(fVar, "writer");
        k.g(wVar, "customScalarAdapters");
        k.g(jVar, "value");
        fVar.z0("__typename");
        aa.c.a.b(fVar, wVar, jVar.a);
        List list = p1.a;
        h0 h0Var = jVar.b;
        k.g(fVar, "writer");
        k.g(wVar, "customScalarAdapters");
        k.g(h0Var, "value");
        fVar.z0("__typename");
        aa.c.a.b(fVar, wVar, h0Var.a);
        mo.d dVar = h0Var.b;
        if (dVar != null) {
            l0.d(fVar, wVar, dVar);
        }
        mo.e eVar = h0Var.c;
        if (eVar != null) {
            m0.d(fVar, wVar, eVar);
        }
        mo.f fVar2 = h0Var.d;
        if (fVar2 != null) {
            n0.d(fVar, wVar, fVar2);
        }
        mo.g gVar = h0Var.e;
        if (gVar != null) {
            o0.d(fVar, wVar, gVar);
        }
        mo.h hVar = h0Var.f;
        if (hVar != null) {
            p0.d(fVar, wVar, hVar);
        }
        mo.i iVar = h0Var.g;
        if (iVar != null) {
            q0.d(fVar, wVar, iVar);
        }
        mo.k kVar = h0Var.h;
        if (kVar != null) {
            s0.d(fVar, wVar, kVar);
        }
        l lVar = h0Var.i;
        if (lVar != null) {
            t0.d(fVar, wVar, lVar);
        }
        m mVar = h0Var.j;
        if (mVar != null) {
            u0.d(fVar, wVar, mVar);
        }
        n nVar = h0Var.k;
        if (nVar != null) {
            v0.d(fVar, wVar, nVar);
        }
        o oVar = h0Var.l;
        if (oVar != null) {
            w0.d(fVar, wVar, oVar);
        }
        p pVar = h0Var.m;
        if (pVar != null) {
            x0.d(fVar, wVar, pVar);
        }
        q qVar = h0Var.n;
        if (qVar != null) {
            y0.d(fVar, wVar, qVar);
        }
        r rVar = h0Var.o;
        if (rVar != null) {
            z0.d(fVar, wVar, rVar);
        }
        vx.a aVar = h0Var.p;
        if (aVar != null) {
            vx.b.d(fVar, wVar, aVar);
        }
    }
}
