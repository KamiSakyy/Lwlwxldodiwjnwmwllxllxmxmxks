package p20;

import java.util.List;
import u10.w20;
import u10.y20;

/* loaded from: /home/user/work/p/classes3.dex */
public final class tq implements aaShadow.a {
    public static final tq a = new tq();
    public static final List b = sy.d0.o("clientMutationId", "pullRequest");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        w20 w20Var = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                str = (String) aa.c.i.a(eVar, wVar);
            } else {
                if (r0 != 1) {
                    return new y20(str, w20Var);
                }
                w20Var = (w20) aa.c.b(aa.c.c(rq.a, false)).a(eVar, wVar);
            }
        }
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        y20 y20Var = (y20) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(y20Var, "value");
        fVar.z0("clientMutationId");
        aa.c.i.b(fVar, wVar, y20Var.a);
        fVar.z0("pullRequest");
        aa.c.b(aa.c.c(rq.a, false)).b(fVar, wVar, y20Var.b);
    }
}
