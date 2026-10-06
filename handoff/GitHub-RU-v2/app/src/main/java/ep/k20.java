package ep;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jo.rj0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class k20 implements aaShadow.a {
    public static final k20 a = new k20();
    public static final List b = sy.d0.o("allowableStatus", "mergeMethods", "name");

    public final Object a(ea.e eVar, aa.w wVar) {
        Object obj;
        Object obj2;
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        m10.ry ryVar = null;
        ArrayList arrayList = null;
        m10.ny nyVar = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                String u = eVar.u();
                k71.k.d(u);
                m10.ry.Companion.getClass();
                Iterator it = m10.ry.v.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj2 = null;
                        break;
                    }
                    obj2 = it.next();
                    if (((m10.ry) obj2).r.equals(u)) {
                        break;
                    }
                }
                m10.ry ryVar2 = (m10.ry) obj2;
                ryVar = ryVar2 == null ? m10.ry.t : ryVar2;
            } else if (r0 == 1) {
                arrayList = aa.c.a(aa.c.c(g20.a, false)).c(eVar, wVar);
            } else {
                if (r0 != 2) {
                    break;
                }
                String u2 = eVar.u();
                k71.k.d(u2);
                m10.ny.Companion.getClass();
                Iterator it2 = m10.ny.x.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it2.next();
                    if (((m10.ny) obj).r.equals(u2)) {
                        break;
                    }
                }
                m10.ny nyVar2 = (m10.ny) obj;
                nyVar = nyVar2 == null ? m10.ny.v : nyVar2;
            }
        }
        if (ryVar == null) {
            k41.b.B(eVar, "allowableStatus");
            throw null;
        }
        if (arrayList == null) {
            k41.b.B(eVar, "mergeMethods");
            throw null;
        }
        if (nyVar != null) {
            return new rj0(ryVar, arrayList, nyVar);
        }
        k41.b.B(eVar, "name");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        rj0 rj0Var = (rj0) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(rj0Var, "value");
        fVar.z0("allowableStatus");
        fVar.I(rj0Var.a.r);
        fVar.z0("mergeMethods");
        aa.c.a(aa.c.c(g20.a, false)).e(fVar, wVar, rj0Var.b);
        fVar.z0("name");
        fVar.I(rj0Var.c.r);
    }
}
