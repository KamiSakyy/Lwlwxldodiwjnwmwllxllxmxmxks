package fd0;

import java.util.List;
import kc0.w30;
import kc0.x30;

/* loaded from: /home/user/work/p/classes4.dex */
public final class lr implements aaShadow.a {
    public static final lr a = new lr();
    public static final List b = sy.d0.n("user");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        x30 x30Var = null;
        while (eVar.r0(b) == 0) {
            x30Var = (x30) aa.c.b(aa.c.c(mr.a, true)).a(eVar, wVar);
        }
        return new w30(x30Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        w30 w30Var = (w30) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(w30Var, "value");
        fVar.z0("user");
        aa.c.b(aa.c.c(mr.a, true)).b(fVar, wVar, w30Var.a);
    }
}
