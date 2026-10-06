package ep;

import java.util.List;
import jo.fb0;
import jo.hb0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class ywShadow implements aaShadow.a {
    public static final ywShadow a = new ywShadow();
    public static final List b = sy.d0Shadow.o("clientMutationId", "pullRequest");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        fb0 fb0Var = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                str = (String) aa.c.i.a(eVar, wVar);
            } else {
                if (r0 != 1) {
                    return new hb0(str, fb0Var);
                }
                fb0Var = (fb0) aa.c.b(aa.c.c(ww.a, false)).a(eVar, wVar);
            }
        }
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        hb0 hb0Var = (hb0) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(hb0Var, "value");
        fVar.z0("clientMutationId");
        aa.c.i.b(fVar, wVar, hb0Var.a);
        fVar.z0("pullRequest");
        aa.c.b(aa.c.c(ww.a, false)).b(fVar, wVar, hb0Var.b);
    }
}
