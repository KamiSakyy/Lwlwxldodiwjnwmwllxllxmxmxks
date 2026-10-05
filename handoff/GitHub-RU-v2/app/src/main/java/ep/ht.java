package ep;

import java.util.List;
import jo.y50;

/* loaded from: /home/user/work/p/classes3.dex */
public final class ht implements aa.a {
    public static final ht a = new ht();
    public static final List b = sy.d0.n("__typename");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        while (eVar.r0(b) == 0) {
            str = (String) aa.c.a.a(eVar, wVar);
        }
        eVar.s0();
        gq.c c = gq.d.c(eVar, wVar);
        if (str != null) {
            return new y50(str, c);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        y50 y50Var = (y50) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(y50Var, "value");
        fVar.z0("__typename");
        aa.c.a.b(fVar, wVar, y50Var.a);
        List list = gq.d.a;
        gq.d.d(fVar, wVar, y50Var.b);
    }
}
