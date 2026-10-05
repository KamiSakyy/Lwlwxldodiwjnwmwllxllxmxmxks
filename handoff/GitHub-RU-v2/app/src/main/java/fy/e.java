package fy;

import aa.w;
import java.util.List;
import sy.d0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class e implements aa.a {
    public static final e a = new e();
    public static final List b = d0.o("statusChecks", "statusRollup");

    public final Object a(ea.e eVar, w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        ey.g gVar = null;
        ey.h hVar = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                gVar = (ey.g) aa.c.b(aa.c.c(f.a, false)).a(eVar, wVar);
            } else {
                if (r0 != 1) {
                    break;
                }
                hVar = (ey.h) aa.c.c(g.a, false).a(eVar, wVar);
            }
        }
        if (hVar != null) {
            return new ey.f(gVar, hVar);
        }
        k41.b.B(eVar, "statusRollup");
        throw null;
    }

    public final void b(ea.f fVar, w wVar, Object obj) {
        ey.f fVar2 = (ey.f) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(fVar2, "value");
        fVar.z0("statusChecks");
        aa.c.b(aa.c.c(f.a, false)).b(fVar, wVar, fVar2.a);
        fVar.z0("statusRollup");
        aa.c.c(g.a, false).b(fVar, wVar, fVar2.b);
    }

}
