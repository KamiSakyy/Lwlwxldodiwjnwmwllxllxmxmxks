package fd0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class xl implements aaShadow.a {
    public static final xl a = new xl();
    public static final List b = sy.d0.o(new String[]{"pageInfo", "totalCount", "nodes"});

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        kc0.vv vvVar = null;
        Integer num = null;
        List list = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                vvVar = (kc0.vv) aa.c.c(am.a, false).a(eVar, wVar);
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
                list = (List) aa.c.b(aa.c.a(aa.c.b(aa.c.c(zl.a, true)))).a(eVar, wVar);
            }
        }
        if (vvVar == null) {
            k41.b.B(eVar, "pageInfo");
            throw null;
        }
        if (num != null) {
            return new kc0.rv(vvVar, num.intValue(), list);
        }
        k41.b.B(eVar, "totalCount");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        kc0.rv rvVar = (kc0.rv) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(rvVar, "value");
        fVar.z0("pageInfo");
        aa.c.c(am.a, false).b(fVar, wVar, rvVar.a);
        fVar.z0("totalCount");
        fVar.z(rvVar.b);
        fVar.z0("nodes");
        aa.c.b(aa.c.a(aa.c.b(aa.c.c(zl.a, true)))).b(fVar, wVar, rvVar.c);
    }
}
