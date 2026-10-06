package eo0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class o1 implements aaShadow.a {
    public static final o1 a = new o1();
    public static final List b = sy.d0Shadow.o(new String[]{"viewer", "node", "id", "__typename"});

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        jn0.d3 d3Var = null;
        jn0.x2 x2Var = null;
        String str = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                d3Var = (jn0.d3) aa.c.c(w1.a, true).a(eVar, wVar);
            } else if (r0 == 1) {
                x2Var = (jn0.x2) aa.c.b(aa.c.c(q1.a, true)).a(eVar, wVar);
            } else if (r0 == 2) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else {
                if (r0 != 3) {
                    break;
                }
                str2 = (String) aa.c.a.a(eVar, wVar);
            }
        }
        if (d3Var == null) {
            k41.b.B(eVar, "viewer");
            throw null;
        }
        if (str == null) {
            k41.b.B(eVar, "id");
            throw null;
        }
        if (str2 != null) {
            return new jn0.v2(d3Var, x2Var, str, str2);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jn0.v2 v2Var = (jn0.v2) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(v2Var, "value");
        fVar.z0("viewer");
        aa.c.c(w1.a, true).b(fVar, wVar, v2Var.a);
        fVar.z0("node");
        aa.c.b(aa.c.c(q1.a, true)).b(fVar, wVar, v2Var.b);
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, v2Var.c);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, v2Var.d);
    }
}
