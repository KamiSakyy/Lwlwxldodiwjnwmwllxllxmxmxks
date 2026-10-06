package qx;

import java.util.Iterator;
import java.util.List;
import m10.dg0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class f implements aa.a {
    public static final f a = new f();
    public static final List b = sy.d0Shadow.o("identifier", "hidden");

    public final Object a(ea.e eVar, aa.w wVar) {
        Object obj;
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        dg0 dg0Var = null;
        Boolean bool = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                String u = eVar.u();
                k71.k.d(u);
                dg0.Companion.getClass();
                Iterator it = dg0.C.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (((dg0) obj).r.equals(u)) {
                        break;
                    }
                }
                dg0 dg0Var2 = (dg0) obj;
                dg0Var = dg0Var2 == null ? dg0.A : dg0Var2;
            } else {
                if (r0 != 1) {
                    break;
                }
                bool = (Boolean) aa.c.f.a(eVar, wVar);
            }
        }
        if (dg0Var == null) {
            k41.b.B(eVar, "identifier");
            throw null;
        }
        if (bool != null) {
            return new b(dg0Var, bool.booleanValue());
        }
        k41.b.B(eVar, "hidden");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        b bVar = (b) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(bVar, "value");
        fVar.z0("identifier");
        fVar.I(bVar.a.r);
        fVar.z0("hidden");
        aa.c.f.b(fVar, wVar, Boolean.valueOf(bVar.b));
    }
}
