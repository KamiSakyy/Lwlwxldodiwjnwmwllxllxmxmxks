package fd0;

import java.util.List;
import kc0.f60;
import kc0.h60;

/* loaded from: /home/user/work/p/classes4.dex */
public final class ys implements aaShadow.a {
    public static final ys a = new ys();
    public static final List b = sy.d0.n("updateIssueComment");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        h60 h60Var = null;
        while (eVar.r0(b) == 0) {
            h60Var = (h60) aa.c.b(aa.c.c(at.a, false)).a(eVar, wVar);
        }
        return new f60(h60Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        f60 f60Var = (f60) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(f60Var, "value");
        fVar.z0("updateIssueComment");
        aa.c.b(aa.c.c(at.a, false)).b(fVar, wVar, f60Var.a);
    }
}
