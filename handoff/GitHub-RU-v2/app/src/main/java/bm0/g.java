package bm0;

import gn0.l2;
import gn0.r2;
import java.util.Iterator;
import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class g implements aa.a {
    public static final List a = x61.l.r(new String[]{"id", "url", "conclusion", "status"});

    public static am0.h c(ea.e eVar, aa.w wVar) {
        Object obj;
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        String str2 = null;
        l2 l2Var = null;
        r2 r2Var = null;
        while (true) {
            int r0 = eVar.r0(a);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 1) {
                str2 = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 2) {
                l2Var = (l2) aa.c.b(hn0.a.b).a(eVar, wVar);
            } else {
                if (r0 != 3) {
                    break;
                }
                String u = eVar.u();
                k71.k.d(u);
                r2.Companion.getClass();
                Iterator it = r2.v.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (((r2) obj).r.equals(u)) {
                        break;
                    }
                }
                r2 r2Var2 = (r2) obj;
                r2Var = r2Var2 == null ? r2.t : r2Var2;
            }
        }
        if (str == null) {
            k41.b.B(eVar, "id");
            throw null;
        }
        if (str2 == null) {
            k41.b.B(eVar, "url");
            throw null;
        }
        if (r2Var != null) {
            return new am0.h(str, str2, l2Var, r2Var);
        }
        k41.b.B(eVar, "status");
        throw null;
    }

    public static void d(ea.f fVar, aa.w wVar, am0.h hVar) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(hVar, "value");
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, hVar.a);
        fVar.z0("url");
        bVar.b(fVar, wVar, hVar.b);
        fVar.z0("conclusion");
        aa.c.b(hn0.a.b).b(fVar, wVar, hVar.c);
        fVar.z0("status");
        fVar.I(hVar.d.r);
    }
}
