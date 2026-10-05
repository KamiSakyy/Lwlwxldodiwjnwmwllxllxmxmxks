package u40;

import aa.w;
import hc0.z7;
import java.util.Iterator;
import java.util.List;
import k71.k;
import sy.d0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class h implements aa.a {
    public static final h a = new h();
    public static final List b = d0.o("__typename", "state", "environmentUrl", "id");

    public final Object a(ea.e eVar, w wVar) {
        Object obj;
        k.g(eVar, "reader");
        k.g(wVar, "customScalarAdapters");
        String str = null;
        z7 z7Var = null;
        String str2 = null;
        String str3 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 1) {
                String u = eVar.u();
                k.d(u);
                z7.Companion.getClass();
                Iterator it = z7.v.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (((z7) obj).r.equals(u)) {
                        break;
                    }
                }
                z7 z7Var2 = (z7) obj;
                z7Var = z7Var2 == null ? z7.t : z7Var2;
            } else if (r0 == 2) {
                str2 = (String) aa.c.i.a(eVar, wVar);
            } else {
                if (r0 != 3) {
                    break;
                }
                str3 = (String) aa.c.a.a(eVar, wVar);
            }
        }
        if (str == null) {
            k41.b.B(eVar, "__typename");
            throw null;
        }
        if (z7Var == null) {
            k41.b.B(eVar, "state");
            throw null;
        }
        if (str3 != null) {
            return new c(str, z7Var, str2, str3);
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
        fVar.z0("id");
        bVar.b(fVar, wVar, cVar.d);
    }
}
