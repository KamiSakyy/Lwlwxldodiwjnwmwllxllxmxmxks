package fd0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class v7 implements aaShadow.a {
    public static final v7 a = new v7();
    public static final List b = sy.d0Shadow.o(new String[]{"discussionCount", "pageInfo", "nodes"});

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        Integer num = null;
        kc0.qb qbVar = null;
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
                qbVar = (kc0.qb) aa.c.c(t7.a, false).a(eVar, wVar);
            } else {
                if (r0 != 2) {
                    break;
                }
                list = (List) aa.c.b(aa.c.a(aa.c.b(aa.c.c(s7.a, true)))).a(eVar, wVar);
            }
        }
        if (num == null) {
            k41.b.B(eVar, "discussionCount");
            throw null;
        }
        int intValue = num.intValue();
        if (qbVar != null) {
            return new kc0.sb(intValue, qbVar, list);
        }
        k41.b.B(eVar, "pageInfo");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        kc0.sb sbVar = (kc0.sb) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(sbVar, "value");
        fVar.z0("discussionCount");
        fVar.z(sbVar.a);
        fVar.z0("pageInfo");
        aa.c.c(t7.a, false).b(fVar, wVar, sbVar.b);
        fVar.z0("nodes");
        aa.c.b(aa.c.a(aa.c.b(aa.c.c(s7.a, true)))).b(fVar, wVar, sbVar.c);
    }
}
