package ep;

import java.util.List;
import jo.y60;
import jo.z60;

/* loaded from: /home/user/work/p/classes3.dex */
public final class au implements aaShadow.a {
    public static final au a = new au();
    public static final List b = sy.d0.o("pageInfo", "nodes");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        y60 y60Var = null;
        List list = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                y60Var = (y60) aa.c.c(ztShadow.a, false).a(eVar, wVar);
            } else {
                if (r0 != 1) {
                    break;
                }
                list = (List) aa.c.b(aa.c.a(aa.c.b(aa.c.c(yt.a, true)))).a(eVar, wVar);
            }
        }
        if (y60Var != null) {
            return new z60(y60Var, list);
        }
        k41.b.B(eVar, "pageInfo");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        z60 z60Var = (z60) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(z60Var, "value");
        fVar.z0("pageInfo");
        aa.c.c(ztShadow.a, false).b(fVar, wVar, z60Var.a);
        fVar.z0("nodes");
        aa.c.b(aa.c.a(aa.c.b(aa.c.c(yt.a, true)))).b(fVar, wVar, z60Var.b);
    }
}
