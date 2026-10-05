package sz;

import java.util.List;
import rz.u0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class e0 implements aa.a {
    public static final e0 a = new e0();
    public static final List b = sy.d0.o("id", "projectsV2", "__typename");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        rz.t0 t0Var = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 1) {
                t0Var = (rz.t0) aa.c.c(d0.a, true).a(eVar, wVar);
            } else {
                if (r0 != 2) {
                    break;
                }
                str2 = (String) aa.c.a.a(eVar, wVar);
            }
        }
        if (str == null) {
            k41.b.B(eVar, "id");
            throw null;
        }
        if (t0Var == null) {
            k41.b.B(eVar, "projectsV2");
            throw null;
        }
        if (str2 != null) {
            return new u0(str, t0Var, str2);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        u0 u0Var = (u0) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(u0Var, "value");
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, u0Var.a);
        fVar.z0("projectsV2");
        aa.c.c(d0.a, true).b(fVar, wVar, u0Var.b);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, u0Var.c);
    }
}
