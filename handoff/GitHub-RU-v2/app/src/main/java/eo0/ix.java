package eo0;

import java.util.List;
import jn0.cc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class ix implements aaShadow.a {
    public static final ix a = new ix();
    public static final List b = sy.d0Shadow.n("nodes");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        List list = null;
        while (eVar.r0(b) == 0) {
            list = (List) aa.c.b(aa.c.a(aa.c.b(aa.c.c(ex.a, true)))).a(eVar, wVar);
        }
        return new cc0(list);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        cc0 cc0Var = (cc0) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(cc0Var, "value");
        fVar.z0("nodes");
        aa.c.b(aa.c.a(aa.c.b(aa.c.c(ex.a, true)))).b(fVar, wVar, cc0Var.a);
    }
}
