package eo0;

import java.util.List;
import jn0.l70;

/* loaded from: /home/user/work/p/classes4.dex */
public final class hu implements aaShadow.a {
    public static final hu a = new hu();
    public static final List b = sy.d0.n("clientMutationId");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        while (eVar.r0(b) == 0) {
            str = (String) aa.c.i.a(eVar, wVar);
        }
        return new l70(str);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        l70 l70Var = (l70) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(l70Var, "value");
        fVar.z0("clientMutationId");
        aa.c.i.b(fVar, wVar, l70Var.a);
    }
}
