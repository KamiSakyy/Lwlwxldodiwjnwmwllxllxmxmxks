package vw0;

import aa.w;
import java.util.List;
import jo.f4Shadow;
import sy.d0Shadow;

/* loaded from: /home/user/work/p/classes4.dex */
public final class i implements aa.a {
    public static final i a = new i();
    public static final List b = d0Shadow.o(new String[]{"pageInfo", "nodes", "totalCount"});

    public final Object a(ea.e eVar, w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        uw0.s sVar = null;
        List list = null;
        Integer num = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                sVar = (uw0.s) aa.c.c(l.a, false).a(eVar, wVar);
            } else if (r0 == 1) {
                list = (List) aa.c.b(aa.c.a(aa.c.b(aa.c.c(k.a, true)))).a(eVar, wVar);
            } else {
                if (r0 != 2) {
                    break;
                }
                long nextLong = eVar.nextLong();
                if (nextLong > 2147483647L) {
                    while (nextLong > 2147483647L) {
                        nextLong = f4Shadow.c(1, nextLong, "substring(...)");
                    }
                    num = Integer.valueOf((int) nextLong);
                } else {
                    num = Integer.valueOf((int) nextLong);
                }
            }
        }
        if (sVar == null) {
            k41.b.B(eVar, "pageInfo");
            throw null;
        }
        if (num != null) {
            return new uw0.p(sVar, list, num.intValue());
        }
        k41.b.B(eVar, "totalCount");
        throw null;
    }

    public final void b(ea.f fVar, w wVar, Object obj) {
        uw0.p pVar = (uw0.p) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(pVar, "value");
        fVar.z0("pageInfo");
        aa.c.c(l.a, false).b(fVar, wVar, pVar.a);
        fVar.z0("nodes");
        aa.c.b(aa.c.a(aa.c.b(aa.c.c(k.a, true)))).b(fVar, wVar, pVar.b);
        fVar.z0("totalCount");
        fVar.z(pVar.c);
    }
}
