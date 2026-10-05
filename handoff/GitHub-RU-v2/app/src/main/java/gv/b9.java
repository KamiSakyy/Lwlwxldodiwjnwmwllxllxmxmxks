package gv;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class b9 implements aa.a {
    public static final List a = x61.l.r(new String[]{"id", "login", "displayName", "avatarUrl", "isViewer"});

    public static t8 c(ea.e eVar, aa.w wVar) {
        Boolean bool;
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        Boolean bool2 = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
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
                str3 = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 3) {
                bool = bool2;
                str4 = (String) aa.c.a.a(eVar, wVar);
            } else {
                if (r0 != 4) {
                    break;
                }
                bool2 = (Boolean) aa.c.f.a(eVar, wVar);
            }
            bool2 = bool;
        }
        Boolean bool3 = bool2;
        if (str == null) {
            k41.b.B(eVar, "id");
            throw null;
        }
        if (str2 == null) {
            k41.b.B(eVar, "login");
            throw null;
        }
        if (str3 == null) {
            k41.b.B(eVar, "displayName");
            throw null;
        }
        if (str4 == null) {
            k41.b.B(eVar, "avatarUrl");
            throw null;
        }
        if (bool3 != null) {
            return new t8(str, str2, str3, str4, bool3.booleanValue());
        }
        k41.b.B(eVar, "isViewer");
        throw null;
    }

    public static void d(ea.f fVar, aa.w wVar, t8 t8Var) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(t8Var, "value");
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, t8Var.a);
        fVar.z0("login");
        bVar.b(fVar, wVar, t8Var.b);
        fVar.z0("displayName");
        bVar.b(fVar, wVar, t8Var.c);
        fVar.z0("avatarUrl");
        bVar.b(fVar, wVar, t8Var.d);
        fVar.z0("isViewer");
        aa.c.f.b(fVar, wVar, Boolean.valueOf(t8Var.e));
    }
}
