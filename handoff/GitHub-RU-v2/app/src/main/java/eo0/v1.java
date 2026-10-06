package eo0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class v1 implements aaShadow.a {
    public static final v1 a = new v1();
    public static final List b = sy.d0.o(new String[]{"pageInfo", "totalCount", "nodes"});

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        jn0.a3 a3Var = null;
        Integer num = null;
        List list = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                a3Var = (jn0.a3) aa.c.c(t1.a, false).a(eVar, wVar);
            } else if (r0 == 1) {
                long nextLong = eVar.nextLong();
                if (nextLong > 2147483647L) {
                    while (nextLong > 2147483647L) {
                        nextLong = jo.f4.c(1, nextLong, "substring(...)");
                    }
                    num = Integer.valueOf((int) nextLong);
                } else {
                    num = Integer.valueOf((int) nextLong);
                }
            } else {
                if (r0 != 2) {
                    break;
                }
                list = (List) aa.c.b(aa.c.a(aa.c.b(aa.c.c(p1.a, true)))).a(eVar, wVar);
            }
        }
        if (a3Var == null) {
            k41.b.B(eVar, "pageInfo");
            throw null;
        }
        if (num != null) {
            return new jn0.c3(a3Var, num.intValue(), list);
        }
        k41.b.B(eVar, "totalCount");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jn0.c3 c3Var = (jn0.c3) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(c3Var, "value");
        fVar.z0("pageInfo");
        aa.c.c(t1.a, false).b(fVar, wVar, c3Var.a);
        fVar.z0("totalCount");
        fVar.z(c3Var.b);
        fVar.z0("nodes");
        aa.c.b(aa.c.a(aa.c.b(aa.c.c(p1.a, true)))).b(fVar, wVar, c3Var.c);
    }
}
