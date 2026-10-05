package mz;

import java.util.Iterator;
import java.util.List;
import m10.b4;
import m10.t3;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class f implements aa.a {
    public static final List a = x61.l.r(new String[]{"id", "url", "conclusion", "status"});

    public static lz.g c(ea.e eVar, aa.w wVar) {
        Object obj;
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        String str2 = null;
        t3 t3Var = null;
        b4 b4Var = null;
        while (true) {
            int r0 = eVar.r0(a);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 1) {
                str2 = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 2) {
                t3Var = (t3) aa.c.b(n10.a.d).a(eVar, wVar);
            } else {
                if (r0 != 3) {
                    break;
                }
                String u = eVar.u();
                k71.k.d(u);
                b4.Companion.getClass();
                Iterator it = b4.v.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (((b4) obj).r.equals(u)) {
                        break;
                    }
                }
                b4 b4Var2 = (b4) obj;
                b4Var = b4Var2 == null ? b4.t : b4Var2;
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
        if (b4Var != null) {
            return new lz.g(str, str2, t3Var, b4Var);
        }
        k41.b.B(eVar, "status");
        throw null;
    }

    public static void d(ea.f fVar, aa.w wVar, lz.g gVar) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(gVar, "value");
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, gVar.a);
        fVar.z0("url");
        bVar.b(fVar, wVar, gVar.b);
        fVar.z0("conclusion");
        aa.c.b(n10.a.d).b(fVar, wVar, gVar.c);
        fVar.z0("status");
        fVar.I(gVar.d.r);
    }
}
