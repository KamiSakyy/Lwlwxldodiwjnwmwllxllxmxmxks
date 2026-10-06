package fd0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class e3 implements aaShadow.a {
    public static final e3 a = new e3();
    public static final List b = sy.d0Shadow.o(new String[]{"pageInfo", "nodes"});

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        kc0.f5 f5Var = null;
        List list = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                f5Var = (kc0.f5) aa.c.c(i3.a, false).a(eVar, wVar);
            } else {
                if (r0 != 1) {
                    break;
                }
                list = (List) aa.c.b(aa.c.a(aa.c.b(aa.c.c(h3.a, false)))).a(eVar, wVar);
            }
        }
        if (f5Var != null) {
            return new kc0.a5(f5Var, list);
        }
        k41.b.B(eVar, "pageInfo");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        kc0.a5 a5Var = (kc0.a5) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(a5Var, "value");
        fVar.z0("pageInfo");
        aa.c.c(i3.a, false).b(fVar, wVar, a5Var.a);
        fVar.z0("nodes");
        aa.c.b(aa.c.a(aa.c.b(aa.c.c(h3.a, false)))).b(fVar, wVar, a5Var.b);
    }
}
