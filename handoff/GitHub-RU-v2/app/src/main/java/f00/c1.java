package f00;

import java.util.Iterator;
import java.util.List;
import m10.cr;

/* loaded from: /home/user/work/p/classes3.dex */
public final class c1 implements aa.a {
    public static final c1 a = new c1();
    public static final List b = sy.d0Shadow.o("direction", "field");

    public final Object a(ea.e eVar, aa.w wVar) {
        Object obj;
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        cr crVar = null;
        q0 q0Var = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                String u = eVar.u();
                k71.k.d(u);
                cr.Companion.getClass();
                Iterator it = cr.x.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (((cr) obj).r.equals(u)) {
                        break;
                    }
                }
                cr crVar2 = (cr) obj;
                crVar = crVar2 == null ? cr.v : crVar2;
            } else {
                if (r0 != 1) {
                    break;
                }
                q0Var = (q0) aa.c.c(y0.a, true).a(eVar, wVar);
            }
        }
        if (crVar == null) {
            k41.b.B(eVar, "direction");
            throw null;
        }
        if (q0Var != null) {
            return new u0(crVar, q0Var);
        }
        k41.b.B(eVar, "field");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        u0 u0Var = (u0) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(u0Var, "value");
        fVar.z0("direction");
        fVar.I(u0Var.a.r);
        fVar.z0("field");
        aa.c.c(y0.a, true).b(fVar, wVar, u0Var.b);
    }
}
