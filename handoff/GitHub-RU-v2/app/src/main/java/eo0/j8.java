package eo0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class j8 implements aaShadow.a {
    public static final j8 a = new j8();
    public static final List b = sy.d0Shadow.o(new String[]{"discussionCount", "pageInfo", "nodes"});

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        Integer num = null;
        jn0.kc kcVar = null;
        List list = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                long nextLong = eVar.nextLong();
                if (nextLong > 2147483647L) {
                    while (nextLong > 2147483647L) {
                        nextLong = jo.f4Shadow.c(1, nextLong, "substring(...)");
                    }
                    num = Integer.valueOf((int) nextLong);
                } else {
                    num = Integer.valueOf((int) nextLong);
                }
            } else if (r0 == 1) {
                kcVar = (jn0.kc) aa.c.c(h8.a, false).a(eVar, wVar);
            } else {
                if (r0 != 2) {
                    break;
                }
                list = (List) aa.c.b(aa.c.a(aa.c.b(aa.c.c(g8.a, true)))).a(eVar, wVar);
            }
        }
        if (num == null) {
            k41.b.B(eVar, "discussionCount");
            throw null;
        }
        int intValue = num.intValue();
        if (kcVar != null) {
            return new jn0.mc(intValue, kcVar, list);
        }
        k41.b.B(eVar, "pageInfo");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jn0.mc mcVar = (jn0.mc) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(mcVar, "value");
        fVar.z0("discussionCount");
        fVar.z(mcVar.a);
        fVar.z0("pageInfo");
        aa.c.c(h8.a, false).b(fVar, wVar, mcVar.b);
        fVar.z0("nodes");
        aa.c.b(aa.c.a(aa.c.b(aa.c.c(g8.a, true)))).b(fVar, wVar, mcVar.c);
    }
}
