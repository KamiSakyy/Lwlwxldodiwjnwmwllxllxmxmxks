package ep;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class e1 implements aa.a {
    public static final e1 a = new e1();
    public static final List b = sy.d0.n("addSubIssue");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        jo.b2 b2Var = null;
        while (eVar.r0(b) == 0) {
            b2Var = (jo.b2) aa.c.b(aa.c.c(d1.a, false)).a(eVar, wVar);
        }
        return new jo.d2(b2Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jo.d2 d2Var = (jo.d2) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(d2Var, "value");
        fVar.z0("addSubIssue");
        aa.c.b(aa.c.c(d1.a, false)).b(fVar, wVar, d2Var.a);
    }
}
