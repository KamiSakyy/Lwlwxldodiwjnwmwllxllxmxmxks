package fd0;

import java.util.List;
import kc0.k60;
import kc0.p60;
import kc0.q60;

/* loaded from: /home/user/work/p/classes4.dex */
public final class gt implements aaShadow.a {
    public static final gt a = new gt();
    public static final List b = sy.d0Shadow.o(new String[]{"column", "project", "id", "__typename"});

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        k60 k60Var = null;
        q60 q60Var = null;
        String str = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                k60Var = (k60) aa.c.b(aa.c.c(ct.a, false)).a(eVar, wVar);
            } else if (r0 == 1) {
                q60Var = (q60) aa.c.c(ht.a, false).a(eVar, wVar);
            } else if (r0 == 2) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else {
                if (r0 != 3) {
                    break;
                }
                str2 = (String) aa.c.a.a(eVar, wVar);
            }
        }
        if (q60Var == null) {
            k41.b.B(eVar, "project");
            throw null;
        }
        if (str == null) {
            k41.b.B(eVar, "id");
            throw null;
        }
        if (str2 != null) {
            return new p60(k60Var, q60Var, str, str2);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        p60 p60Var = (p60) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(p60Var, "value");
        fVar.z0("column");
        aa.c.b(aa.c.c(ct.a, false)).b(fVar, wVar, p60Var.a);
        fVar.z0("project");
        aa.c.c(ht.a, false).b(fVar, wVar, p60Var.b);
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, p60Var.c);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, p60Var.d);
    }
}
