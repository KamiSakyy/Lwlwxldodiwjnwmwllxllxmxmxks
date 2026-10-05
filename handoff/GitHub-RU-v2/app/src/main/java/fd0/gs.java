package fd0;

import java.util.List;
import kc0.b50;
import kc0.c50;

/* loaded from: /home/user/work/p/classes4.dex */
public final class gs implements aa.a {
    public static final gs a = new gs();
    public static final List b = sy.d0.n("unminimizedComment");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        c50 c50Var = null;
        while (eVar.r0(b) == 0) {
            c50Var = (c50) aa.c.b(aa.c.c(hs.a, true)).a(eVar, wVar);
        }
        return new b50(c50Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        b50 b50Var = (b50) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(b50Var, "value");
        fVar.z0("unminimizedComment");
        aa.c.b(aa.c.c(hs.a, true)).b(fVar, wVar, b50Var.a);
    }
}
