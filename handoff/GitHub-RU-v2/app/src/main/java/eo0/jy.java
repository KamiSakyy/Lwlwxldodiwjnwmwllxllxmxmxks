package eo0;

import java.util.List;
import jn0.ld0;
import jn0.md0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class jy implements aaShadow.a {
    public static final jy a = new jy();
    public static final List b = sy.d0Shadow.n("pullRequestReviewComment");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        ld0 ld0Var = null;
        while (eVar.r0(b) == 0) {
            ld0Var = (ld0) aa.c.b(aa.c.c(iy.a, true)).a(eVar, wVar);
        }
        return new md0(ld0Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        md0 md0Var = (md0) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(md0Var, "value");
        fVar.z0("pullRequestReviewComment");
        aa.c.b(aa.c.c(iy.a, true)).b(fVar, wVar, md0Var.a);
    }
}
