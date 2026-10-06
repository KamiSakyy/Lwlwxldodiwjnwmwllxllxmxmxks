package eo0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class hp implements aaShadow.a {
    public static final hp a = new hp();
    public static final List b = sy.d0.o(new String[]{"pageInfo", "nodes"});

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        jn0.i00 i00Var = null;
        List list = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                i00Var = (jn0.i00) aa.c.c(jp.a, false).a(eVar, wVar);
            } else {
                if (r0 != 1) {
                    break;
                }
                list = (List) aa.c.b(aa.c.a(aa.c.b(aa.c.c(ip.a, false)))).a(eVar, wVar);
            }
        }
        if (i00Var != null) {
            return new jn0.g00(i00Var, list);
        }
        k41.b.B(eVar, "pageInfo");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jn0.g00 g00Var = (jn0.g00) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(g00Var, "value");
        fVar.z0("pageInfo");
        aa.c.c(jp.a, false).b(fVar, wVar, g00Var.a);
        fVar.z0("nodes");
        aa.c.b(aa.c.a(aa.c.b(aa.c.c(ip.a, false)))).b(fVar, wVar, g00Var.b);
    }
}
