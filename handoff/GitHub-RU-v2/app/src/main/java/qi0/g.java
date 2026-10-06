package qi0;

import aa.w;
import java.util.List;
import jo.f4Shadow;
import k71.k;
import pi0.j;
import ri0.r8;
import ri0.u8;
import ri0.w8;
import ri0.x8;
import sy.d0Shadow;

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
        r8 c = x8.c(eVar, wVar);
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
        List list = x8.a;
        r8 r8Var = jVar.b;
        k.g(fVar, "writer");
        k.g(wVar, "customScalarAdapters");
        k.g(r8Var, "value");
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, r8Var.a);
        fVar.z0("viewerDidAuthor");
        f4Shadow.C(r8Var.b, aa.c.f, fVar, wVar, "viewerLatestReviewRequest");
        aa.c.b(aa.c.c(w8.a, false)).b(fVar, wVar, r8Var.c);
        fVar.z0("pendingReviews");
        aa.c.b(aa.c.c(u8.a, false)).b(fVar, wVar, r8Var.d);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, r8Var.e);
    }
}
