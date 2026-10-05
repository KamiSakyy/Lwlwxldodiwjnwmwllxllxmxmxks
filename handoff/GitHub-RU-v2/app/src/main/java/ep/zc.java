package ep;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class zc implements aa.a {
    public static final zc a = new zc();
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
                list = (List) aa.c.b(aa.c.a(aa.c.b(aa.c.c(mc.a, true)))).a(eVar, wVar);
            }
        }
        if (num != null) {
            return new jo.yi(num.intValue(), list);
        }
        k41.b.B(eVar, "issueCount");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jo.yi yiVar = (jo.yi) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(yiVar, "value");
        fVar.z0("issueCount");
        fVar.z(yiVar.a);
        fVar.z0("nodes");
        aa.c.b(aa.c.a(aa.c.b(aa.c.c(mc.a, true)))).b(fVar, wVar, yiVar.b);
    }
}
