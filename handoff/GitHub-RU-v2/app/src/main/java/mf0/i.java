package mf0;

import aa.w;
import gn0.j8;
import java.util.Iterator;
import java.util.List;
import k71.k;
import sy.d0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class i implements aa.a {
    public static final i a = new i();
    public static final List b = d0.o(new String[]{"__typename", "state", "environmentUrl", "deployment", "id"});

    public final Object a(ea.e eVar, w wVar) {
        Object obj;
        k.g(eVar, "reader");
        k.g(wVar, "customScalarAdapters");
        String str = null;
        j8 j8Var = null;
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
                j8.Companion.getClass();
                Iterator it = j8.v.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (((j8) obj).r.equals(u)) {
                        break;
                    }
                }
                j8 j8Var2 = (j8) obj;
                j8Var = j8Var2 == null ? j8.t : j8Var2;
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
        if (j8Var == null) {
            k41.b.B(eVar, "state");
            throw null;
        }
        if (bVar == null) {
            k41.b.B(eVar, "deployment");
            throw null;
        }
        if (str3 != null) {
            return new c(str, j8Var, str2, bVar, str3);
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
