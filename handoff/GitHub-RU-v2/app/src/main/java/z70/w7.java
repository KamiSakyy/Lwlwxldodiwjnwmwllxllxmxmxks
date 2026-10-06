package z70;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class w7 implements aa.a {
    public static final List a = x61.l.r(new String[]{"__typename", "id", "viewerDidAuthor", "pendingReviews"});

    public static s7 c(ea.e eVar, aa.w wVar) {
        Boolean bool;
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        Boolean bool2 = null;
        String str = null;
        String str2 = null;
        r7 r7Var = null;
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
                r7Var = (r7) aa.c.b(aa.c.c(v7.a, false)).a(eVar, wVar);
            }
            bool2 = bool;
        }
        eVar.s0();
        l7 c = o7.c(eVar, wVar);
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
            return new s7(str, str2, bool3.booleanValue(), r7Var, c);
        }
        k41.b.B(eVar, "viewerDidAuthor");
        throw null;
    }

    public static void d(ea.f fVar, aa.w wVar, s7 s7Var) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(s7Var, "value");
        fVar.z0("__typename");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, s7Var.a);
        fVar.z0("id");
        bVar.b(fVar, wVar, s7Var.b);
        fVar.z0("viewerDidAuthor");
        jo.f4Shadow.C(s7Var.c, aa.c.f, fVar, wVar, "pendingReviews");
        aa.c.b(aa.c.c(v7.a, false)).b(fVar, wVar, s7Var.d);
        List list = o7.a;
        o7.d(fVar, wVar, s7Var.e);
    }
}
