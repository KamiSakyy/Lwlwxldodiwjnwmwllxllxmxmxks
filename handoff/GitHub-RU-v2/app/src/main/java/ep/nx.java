package ep;

import java.util.List;
import jo.gc0;
import jo.ic0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class nx implements aaShadow.a {
    public static final nx a = new nx();
    public static final List b = sy.d0.n("updateDiscussion");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        ic0 ic0Var = null;
        while (eVar.r0(b) == 0) {
            ic0Var = (ic0) aa.c.b(aa.c.c(px.a, false)).a(eVar, wVar);
        }
        return new gc0(ic0Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        gc0 gc0Var = (gc0) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(gc0Var, "value");
        fVar.z0("updateDiscussion");
        aa.c.b(aa.c.c(px.a, false)).b(fVar, wVar, gc0Var.a);
    }
}
