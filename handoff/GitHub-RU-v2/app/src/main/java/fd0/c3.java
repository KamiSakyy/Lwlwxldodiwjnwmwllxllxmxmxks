package fd0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class c3 implements aaShadow.a {
    public static final c3 a = new c3();
    public static final List b = sy.d0Shadow.n("closePullRequest");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        kc0.v4 v4Var = null;
        while (eVar.r0(b) == 0) {
            v4Var = (kc0.v4) aa.c.b(aa.c.c(b3.a, false)).a(eVar, wVar);
        }
        return new kc0.x4(v4Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        kc0.x4 x4Var = (kc0.x4) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(x4Var, "value");
        fVar.z0("closePullRequest");
        aa.c.b(aa.c.c(b3.a, false)).b(fVar, wVar, x4Var.a);
    }
}
