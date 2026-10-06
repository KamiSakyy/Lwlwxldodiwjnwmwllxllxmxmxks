package ep;

import java.util.List;
import jo.v50;
import jo.w50;

/* loaded from: /home/user/work/p/classes3.dex */
public final class gtShadow implements aaShadow.a {
    public static final gtShadow a = new gtShadow();
    public static final List b = sy.d0.o("repositoryCount", "pageInfo", "nodes");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        Integer num = null;
        v50 v50Var = null;
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
                v50Var = (v50) aa.c.c(ft.a, false).a(eVar, wVar);
            } else {
                if (r0 != 2) {
                    break;
                }
                list = (List) aa.c.b(aa.c.a(aa.c.b(aa.c.c(dt.a, true)))).a(eVar, wVar);
            }
        }
        if (num == null) {
            k41.b.B(eVar, "repositoryCount");
            throw null;
        }
        int intValue = num.intValue();
        if (v50Var != null) {
            return new w50(intValue, v50Var, list);
        }
        k41.b.B(eVar, "pageInfo");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        w50 w50Var = (w50) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(w50Var, "value");
        fVar.z0("repositoryCount");
        fVar.z(w50Var.a);
        fVar.z0("pageInfo");
        aa.c.c(ft.a, false).b(fVar, wVar, w50Var.b);
        fVar.z0("nodes");
        aa.c.b(aa.c.a(aa.c.b(aa.c.c(dt.a, true)))).b(fVar, wVar, w50Var.c);
    }
}
