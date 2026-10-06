package qx;

import java.util.Iterator;
import java.util.List;
import m10.p80;

/* loaded from: /home/user/work/p/classes3.dex */
public final class z1 implements aa.a {
    public static final z1 a = new z1();
    public static final List b = sy.d0Shadow.o("displayName", "provider", "url");

    public final Object a(ea.e eVar, aa.w wVar) {
        Object obj;
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        p80 p80Var = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 1) {
                String u = eVar.u();
                k71.k.d(u);
                p80.Companion.getClass();
                Iterator it = p80.v.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (((p80) obj).r.equals(u)) {
                        break;
                    }
                }
                p80 p80Var2 = (p80) obj;
                p80Var = p80Var2 == null ? p80.t : p80Var2;
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
        if (p80Var == null) {
            k41.b.B(eVar, "provider");
            throw null;
        }
        if (str2 != null) {
            return new j1(str, p80Var, str2);
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
