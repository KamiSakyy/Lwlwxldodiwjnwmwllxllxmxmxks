package fd0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class r1 implements aaShadow.a {
    public static final r1 a = new r1();
    public static final List b = sy.d0Shadow.o(new String[]{"pageInfo", "totalCount", "nodes"});

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        kc0.u2 u2Var = null;
        Integer num = null;
        List list = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                u2Var = (kc0.u2) aa.c.c(p1.a, false).a(eVar, wVar);
            } else if (r0 == 1) {
                long nextLong = eVar.nextLong();
                if (nextLong > 2147483647L) {
                    while (nextLong > 2147483647L) {
                        nextLong = jo.f4Shadow.c(1, nextLong, "substring(...)");
                    }
                    num = Integer.valueOf((int) nextLong);
                } else {
                    num = Integer.valueOf((int) nextLong);
                }
            } else {
                if (r0 != 2) {
                    break;
                }
                list = (List) aa.c.b(aa.c.a(aa.c.b(aa.c.c(l1.a, true)))).a(eVar, wVar);
            }
        }
        if (u2Var == null) {
            k41.b.B(eVar, "pageInfo");
            throw null;
        }
        if (num != null) {
            return new kc0.w2(u2Var, num.intValue(), list);
        }
        k41.b.B(eVar, "totalCount");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        kc0.w2 w2Var = (kc0.w2) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(w2Var, "value");
        fVar.z0("pageInfo");
        aa.c.c(p1.a, false).b(fVar, wVar, w2Var.a);
        fVar.z0("totalCount");
        fVar.z(w2Var.b);
        fVar.z0("nodes");
        aa.c.b(aa.c.a(aa.c.b(aa.c.c(l1.a, true)))).b(fVar, wVar, w2Var.c);
    }
}
