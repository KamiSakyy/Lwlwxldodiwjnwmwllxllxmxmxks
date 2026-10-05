package p20;

import java.util.List;
import u10.v90;
import u10.w90;

/* loaded from: /home/user/work/p/classes3.dex */
public final class kv implements aa.a {
    public static final kv a = new kv();
    public static final List b = sy.d0.o("notificationThreads", "id", "__typename");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        v90 v90Var = null;
        String str = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                v90Var = (v90) aa.c.c(jv.a, false).a(eVar, wVar);
            } else if (r0 == 1) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else {
                if (r0 != 2) {
                    break;
                }
                str2 = (String) aa.c.a.a(eVar, wVar);
            }
        }
        if (v90Var == null) {
            k41.b.B(eVar, "notificationThreads");
            throw null;
        }
        if (str == null) {
            k41.b.B(eVar, "id");
            throw null;
        }
        if (str2 != null) {
            return new w90(v90Var, str, str2);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        w90 w90Var = (w90) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(w90Var, "value");
        fVar.z0("notificationThreads");
        aa.c.c(jv.a, false).b(fVar, wVar, w90Var.a);
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, w90Var.b);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, w90Var.c);
    }
}
