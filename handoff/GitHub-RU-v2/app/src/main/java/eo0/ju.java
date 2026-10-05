package eo0;

import java.util.List;
import jn0.p70;

/* loaded from: /home/user/work/p/classes4.dex */
public final class ju implements aa.a {
    public static final ju a = new ju();
    public static final List b = sy.d0.n("clientMutationId");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        while (eVar.r0(b) == 0) {
            str = (String) aa.c.i.a(eVar, wVar);
        }
        return new p70(str);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        p70 p70Var = (p70) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(p70Var, "value");
        fVar.z0("clientMutationId");
        aa.c.i.b(fVar, wVar, p70Var.a);
    }
}
