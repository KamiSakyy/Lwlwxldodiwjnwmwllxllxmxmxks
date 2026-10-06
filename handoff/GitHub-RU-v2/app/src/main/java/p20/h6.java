package p20;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class h6 implements aaShadow.a {
    public static final h6 a = new h6();
    public static final List b = sy.d0Shadow.o("pageInfo", "nodes");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        u10.o9 o9Var = null;
        List list = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                o9Var = (u10.o9) aa.c.c(j6.a, false).a(eVar, wVar);
            } else {
                if (r0 != 1) {
                    break;
                }
                list = (List) aa.c.b(aa.c.a(aa.c.b(aa.c.c(i6.a, true)))).a(eVar, wVar);
            }
        }
        if (o9Var != null) {
            return new u10.m9(o9Var, list);
        }
        k41.b.B(eVar, "pageInfo");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        u10.m9 m9Var = (u10.m9) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(m9Var, "value");
        fVar.z0("pageInfo");
        aa.c.c(j6.a, false).b(fVar, wVar, m9Var.a);
        fVar.z0("nodes");
        aa.c.b(aa.c.a(aa.c.b(aa.c.c(i6.a, true)))).b(fVar, wVar, m9Var.b);
    }
}
