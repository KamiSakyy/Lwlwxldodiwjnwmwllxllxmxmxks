package fd0;

import java.util.List;
import kc0.g60;
import kc0.h60;

/* loaded from: /home/user/work/p/classes4.dex */
public final class at implements aaShadow.a {
    public static final at a = new at();
    public static final List b = sy.d0.n("issueComment");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        g60 g60Var = null;
        while (eVar.r0(b) == 0) {
            g60Var = (g60) aa.c.b(aa.c.c(zs.a, true)).a(eVar, wVar);
        }
        return new h60(g60Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        h60 h60Var = (h60) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(h60Var, "value");
        fVar.z0("issueComment");
        aa.c.b(aa.c.c(zs.a, true)).b(fVar, wVar, h60Var.a);
    }
}
