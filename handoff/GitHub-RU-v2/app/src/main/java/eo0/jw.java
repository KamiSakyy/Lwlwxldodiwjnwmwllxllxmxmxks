package eo0;

import java.util.List;
import jn0.ta0;
import jn0.wa0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class jw implements aaShadow.a {
    public static final jw a = new jw();
    public static final List b = sy.d0Shadow.n("updateIssue");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        wa0 wa0Var = null;
        while (eVar.r0(b) == 0) {
            wa0Var = (wa0) aa.c.b(aa.c.c(mw.a, false)).a(eVar, wVar);
        }
        return new ta0(wa0Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        ta0 ta0Var = (ta0) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(ta0Var, "value");
        fVar.z0("updateIssue");
        aa.c.b(aa.c.c(mw.a, false)).b(fVar, wVar, ta0Var.a);
    }
}
