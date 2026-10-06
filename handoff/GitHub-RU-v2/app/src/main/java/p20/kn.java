package p20;

import java.util.List;
import u10.ay;
import u10.cy;

/* loaded from: /home/user/work/p/classes3.dex */
public final class kn implements aaShadow.a {
    public static final kn a = new kn();
    public static final List b = sy.d0Shadow.o("issueCount", "pageInfo", "nodes");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        Integer num = null;
        ay ayVar = null;
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
                ayVar = (ay) aa.c.c(jn.a, false).a(eVar, wVar);
            } else {
                if (r0 != 2) {
                    break;
                }
                list = (List) aa.c.b(aa.c.a(aa.c.b(aa.c.c(hn.a, true)))).a(eVar, wVar);
            }
        }
        if (num == null) {
            k41.b.B(eVar, "issueCount");
            throw null;
        }
        int intValue = num.intValue();
        if (ayVar != null) {
            return new cy(intValue, ayVar, list);
        }
        k41.b.B(eVar, "pageInfo");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        cy cyVar = (cy) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(cyVar, "value");
        fVar.z0("issueCount");
        fVar.z(cyVar.a);
        fVar.z0("pageInfo");
        aa.c.c(jn.a, false).b(fVar, wVar, cyVar.b);
        fVar.z0("nodes");
        aa.c.b(aa.c.a(aa.c.b(aa.c.c(hn.a, true)))).b(fVar, wVar, cyVar.c);
    }
}
