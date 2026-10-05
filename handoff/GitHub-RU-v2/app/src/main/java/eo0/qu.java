package eo0;

import java.util.List;
import jn0.c80;
import jn0.d80;

/* loaded from: /home/user/work/p/classes4.dex */
public final class qu implements aa.a {
    public static final qu a = new qu();
    public static final List b = sy.d0.n("unlockLockable");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        d80 d80Var = null;
        while (eVar.r0(b) == 0) {
            d80Var = (d80) aa.c.b(aa.c.c(ru.a, false)).a(eVar, wVar);
        }
        return new c80(d80Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        c80 c80Var = (c80) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(c80Var, "value");
        fVar.z0("unlockLockable");
        aa.c.b(aa.c.c(ru.a, false)).b(fVar, wVar, c80Var.a);
    }
}
