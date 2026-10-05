package ep;

import java.util.List;
import jo.h50;
import jo.i50;

/* loaded from: /home/user/work/p/classes3.dex */
public final class ws implements aa.a {
    public static final ws a = new ws();
    public static final List b = sy.d0.o("userCount", "pageInfo", "nodes");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        Integer num = null;
        h50 h50Var = null;
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
                h50Var = (h50) aa.c.c(vs.a, false).a(eVar, wVar);
            } else {
                if (r0 != 2) {
                    break;
                }
                list = (List) aa.c.b(aa.c.a(aa.c.b(aa.c.c(ts.a, true)))).a(eVar, wVar);
            }
        }
        if (num == null) {
            k41.b.B(eVar, "userCount");
            throw null;
        }
        int intValue = num.intValue();
        if (h50Var != null) {
            return new i50(intValue, h50Var, list);
        }
        k41.b.B(eVar, "pageInfo");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        i50 i50Var = (i50) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(i50Var, "value");
        fVar.z0("userCount");
        fVar.z(i50Var.a);
        fVar.z0("pageInfo");
        aa.c.c(vs.a, false).b(fVar, wVar, i50Var.b);
        fVar.z0("nodes");
        aa.c.b(aa.c.a(aa.c.b(aa.c.c(ts.a, true)))).b(fVar, wVar, i50Var.c);
    }
}
