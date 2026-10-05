package px0;

import java.util.Iterator;
import java.util.List;
import pz0.e3;
import pz0.y2;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class g implements aa.a {
    public static final List a = x61.l.r(new String[]{"id", "url", "conclusion", "status"});

    public static ox0.h c(ea.e eVar, aa.w wVar) {
        Object obj;
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        String str2 = null;
        y2 y2Var = null;
        e3 e3Var = null;
        while (true) {
            int r0 = eVar.r0(a);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 1) {
                str2 = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 2) {
                y2Var = (y2) aa.c.b(qz0.a.c).a(eVar, wVar);
            } else {
                if (r0 != 3) {
                    break;
                }
                String u = eVar.u();
                k71.k.d(u);
                e3.Companion.getClass();
                Iterator it = e3.v.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (((e3) obj).r.equals(u)) {
                        break;
                    }
                }
                e3 e3Var2 = (e3) obj;
                e3Var = e3Var2 == null ? e3.t : e3Var2;
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
        if (e3Var != null) {
            return new ox0.h(str, str2, y2Var, e3Var);
        }
        k41.b.B(eVar, "status");
        throw null;
    }

    public static void d(ea.f fVar, aa.w wVar, ox0.h hVar) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(hVar, "value");
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, hVar.a);
        fVar.z0("url");
        bVar.b(fVar, wVar, hVar.b);
        fVar.z0("conclusion");
        aa.c.b(qz0.a.c).b(fVar, wVar, hVar.c);
        fVar.z0("status");
        fVar.I(hVar.d.r);
    }
}
