package oa0;

import hc0.uu;
import java.util.Iterator;
import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class y implements aa.a {
    public static final y a = new y();
    public static final List b = sy.d0Shadow.o("id", "state", "contexts", "__typename");

    public final Object a(ea.e eVar, aa.w wVar) {
        Object obj;
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        uu uuVar = null;
        na0.v vVar = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 1) {
                String u = eVar.u();
                k71.k.d(u);
                uu.Companion.getClass();
                Iterator it = uu.v.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (((uu) obj).r.equals(u)) {
                        break;
                    }
                }
                uu uuVar2 = (uu) obj;
                uuVar = uuVar2 == null ? uu.t : uuVar2;
            } else if (r0 == 2) {
                vVar = (na0.v) aa.c.c(o.a, false).a(eVar, wVar);
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
        if (uuVar == null) {
            k41.b.B(eVar, "state");
            throw null;
        }
        if (vVar == null) {
            k41.b.B(eVar, "contexts");
            throw null;
        }
        if (str2 != null) {
            return new na0.f0(str, uuVar, vVar, str2);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        na0.f0 f0Var = (na0.f0) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(f0Var, "value");
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, f0Var.a);
        fVar.z0("state");
        fVar.I(f0Var.b.r);
        fVar.z0("contexts");
        aa.c.c(o.a, false).b(fVar, wVar, f0Var.c);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, f0Var.d);
    }
}
