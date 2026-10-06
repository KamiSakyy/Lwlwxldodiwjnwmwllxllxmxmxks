package ep;

import java.util.List;
import jo.ka0;
import jo.la0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class hw implements aaShadow.a {
    public static final hw a = new hw();
    public static final List b = sy.d0.n("unfollowUser");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        la0 la0Var = null;
        while (eVar.r0(b) == 0) {
            la0Var = (la0) aa.c.b(aa.c.c(iw.a, false)).a(eVar, wVar);
        }
        return new ka0(la0Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        ka0 ka0Var = (ka0) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(ka0Var, "value");
        fVar.z0("unfollowUser");
        aa.c.b(aa.c.c(iw.a, false)).b(fVar, wVar, ka0Var.a);
    }
}
