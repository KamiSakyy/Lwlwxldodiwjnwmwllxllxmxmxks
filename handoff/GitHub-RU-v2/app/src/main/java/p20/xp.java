package p20;

import java.util.List;
import u10.q10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class xp implements aa.a {
    public static final xp a = new xp();
    public static final List b = sy.d0.n("clientMutationId");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        while (eVar.r0(b) == 0) {
            str = (String) aa.c.i.a(eVar, wVar);
        }
        return new q10(str);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        q10 q10Var = (q10) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(q10Var, "value");
        fVar.z0("clientMutationId");
        aa.c.i.b(fVar, wVar, q10Var.a);
    }
}
