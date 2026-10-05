package xt0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class d8 implements aa.a {
    public static final List a = x61.l.r(new String[]{"__typename", "id", "viewerDidAuthor", "pendingReviews"});

    public static z7 c(ea.e eVar, aa.w wVar) {
        Boolean bool;
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        Boolean bool2 = null;
        String str = null;
        String str2 = null;
        y7 y7Var = null;
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
                y7Var = (y7) aa.c.b(aa.c.c(c8.a, false)).a(eVar, wVar);
            }
            bool2 = bool;
        }
        eVar.s0();
        s7 c = v7.c(eVar, wVar);
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
            return new z7(str, str2, bool3.booleanValue(), y7Var, c);
        }
        k41.b.B(eVar, "viewerDidAuthor");
        throw null;
    }

    public static void d(ea.f fVar, aa.w wVar, z7 z7Var) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(z7Var, "value");
        fVar.z0("__typename");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, z7Var.a);
        fVar.z0("id");
        bVar.b(fVar, wVar, z7Var.b);
        fVar.z0("viewerDidAuthor");
        jo.f4.C(z7Var.c, aa.c.f, fVar, wVar, "pendingReviews");
        aa.c.b(aa.c.c(c8.a, false)).b(fVar, wVar, z7Var.d);
        List list = v7.a;
        v7.d(fVar, wVar, z7Var.e);
    }
}
