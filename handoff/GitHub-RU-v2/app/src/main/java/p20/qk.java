package p20;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class qk implements aaShadow.a {
    public static final qk a = new qk();
    public static final List b = sy.d0.o("pageInfo", "nodes");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        u10.yt ytVar = null;
        List list = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                ytVar = (u10.yt) aa.c.c(pk.a, false).a(eVar, wVar);
            } else {
                if (r0 != 1) {
                    break;
                }
                list = (List) aa.c.b(aa.c.a(aa.c.b(aa.c.c(ok.a, true)))).a(eVar, wVar);
            }
        }
        if (ytVar != null) {
            return new u10.zt(ytVar, list);
        }
        k41.b.B(eVar, "pageInfo");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        u10.zt ztVar = (u10.zt) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(ztVar, "value");
        fVar.z0("pageInfo");
        aa.c.c(pk.a, false).b(fVar, wVar, ztVar.a);
        fVar.z0("nodes");
        aa.c.b(aa.c.a(aa.c.b(aa.c.c(ok.a, true)))).b(fVar, wVar, ztVar.b);
    }
}
