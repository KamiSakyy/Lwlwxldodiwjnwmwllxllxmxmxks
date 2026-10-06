package ep;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class qj implements aaShadow.a {
    public static final qj a = new qj();
    public static final List b = sy.d0Shadow.o("issueCount", "nodes");

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
                        nextLong = jo.f4Shadow.c(1, nextLong, "substring(...)");
                    }
                    num = Integer.valueOf((int) nextLong);
                } else {
                    num = Integer.valueOf((int) nextLong);
                }
            } else {
                if (r0 != 1) {
                    break;
                }
                list = (List) aa.c.b(aa.c.a(aa.c.b(aa.c.c(oj.a, true)))).a(eVar, wVar);
            }
        }
        if (num != null) {
            return new jo.rs(num.intValue(), list);
        }
        k41.b.B(eVar, "issueCount");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jo.rs rsVar = (jo.rs) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(rsVar, "value");
        fVar.z0("issueCount");
        fVar.z(rsVar.a);
        fVar.z0("nodes");
        aa.c.b(aa.c.a(aa.c.b(aa.c.c(oj.a, true)))).b(fVar, wVar, rsVar.b);
    }
}
