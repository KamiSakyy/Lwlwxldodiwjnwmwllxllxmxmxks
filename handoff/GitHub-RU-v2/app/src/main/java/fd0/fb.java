package fd0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class fb implements aaShadow.a {
    public static final fb a = new fb();
    public static final List b = sy.d0.o(new String[]{"repositoryCount", "nodes"});

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        Integer num = null;
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
            } else {
                if (r0 != 1) {
                    break;
                }
                list = (List) aa.c.b(aa.c.a(aa.c.b(aa.c.c(sa.a, true)))).a(eVar, wVar);
            }
        }
        if (num != null) {
            return new kc0.lg(num.intValue(), list);
        }
        k41.b.B(eVar, "repositoryCount");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        kc0.lg lgVar = (kc0.lg) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(lgVar, "value");
        fVar.z0("repositoryCount");
        fVar.z(lgVar.a);
        fVar.z0("nodes");
        aa.c.b(aa.c.a(aa.c.b(aa.c.c(sa.a, true)))).b(fVar, wVar, lgVar.b);
    }
}
