package ep;

import java.util.List;
import jo.hd0;
import jo.kd0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class fy implements aaShadow.a {
    public static final fy a = new fy();
    public static final List b = sy.d0.n("updateIssue");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        kd0 kd0Var = null;
        while (eVar.r0(b) == 0) {
            kd0Var = (kd0) aa.c.b(aa.c.c(iy.a, false)).a(eVar, wVar);
        }
        return new hd0(kd0Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        hd0 hd0Var = (hd0) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(hd0Var, "value");
        fVar.z0("updateIssue");
        aa.c.b(aa.c.c(iy.a, false)).b(fVar, wVar, hd0Var.a);
    }
}
