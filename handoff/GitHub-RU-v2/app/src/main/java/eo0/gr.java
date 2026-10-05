package eo0;

import java.util.List;
import jn0.a30;
import jn0.b30;

/* loaded from: /home/user/work/p/classes4.dex */
public final class gr implements aa.a {
    public static final gr a = new gr();
    public static final List b = sy.d0.o(new String[]{"userCount", "pageInfo", "nodes"});

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        Integer num = null;
        a30 a30Var = null;
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
                a30Var = (a30) aa.c.c(fr.a, false).a(eVar, wVar);
            } else {
                if (r0 != 2) {
                    break;
                }
                list = (List) aa.c.b(aa.c.a(aa.c.b(aa.c.c(dr.a, true)))).a(eVar, wVar);
            }
        }
        if (num == null) {
            k41.b.B(eVar, "userCount");
            throw null;
        }
        int intValue = num.intValue();
        if (a30Var != null) {
            return new b30(intValue, a30Var, list);
        }
        k41.b.B(eVar, "pageInfo");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        b30 b30Var = (b30) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(b30Var, "value");
        fVar.z0("userCount");
        fVar.z(b30Var.a);
        fVar.z0("pageInfo");
        aa.c.c(fr.a, false).b(fVar, wVar, b30Var.b);
        fVar.z0("nodes");
        aa.c.b(aa.c.a(aa.c.b(aa.c.c(dr.a, true)))).b(fVar, wVar, b30Var.c);
    }
}
