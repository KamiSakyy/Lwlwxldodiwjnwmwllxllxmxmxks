package fd0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class g4 implements aaShadow.a {
    public static final g4 a = new g4();
    public static final List b = sy.d0.n("createDiscussion");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        kc0.m6 m6Var = null;
        while (eVar.r0(b) == 0) {
            m6Var = (kc0.m6) aa.c.b(aa.c.c(f4.a, false)).a(eVar, wVar);
        }
        return new kc0.n6(m6Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        kc0.n6 n6Var = (kc0.n6) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(n6Var, "value");
        fVar.z0("createDiscussion");
        aa.c.b(aa.c.c(f4.a, false)).b(fVar, wVar, n6Var.a);
    }
}
