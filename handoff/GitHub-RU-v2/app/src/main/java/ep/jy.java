package ep;

import java.util.List;
import jo.nd0;
import jo.pd0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class jy implements aaShadow.a {
    public static final jy a = new jy();
    public static final List b = sy.d0Shadow.n("updateIssue");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        pd0 pd0Var = null;
        while (eVar.r0(b) == 0) {
            pd0Var = (pd0) aa.c.b(aa.c.c(ly.a, false)).a(eVar, wVar);
        }
        return new nd0(pd0Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        nd0 nd0Var = (nd0) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(nd0Var, "value");
        fVar.z0("updateIssue");
        aa.c.b(aa.c.c(ly.a, false)).b(fVar, wVar, nd0Var.a);
    }
}
