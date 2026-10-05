package ep;

import java.util.List;
import jo.b60;
import jo.y50;

/* loaded from: /home/user/work/p/classes3.dex */
public final class kt implements aa.a {
    public static final kt a = new kt();
    public static final List b = sy.d0.n("assignable");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        y50 y50Var = null;
        while (eVar.r0(b) == 0) {
            y50Var = (y50) aa.c.b(aa.c.c(ht.a, true)).a(eVar, wVar);
        }
        return new b60(y50Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        b60 b60Var = (b60) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(b60Var, "value");
        fVar.z0("assignable");
        aa.c.b(aa.c.c(ht.a, true)).b(fVar, wVar, b60Var.a);
    }
}
