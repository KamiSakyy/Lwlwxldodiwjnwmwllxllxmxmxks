package jl0;

import aa.w;
import il0.b0;
import il0.f0;
import java.util.List;
import sy.d0Shadow;

/* loaded from: /home/user/work/p/classes4.dex */
public final class q implements aa.a {
    public static final q a = new q();
    public static final List b = d0Shadow.n("updateUserListsForItem");

    public final Object a(ea.e eVar, w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        f0 f0Var = null;
        while (eVar.r0(b) == 0) {
            f0Var = (f0) aa.c.b(aa.c.c(u.a, false)).a(eVar, wVar);
        }
        return new b0(f0Var);
    }

    public final void b(ea.f fVar, w wVar, Object obj) {
        b0 b0Var = (b0) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(b0Var, "value");
        fVar.z0("updateUserListsForItem");
        aa.c.b(aa.c.c(u.a, false)).b(fVar, wVar, b0Var.a);
    }
}
