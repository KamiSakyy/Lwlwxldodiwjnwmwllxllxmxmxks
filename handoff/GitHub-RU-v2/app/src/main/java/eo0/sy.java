package eo0;

import java.util.List;
import jn0.ae0;
import jn0.be0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class syShadow implements aaShadow.a {
    public static final syShadow a = new syShadow();
    public static final List b = sy.d0Shadow.n("subscribable");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        ae0 ae0Var = null;
        while (eVar.r0(b) == 0) {
            ae0Var = (ae0) aa.c.b(aa.c.c(ry.a, true)).a(eVar, wVar);
        }
        return new be0(ae0Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        be0 be0Var = (be0) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(be0Var, "value");
        fVar.z0("subscribable");
        aa.c.b(aa.c.c(ry.a, true)).b(fVar, wVar, be0Var.a);
    }
}
