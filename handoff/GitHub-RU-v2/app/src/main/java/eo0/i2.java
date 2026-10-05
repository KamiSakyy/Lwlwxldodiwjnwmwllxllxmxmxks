package eo0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class i2 implements aa.a {
    public static final i2 a = new i2();
    public static final List b = sy.d0.o(new String[]{"workflowRun", "app", "id", "__typename"});

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        jn0.p4 p4Var = null;
        jn0.x3 x3Var = null;
        String str = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                p4Var = (jn0.p4) aa.c.b(aa.c.c(y2.a, false)).a(eVar, wVar);
            } else if (r0 == 1) {
                x3Var = (jn0.x3) aa.c.b(aa.c.c(h2.a, false)).a(eVar, wVar);
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
            return new jn0.y3(p4Var, x3Var, str, str2);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jn0.y3 y3Var = (jn0.y3) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(y3Var, "value");
        fVar.z0("workflowRun");
        aa.c.b(aa.c.c(y2.a, false)).b(fVar, wVar, y3Var.a);
        fVar.z0("app");
        aa.c.b(aa.c.c(h2.a, false)).b(fVar, wVar, y3Var.b);
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, y3Var.c);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, y3Var.d);
    }
}
