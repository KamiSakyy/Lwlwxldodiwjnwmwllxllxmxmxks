package ep;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class o2 implements aaShadow.a {
    public static final o2 a = new o2();
    public static final List b = sy.d0Shadow.o("workflowRun", "app", "id", "__typename");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        jo.y4 y4Var = null;
        jo.g4 g4Var = null;
        String str = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                y4Var = (jo.y4) aa.c.b(aa.c.c(e3.a, false)).a(eVar, wVar);
            } else if (r0 == 1) {
                g4Var = (jo.g4) aa.c.b(aa.c.c(n2.a, false)).a(eVar, wVar);
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
            return new jo.h4(y4Var, g4Var, str, str2);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jo.h4 h4Var = (jo.h4) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(h4Var, "value");
        fVar.z0("workflowRun");
        aa.c.b(aa.c.c(e3.a, false)).b(fVar, wVar, h4Var.a);
        fVar.z0("app");
        aa.c.b(aa.c.c(n2.a, false)).b(fVar, wVar, h4Var.b);
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, h4Var.c);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, h4Var.d);
    }
}
