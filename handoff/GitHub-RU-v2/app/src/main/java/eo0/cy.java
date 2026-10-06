package eo0;

import java.util.List;
import jn0.ad0;
import jn0.bd0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class cy implements aaShadow.a {
    public static final cy a = new cy();
    public static final List b = sy.d0Shadow.n("pullRequest");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        ad0 ad0Var = null;
        while (eVar.r0(b) == 0) {
            ad0Var = (ad0) aa.c.b(aa.c.c(ay.a, false)).a(eVar, wVar);
        }
        return new bd0(ad0Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        bd0 bd0Var = (bd0) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(bd0Var, "value");
        fVar.z0("pullRequest");
        aa.c.b(aa.c.c(ay.a, false)).b(fVar, wVar, bd0Var.a);
    }
}
