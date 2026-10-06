package eo0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class db implements aaShadow.a {
    public static final db a = new db();
    public static final List b = sy.d0Shadow.o(new String[]{"pageInfo", "nodes"});

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        jn0.tg tgVar = null;
        List list = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                tgVar = (jn0.tg) aa.c.c(jb.a, false).a(eVar, wVar);
            } else {
                if (r0 != 1) {
                    break;
                }
                list = (List) aa.c.b(aa.c.a(aa.c.b(aa.c.c(eb.a, true)))).a(eVar, wVar);
            }
        }
        if (tgVar != null) {
            return new jn0.ng(tgVar, list);
        }
        k41.b.B(eVar, "pageInfo");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jn0.ng ngVar = (jn0.ng) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(ngVar, "value");
        fVar.z0("pageInfo");
        aa.c.c(jb.a, false).b(fVar, wVar, ngVar.a);
        fVar.z0("nodes");
        aa.c.b(aa.c.a(aa.c.b(aa.c.c(eb.a, true)))).b(fVar, wVar, ngVar.b);
    }
}
