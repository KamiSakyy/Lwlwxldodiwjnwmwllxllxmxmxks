package p20;

import java.util.List;
import u10.xy;

/* loaded from: /home/user/work/p/classes3.dex */
public final class xn implements aa.a {
    public static final xn a = new xn();
    public static final List b = sy.d0.n("shortcuts");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        List list = null;
        while (eVar.r0(b) == 0) {
            list = (List) aa.c.b(aa.c.a(aa.c.c(yn.a, true))).a(eVar, wVar);
        }
        return new xy(list);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        xy xyVar = (xy) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(xyVar, "value");
        fVar.z0("shortcuts");
        aa.c.b(aa.c.a(aa.c.c(yn.a, true))).b(fVar, wVar, xyVar.a);
    }
}
