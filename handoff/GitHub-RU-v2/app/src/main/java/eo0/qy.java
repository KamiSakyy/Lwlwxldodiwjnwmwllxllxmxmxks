package eo0;

import java.util.List;
import jn0.be0;
import jn0.zd0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class qy implements aaShadow.a {
    public static final qy a = new qy();
    public static final List b = sy.d0Shadow.n("updateSubscription");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        be0 be0Var = null;
        while (eVar.r0(b) == 0) {
            be0Var = (be0) aa.c.b(aa.c.c(syShadow.a, false)).a(eVar, wVar);
        }
        return new zd0(be0Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        zd0 zd0Var = (zd0) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(zd0Var, "value");
        fVar.z0("updateSubscription");
        aa.c.b(aa.c.c(syShadow.a, false)).b(fVar, wVar, zd0Var.a);
    }
}
