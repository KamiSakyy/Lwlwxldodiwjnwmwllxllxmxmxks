package ep;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class li implements aaShadow.a {
    public static final li a = new li();
    public static final List b = sy.d0.o("totalCount", "nodes");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        Integer num = null;
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
            } else {
                if (r0 != 1) {
                    break;
                }
                list = (List) aa.c.b(aa.c.a(aa.c.b(aa.c.c(oi.a, true)))).a(eVar, wVar);
            }
        }
        if (num != null) {
            return new jo.hr(num.intValue(), list);
        }
        k41.b.B(eVar, "totalCount");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jo.hr hrVar = (jo.hr) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(hrVar, "value");
        fVar.z0("totalCount");
        fVar.z(hrVar.a);
        fVar.z0("nodes");
        aa.c.b(aa.c.a(aa.c.b(aa.c.c(oi.a, true)))).b(fVar, wVar, hrVar.b);
    }
}
