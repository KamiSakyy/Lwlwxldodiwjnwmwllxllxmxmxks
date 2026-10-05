package as;

import aa.w;
import java.util.Iterator;
import java.util.List;
import k71.k;
import m10.oc;
import sy.d0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class i implements aa.a {
    public static final i a = new i();
    public static final List b = d0.o("__typename", "state", "environmentUrl", "deployment", "id");

    public final Object a(ea.e eVar, w wVar) {
        Object obj;
        k.g(eVar, "reader");
        k.g(wVar, "customScalarAdapters");
        String str = null;
        oc ocVar = null;
        String str2 = null;
        b bVar = null;
        String str3 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 1) {
                String u = eVar.u();
                k.d(u);
                oc.Companion.getClass();
                Iterator it = oc.v.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (((oc) obj).r.equals(u)) {
                        break;
                    }
                }
                oc ocVar2 = (oc) obj;
                ocVar = ocVar2 == null ? oc.t : ocVar2;
            } else if (r0 == 2) {
                str2 = (String) aa.c.i.a(eVar, wVar);
            } else if (r0 == 3) {
                bVar = (b) aa.c.c(h.a, false).a(eVar, wVar);
            } else {
                if (r0 != 4) {
                    break;
                }
                str3 = (String) aa.c.a.a(eVar, wVar);
            }
        }
        if (str == null) {
            k41.b.B(eVar, "__typename");
            throw null;
        }
        if (ocVar == null) {
            k41.b.B(eVar, "state");
            throw null;
        }
        if (bVar == null) {
            k41.b.B(eVar, "deployment");
            throw null;
        }
        if (str3 != null) {
            return new c(str, ocVar, str2, bVar, str3);
        }
        k41.b.B(eVar, "id");
        throw null;
    }

    public final void b(ea.f fVar, w wVar, Object obj) {
        c cVar = (c) obj;
        k.g(fVar, "writer");
        k.g(wVar, "customScalarAdapters");
        k.g(cVar, "value");
        fVar.z0("__typename");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, cVar.a);
        fVar.z0("state");
        fVar.I(cVar.b.r);
        fVar.z0("environmentUrl");
        aa.c.i.b(fVar, wVar, cVar.c);
        fVar.z0("deployment");
        aa.c.c(h.a, false).b(fVar, wVar, cVar.d);
        fVar.z0("id");
        bVar.b(fVar, wVar, cVar.e);
    }

}
