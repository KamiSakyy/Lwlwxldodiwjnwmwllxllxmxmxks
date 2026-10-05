package p20;

import java.util.Iterator;
import java.util.List;
import u10.h60;

/* loaded from: /home/user/work/p/classes3.dex */
public final class at implements aa.a {
    public static final at a = new at();
    public static final List b = sy.d0.o("id", "name", "state", "__typename");

    public final Object a(ea.e eVar, aa.w wVar) {
        Object obj;
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        String str2 = null;
        hc0.dk dkVar = null;
        String str3 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 1) {
                str2 = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 2) {
                String u = eVar.u();
                k71.k.d(u);
                hc0.dk.Companion.getClass();
                Iterator it = hc0.dk.v.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (((hc0.dk) obj).r.equals(u)) {
                        break;
                    }
                }
                hc0.dk dkVar2 = (hc0.dk) obj;
                dkVar = dkVar2 == null ? hc0.dk.t : dkVar2;
            } else {
                if (r0 != 3) {
                    break;
                }
                str3 = (String) aa.c.a.a(eVar, wVar);
            }
        }
        if (str == null) {
            k41.b.B(eVar, "id");
            throw null;
        }
        if (str2 == null) {
            k41.b.B(eVar, "name");
            throw null;
        }
        if (dkVar == null) {
            k41.b.B(eVar, "state");
            throw null;
        }
        if (str3 != null) {
            return new h60(str, str2, dkVar, str3);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        h60 h60Var = (h60) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(h60Var, "value");
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, h60Var.a);
        fVar.z0("name");
        bVar.b(fVar, wVar, h60Var.b);
        fVar.z0("state");
        fVar.I(h60Var.c.r);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, h60Var.d);
    }
}
