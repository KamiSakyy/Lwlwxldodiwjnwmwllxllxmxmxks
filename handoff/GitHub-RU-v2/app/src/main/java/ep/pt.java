package ep;

import java.util.List;
import jo.k60;

/* loaded from: /home/user/work/p/classes3.dex */
public final class pt implements aa.a {
    public static final pt a = new pt();
    public static final List b = sy.d0.n("shortcuts");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        List list = null;
        while (eVar.r0(b) == 0) {
            list = (List) aa.c.b(aa.c.a(aa.c.c(qt.a, true))).a(eVar, wVar);
        }
        return new k60(list);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        k60 k60Var = (k60) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(k60Var, "value");
        fVar.z0("shortcuts");
        aa.c.b(aa.c.a(aa.c.c(qt.a, true))).b(fVar, wVar, k60Var.a);
    }
}
