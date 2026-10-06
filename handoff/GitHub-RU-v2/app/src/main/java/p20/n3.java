package p20;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class n3 implements aaShadow.a {
    public static final n3 a = new n3();
    public static final List b = sy.d0.o("pageInfo", "nodes");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        u10.v5 v5Var = null;
        List list = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                v5Var = (u10.v5) aa.c.c(u3.a, false).a(eVar, wVar);
            } else {
                if (r0 != 1) {
                    break;
                }
                list = (List) aa.c.b(aa.c.a(aa.c.b(aa.c.c(p3.a, true)))).a(eVar, wVar);
            }
        }
        if (v5Var != null) {
            return new u10.o5(v5Var, list);
        }
        k41.b.B(eVar, "pageInfo");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        u10.o5 o5Var = (u10.o5) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(o5Var, "value");
        fVar.z0("pageInfo");
        aa.c.c(u3.a, false).b(fVar, wVar, o5Var.a);
        fVar.z0("nodes");
        aa.c.b(aa.c.a(aa.c.b(aa.c.c(p3.a, true)))).b(fVar, wVar, o5Var.b);
    }
}
