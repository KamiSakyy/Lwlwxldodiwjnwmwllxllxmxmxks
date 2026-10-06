package p20;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class d5 implements aaShadow.a {
    public static final d5 a = new d5();
    public static final List b = sy.d0Shadow.n("deleteIssueComment");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        u10.x7 x7Var = null;
        while (eVar.r0(b) == 0) {
            x7Var = (u10.x7) aa.c.b(aa.c.c(e5.a, false)).a(eVar, wVar);
        }
        return new u10.w7(x7Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        u10.w7 w7Var = (u10.w7) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(w7Var, "value");
        fVar.z0("deleteIssueComment");
        aa.c.b(aa.c.c(e5.a, false)).b(fVar, wVar, w7Var.a);
    }
}
