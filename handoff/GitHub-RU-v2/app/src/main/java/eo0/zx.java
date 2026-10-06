package eo0;

import java.util.List;
import jn0.bd0;
import jn0.zc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class zx implements aaShadow.a {
    public static final zx a = new zx();
    public static final List b = sy.d0Shadow.n("updatePullRequest");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        bd0 bd0Var = null;
        while (eVar.r0(b) == 0) {
            bd0Var = (bd0) aa.c.b(aa.c.c(cy.a, false)).a(eVar, wVar);
        }
        return new zc0(bd0Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        zc0 zc0Var = (zc0) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(zc0Var, "value");
        fVar.z0("updatePullRequest");
        aa.c.b(aa.c.c(cy.a, false)).b(fVar, wVar, zc0Var.a);
    }
}
