package fd0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class d4 implements aa.a {
    public static final d4 a = new d4();
    public static final List b = sy.d0.n("commit");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        kc0.g6 g6Var = null;
        while (eVar.r0(b) == 0) {
            g6Var = (kc0.g6) aa.c.b(aa.c.c(c4.a, true)).a(eVar, wVar);
        }
        return new kc0.i6(g6Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        kc0.i6 i6Var = (kc0.i6) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(i6Var, "value");
        fVar.z0("commit");
        aa.c.b(aa.c.c(c4.a, true)).b(fVar, wVar, i6Var.a);
    }
}
