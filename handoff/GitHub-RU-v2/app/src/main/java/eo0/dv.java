package eo0;

import java.util.List;
import jn0.r80;
import jn0.t80;

/* loaded from: /home/user/work/p/classes4.dex */
public final class dv implements aaShadow.a {
    public static final dv a = new dv();
    public static final List b = sy.d0.o(new String[]{"clientMutationId", "pullRequest"});

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        r80 r80Var = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                str = (String) aa.c.i.a(eVar, wVar);
            } else {
                if (r0 != 1) {
                    return new t80(str, r80Var);
                }
                r80Var = (r80) aa.c.b(aa.c.c(bv.a, false)).a(eVar, wVar);
            }
        }
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        t80 t80Var = (t80) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(t80Var, "value");
        fVar.z0("clientMutationId");
        aa.c.i.b(fVar, wVar, t80Var.a);
        fVar.z0("pullRequest");
        aa.c.b(aa.c.c(bv.a, false)).b(fVar, wVar, t80Var.b);
    }
}
