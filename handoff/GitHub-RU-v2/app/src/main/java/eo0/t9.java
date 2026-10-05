package eo0;

import java.util.Iterator;
import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class t9 implements aa.a {
    public static final t9 a = new t9();
    public static final List b = sy.d0.o(new String[]{"isEnabled", "filterGroup"});

    public final Object a(ea.e eVar, aa.w wVar) {
        Object obj;
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        Boolean bool = null;
        pz0.g7 g7Var = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                bool = (Boolean) aa.c.f.a(eVar, wVar);
            } else {
                if (r0 != 1) {
                    break;
                }
                String u = eVar.u();
                k71.k.d(u);
                pz0.g7.Companion.getClass();
                Iterator it = pz0.g7.D.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (((pz0.g7) obj).r.equals(u)) {
                        break;
                    }
                }
                pz0.g7 g7Var2 = (pz0.g7) obj;
                g7Var = g7Var2 == null ? pz0.g7.B : g7Var2;
            }
        }
        if (bool == null) {
            k41.b.B(eVar, "isEnabled");
            throw null;
        }
        boolean booleanValue = bool.booleanValue();
        if (g7Var != null) {
            return new jn0.oe(booleanValue, g7Var);
        }
        k41.b.B(eVar, "filterGroup");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jn0.oe oeVar = (jn0.oe) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(oeVar, "value");
        fVar.z0("isEnabled");
        jo.f4.C(oeVar.a, aa.c.f, fVar, wVar, "filterGroup");
        fVar.I(oeVar.b.r);
    }
}
