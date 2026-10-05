package z70;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class g8 implements aa.a {
    public static final g8 a = new g8();
    public static final List b = sy.d0.o("id", "login", "avatarUrl", "isViewer", "__typename");

    public final Object a(ea.e eVar, aa.w wVar) {
        Boolean bool;
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        Boolean bool2 = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        while (true) {
            int r0 = eVar.r0(b);
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
                bool2 = (Boolean) aa.c.f.a(eVar, wVar);
            } else {
                if (r0 != 4) {
                    break;
                }
                bool = bool2;
                str4 = (String) aa.c.a.a(eVar, wVar);
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
            k41.b.B(eVar, "avatarUrl");
            throw null;
        }
        if (bool3 == null) {
            k41.b.B(eVar, "isViewer");
            throw null;
        }
        boolean booleanValue = bool3.booleanValue();
        if (str4 != null) {
            return new a8(str, str2, str3, str4, booleanValue);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        a8 a8Var = (a8) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(a8Var, "value");
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, a8Var.a);
        fVar.z0("login");
        bVar.b(fVar, wVar, a8Var.b);
        fVar.z0("avatarUrl");
        bVar.b(fVar, wVar, a8Var.c);
        fVar.z0("isViewer");
        jo.f4.C(a8Var.d, aa.c.f, fVar, wVar, "__typename");
        bVar.b(fVar, wVar, a8Var.e);
    }
}
