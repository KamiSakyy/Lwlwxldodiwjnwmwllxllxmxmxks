package p20;

import java.util.List;
import u10.f90;

/* loaded from: /home/user/work/p/classes3.dex */
public final class zu implements aaShadow.a {
    public static final zu a = new zu();
    public static final List b = sy.d0.n("nodes");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        List list = null;
        while (eVar.r0(b) == 0) {
            list = (List) aa.c.b(aa.c.a(aa.c.b(aa.c.c(av.a, true)))).a(eVar, wVar);
        }
        return new f90(list);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        f90 f90Var = (f90) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(f90Var, "value");
        fVar.z0("nodes");
        aa.c.b(aa.c.a(aa.c.b(aa.c.c(av.a, true)))).b(fVar, wVar, f90Var.a);
    }
}
