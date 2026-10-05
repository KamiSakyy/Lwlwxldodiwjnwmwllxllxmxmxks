package ep;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class n5 implements aa.a {
    public static final n5 a = new n5();
    public static final List b = sy.d0.n("pullRequest");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        jo.m8 m8Var = null;
        while (eVar.r0(b) == 0) {
            m8Var = (jo.m8) aa.c.b(aa.c.c(q5.a, false)).a(eVar, wVar);
        }
        return new jo.j8(m8Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jo.j8 j8Var = (jo.j8) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(j8Var, "value");
        fVar.z0("pullRequest");
        aa.c.b(aa.c.c(q5.a, false)).b(fVar, wVar, j8Var.a);
    }
}
