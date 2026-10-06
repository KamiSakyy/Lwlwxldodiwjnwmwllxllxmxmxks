package gb0;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class u0 implements aa.a {
    public static final u0 a = new u0();
    public static final List b = sy.d0Shadow.o("notificationListsWithThreadCount", "id", "__typename");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        fb0.u0 u0Var = null;
        String str = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                u0Var = (fb0.u0) aa.c.c(r0.a, false).a(eVar, wVar);
            } else if (r0 == 1) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else {
                if (r0 != 2) {
                    break;
                }
                str2 = (String) aa.c.a.a(eVar, wVar);
            }
        }
        if (u0Var == null) {
            k41.b.B(eVar, "notificationListsWithThreadCount");
            throw null;
        }
        if (str == null) {
            k41.b.B(eVar, "id");
            throw null;
        }
        if (str2 != null) {
            return new fb0.x0(u0Var, str, str2);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        fb0.x0 x0Var = (fb0.x0) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(x0Var, "value");
        fVar.z0("notificationListsWithThreadCount");
        aa.c.c(r0.a, false).b(fVar, wVar, x0Var.a);
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, x0Var.b);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, x0Var.c);
    }
}
