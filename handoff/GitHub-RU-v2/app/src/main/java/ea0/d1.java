package ea0;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class d1 implements aa.a {
    public static final List a = x61.l.r(new String[]{"__typename", "id", "name", "login", "bioHTML", "viewerIsFollowing"});

    public static c1 c(ea.e eVar, aa.w wVar) {
        Boolean bool;
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        Boolean bool2 = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        while (true) {
            int r0 = eVar.r0(a);
            if (r0 == 0) {
                bool = bool2;
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 1) {
                bool = bool2;
                str2 = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 2) {
                bool = bool2;
                str3 = (String) aa.c.i.a(eVar, wVar);
            } else if (r0 == 3) {
                bool = bool2;
                str4 = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 4) {
                bool = bool2;
                str5 = (String) aa.c.a.a(eVar, wVar);
            } else {
                if (r0 != 5) {
                    break;
                }
                bool2 = (Boolean) aa.c.f.a(eVar, wVar);
            }
            bool2 = bool;
        }
        eVar.s0();
        e30.c c = e30.d.c(eVar, wVar);
        Boolean bool3 = bool2;
        if (str == null) {
            k41.b.B(eVar, "__typename");
            throw null;
        }
        if (str2 == null) {
            k41.b.B(eVar, "id");
            throw null;
        }
        if (str4 == null) {
            k41.b.B(eVar, "login");
            throw null;
        }
        if (str5 == null) {
            k41.b.B(eVar, "bioHTML");
            throw null;
        }
        if (bool3 != null) {
            return new c1(str, str2, str3, str4, str5, bool3.booleanValue(), c);
        }
        k41.b.B(eVar, "viewerIsFollowing");
        throw null;
    }

    public static void d(ea.f fVar, aa.w wVar, c1 c1Var) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(c1Var, "value");
        fVar.z0("__typename");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, c1Var.a);
        fVar.z0("id");
        bVar.b(fVar, wVar, c1Var.b);
        fVar.z0("name");
        aa.c.i.b(fVar, wVar, c1Var.c);
        fVar.z0("login");
        bVar.b(fVar, wVar, c1Var.d);
        fVar.z0("bioHTML");
        bVar.b(fVar, wVar, c1Var.e);
        fVar.z0("viewerIsFollowing");
        aa.c.f.b(fVar, wVar, Boolean.valueOf(c1Var.f));
        List list = e30.d.a;
        e30.d.d(fVar, wVar, c1Var.g);
    }
}
