package p20;

import java.util.List;
import u10.a80;
import u10.b80;

/* loaded from: /home/user/work/p/classes3.dex */
public final class hu implements aa.a {
    public static final hu a = new hu();
    public static final List b = sy.d0.n("subscribable");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        a80 a80Var = null;
        while (eVar.r0(b) == 0) {
            a80Var = (a80) aa.c.b(aa.c.c(gu.a, true)).a(eVar, wVar);
        }
        return new b80(a80Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        b80 b80Var = (b80) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(b80Var, "value");
        fVar.z0("subscribable");
        aa.c.b(aa.c.c(gu.a, true)).b(fVar, wVar, b80Var.a);
    }
}
