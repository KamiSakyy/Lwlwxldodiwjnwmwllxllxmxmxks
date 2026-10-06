package eo0;

import java.util.List;
import jn0.ob0;
import jn0.pb0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class xw implements aaShadow.a {
    public static final xw a = new xw();
    public static final List b = sy.d0Shadow.n("pullRequest");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        ob0 ob0Var = null;
        while (eVar.r0(b) == 0) {
            ob0Var = (ob0) aa.c.b(aa.c.c(ww.a, false)).a(eVar, wVar);
        }
        return new pb0(ob0Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        pb0 pb0Var = (pb0) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(pb0Var, "value");
        fVar.z0("pullRequest");
        aa.c.b(aa.c.c(ww.a, false)).b(fVar, wVar, pb0Var.a);
    }
}
