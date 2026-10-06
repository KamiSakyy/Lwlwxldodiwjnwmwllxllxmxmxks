package ep;

import java.util.List;
import jo.r40;
import jo.u40;

/* loaded from: /home/user/work/p/classes3.dex */
public final class msShadow implements aaShadow.a {
    public static final msShadow a = new msShadow();
    public static final List b = sy.d0.o("issueCount", "pageInfo", "nodes");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        Integer num = null;
        r40 r40Var = null;
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
                r40Var = (r40) aa.c.c(js.a, false).a(eVar, wVar);
            } else {
                if (r0 != 2) {
                    break;
                }
                list = (List) aa.c.b(aa.c.a(aa.c.b(aa.c.c(fs.a, true)))).a(eVar, wVar);
            }
        }
        if (num == null) {
            k41.b.B(eVar, "issueCount");
            throw null;
        }
        int intValue = num.intValue();
        if (r40Var != null) {
            return new u40(intValue, r40Var, list);
        }
        k41.b.B(eVar, "pageInfo");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        u40 u40Var = (u40) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(u40Var, "value");
        fVar.z0("issueCount");
        fVar.z(u40Var.a);
        fVar.z0("pageInfo");
        aa.c.c(js.a, false).b(fVar, wVar, u40Var.b);
        fVar.z0("nodes");
        aa.c.b(aa.c.a(aa.c.b(aa.c.c(fs.a, true)))).b(fVar, wVar, u40Var.c);
    }
}
