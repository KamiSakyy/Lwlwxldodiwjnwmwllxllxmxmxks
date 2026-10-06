package eo0;

import java.util.List;
import jn0.pc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class rx implements aaShadow.a {
    public static final rx a = new rx();
    public static final List b = sy.d0.n("nodes");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        List list = null;
        while (eVar.r0(b) == 0) {
            list = (List) aa.c.b(aa.c.a(aa.c.b(aa.c.c(sx.a, true)))).a(eVar, wVar);
        }
        return new pc0(list);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        pc0 pc0Var = (pc0) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(pc0Var, "value");
        fVar.z0("nodes");
        aa.c.b(aa.c.a(aa.c.b(aa.c.c(sx.a, true)))).b(fVar, wVar, pc0Var.a);
    }
}
