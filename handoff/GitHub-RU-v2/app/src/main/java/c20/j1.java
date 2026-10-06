package c20;

import b20.c2;
import b20.d2;
import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class j1 implements aa.a {
    public static final j1 a = new j1();
    public static final List b = sy.d0Shadow.n("node");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        d2 d2Var = null;
        while (eVar.r0(b) == 0) {
            d2Var = (d2) aa.c.b(aa.c.c(k1.a, true)).a(eVar, wVar);
        }
        return new c2(d2Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        c2 c2Var = (c2) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(c2Var, "value");
        fVar.z0("node");
        aa.c.b(aa.c.c(k1.a, true)).b(fVar, wVar, c2Var.a);
    }
}
