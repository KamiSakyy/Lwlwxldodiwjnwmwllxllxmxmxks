package eo0;

import java.util.List;
import jn0.vd0;
import jn0.wd0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class py implements aa.a {
    public static final py a = new py();
    public static final List b = sy.d0.n("shortcut");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        vd0 vd0Var = null;
        while (eVar.r0(b) == 0) {
            vd0Var = (vd0) aa.c.b(aa.c.c(oy.a, true)).a(eVar, wVar);
        }
        return new wd0(vd0Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        wd0 wd0Var = (wd0) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(wd0Var, "value");
        fVar.z0("shortcut");
        aa.c.b(aa.c.c(oy.a, true)).b(fVar, wVar, wd0Var.a);
    }
}
