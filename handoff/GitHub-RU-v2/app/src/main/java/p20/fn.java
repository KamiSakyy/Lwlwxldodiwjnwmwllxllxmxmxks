package p20;

import java.util.List;
import u10.tx;
import u10.ux;

/* loaded from: /home/user/work/p/classes3.dex */
public final class fn implements aaShadow.a {
    public static final fn a = new fn();
    public static final List b = sy.d0.o("userCount", "pageInfo", "nodes");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        Integer num = null;
        tx txVar = null;
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
                txVar = (tx) aa.c.c(en.a, false).a(eVar, wVar);
            } else {
                if (r0 != 2) {
                    break;
                }
                list = (List) aa.c.b(aa.c.a(aa.c.b(aa.c.c(cn.a, true)))).a(eVar, wVar);
            }
        }
        if (num == null) {
            k41.b.B(eVar, "userCount");
            throw null;
        }
        int intValue = num.intValue();
        if (txVar != null) {
            return new ux(intValue, txVar, list);
        }
        k41.b.B(eVar, "pageInfo");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        ux uxVar = (ux) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(uxVar, "value");
        fVar.z0("userCount");
        fVar.z(uxVar.a);
        fVar.z0("pageInfo");
        aa.c.c(en.a, false).b(fVar, wVar, uxVar.b);
        fVar.z0("nodes");
        aa.c.b(aa.c.a(aa.c.b(aa.c.c(cn.a, true)))).b(fVar, wVar, uxVar.c);
    }
}
