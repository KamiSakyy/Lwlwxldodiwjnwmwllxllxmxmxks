package gp;

import java.util.List;
import jo.f4Shadow;

/* loaded from: /home/user/work/p/classes3.dex */
public final class l implements aa.a {
    public static final l a = new l();
    public static final List b = sy.d0Shadow.o("totalCount", "nodes", "pageInfo");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        Integer num = null;
        List list = null;
        fp.d0 d0Var = null;
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
                list = (List) aa.c.b(aa.c.a(aa.c.b(aa.c.c(i.a, true)))).a(eVar, wVar);
            } else {
                if (r0 != 2) {
                    break;
                }
                d0Var = (fp.d0) aa.c.c(j.a, false).a(eVar, wVar);
            }
        }
        if (num == null) {
            k41.b.B(eVar, "totalCount");
            throw null;
        }
        int intValue = num.intValue();
        if (d0Var != null) {
            return new fp.f0(intValue, list, d0Var);
        }
        k41.b.B(eVar, "pageInfo");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        fp.f0 f0Var = (fp.f0) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(f0Var, "value");
        fVar.z0("totalCount");
        fVar.z(f0Var.a);
        fVar.z0("nodes");
        aa.c.b(aa.c.a(aa.c.b(aa.c.c(i.a, true)))).b(fVar, wVar, f0Var.b);
        fVar.z0("pageInfo");
        aa.c.c(j.a, false).b(fVar, wVar, f0Var.c);
    }
}
