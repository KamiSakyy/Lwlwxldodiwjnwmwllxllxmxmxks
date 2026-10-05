package eo0;

import java.util.List;
import jn0.mc0;
import jn0.tc0;
import jn0.vc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class xx implements aa.a {
    public static final xx a = new xx();
    public static final List b = sy.d0.o(new String[]{"actor", "pullRequest"});

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        mc0 mc0Var = null;
        tc0 tc0Var = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                mc0Var = (mc0) aa.c.b(aa.c.c(px.a, true)).a(eVar, wVar);
            } else {
                if (r0 != 1) {
                    return new vc0(mc0Var, tc0Var);
                }
                tc0Var = (tc0) aa.c.b(aa.c.c(vx.a, false)).a(eVar, wVar);
            }
        }
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        vc0 vc0Var = (vc0) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(vc0Var, "value");
        fVar.z0("actor");
        aa.c.b(aa.c.c(px.a, true)).b(fVar, wVar, vc0Var.a);
        fVar.z0("pullRequest");
        aa.c.b(aa.c.c(vx.a, false)).b(fVar, wVar, vc0Var.b);
    }
}
