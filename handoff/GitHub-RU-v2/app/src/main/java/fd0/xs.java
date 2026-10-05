package fd0;

import java.util.List;
import kc0.b60;
import kc0.c60;

/* loaded from: /home/user/work/p/classes4.dex */
public final class xs implements aa.a {
    public static final xs a = new xs();
    public static final List b = sy.d0.n("discussion");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        b60 b60Var = null;
        while (eVar.r0(b) == 0) {
            b60Var = (b60) aa.c.b(aa.c.c(ws.a, false)).a(eVar, wVar);
        }
        return new c60(b60Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        c60 c60Var = (c60) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(c60Var, "value");
        fVar.z0("discussion");
        aa.c.b(aa.c.c(ws.a, false)).b(fVar, wVar, c60Var.a);
    }
}
