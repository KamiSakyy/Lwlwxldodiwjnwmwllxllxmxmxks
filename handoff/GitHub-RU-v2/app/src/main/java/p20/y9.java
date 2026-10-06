package p20;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class y9 implements aaShadow.a {
    public static final y9 a = new y9();
    public static final List b = sy.d0.o("issueCount", "nodes");

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
                list = (List) aa.c.b(aa.c.a(aa.c.b(aa.c.c(da.a, true)))).a(eVar, wVar);
            }
        }
        if (num != null) {
            return new u10.ve(num.intValue(), list);
        }
        k41.b.B(eVar, "issueCount");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        u10.ve veVar = (u10.ve) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(veVar, "value");
        fVar.z0("issueCount");
        fVar.z(veVar.a);
        fVar.z0("nodes");
        aa.c.b(aa.c.a(aa.c.b(aa.c.c(da.a, true)))).b(fVar, wVar, veVar.b);
    }
}
