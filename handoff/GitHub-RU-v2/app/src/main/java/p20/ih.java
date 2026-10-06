package p20;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class ih implements aaShadow.a {
    public static final ih a = new ih();
    public static final List b = sy.d0.o("pageInfo", "nodes");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        u10.fp fpVar = null;
        List list = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                fpVar = (u10.fp) aa.c.c(fh.a, false).a(eVar, wVar);
            } else {
                if (r0 != 1) {
                    break;
                }
                list = (List) aa.c.b(aa.c.a(aa.c.b(aa.c.c(bh.a, false)))).a(eVar, wVar);
            }
        }
        if (fpVar != null) {
            return new u10.ip(fpVar, list);
        }
        k41.b.B(eVar, "pageInfo");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        u10.ip ipVar = (u10.ip) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(ipVar, "value");
        fVar.z0("pageInfo");
        aa.c.c(fh.a, false).b(fVar, wVar, ipVar.a);
        fVar.z0("nodes");
        aa.c.b(aa.c.a(aa.c.b(aa.c.c(bh.a, false)))).b(fVar, wVar, ipVar.b);
    }
}
