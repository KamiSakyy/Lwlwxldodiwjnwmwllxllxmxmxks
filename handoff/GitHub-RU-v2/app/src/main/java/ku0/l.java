package ku0;

import aa.w;
import java.util.Iterator;
import java.util.List;
import pz0.n30;
import sy.d0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class l implements aa.a {
    public static final l a = new l();
    public static final List b = d0.o(new String[]{"__typename", "state", "id"});

    public final Object a(ea.e eVar, w wVar) {
        Object obj;
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        n30 n30Var = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 1) {
                String u = eVar.u();
                k71.k.d(u);
                n30.Companion.getClass();
                Iterator it = n30.v.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (((n30) obj).r.equals(u)) {
                        break;
                    }
                }
                n30 n30Var2 = (n30) obj;
                n30Var = n30Var2 == null ? n30.t : n30Var2;
            } else {
                if (r0 != 2) {
                    break;
                }
                str2 = (String) aa.c.a.a(eVar, wVar);
            }
        }
        if (str == null) {
            k41.b.B(eVar, "__typename");
            throw null;
        }
        if (n30Var == null) {
            k41.b.B(eVar, "state");
            throw null;
        }
        if (str2 != null) {
            return new e(str, str2, n30Var);
        }
        k41.b.B(eVar, "id");
        throw null;
    }

    public final void b(ea.f fVar, w wVar, Object obj) {
        e eVar = (e) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(eVar, "value");
        fVar.z0("__typename");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, eVar.a);
        fVar.z0("state");
        fVar.I(eVar.b.r);
        fVar.z0("id");
        bVar.b(fVar, wVar, eVar.c);
    }
}
