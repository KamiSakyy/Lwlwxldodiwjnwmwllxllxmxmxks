package eo0;

import java.util.List;
import jn0.x90;
import jn0.z90;

/* loaded from: /home/user/work/p/classes4.dex */
public final class vv implements aaShadow.a {
    public static final vv a = new vv();
    public static final List b = sy.d0Shadow.n("updateDiscussion");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        z90 z90Var = null;
        while (eVar.r0(b) == 0) {
            z90Var = (z90) aa.c.b(aa.c.c(xv.a, false)).a(eVar, wVar);
        }
        return new x90(z90Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        x90 x90Var = (x90) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(x90Var, "value");
        fVar.z0("updateDiscussion");
        aa.c.b(aa.c.c(xv.a, false)).b(fVar, wVar, x90Var.a);
    }
}
