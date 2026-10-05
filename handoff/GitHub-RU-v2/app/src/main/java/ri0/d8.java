package ri0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class d8 implements aa.a {
    public static final List a = x61.l.r(new String[]{"id", "viewerLatestReviewRequest", "__typename"});

    public static a8 c(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        z7 z7Var = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(a);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 1) {
                z7Var = (z7) aa.c.b(aa.c.c(c8.a, false)).a(eVar, wVar);
            } else {
                if (r0 != 2) {
                    break;
                }
                str2 = (String) aa.c.a.a(eVar, wVar);
            }
        }
        if (str == null) {
            k41.b.B(eVar, "id");
            throw null;
        }
        if (str2 != null) {
            return new a8(str, z7Var, str2);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public static void d(ea.f fVar, aa.w wVar, a8 a8Var) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(a8Var, "value");
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, a8Var.a);
        fVar.z0("viewerLatestReviewRequest");
        aa.c.b(aa.c.c(c8.a, false)).b(fVar, wVar, a8Var.b);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, a8Var.c);
    }
}
