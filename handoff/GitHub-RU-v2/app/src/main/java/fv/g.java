package fv;

import aa.w;
import ev.j;
import gv.c9;
import gv.e9;
import gv.f9;
import gv.x8;
import java.util.List;
import jo.f4Shadow;
import k71.k;
import sy.d0Shadow;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class g implements aa.a {
    public static final List a = d0Shadow.n("__typename");

    public static j c(ea.e eVar, w wVar) {
        k.g(eVar, "reader");
        k.g(wVar, "customScalarAdapters");
        String str = null;
        while (eVar.r0(a) == 0) {
            str = (String) aa.c.a.a(eVar, wVar);
        }
        eVar.s0();
        x8 c = f9.c(eVar, wVar);
        if (str != null) {
            return new j(str, c);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public static void d(ea.f fVar, w wVar, j jVar) {
        k.g(fVar, "writer");
        k.g(wVar, "customScalarAdapters");
        k.g(jVar, "value");
        fVar.z0("__typename");
        aa.c.a.b(fVar, wVar, jVar.a);
        List list = f9.a;
        x8 x8Var = jVar.b;
        k.g(fVar, "writer");
        k.g(wVar, "customScalarAdapters");
        k.g(x8Var, "value");
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, x8Var.a);
        fVar.z0("viewerDidAuthor");
        f4Shadow.C(x8Var.b, aa.c.f, fVar, wVar, "viewerLatestReviewRequest");
        aa.c.b(aa.c.c(e9.a, false)).b(fVar, wVar, x8Var.c);
        fVar.z0("pendingReviews");
        aa.c.b(aa.c.c(c9.a, false)).b(fVar, wVar, x8Var.d);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, x8Var.e);
    }

}
