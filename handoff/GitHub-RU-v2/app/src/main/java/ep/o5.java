package ep;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class o5 implements aaShadow.a {
    public static final o5 a = new o5();
    public static final List b = sy.d0Shadow.n("createPullRequest");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        jo.j8 j8Var = null;
        while (eVar.r0(b) == 0) {
            j8Var = (jo.j8) aa.c.b(aa.c.c(n5.a, false)).a(eVar, wVar);
        }
        return new jo.k8(j8Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jo.k8 k8Var = (jo.k8) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(k8Var, "value");
        fVar.z0("createPullRequest");
        aa.c.b(aa.c.c(n5.a, false)).b(fVar, wVar, k8Var.a);
    }
}
