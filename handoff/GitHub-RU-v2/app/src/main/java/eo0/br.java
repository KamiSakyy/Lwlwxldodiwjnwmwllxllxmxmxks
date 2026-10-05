package eo0;

import java.util.List;
import jn0.r20;
import jn0.u20;

/* loaded from: /home/user/work/p/classes4.dex */
public final class br implements aa.a {
    public static final br a = new br();
    public static final List b = sy.d0.o(new String[]{"issueCount", "pageInfo", "nodes"});

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        Integer num = null;
        r20 r20Var = null;
        List list = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                long nextLong = eVar.nextLong();
                if (nextLong > 2147483647L) {
                    while (nextLong > 2147483647L) {
                        nextLong = jo.f4.c(1, nextLong, "substring(...)");
                    }
                    num = Integer.valueOf((int) nextLong);
                } else {
                    num = Integer.valueOf((int) nextLong);
                }
            } else if (r0 == 1) {
                r20Var = (r20) aa.c.c(yq.a, false).a(eVar, wVar);
            } else {
                if (r0 != 2) {
                    break;
                }
                list = (List) aa.c.b(aa.c.a(aa.c.b(aa.c.c(uq.a, true)))).a(eVar, wVar);
            }
        }
        if (num == null) {
            k41.b.B(eVar, "issueCount");
            throw null;
        }
        int intValue = num.intValue();
        if (r20Var != null) {
            return new u20(intValue, r20Var, list);
        }
        k41.b.B(eVar, "pageInfo");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        u20 u20Var = (u20) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(u20Var, "value");
        fVar.z0("issueCount");
        fVar.z(u20Var.a);
        fVar.z0("pageInfo");
        aa.c.c(yq.a, false).b(fVar, wVar, u20Var.b);
        fVar.z0("nodes");
        aa.c.b(aa.c.a(aa.c.b(aa.c.c(uq.a, true)))).b(fVar, wVar, u20Var.c);
    }
}
