package ep;

import java.util.List;
import jo.ne0;
import jo.re0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class fz implements aa.a {
    public static final fz a = new fz();
    public static final List b = sy.d0.o("pullRequest", "clientMutationId");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        ne0 ne0Var = null;
        String str = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                ne0Var = (ne0) aa.c.b(aa.c.c(bz.a, true)).a(eVar, wVar);
            } else {
                if (r0 != 1) {
                    return new re0(ne0Var, str);
                }
                str = (String) aa.c.i.a(eVar, wVar);
            }
        }
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        re0 re0Var = (re0) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(re0Var, "value");
        fVar.z0("pullRequest");
        aa.c.b(aa.c.c(bz.a, true)).b(fVar, wVar, re0Var.a);
        fVar.z0("clientMutationId");
        aa.c.i.b(fVar, wVar, re0Var.b);
    }
}
