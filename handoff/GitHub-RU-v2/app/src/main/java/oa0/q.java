package oa0;

import hc0.uu;
import java.util.Iterator;
import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class q implements aa.a {
    public static final q a = new q();
    public static final List b = sy.d0.o("id", "context", "state", "description", "__typename");

    public final Object a(ea.e eVar, aa.w wVar) {
        Object obj;
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        String str2 = null;
        uu uuVar = null;
        String str3 = null;
        String str4 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 1) {
                str2 = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 2) {
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
            } else if (r0 == 3) {
                str3 = (String) aa.c.i.a(eVar, wVar);
            } else {
                if (r0 != 4) {
                    break;
                }
                str4 = (String) aa.c.a.a(eVar, wVar);
            }
        }
        if (str == null) {
            k41.b.B(eVar, "id");
            throw null;
        }
        if (str2 == null) {
            k41.b.B(eVar, "context");
            throw null;
        }
        if (uuVar == null) {
            k41.b.B(eVar, "state");
            throw null;
        }
        if (str4 != null) {
            return new na0.x(str, str2, uuVar, str3, str4);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        na0.x xVar = (na0.x) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(xVar, "value");
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, xVar.a);
        fVar.z0("context");
        bVar.b(fVar, wVar, xVar.b);
        fVar.z0("state");
        fVar.I(xVar.c.r);
        fVar.z0("description");
        aa.c.i.b(fVar, wVar, xVar.d);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, xVar.e);
    }
}
