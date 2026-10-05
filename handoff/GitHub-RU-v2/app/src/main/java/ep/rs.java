package ep;

import java.util.List;
import jo.a50;
import jo.b50;

/* loaded from: /home/user/work/p/classes3.dex */
public final class rs implements aa.a {
    public static final rs a = new rs();
    public static final List b = sy.d0.o("userCount", "pageInfo", "nodes");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        Integer num = null;
        a50 a50Var = null;
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
                a50Var = (a50) aa.c.c(qs.a, false).a(eVar, wVar);
            } else {
                if (r0 != 2) {
                    break;
                }
                list = (List) aa.c.b(aa.c.a(aa.c.b(aa.c.c(os.a, true)))).a(eVar, wVar);
            }
        }
        if (num == null) {
            k41.b.B(eVar, "userCount");
            throw null;
        }
        int intValue = num.intValue();
        if (a50Var != null) {
            return new b50(intValue, a50Var, list);
        }
        k41.b.B(eVar, "pageInfo");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        b50 b50Var = (b50) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(b50Var, "value");
        fVar.z0("userCount");
        fVar.z(b50Var.a);
        fVar.z0("pageInfo");
        aa.c.c(qs.a, false).b(fVar, wVar, b50Var.b);
        fVar.z0("nodes");
        aa.c.b(aa.c.a(aa.c.b(aa.c.c(os.a, true)))).b(fVar, wVar, b50Var.c);
    }
}
