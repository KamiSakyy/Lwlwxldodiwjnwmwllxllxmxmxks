package fd0;

import java.util.List;
import kc0.oc0;
import kc0.qc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class hx implements aa.a {
    public static final hx a = new hx();
    public static final List b = sy.d0.o(new String[]{"organizations", "id", "__typename"});

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        oc0 oc0Var = null;
        String str = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                oc0Var = (oc0) aa.c.c(fx.a, false).a(eVar, wVar);
            } else if (r0 == 1) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else {
                if (r0 != 2) {
                    break;
                }
                str2 = (String) aa.c.a.a(eVar, wVar);
            }
        }
        if (oc0Var == null) {
            k41.b.B(eVar, "organizations");
            throw null;
        }
        if (str == null) {
            k41.b.B(eVar, "id");
            throw null;
        }
        if (str2 != null) {
            return new qc0(oc0Var, str, str2);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        qc0 qc0Var = (qc0) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(qc0Var, "value");
        fVar.z0("organizations");
        aa.c.c(fx.a, false).b(fVar, wVar, qc0Var.a);
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, qc0Var.b);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, qc0Var.c);
    }
}
