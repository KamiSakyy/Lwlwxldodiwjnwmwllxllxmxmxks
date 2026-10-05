package oj0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class k3 implements aa.a {
    public static final k3 a = new k3();
    public static final List b = sy.d0.o(new String[]{"column", "project", "id", "__typename"});

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        b3 b3Var = null;
        e3 e3Var = null;
        String str = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                b3Var = (b3) aa.c.b(aa.c.c(i3.a, false)).a(eVar, wVar);
            } else if (r0 == 1) {
                e3Var = (e3) aa.c.c(l3.a, false).a(eVar, wVar);
            } else if (r0 == 2) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else {
                if (r0 != 3) {
                    break;
                }
                str2 = (String) aa.c.a.a(eVar, wVar);
            }
        }
        if (e3Var == null) {
            k41.b.B(eVar, "project");
            throw null;
        }
        if (str == null) {
            k41.b.B(eVar, "id");
            throw null;
        }
        if (str2 != null) {
            return new d3(b3Var, e3Var, str, str2);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        d3 d3Var = (d3) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(d3Var, "value");
        fVar.z0("column");
        aa.c.b(aa.c.c(i3.a, false)).b(fVar, wVar, d3Var.a);
        fVar.z0("project");
        aa.c.c(l3.a, false).b(fVar, wVar, d3Var.b);
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, d3Var.c);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, d3Var.d);
    }
}
