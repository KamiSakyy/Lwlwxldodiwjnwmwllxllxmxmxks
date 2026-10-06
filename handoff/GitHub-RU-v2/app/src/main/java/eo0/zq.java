package eo0;

import java.util.List;
import jn0.s20;

/* loaded from: /home/user/work/p/classes4.dex */
public final class zq implements aaShadow.a {
    public static final zq a = new zq();
    public static final List b = sy.d0.n("nodes");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        List list = null;
        while (eVar.r0(b) == 0) {
            list = (List) aa.c.b(aa.c.a(aa.c.b(aa.c.c(vq.a, false)))).a(eVar, wVar);
        }
        return new s20(list);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        s20 s20Var = (s20) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(s20Var, "value");
        fVar.z0("nodes");
        aa.c.b(aa.c.a(aa.c.b(aa.c.c(vq.a, false)))).b(fVar, wVar, s20Var.a);
    }
}
