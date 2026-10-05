package p20;

import java.util.List;
import u10.oa0;
import u10.qa0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class vv implements aa.a {
    public static final vv a = new vv();
    public static final List b = sy.d0.o("organizations", "id", "__typename");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        oa0 oa0Var = null;
        String str = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                oa0Var = (oa0) aa.c.c(tv.a, false).a(eVar, wVar);
            } else if (r0 == 1) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else {
                if (r0 != 2) {
                    break;
                }
                str2 = (String) aa.c.a.a(eVar, wVar);
            }
        }
        if (oa0Var == null) {
            k41.b.B(eVar, "organizations");
            throw null;
        }
        if (str == null) {
            k41.b.B(eVar, "id");
            throw null;
        }
        if (str2 != null) {
            return new qa0(oa0Var, str, str2);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        qa0 qa0Var = (qa0) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(qa0Var, "value");
        fVar.z0("organizations");
        aa.c.c(tv.a, false).b(fVar, wVar, qa0Var.a);
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, qa0Var.b);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, qa0Var.c);
    }
}
