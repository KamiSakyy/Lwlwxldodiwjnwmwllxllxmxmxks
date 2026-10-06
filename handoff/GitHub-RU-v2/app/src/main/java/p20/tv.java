package p20;

import java.util.List;
import u10.oa0;
import u10.pa0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class tv implements aaShadow.a {
    public static final tv a = new tv();
    public static final List b = sy.d0Shadow.o("pageInfo", "nodes");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        pa0 pa0Var = null;
        List list = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                pa0Var = (pa0) aa.c.c(uv.a, false).a(eVar, wVar);
            } else {
                if (r0 != 1) {
                    break;
                }
                list = (List) aa.c.b(aa.c.a(aa.c.b(aa.c.c(sv.a, true)))).a(eVar, wVar);
            }
        }
        if (pa0Var != null) {
            return new oa0(pa0Var, list);
        }
        k41.b.B(eVar, "pageInfo");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        oa0 oa0Var = (oa0) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(oa0Var, "value");
        fVar.z0("pageInfo");
        aa.c.c(uv.a, false).b(fVar, wVar, oa0Var.a);
        fVar.z0("nodes");
        aa.c.b(aa.c.a(aa.c.b(aa.c.c(sv.a, true)))).b(fVar, wVar, oa0Var.b);
    }
}
