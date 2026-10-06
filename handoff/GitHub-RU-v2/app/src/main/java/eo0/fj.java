package eo0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class fj implements aaShadow.a {
    public static final fj a = new fj();
    public static final List b = sy.d0.o(new String[]{"totalCount", "nodes"});

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
                list = (List) aa.c.b(aa.c.a(aa.c.b(aa.c.c(jj.a, true)))).a(eVar, wVar);
            }
        }
        if (num != null) {
            return new jn0.as(num.intValue(), list);
        }
        k41.b.B(eVar, "totalCount");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jn0.as asVar = (jn0.as) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(asVar, "value");
        fVar.z0("totalCount");
        fVar.z(asVar.a);
        fVar.z0("nodes");
        aa.c.b(aa.c.a(aa.c.b(aa.c.c(jj.a, true)))).b(fVar, wVar, asVar.b);
    }
}
