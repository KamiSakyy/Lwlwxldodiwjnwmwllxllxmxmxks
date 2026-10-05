package k00;

import j00.x0;
import j00.y0;
import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class g0 implements aa.a {
    public static final g0 a = new g0();
    public static final List b = sy.d0.o("clientMutationId", "user");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        y0 y0Var = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                str = (String) aa.c.i.a(eVar, wVar);
            } else {
                if (r0 != 1) {
                    return new x0(str, y0Var);
                }
                y0Var = (y0) aa.c.b(aa.c.c(h0.a, false)).a(eVar, wVar);
            }
        }
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        x0 x0Var = (x0) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(x0Var, "value");
        fVar.z0("clientMutationId");
        aa.c.i.b(fVar, wVar, x0Var.a);
        fVar.z0("user");
        aa.c.b(aa.c.c(h0.a, false)).b(fVar, wVar, x0Var.b);
    }
}
