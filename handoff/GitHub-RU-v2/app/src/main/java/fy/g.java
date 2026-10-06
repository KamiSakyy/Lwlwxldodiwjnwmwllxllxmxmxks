package fy;

import aa.w;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import m10.ba0;
import sy.d0Shadow;

/* loaded from: /home/user/work/p/classes3.dex */
public final class g implements aa.a {
    public static final g a = new g();
    public static final List b = d0Shadow.o("combinedState", "summary");

    public final Object a(ea.e eVar, w wVar) {
        Object obj;
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        ba0 ba0Var = null;
        ArrayList arrayList = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                String u = eVar.u();
                k71.k.d(u);
                ba0.Companion.getClass();
                Iterator it = ba0.v.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (((ba0) obj).r.equals(u)) {
                        break;
                    }
                }
                ba0 ba0Var2 = (ba0) obj;
                ba0Var = ba0Var2 == null ? ba0.t : ba0Var2;
            } else {
                if (r0 != 1) {
                    break;
                }
                arrayList = aa.c.a(aa.c.c(h.a, false)).c(eVar, wVar);
            }
        }
        if (ba0Var == null) {
            k41.b.B(eVar, "combinedState");
            throw null;
        }
        if (arrayList != null) {
            return new ey.h(ba0Var, arrayList);
        }
        k41.b.B(eVar, "summary");
        throw null;
    }

    public final void b(ea.f fVar, w wVar, Object obj) {
        ey.h hVar = (ey.h) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(hVar, "value");
        fVar.z0("combinedState");
        fVar.I(hVar.a.r);
        fVar.z0("summary");
        aa.c.a(aa.c.c(h.a, false)).e(fVar, wVar, hVar.b);
    }

}
