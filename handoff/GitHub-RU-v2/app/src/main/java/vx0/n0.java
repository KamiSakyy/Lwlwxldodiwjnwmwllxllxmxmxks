package vx0;

import java.util.List;
import ux0.j1;

/* loaded from: /home/user/work/p/classes4.dex */
public final class n0 implements aa.a {
    public static final n0 a = new n0();
    public static final List b = sy.d0.n("clientMutationId");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        while (eVar.r0(b) == 0) {
            str = (String) aa.c.i.a(eVar, wVar);
        }
        return new j1(str);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        j1 j1Var = (j1) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(j1Var, "value");
        fVar.z0("clientMutationId");
        aa.c.i.b(fVar, wVar, j1Var.a);
    }
}
