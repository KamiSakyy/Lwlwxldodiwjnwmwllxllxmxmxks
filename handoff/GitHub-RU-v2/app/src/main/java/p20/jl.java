package p20;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class jl implements aaShadow.a {
    public static final jl a = new jl();
    public static final List b = sy.d0.o("pageInfo", "nodes");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        u10.ev evVar = null;
        List list = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                evVar = (u10.ev) aa.c.c(ll.a, false).a(eVar, wVar);
            } else {
                if (r0 != 1) {
                    break;
                }
                list = (List) aa.c.b(aa.c.a(aa.c.b(aa.c.c(kl.a, false)))).a(eVar, wVar);
            }
        }
        if (evVar != null) {
            return new u10.cv(evVar, list);
        }
        k41.b.B(eVar, "pageInfo");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        u10.cv cvVar = (u10.cv) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(cvVar, "value");
        fVar.z0("pageInfo");
        aa.c.c(ll.a, false).b(fVar, wVar, cvVar.a);
        fVar.z0("nodes");
        aa.c.b(aa.c.a(aa.c.b(aa.c.c(kl.a, false)))).b(fVar, wVar, cvVar.b);
    }
}
