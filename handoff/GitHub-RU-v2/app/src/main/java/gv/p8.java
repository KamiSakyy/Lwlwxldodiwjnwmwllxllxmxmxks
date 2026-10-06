package gv;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class p8 implements aa.a {
    public static final List a = x61.l.r(new String[]{"__typename", "id", "viewerDidAuthor", "pendingReviews"});

    public static l8 c(ea.e eVar, aa.w wVar) {
        Boolean bool;
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        Boolean bool2 = null;
        String str = null;
        String str2 = null;
        k8 k8Var = null;
        while (true) {
            int r0 = eVar.r0(a);
            if (r0 == 0) {
                bool = bool2;
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 1) {
                bool = bool2;
                str2 = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 2) {
                bool2 = (Boolean) aa.c.f.a(eVar, wVar);
            } else {
                if (r0 != 3) {
                    break;
                }
                bool = bool2;
                k8Var = (k8) aa.c.b(aa.c.c(o8.a, false)).a(eVar, wVar);
            }
            bool2 = bool;
        }
        eVar.s0();
        f8 c = h8.c(eVar, wVar);
        Boolean bool3 = bool2;
        if (str == null) {
            k41.b.B(eVar, "__typename");
            throw null;
        }
        if (str2 == null) {
            k41.b.B(eVar, "id");
            throw null;
        }
        if (bool3 != null) {
            return new l8(str, str2, bool3.booleanValue(), k8Var, c);
        }
        k41.b.B(eVar, "viewerDidAuthor");
        throw null;
    }

    public static void d(ea.f fVar, aa.w wVar, l8 l8Var) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(l8Var, "value");
        fVar.z0("__typename");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, l8Var.a);
        fVar.z0("id");
        bVar.b(fVar, wVar, l8Var.b);
        fVar.z0("viewerDidAuthor");
        jo.f4Shadow.C(l8Var.c, aa.c.f, fVar, wVar, "pendingReviews");
        aa.c.b(aa.c.c(o8.a, false)).b(fVar, wVar, l8Var.d);
        List list = h8.a;
        h8.d(fVar, wVar, l8Var.e);
    }
}
