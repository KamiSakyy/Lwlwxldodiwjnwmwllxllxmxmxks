package eo0;

import java.util.List;
import jn0.h30;
import jn0.i30;

/* loaded from: /home/user/work/p/classes4.dex */
public final class lr implements aaShadow.a {
    public static final lr a = new lr();
    public static final List b = sy.d0Shadow.o(new String[]{"userCount", "pageInfo", "nodes"});

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        Integer num = null;
        h30 h30Var = null;
        List list = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                long nextLong = eVar.nextLong();
                if (nextLong > 2147483647L) {
                    while (nextLong > 2147483647L) {
                        nextLong = jo.f4Shadow.c(1, nextLong, "substring(...)");
                    }
                    num = Integer.valueOf((int) nextLong);
                } else {
                    num = Integer.valueOf((int) nextLong);
                }
            } else if (r0 == 1) {
                h30Var = (h30) aa.c.c(kr.a, false).a(eVar, wVar);
            } else {
                if (r0 != 2) {
                    break;
                }
                list = (List) aa.c.b(aa.c.a(aa.c.b(aa.c.c(ir.a, true)))).a(eVar, wVar);
            }
        }
        if (num == null) {
            k41.b.B(eVar, "userCount");
            throw null;
        }
        int intValue = num.intValue();
        if (h30Var != null) {
            return new i30(intValue, h30Var, list);
        }
        k41.b.B(eVar, "pageInfo");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        i30 i30Var = (i30) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(i30Var, "value");
        fVar.z0("userCount");
        fVar.z(i30Var.a);
        fVar.z0("pageInfo");
        aa.c.c(kr.a, false).b(fVar, wVar, i30Var.b);
        fVar.z0("nodes");
        aa.c.b(aa.c.a(aa.c.b(aa.c.c(ir.a, true)))).b(fVar, wVar, i30Var.c);
    }
}
