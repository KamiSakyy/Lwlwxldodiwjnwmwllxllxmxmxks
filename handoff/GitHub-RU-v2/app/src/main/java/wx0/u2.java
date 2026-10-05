package wx0;

import java.util.Iterator;
import java.util.List;
import pz0.ko;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class u2 implements aa.a {
    public static final List a = x61.l.r(new String[]{"id", "dataType", "name"});

    public static m0 c(ea.e eVar, aa.w wVar) {
        Object obj;
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        ko koVar = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(a);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 1) {
                String u = eVar.u();
                k71.k.d(u);
                ko.Companion.getClass();
                Iterator it = ko.w.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (((ko) obj).r.equals(u)) {
                        break;
                    }
                }
                ko koVar2 = (ko) obj;
                koVar = koVar2 == null ? ko.u : koVar2;
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
        if (koVar == null) {
            k41.b.B(eVar, "dataType");
            throw null;
        }
        if (str2 != null) {
            return new m0(str, koVar, str2);
        }
        k41.b.B(eVar, "name");
        throw null;
    }

    public static void d(ea.f fVar, aa.w wVar, m0 m0Var) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(m0Var, "value");
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, m0Var.a);
        fVar.z0("dataType");
        fVar.I(m0Var.b.r);
        fVar.z0("name");
        bVar.b(fVar, wVar, m0Var.c);
    }
}
