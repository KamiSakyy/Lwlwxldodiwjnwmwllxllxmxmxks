package fd0;

import java.util.List;
import kc0.b10;
import kc0.c10;

/* loaded from: /home/user/work/p/classes4.dex */
public final class mp implements aaShadow.a {
    public static final mp a = new mp();
    public static final List b = sy.d0.n("node");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        c10 c10Var = null;
        while (eVar.r0(b) == 0) {
            c10Var = (c10) aa.c.b(aa.c.c(np.a, true)).a(eVar, wVar);
        }
        return new b10(c10Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        b10 b10Var = (b10) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(b10Var, "value");
        fVar.z0("node");
        aa.c.b(aa.c.c(np.a, true)).b(fVar, wVar, b10Var.a);
    }
}
