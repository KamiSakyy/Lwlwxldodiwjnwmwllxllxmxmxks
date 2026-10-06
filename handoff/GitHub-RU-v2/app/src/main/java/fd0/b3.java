package fd0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class b3 implements aaShadow.a {
    public static final b3 a = new b3();
    public static final List b = sy.d0Shadow.n("pullRequest");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        kc0.y4 y4Var = null;
        while (eVar.r0(b) == 0) {
            y4Var = (kc0.y4) aa.c.b(aa.c.c(d3.a, false)).a(eVar, wVar);
        }
        return new kc0.v4(y4Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        kc0.v4 v4Var = (kc0.v4) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(v4Var, "value");
        fVar.z0("pullRequest");
        aa.c.b(aa.c.c(d3.a, false)).b(fVar, wVar, v4Var.a);
    }
}
