package eo0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class rn implements aaShadow.a {
    public static final rn a = new rn();
    public static final List b = sy.d0Shadow.o(new String[]{"pageInfo", "totalCount", "nodes"});

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        jn0.gy gyVar = null;
        Integer num = null;
        List list = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                gyVar = (jn0.gy) aa.c.c(un.a, false).a(eVar, wVar);
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
                list = (List) aa.c.b(aa.c.a(aa.c.b(aa.c.c(tn.a, true)))).a(eVar, wVar);
            }
        }
        if (gyVar == null) {
            k41.b.B(eVar, "pageInfo");
            throw null;
        }
        if (num != null) {
            return new jn0.cy(gyVar, num.intValue(), list);
        }
        k41.b.B(eVar, "totalCount");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jn0.cy cyVar = (jn0.cy) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(cyVar, "value");
        fVar.z0("pageInfo");
        aa.c.c(un.a, false).b(fVar, wVar, cyVar.a);
        fVar.z0("totalCount");
        fVar.z(cyVar.b);
        fVar.z0("nodes");
        aa.c.b(aa.c.a(aa.c.b(aa.c.c(tn.a, true)))).b(fVar, wVar, cyVar.c);
    }
}
