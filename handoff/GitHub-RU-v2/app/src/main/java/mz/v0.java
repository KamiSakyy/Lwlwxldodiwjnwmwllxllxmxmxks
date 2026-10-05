package mz;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class v0 implements aa.a {
    public static final v0 a = new v0();
    public static final List b = sy.d0.o("notificationListsWithThreadCount", "id", "__typename");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        lz.v0 v0Var = null;
        String str = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                v0Var = (lz.v0) aa.c.c(s0.a, false).a(eVar, wVar);
            } else if (r0 == 1) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else {
                if (r0 != 2) {
                    break;
                }
                str2 = (String) aa.c.a.a(eVar, wVar);
            }
        }
        if (v0Var == null) {
            k41.b.B(eVar, "notificationListsWithThreadCount");
            throw null;
        }
        if (str == null) {
            k41.b.B(eVar, "id");
            throw null;
        }
        if (str2 != null) {
            return new lz.y0(v0Var, str, str2);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        lz.y0 y0Var = (lz.y0) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(y0Var, "value");
        fVar.z0("notificationListsWithThreadCount");
        aa.c.c(s0.a, false).b(fVar, wVar, y0Var.a);
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, y0Var.b);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, y0Var.c);
    }
}
