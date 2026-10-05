package p20;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class vl implements aa.a {
    public static final vl a = new vl();
    public static final List b = sy.d0.o("pageInfo", "nodes");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        u10.wv wvVar = null;
        List list = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                wvVar = (u10.wv) aa.c.c(xl.a, false).a(eVar, wVar);
            } else {
                if (r0 != 1) {
                    break;
                }
                list = (List) aa.c.b(aa.c.a(aa.c.b(aa.c.c(wl.a, true)))).a(eVar, wVar);
            }
        }
        if (wvVar != null) {
            return new u10.uv(wvVar, list);
        }
        k41.b.B(eVar, "pageInfo");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        u10.uv uvVar = (u10.uv) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(uvVar, "value");
        fVar.z0("pageInfo");
        aa.c.c(xl.a, false).b(fVar, wVar, uvVar.a);
        fVar.z0("nodes");
        aa.c.b(aa.c.a(aa.c.b(aa.c.c(wl.a, true)))).b(fVar, wVar, uvVar.b);
    }
}
