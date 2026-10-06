package gp;

import fp.g1Shadow;
import fp.i1;
import java.util.List;
import jo.f4Shadow;

/* loaded from: /home/user/work/p/classes3.dex */
public final class e0 implements aa.a {
    public static final e0 a = new e0();
    public static final List b = sy.d0Shadow.o("totalCount", "nodes", "pageInfo");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        Integer num = null;
        List list = null;
        g1Shadow g1Var = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                long nextLong = eVar.nextLong();
                if (nextLong > 2147483647L) {
                    while (nextLong > 2147483647L) {
                        nextLong = f4Shadow.c(1, nextLong, "substring(...)");
                    }
                    num = Integer.valueOf((int) nextLong);
                } else {
                    num = Integer.valueOf((int) nextLong);
                }
            } else if (r0 == 1) {
                list = (List) aa.c.b(aa.c.a(aa.c.b(aa.c.c(z.a, true)))).a(eVar, wVar);
            } else {
                if (r0 != 2) {
                    break;
                }
                g1Var = (g1Shadow) aa.c.c(c0.a, false).a(eVar, wVar);
            }
        }
        if (num == null) {
            k41.b.B(eVar, "totalCount");
            throw null;
        }
        int intValue = num.intValue();
        if (g1Var != null) {
            return new i1(intValue, list, g1Var);
        }
        k41.b.B(eVar, "pageInfo");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        i1 i1Var = (i1) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(i1Var, "value");
        fVar.z0("totalCount");
        fVar.z(i1Var.a);
        fVar.z0("nodes");
        aa.c.b(aa.c.a(aa.c.b(aa.c.c(z.a, true)))).b(fVar, wVar, i1Var.b);
        fVar.z0("pageInfo");
        aa.c.c(c0.a, false).b(fVar, wVar, i1Var.c);
    }
}
