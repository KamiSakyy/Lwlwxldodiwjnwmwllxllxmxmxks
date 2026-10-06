package fd0;

import java.util.List;
import kc0.h20;

/* loaded from: /home/user/work/p/classes4.dex */
public final class iq implements aaShadow.a {
    public static final iq a = new iq();
    public static final List b = sy.d0Shadow.n("success");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        Boolean bool = null;
        while (eVar.r0(b) == 0) {
            bool = (Boolean) aa.c.k.a(eVar, wVar);
        }
        return new h20(bool);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        h20 h20Var = (h20) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(h20Var, "value");
        fVar.z0("success");
        aa.c.k.b(fVar, wVar, h20Var.a);
    }
}
