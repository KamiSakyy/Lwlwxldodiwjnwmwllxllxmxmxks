package gv;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class l6 implements aa.a {
    public static final l6 a = new l6();
    public static final List b = sy.d0.o("workflowRun", "app", "id", "__typename");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        f6 f6Var = null;
        u4 u4Var = null;
        String str = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                f6Var = (f6) aa.c.b(aa.c.c(t7.a, false)).a(eVar, wVar);
            } else if (r0 == 1) {
                u4Var = (u4) aa.c.b(aa.c.c(h6.a, false)).a(eVar, wVar);
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
            return new y4(f6Var, u4Var, str, str2);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        y4 y4Var = (y4) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(y4Var, "value");
        fVar.z0("workflowRun");
        aa.c.b(aa.c.c(t7.a, false)).b(fVar, wVar, y4Var.a);
        fVar.z0("app");
        aa.c.b(aa.c.c(h6.a, false)).b(fVar, wVar, y4Var.b);
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, y4Var.c);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, y4Var.d);
    }
}
