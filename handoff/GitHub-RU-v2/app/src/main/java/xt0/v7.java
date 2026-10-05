package xt0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class v7 implements aa.a {
    public static final List a = x61.l.r(new String[]{"id", "viewerLatestReviewRequest", "__typename"});

    public static s7 c(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        r7 r7Var = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(a);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 1) {
                r7Var = (r7) aa.c.b(aa.c.c(u7.a, false)).a(eVar, wVar);
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
            return new s7(str, r7Var, str2);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public static void d(ea.f fVar, aa.w wVar, s7 s7Var) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(s7Var, "value");
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, s7Var.a);
        fVar.z0("viewerLatestReviewRequest");
        aa.c.b(aa.c.c(u7.a, false)).b(fVar, wVar, s7Var.b);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, s7Var.c);
    }
}
