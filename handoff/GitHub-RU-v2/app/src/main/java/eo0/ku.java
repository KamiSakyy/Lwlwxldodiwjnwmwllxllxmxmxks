package eo0;

import java.util.List;
import jn0.s70;
import jn0.t70;

/* loaded from: /home/user/work/p/classes4.dex */
public final class ku implements aaShadow.a {
    public static final ku a = new ku();
    public static final List b = sy.d0.n("unfollowUser");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        t70 t70Var = null;
        while (eVar.r0(b) == 0) {
            t70Var = (t70) aa.c.b(aa.c.c(lu.a, false)).a(eVar, wVar);
        }
        return new s70(t70Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        s70 s70Var = (s70) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(s70Var, "value");
        fVar.z0("unfollowUser");
        aa.c.b(aa.c.c(lu.a, false)).b(fVar, wVar, s70Var.a);
    }
}
