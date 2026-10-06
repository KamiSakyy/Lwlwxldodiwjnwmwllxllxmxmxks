package eo0;

import java.util.List;
import jn0.h70;

/* loaded from: /home/user/work/p/classes4.dex */
public final class fu implements aaShadow.a {
    public static final fu a = new fu();
    public static final List b = sy.d0Shadow.n("clientMutationId");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        while (eVar.r0(b) == 0) {
            str = (String) aa.c.i.a(eVar, wVar);
        }
        return new h70(str);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        h70 h70Var = (h70) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(h70Var, "value");
        fVar.z0("clientMutationId");
        aa.c.i.b(fVar, wVar, h70Var.a);
    }
}
