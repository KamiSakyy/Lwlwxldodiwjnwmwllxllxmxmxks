package fd0;

import java.util.List;
import kc0.e80;
import kc0.k80;

/* loaded from: /home/user/work/p/classes4.dex */
public final class ku implements aaShadow.a {
    public static final ku a = new ku();
    public static final List b = sy.d0.n("updatePullRequest");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        k80 k80Var = null;
        while (eVar.r0(b) == 0) {
            k80Var = (k80) aa.c.b(aa.c.c(qu.a, false)).a(eVar, wVar);
        }
        return new e80(k80Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        e80 e80Var = (e80) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(e80Var, "value");
        fVar.z0("updatePullRequest");
        aa.c.b(aa.c.c(qu.a, false)).b(fVar, wVar, e80Var.a);
    }
}
