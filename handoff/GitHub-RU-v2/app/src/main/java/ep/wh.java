package ep;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class wh implements aaShadow.a {
    public static final wh a = new wh();
    public static final List b = sy.d0.o("pageInfo", "nodes");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        jo.mq mqVar = null;
        List list = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                mqVar = (jo.mq) aa.c.c(xh.a, false).a(eVar, wVar);
            } else {
                if (r0 != 1) {
                    break;
                }
                list = (List) aa.c.b(aa.c.a(aa.c.b(aa.c.c(vh.a, true)))).a(eVar, wVar);
            }
        }
        if (mqVar != null) {
            return new jo.lq(mqVar, list);
        }
        k41.b.B(eVar, "pageInfo");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jo.lq lqVar = (jo.lq) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(lqVar, "value");
        fVar.z0("pageInfo");
        aa.c.c(xh.a, false).b(fVar, wVar, lqVar.a);
        fVar.z0("nodes");
        aa.c.b(aa.c.a(aa.c.b(aa.c.c(vh.a, true)))).b(fVar, wVar, lqVar.b);
    }
}
