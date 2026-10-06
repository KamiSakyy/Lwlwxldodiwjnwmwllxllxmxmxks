package fd0;

import java.util.List;
import kc0.k70;
import kc0.l70;

/* loaded from: /home/user/work/p/classes4.dex */
public final class vt implements aaShadow.a {
    public static final vt a = new vt();
    public static final List b = sy.d0.n("pullRequest");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        k70 k70Var = null;
        while (eVar.r0(b) == 0) {
            k70Var = (k70) aa.c.b(aa.c.c(ut.a, false)).a(eVar, wVar);
        }
        return new l70(k70Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        l70 l70Var = (l70) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(l70Var, "value");
        fVar.z0("pullRequest");
        aa.c.b(aa.c.c(ut.a, false)).b(fVar, wVar, l70Var.a);
    }
}
