package ep;

import java.util.List;
import jo.tg0;
import jo.ug0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class p00 implements aa.a {
    public static final p00 a = new p00();
    public static final List b = sy.d0.n("user");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        ug0 ug0Var = null;
        while (eVar.r0(b) == 0) {
            ug0Var = (ug0) aa.c.b(aa.c.c(q00.a, false)).a(eVar, wVar);
        }
        return new tg0(ug0Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        tg0 tg0Var = (tg0) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(tg0Var, "value");
        fVar.z0("user");
        aa.c.b(aa.c.c(q00.a, false)).b(fVar, wVar, tg0Var.a);
    }
}
