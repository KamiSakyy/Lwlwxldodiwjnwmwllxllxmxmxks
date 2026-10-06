package ay;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class w implements aa.a {
    public static final w a = new w();
    public static final List b = sy.d0Shadow.o("workflowRun", "app", "id", "__typename");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        zx.a1 a1Var = null;
        zx.j0 j0Var = null;
        String str = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                a1Var = (zx.a1) aa.c.b(aa.c.c(l0.a, false)).a(eVar, wVar);
            } else if (r0 == 1) {
                j0Var = (zx.j0) aa.c.b(aa.c.c(v.a, false)).a(eVar, wVar);
            } else if (r0 == 2) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else {
                if (r0 != 3) {
                    break;
                }
                str2 = (String) aa.c.a.a(eVar, wVar);
            }
        }
        if (str == null) {
            k41.b.B(eVar, "id");
            throw null;
        }
        if (str2 != null) {
            return new zx.k0(a1Var, j0Var, str, str2);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        zx.k0 k0Var = (zx.k0) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(k0Var, "value");
        fVar.z0("workflowRun");
        aa.c.b(aa.c.c(l0.a, false)).b(fVar, wVar, k0Var.a);
        fVar.z0("app");
        aa.c.b(aa.c.c(v.a, false)).b(fVar, wVar, k0Var.b);
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, k0Var.c);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, k0Var.d);
    }
    public Object e(Object p1) { return null; }
}
