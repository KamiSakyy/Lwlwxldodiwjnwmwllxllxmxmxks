package ep;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class n6 implements aa.a {
    public static final n6 a = new n6();
    public static final List b = sy.d0.n("deleteIssueComment");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        jo.w9 w9Var = null;
        while (eVar.r0(b) == 0) {
            w9Var = (jo.w9) aa.c.b(aa.c.c(o6.a, false)).a(eVar, wVar);
        }
        return new jo.v9(w9Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jo.v9 v9Var = (jo.v9) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(v9Var, "value");
        fVar.z0("deleteIssueComment");
        aa.c.b(aa.c.c(o6.a, false)).b(fVar, wVar, v9Var.a);
    }
}
