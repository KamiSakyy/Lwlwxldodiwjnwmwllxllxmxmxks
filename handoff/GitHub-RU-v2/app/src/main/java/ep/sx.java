package ep;

import java.util.List;
import jo.mc0;
import jo.nc0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class sx implements aaShadow.a {
    public static final sx a = new sx();
    public static final List b = sy.d0.n("discussion");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        mc0 mc0Var = null;
        while (eVar.r0(b) == 0) {
            mc0Var = (mc0) aa.c.b(aa.c.c(rx.a, false)).a(eVar, wVar);
        }
        return new nc0(mc0Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        nc0 nc0Var = (nc0) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(nc0Var, "value");
        fVar.z0("discussion");
        aa.c.b(aa.c.c(rx.a, false)).b(fVar, wVar, nc0Var.a);
    }
}
