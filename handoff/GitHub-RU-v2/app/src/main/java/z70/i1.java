package z70;

import hc0.z9;
import java.util.Iterator;
import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class i1 implements aa.a {
    public static final i1 a = new i1();
    public static final List b = sy.d0.o("viewerViewedState", "path");

    public final Object a(ea.e eVar, aa.w wVar) {
        Object obj;
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        z9 z9Var = null;
        String str = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                String u = eVar.u();
                k71.k.d(u);
                z9.Companion.getClass();
                Iterator it = z9.x.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (((z9) obj).r.equals(u)) {
                        break;
                    }
                }
                z9 z9Var2 = (z9) obj;
                z9Var = z9Var2 == null ? z9.v : z9Var2;
            } else {
                if (r0 != 1) {
                    break;
                }
                str = (String) aa.c.a.a(eVar, wVar);
            }
        }
        if (z9Var == null) {
            k41.b.B(eVar, "viewerViewedState");
            throw null;
        }
        if (str != null) {
            return new n0(z9Var, str);
        }
        k41.b.B(eVar, "path");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        n0 n0Var = (n0) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(n0Var, "value");
        fVar.z0("viewerViewedState");
        fVar.I(n0Var.a.r);
        fVar.z0("path");
        aa.c.a.b(fVar, wVar, n0Var.b);
    }
}
