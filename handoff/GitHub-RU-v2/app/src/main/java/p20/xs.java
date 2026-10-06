package p20;

import java.util.List;
import u10.e60;
import u10.k60;

/* loaded from: /home/user/work/p/classes3.dex */
public final class xs implements aaShadow.a {
    public static final xs a = new xs();
    public static final List b = sy.d0.n("updatePullRequest");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        k60 k60Var = null;
        while (eVar.r0(b) == 0) {
            k60Var = (k60) aa.c.b(aa.c.c(dt.a, false)).a(eVar, wVar);
        }
        return new e60(k60Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        e60 e60Var = (e60) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(e60Var, "value");
        fVar.z0("updatePullRequest");
        aa.c.b(aa.c.c(dt.a, false)).b(fVar, wVar, e60Var.a);
    }
}
