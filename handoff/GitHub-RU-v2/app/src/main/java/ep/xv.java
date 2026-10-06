package ep;

import java.util.List;
import jo.p90;
import jo.q90;

/* loaded from: /home/user/work/p/classes3.dex */
public final class xv implements aaShadow.a {
    public static final xv a = new xv();
    public static final List b = sy.d0Shadow.n("thread");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        p90 p90Var = null;
        while (eVar.r0(b) == 0) {
            p90Var = (p90) aa.c.b(aa.c.c(wv.a, true)).a(eVar, wVar);
        }
        return new q90(p90Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        q90 q90Var = (q90) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(q90Var, "value");
        fVar.z0("thread");
        aa.c.b(aa.c.c(wv.a, true)).b(fVar, wVar, q90Var.a);
    }
}
