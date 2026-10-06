package fd0;

import java.util.List;
import kc0.m60;
import kc0.s60;

/* loaded from: /home/user/work/p/classes4.dex */
public final class dt implements aaShadow.a {
    public static final dt a = new dt();
    public static final List b = sy.d0.n("updateIssue");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        s60 s60Var = null;
        while (eVar.r0(b) == 0) {
            s60Var = (s60) aa.c.b(aa.c.c(kt.a, false)).a(eVar, wVar);
        }
        return new m60(s60Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        m60 m60Var = (m60) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(m60Var, "value");
        fVar.z0("updateIssue");
        aa.c.b(aa.c.c(kt.a, false)).b(fVar, wVar, m60Var.a);
    }
}
