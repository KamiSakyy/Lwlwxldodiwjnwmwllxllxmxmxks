package fd0;

import java.util.List;
import kc0.b50;
import kc0.z40;

/* loaded from: /home/user/work/p/classes4.dex */
public final class es implements aaShadow.a {
    public static final es a = new es();
    public static final List b = sy.d0Shadow.n("unminimizeComment");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        b50 b50Var = null;
        while (eVar.r0(b) == 0) {
            b50Var = (b50) aa.c.b(aa.c.c(gs.a, false)).a(eVar, wVar);
        }
        return new z40(b50Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        z40 z40Var = (z40) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(z40Var, "value");
        fVar.z0("unminimizeComment");
        aa.c.b(aa.c.c(gs.a, false)).b(fVar, wVar, z40Var.a);
    }
}
