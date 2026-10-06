package p20;

import java.util.List;
import u10.l80;

/* loaded from: /home/user/work/p/classes3.dex */
public final class nu implements aaShadow.a {
    public static final nu a = new nu();
    public static final List b = sy.d0.n("navLinks");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        List list = null;
        while (eVar.r0(b) == 0) {
            list = (List) aa.c.b(aa.c.a(aa.c.c(mu.a, false))).a(eVar, wVar);
        }
        return new l80(list);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        l80 l80Var = (l80) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(l80Var, "value");
        fVar.z0("navLinks");
        aa.c.b(aa.c.a(aa.c.c(mu.a, false))).b(fVar, wVar, l80Var.a);
    }
}
