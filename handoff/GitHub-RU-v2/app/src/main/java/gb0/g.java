package gb0;

import hc0.j2;
import hc0.p2;
import java.util.Iterator;
import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class g implements aa.a {
    public static final List a = x61.l.r(new String[]{"id", "url", "conclusion", "status"});

    public static fb0.h c(ea.e eVar, aa.w wVar) {
        Object obj;
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        String str2 = null;
        j2 j2Var = null;
        p2 p2Var = null;
        while (true) {
            int r0 = eVar.r0(a);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 1) {
                str2 = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 2) {
                j2Var = (j2) aa.c.b(ic0.a.b).a(eVar, wVar);
            } else {
                if (r0 != 3) {
                    break;
                }
                String u = eVar.u();
                k71.k.d(u);
                p2.Companion.getClass();
                Iterator it = p2.v.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (((p2) obj).r.equals(u)) {
                        break;
                    }
                }
                p2 p2Var2 = (p2) obj;
                p2Var = p2Var2 == null ? p2.t : p2Var2;
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
        if (p2Var != null) {
            return new fb0.h(str, str2, j2Var, p2Var);
        }
        k41.b.B(eVar, "status");
        throw null;
    }

    public static void d(ea.f fVar, aa.w wVar, fb0.h hVar) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(hVar, "value");
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, hVar.a);
        fVar.z0("url");
        bVar.b(fVar, wVar, hVar.b);
        fVar.z0("conclusion");
        aa.c.b(ic0.a.b).b(fVar, wVar, hVar.c);
        fVar.z0("status");
        fVar.I(hVar.d.r);
    }
}
