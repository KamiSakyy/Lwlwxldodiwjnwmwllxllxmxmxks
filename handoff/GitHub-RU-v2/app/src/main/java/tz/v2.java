package tz;

import java.util.Iterator;
import java.util.List;
import m10.pt;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class v2 implements aa.a {
    public static final List a = x61.l.r(new String[]{"id", "dataType", "name"});

    public static n0 c(ea.e eVar, aa.w wVar) {
        Object obj;
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        pt ptVar = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(a);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 1) {
                String u = eVar.u();
                k71.k.d(u);
                pt.Companion.getClass();
                Iterator it = pt.w.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (((pt) obj).r.equals(u)) {
                        break;
                    }
                }
                pt ptVar2 = (pt) obj;
                ptVar = ptVar2 == null ? pt.u : ptVar2;
            } else {
                if (r0 != 2) {
                    break;
                }
                str2 = (String) aa.c.a.a(eVar, wVar);
            }
        }
        if (str == null) {
            k41.b.B(eVar, "id");
            throw null;
        }
        if (ptVar == null) {
            k41.b.B(eVar, "dataType");
            throw null;
        }
        if (str2 != null) {
            return new n0(str, ptVar, str2);
        }
        k41.b.B(eVar, "name");
        throw null;
    }

    public static void d(ea.f fVar, aa.w wVar, n0 n0Var) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(n0Var, "value");
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, n0Var.a);
        fVar.z0("dataType");
        fVar.I(n0Var.b.r);
        fVar.z0("name");
        bVar.b(fVar, wVar, n0Var.c);
    }
}
