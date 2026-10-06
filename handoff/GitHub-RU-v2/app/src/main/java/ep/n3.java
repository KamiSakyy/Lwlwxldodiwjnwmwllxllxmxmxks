package ep;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class n3 implements aaShadow.a {
    public static final n3 a = new n3();
    public static final List b = sy.d0Shadow.n("closePullRequest");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        jo.l5 l5Var = null;
        while (eVar.r0(b) == 0) {
            l5Var = (jo.l5) aa.c.b(aa.c.c(m3.a, false)).a(eVar, wVar);
        }
        return new jo.n5(l5Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jo.n5 n5Var = (jo.n5) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(n5Var, "value");
        fVar.z0("closePullRequest");
        aa.c.b(aa.c.c(m3.a, false)).b(fVar, wVar, n5Var.a);
    }
}
