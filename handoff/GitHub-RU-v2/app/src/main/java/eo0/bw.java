package eo0;

import java.util.List;
import jn0.ha0;
import jn0.ja0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class bw implements aa.a {
    public static final bw a = new bw();
    public static final List b = sy.d0.n("updateIssueComment");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        ja0 ja0Var = null;
        while (eVar.r0(b) == 0) {
            ja0Var = (ja0) aa.c.b(aa.c.c(dw.a, false)).a(eVar, wVar);
        }
        return new ha0(ja0Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        ha0 ha0Var = (ha0) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(ha0Var, "value");
        fVar.z0("updateIssueComment");
        aa.c.b(aa.c.c(dw.a, false)).b(fVar, wVar, ha0Var.a);
    }
}
