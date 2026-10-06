package fd0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class ei implements aaShadow.a {
    public static final ei a = new ei();
    public static final List b = sy.d0.o(new String[]{"pageInfo", "nodes"});

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        kc0.jq jqVar = null;
        List list = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                jqVar = (kc0.jq) aa.c.c(bi.a, false).a(eVar, wVar);
            } else {
                if (r0 != 1) {
                    break;
                }
                list = (List) aa.c.b(aa.c.a(aa.c.b(aa.c.c(xh.a, false)))).a(eVar, wVar);
            }
        }
        if (jqVar != null) {
            return new kc0.mq(jqVar, list);
        }
        k41.b.B(eVar, "pageInfo");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        kc0.mq mqVar = (kc0.mq) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(mqVar, "value");
        fVar.z0("pageInfo");
        aa.c.c(bi.a, false).b(fVar, wVar, mqVar.a);
        fVar.z0("nodes");
        aa.c.b(aa.c.a(aa.c.b(aa.c.c(xh.a, false)))).b(fVar, wVar, mqVar.b);
    }
}
