package eo0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class lo implements aaShadow.a {
    public static final lo a = new lo();
    public static final List b = sy.d0.o(new String[]{"pageInfo", "nodes"});

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        jn0.zy zyVar = null;
        List list = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                zyVar = (jn0.zy) aa.c.c(ko.a, false).a(eVar, wVar);
            } else {
                if (r0 != 1) {
                    break;
                }
                list = (List) aa.c.b(aa.c.a(aa.c.b(aa.c.c(jo.a, true)))).a(eVar, wVar);
            }
        }
        if (zyVar != null) {
            return new jn0.az(zyVar, list);
        }
        k41.b.B(eVar, "pageInfo");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jn0.az azVar = (jn0.az) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(azVar, "value");
        fVar.z0("pageInfo");
        aa.c.c(ko.a, false).b(fVar, wVar, azVar.a);
        fVar.z0("nodes");
        aa.c.b(aa.c.a(aa.c.b(aa.c.c(jo.a, true)))).b(fVar, wVar, azVar.b);
    }
}
