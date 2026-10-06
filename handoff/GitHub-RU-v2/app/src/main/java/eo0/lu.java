package eo0;

import java.util.List;
import jn0.t70;
import jn0.u70;

/* loaded from: /home/user/work/p/classes4.dex */
public final class lu implements aaShadow.a {
    public static final lu a = new lu();
    public static final List b = sy.d0Shadow.n("user");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        u70 u70Var = null;
        while (eVar.r0(b) == 0) {
            u70Var = (u70) aa.c.b(aa.c.c(mu.a, true)).a(eVar, wVar);
        }
        return new t70(u70Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        t70 t70Var = (t70) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(t70Var, "value");
        fVar.z0("user");
        aa.c.b(aa.c.c(mu.a, true)).b(fVar, wVar, t70Var.a);
    }
}
