package ep;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class k5 implements aaShadow.a {
    public static final k5 a = new k5();
    public static final List b = sy.d0Shadow.n("createIssue");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        jo.d8 d8Var = null;
        while (eVar.r0(b) == 0) {
            d8Var = (jo.d8) aa.c.b(aa.c.c(j5.a, false)).a(eVar, wVar);
        }
        return new jo.e8(d8Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jo.e8 e8Var = (jo.e8) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(e8Var, "value");
        fVar.z0("createIssue");
        aa.c.b(aa.c.c(j5.a, false)).b(fVar, wVar, e8Var.a);
    }
}
