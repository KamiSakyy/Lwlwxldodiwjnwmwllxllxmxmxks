package fd0;

import java.util.List;
import kc0.o80;
import kc0.v80;

/* loaded from: /home/user/work/p/classes4.dex */
public final class su implements aaShadow.a {
    public static final su a = new su();
    public static final List b = sy.d0Shadow.n("requestReviews");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        v80 v80Var = null;
        while (eVar.r0(b) == 0) {
            v80Var = (v80) aa.c.b(aa.c.c(zu.a, false)).a(eVar, wVar);
        }
        return new o80(v80Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        o80 o80Var = (o80) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(o80Var, "value");
        fVar.z0("requestReviews");
        aa.c.b(aa.c.c(zu.a, false)).b(fVar, wVar, o80Var.a);
    }
}
