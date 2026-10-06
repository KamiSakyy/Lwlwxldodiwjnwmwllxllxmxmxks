package xt0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class z5 implements aa.a {
    public static final z5 a = new z5();
    public static final List b = sy.d0Shadow.o(new String[]{"workflowRun", "app", "id", "__typename"});

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        t5 t5Var = null;
        k4 k4Var = null;
        String str = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                t5Var = (t5) aa.c.b(aa.c.c(f7.a, false)).a(eVar, wVar);
            } else if (r0 == 1) {
                k4Var = (k4) aa.c.b(aa.c.c(v5.a, false)).a(eVar, wVar);
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
            return new o4(t5Var, k4Var, str, str2);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        o4 o4Var = (o4) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(o4Var, "value");
        fVar.z0("workflowRun");
        aa.c.b(aa.c.c(f7.a, false)).b(fVar, wVar, o4Var.a);
        fVar.z0("app");
        aa.c.b(aa.c.c(v5.a, false)).b(fVar, wVar, o4Var.b);
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, o4Var.c);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, o4Var.d);
    }
}
