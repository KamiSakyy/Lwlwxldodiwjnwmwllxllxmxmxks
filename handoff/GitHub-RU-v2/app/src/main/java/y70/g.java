package y70;

import aa.w;
import java.util.List;
import jo.f4;
import k71.k;
import sy.d0;
import x70.j;
import z70.c8;
import z70.f8;
import z70.h8;
import z70.i8;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class g implements aa.a {
    public static final List a = d0.n("__typename");

    public static j c(ea.e eVar, w wVar) {
        k.g(eVar, "reader");
        k.g(wVar, "customScalarAdapters");
        String str = null;
        while (eVar.r0(a) == 0) {
            str = (String) aa.c.a.a(eVar, wVar);
        }
        eVar.s0();
        c8 c = i8.c(eVar, wVar);
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
        List list = i8.a;
        c8 c8Var = jVar.b;
        k.g(fVar, "writer");
        k.g(wVar, "customScalarAdapters");
        k.g(c8Var, "value");
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, c8Var.a);
        fVar.z0("viewerDidAuthor");
        f4.C(c8Var.b, aa.c.f, fVar, wVar, "viewerLatestReviewRequest");
        aa.c.b(aa.c.c(h8.a, false)).b(fVar, wVar, c8Var.c);
        fVar.z0("pendingReviews");
        aa.c.b(aa.c.c(f8.a, false)).b(fVar, wVar, c8Var.d);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, c8Var.e);
    }
}
