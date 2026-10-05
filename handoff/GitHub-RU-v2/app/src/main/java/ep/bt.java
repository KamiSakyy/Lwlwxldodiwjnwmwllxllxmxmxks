package ep;

import java.util.List;
import jo.o50;
import jo.p50;

/* loaded from: /home/user/work/p/classes3.dex */
public final class bt implements aa.a {
    public static final bt a = new bt();
    public static final List b = sy.d0.o("issueCount", "pageInfo", "nodes");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        Integer num = null;
        o50 o50Var = null;
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
                o50Var = (o50) aa.c.c(at.a, false).a(eVar, wVar);
            } else {
                if (r0 != 2) {
                    break;
                }
                list = (List) aa.c.b(aa.c.a(aa.c.b(aa.c.c(ys.a, true)))).a(eVar, wVar);
            }
        }
        if (num == null) {
            k41.b.B(eVar, "issueCount");
            throw null;
        }
        int intValue = num.intValue();
        if (o50Var != null) {
            return new p50(intValue, o50Var, list);
        }
        k41.b.B(eVar, "pageInfo");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        p50 p50Var = (p50) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(p50Var, "value");
        fVar.z0("issueCount");
        fVar.z(p50Var.a);
        fVar.z0("pageInfo");
        aa.c.c(at.a, false).b(fVar, wVar, p50Var.b);
        fVar.z0("nodes");
        aa.c.b(aa.c.a(aa.c.b(aa.c.c(ys.a, true)))).b(fVar, wVar, p50Var.c);
    }
}
