package ep;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class b2 implements aa.a {
    public static final b2 a = new b2();
    public static final List b = sy.d0.o("pageInfo", "totalCount", "nodes");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        jo.i3 i3Var = null;
        Integer num = null;
        List list = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                i3Var = (jo.i3) aa.c.c(z1.a, false).a(eVar, wVar);
            } else if (r0 == 1) {
                long nextLong = eVar.nextLong();
                if (nextLong > 2147483647L) {
                    while (nextLong > 2147483647L) {
                        nextLong = jo.f4.c(1, nextLong, "substring(...)");
                    }
                    num = Integer.valueOf((int) nextLong);
                } else {
                    num = Integer.valueOf((int) nextLong);
                }
            } else {
                if (r0 != 2) {
                    break;
                }
                list = (List) aa.c.b(aa.c.a(aa.c.b(aa.c.c(s1.a, true)))).a(eVar, wVar);
            }
        }
        if (i3Var == null) {
            k41.b.B(eVar, "pageInfo");
            throw null;
        }
        if (num != null) {
            return new jo.k3(i3Var, num.intValue(), list);
        }
        k41.b.B(eVar, "totalCount");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jo.k3 k3Var = (jo.k3) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(k3Var, "value");
        fVar.z0("pageInfo");
        aa.c.c(z1.a, false).b(fVar, wVar, k3Var.a);
        fVar.z0("totalCount");
        fVar.z(k3Var.b);
        fVar.z0("nodes");
        aa.c.b(aa.c.a(aa.c.b(aa.c.c(s1.a, true)))).b(fVar, wVar, k3Var.c);
    }
}
