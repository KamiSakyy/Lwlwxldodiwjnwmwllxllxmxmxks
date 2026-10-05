package xz;

import java.util.List;
import jo.f4;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class t implements aa.a {
    public static final List a = x61.l.r(new String[]{"totalCount", "pageInfo", "nodes"});

    public static p c(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        Integer num = null;
        o oVar = null;
        List list = null;
        while (true) {
            int r0 = eVar.r0(a);
            if (r0 == 0) {
                long nextLong = eVar.nextLong();
                if (nextLong > 2147483647L) {
                    while (nextLong > 2147483647L) {
                        nextLong = f4.c(1, nextLong, "substring(...)");
                    }
                    num = Integer.valueOf((int) nextLong);
                } else {
                    num = Integer.valueOf((int) nextLong);
                }
            } else if (r0 == 1) {
                oVar = (o) aa.c.c(s.a, false).a(eVar, wVar);
            } else {
                if (r0 != 2) {
                    break;
                }
                list = (List) aa.c.b(aa.c.a(aa.c.b(aa.c.c(r.a, true)))).a(eVar, wVar);
            }
        }
        if (num == null) {
            k41.b.B(eVar, "totalCount");
            throw null;
        }
        int intValue = num.intValue();
        if (oVar != null) {
            return new p(intValue, oVar, list);
        }
        k41.b.B(eVar, "pageInfo");
        throw null;
    }

    public static void d(ea.f fVar, aa.w wVar, p pVar) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(pVar, "value");
        fVar.z0("totalCount");
        fVar.z(pVar.a);
        fVar.z0("pageInfo");
        aa.c.c(s.a, false).b(fVar, wVar, pVar.b);
        fVar.z0("nodes");
        aa.c.b(aa.c.a(aa.c.b(aa.c.c(r.a, true)))).b(fVar, wVar, pVar.c);
    }
}
