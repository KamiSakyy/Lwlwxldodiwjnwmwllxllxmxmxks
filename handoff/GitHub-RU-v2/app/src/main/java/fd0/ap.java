package fd0;

import java.util.List;
import kc0.g00;
import kc0.h00;

/* loaded from: /home/user/work/p/classes4.dex */
public final class ap implements aaShadow.a {
    public static final ap a = new ap();
    public static final List b = sy.d0.o(new String[]{"repositoryCount", "pageInfo", "nodes"});

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        Integer num = null;
        g00 g00Var = null;
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
                g00Var = (g00) aa.c.c(zo.a, false).a(eVar, wVar);
            } else {
                if (r0 != 2) {
                    break;
                }
                list = (List) aa.c.b(aa.c.a(aa.c.b(aa.c.c(xo.a, true)))).a(eVar, wVar);
            }
        }
        if (num == null) {
            k41.b.B(eVar, "repositoryCount");
            throw null;
        }
        int intValue = num.intValue();
        if (g00Var != null) {
            return new h00(intValue, g00Var, list);
        }
        k41.b.B(eVar, "pageInfo");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        h00 h00Var = (h00) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(h00Var, "value");
        fVar.z0("repositoryCount");
        fVar.z(h00Var.a);
        fVar.z0("pageInfo");
        aa.c.c(zo.a, false).b(fVar, wVar, h00Var.b);
        fVar.z0("nodes");
        aa.c.b(aa.c.a(aa.c.b(aa.c.c(xo.a, true)))).b(fVar, wVar, h00Var.c);
    }
}
