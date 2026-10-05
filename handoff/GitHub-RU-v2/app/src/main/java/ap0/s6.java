package ap0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class s6 implements aa.a {
    public static final s6 a = new s6();
    public static final List b = sy.d0.n("node");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        l6 l6Var = null;
        while (eVar.r0(b) == 0) {
            l6Var = (l6) aa.c.b(aa.c.c(t6.a, false)).a(eVar, wVar);
        }
        return new k6(l6Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        k6 k6Var = (k6) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(k6Var, "value");
        fVar.z0("node");
        aa.c.b(aa.c.c(t6.a, false)).b(fVar, wVar, k6Var.a);
    }
}
