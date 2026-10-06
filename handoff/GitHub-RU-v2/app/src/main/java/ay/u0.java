package ay;

import java.util.List;
import jo.f4Shadow;
import zx.j1;
import zx.l1;

/* loaded from: /home/user/work/p/classes3.dex */
public final class u0 implements aa.a {
    public static final u0 a = new u0();
    public static final List b = sy.d0Shadow.o("pageInfo", "totalCount", "nodes");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        j1 j1Var = null;
        Integer num = null;
        List list = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                j1Var = (j1) aa.c.c(s0.a, false).a(eVar, wVar);
            } else if (r0 == 1) {
                long nextLong = eVar.nextLong();
                if (nextLong > 2147483647L) {
                    while (nextLong > 2147483647L) {
                        nextLong = f4Shadow.c(1, nextLong, "substring(...)");
                    }
                    num = Integer.valueOf((int) nextLong);
                } else {
                    num = Integer.valueOf((int) nextLong);
                }
            } else {
                if (r0 != 2) {
                    break;
                }
                list = (List) aa.c.b(aa.c.a(aa.c.b(aa.c.c(n0.a, true)))).a(eVar, wVar);
            }
        }
        if (j1Var == null) {
            k41.b.B(eVar, "pageInfo");
            throw null;
        }
        if (num != null) {
            return new l1(j1Var, num.intValue(), list);
        }
        k41.b.B(eVar, "totalCount");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        l1 l1Var = (l1) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(l1Var, "value");
        fVar.z0("pageInfo");
        aa.c.c(s0.a, false).b(fVar, wVar, l1Var.a);
        fVar.z0("totalCount");
        fVar.z(l1Var.b);
        fVar.z0("nodes");
        aa.c.b(aa.c.a(aa.c.b(aa.c.c(n0.a, true)))).b(fVar, wVar, l1Var.c);
    }
}
