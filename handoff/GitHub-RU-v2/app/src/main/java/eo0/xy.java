package eo0;

import java.util.Iterator;
import java.util.List;
import jn0.ke0;
import pz0.i90;

/* loaded from: /home/user/work/p/classes4.dex */
public final class xy implements aaShadow.a {
    public static final xy a = new xy();
    public static final List b = sy.d0Shadow.o(new String[]{"identifier", "hidden"});

    public final Object a(ea.e eVar, aa.w wVar) {
        Object obj;
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        i90 i90Var = null;
        Boolean bool = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                String u = eVar.u();
                k71.k.d(u);
                i90.Companion.getClass();
                Iterator it = i90.C.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (((i90) obj).r.equals(u)) {
                        break;
                    }
                }
                i90 i90Var2 = (i90) obj;
                i90Var = i90Var2 == null ? i90.A : i90Var2;
            } else {
                if (r0 != 1) {
                    break;
                }
                bool = (Boolean) aa.c.f.a(eVar, wVar);
            }
        }
        if (i90Var == null) {
            k41.b.B(eVar, "identifier");
            throw null;
        }
        if (bool != null) {
            return new ke0(i90Var, bool.booleanValue());
        }
        k41.b.B(eVar, "hidden");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        ke0 ke0Var = (ke0) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(ke0Var, "value");
        fVar.z0("identifier");
        fVar.I(ke0Var.a.r);
        fVar.z0("hidden");
        aa.c.f.b(fVar, wVar, Boolean.valueOf(ke0Var.b));
    }
}
