package ep;

import java.util.List;
import jo.hc0;
import jo.ic0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class px implements aaShadow.a {
    public static final px a = new px();
    public static final List b = sy.d0.n("discussion");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        hc0 hc0Var = null;
        while (eVar.r0(b) == 0) {
            hc0Var = (hc0) aa.c.b(aa.c.c(ox.a, true)).a(eVar, wVar);
        }
        return new ic0(hc0Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        ic0 ic0Var = (ic0) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(ic0Var, "value");
        fVar.z0("discussion");
        aa.c.b(aa.c.c(ox.a, true)).b(fVar, wVar, ic0Var.a);
    }
}
