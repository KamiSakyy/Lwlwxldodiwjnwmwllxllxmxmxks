package fd0;

import java.util.List;
import kc0.vb0;
import kc0.wb0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class ww implements aa.a {
    public static final ww a = new ww();
    public static final List b = sy.d0.o(new String[]{"notificationThreads", "id", "__typename"});

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        vb0 vb0Var = null;
        String str = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                vb0Var = (vb0) aa.c.c(vw.a, false).a(eVar, wVar);
            } else if (r0 == 1) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else {
                if (r0 != 2) {
                    break;
                }
                str2 = (String) aa.c.a.a(eVar, wVar);
            }
        }
        if (vb0Var == null) {
            k41.b.B(eVar, "notificationThreads");
            throw null;
        }
        if (str == null) {
            k41.b.B(eVar, "id");
            throw null;
        }
        if (str2 != null) {
            return new wb0(vb0Var, str, str2);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        wb0 wb0Var = (wb0) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(wb0Var, "value");
        fVar.z0("notificationThreads");
        aa.c.c(vw.a, false).b(fVar, wVar, wb0Var.a);
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, wb0Var.b);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, wb0Var.c);
    }
}
