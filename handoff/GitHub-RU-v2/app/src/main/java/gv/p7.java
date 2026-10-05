package gv;

import java.util.Iterator;
import java.util.List;
import m10.da0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class p7 implements aa.a {
    public static final p7 a = new p7();
    public static final List b = sy.d0.o("id", "state", "contexts", "__typename");

    public final Object a(ea.e eVar, aa.w wVar) {
        Object obj;
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        da0 da0Var = null;
        b5 b5Var = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 1) {
                String u = eVar.u();
                k71.k.d(u);
                da0.Companion.getClass();
                Iterator it = da0.v.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (((da0) obj).r.equals(u)) {
                        break;
                    }
                }
                da0 da0Var2 = (da0) obj;
                da0Var = da0Var2 == null ? da0.t : da0Var2;
            } else if (r0 == 2) {
                b5Var = (b5) aa.c.c(o6.a, false).a(eVar, wVar);
            } else {
                if (r0 != 3) {
                    break;
                }
                str2 = (String) aa.c.a.a(eVar, wVar);
            }
        }
        if (str == null) {
            k41.b.B(eVar, "id");
            throw null;
        }
        if (da0Var == null) {
            k41.b.B(eVar, "state");
            throw null;
        }
        if (b5Var == null) {
            k41.b.B(eVar, "contexts");
            throw null;
        }
        if (str2 != null) {
            return new b6(str, da0Var, b5Var, str2);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        b6 b6Var = (b6) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(b6Var, "value");
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, b6Var.a);
        fVar.z0("state");
        fVar.I(b6Var.b.r);
        fVar.z0("contexts");
        aa.c.c(o6.a, false).b(fVar, wVar, b6Var.c);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, b6Var.d);
    }
}
