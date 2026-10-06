package fd0;

import java.util.List;
import kc0.b90;
import kc0.z80;

/* loaded from: /home/user/work/p/classes4.dex */
public final class bv implements aaShadow.a {
    public static final bv a = new bv();
    public static final List b = sy.d0.n("updatePullRequest");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        b90 b90Var = null;
        while (eVar.r0(b) == 0) {
            b90Var = (b90) aa.c.b(aa.c.c(dv.a, false)).a(eVar, wVar);
        }
        return new z80(b90Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        z80 z80Var = (z80) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(z80Var, "value");
        fVar.z0("updatePullRequest");
        aa.c.b(aa.c.c(dv.a, false)).b(fVar, wVar, z80Var.a);
    }
}
