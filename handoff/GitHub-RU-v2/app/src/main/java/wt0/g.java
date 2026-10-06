package wt0;

import aa.w;
import java.util.List;
import jo.f4Shadow;
import k71.k;
import sy.d0Shadow;
import vt0.j;
import xt0.j8;
import xt0.m8;
import xt0.o8;
import xt0.p8;

/* loaded from: /home/user/work/p/classes4.dex */
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
        j8 c = p8.c(eVar, wVar);
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
        List list = p8.a;
        j8 j8Var = jVar.b;
        k.g(fVar, "writer");
        k.g(wVar, "customScalarAdapters");
        k.g(j8Var, "value");
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, j8Var.a);
        fVar.z0("viewerDidAuthor");
        f4Shadow.C(j8Var.b, aa.c.f, fVar, wVar, "viewerLatestReviewRequest");
        aa.c.b(aa.c.c(o8.a, false)).b(fVar, wVar, j8Var.c);
        fVar.z0("pendingReviews");
        aa.c.b(aa.c.c(m8.a, false)).b(fVar, wVar, j8Var.d);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, j8Var.e);
    }
}
