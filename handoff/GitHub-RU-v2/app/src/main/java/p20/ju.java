package p20;

import java.util.List;
import u10.f80;
import u10.g80;

/* loaded from: /home/user/work/p/classes3.dex */
public final class ju implements aaShadow.a {
    public static final ju a = new ju();
    public static final List b = sy.d0.n("user");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        g80 g80Var = null;
        while (eVar.r0(b) == 0) {
            g80Var = (g80) aa.c.b(aa.c.c(ku.a, false)).a(eVar, wVar);
        }
        return new f80(g80Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        f80 f80Var = (f80) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(f80Var, "value");
        fVar.z0("user");
        aa.c.b(aa.c.c(ku.a, false)).b(fVar, wVar, f80Var.a);
    }
}
