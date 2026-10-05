package fy;

import aa.w;
import ey.r;
import ey.s;
import java.util.List;
import sy.d0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class n implements aa.a {
    public static final n a = new n();
    public static final List b = d0.o("statusRollup", "statusChecks");

    public final Object a(ea.e eVar, w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        s sVar = null;
        r rVar = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                sVar = (s) aa.c.c(p.a, false).a(eVar, wVar);
            } else {
                if (r0 != 1) {
                    break;
                }
                rVar = (r) aa.c.b(aa.c.c(o.a, false)).a(eVar, wVar);
            }
        }
        if (sVar != null) {
            return new ey.q(sVar, rVar);
        }
        k41.b.B(eVar, "statusRollup");
        throw null;
    }

    public final void b(ea.f fVar, w wVar, Object obj) {
        ey.q qVar = (ey.q) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(qVar, "value");
        fVar.z0("statusRollup");
        aa.c.c(p.a, false).b(fVar, wVar, qVar.a);
        fVar.z0("statusChecks");
        aa.c.b(aa.c.c(o.a, false)).b(fVar, wVar, qVar.b);
    }
}
