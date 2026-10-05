package fd0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class ib implements aa.a {
    public static final ib a = new ib();
    public static final List b = sy.d0.o(new String[]{"__typename", "id", "login", "isEmployee"});

    public final Object a(ea.e eVar, aa.w wVar) {
        Boolean bool;
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        Boolean bool2 = null;
        String str = null;
        String str2 = null;
        String str3 = null;
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
            } else {
                if (r0 != 3) {
                    break;
                }
                bool2 = (Boolean) aa.c.f.a(eVar, wVar);
            }
            bool2 = bool;
        }
        eVar.s0();
        ud0.c c = ud0.d.c(eVar, wVar);
        eVar.s0();
        wk0.z c2 = wk0.b0.c(eVar, wVar);
        Boolean bool3 = bool2;
        if (str == null) {
            k41.b.B(eVar, "__typename");
            throw null;
        }
        if (str2 == null) {
            k41.b.B(eVar, "id");
            throw null;
        }
        if (str3 == null) {
            k41.b.B(eVar, "login");
            throw null;
        }
        if (bool3 != null) {
            return new kc0.qg(str, str2, str3, bool3.booleanValue(), c, c2);
        }
        k41.b.B(eVar, "isEmployee");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        kc0.qg qgVar = (kc0.qg) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(qgVar, "value");
        fVar.z0("__typename");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, qgVar.a);
        fVar.z0("id");
        bVar.b(fVar, wVar, qgVar.b);
        fVar.z0("login");
        bVar.b(fVar, wVar, qgVar.c);
        fVar.z0("isEmployee");
        aa.c.f.b(fVar, wVar, Boolean.valueOf(qgVar.d));
        List list = ud0.d.a;
        ud0.d.d(fVar, wVar, qgVar.e);
        List list2 = wk0.b0.a;
        wk0.z zVar = qgVar.f;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(zVar, "value");
        fVar.z0("recentInteractions");
        aa.c.a(aa.c.c(wk0.j0.a, false)).e(fVar, wVar, zVar.a);
        fVar.z0("id");
        aa.b bVar2 = aa.c.a;
        bVar2.b(fVar, wVar, zVar.b);
        fVar.z0("__typename");
        bVar2.b(fVar, wVar, zVar.c);
    }
}
