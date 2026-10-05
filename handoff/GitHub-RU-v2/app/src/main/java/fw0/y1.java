package fw0;

import java.util.Iterator;
import java.util.List;
import pz0.p20;

/* loaded from: /home/user/work/p/classes4.dex */
public final class y1 implements aa.a {
    public static final y1 a = new y1();
    public static final List b = sy.d0.o(new String[]{"displayName", "provider", "url"});

    public final Object a(ea.e eVar, aa.w wVar) {
        Object obj;
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        p20 p20Var = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 1) {
                String u = eVar.u();
                k71.k.d(u);
                p20.Companion.getClass();
                Iterator it = p20.v.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (((p20) obj).r.equals(u)) {
                        break;
                    }
                }
                p20 p20Var2 = (p20) obj;
                p20Var = p20Var2 == null ? p20.t : p20Var2;
            } else {
                if (r0 != 2) {
                    break;
                }
                str2 = (String) aa.c.a.a(eVar, wVar);
            }
        }
        if (str == null) {
            k41.b.B(eVar, "displayName");
            throw null;
        }
        if (p20Var == null) {
            k41.b.B(eVar, "provider");
            throw null;
        }
        if (str2 != null) {
            return new j1(str, p20Var, str2);
        }
        k41.b.B(eVar, "url");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        j1 j1Var = (j1) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(j1Var, "value");
        fVar.z0("displayName");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, j1Var.a);
        fVar.z0("provider");
        fVar.I(j1Var.b.r);
        fVar.z0("url");
        bVar.b(fVar, wVar, j1Var.c);
    }
}
