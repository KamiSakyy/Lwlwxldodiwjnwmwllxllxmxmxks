package wx0;

import java.util.Iterator;
import java.util.List;
import pz0.ko;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class n4 implements aa.a {
    public static final List a = x61.l.r(new String[]{"id", "databaseId", "name", "dataType", "configuration", "__typename"});

    public static j4 c(ea.e eVar, aa.w wVar) {
        Object obj;
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        Integer num = null;
        String str2 = null;
        ko koVar = null;
        h4 h4Var = null;
        String str3 = null;
        while (true) {
            int r0 = eVar.r0(a);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 1) {
                num = (Integer) aa.c.b(ro0.a.a).a(eVar, wVar);
            } else if (r0 == 2) {
                str2 = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 3) {
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
            } else if (r0 == 4) {
                h4Var = (h4) aa.c.c(l4.a, false).a(eVar, wVar);
            } else {
                if (r0 != 5) {
                    break;
                }
                str3 = (String) aa.c.a.a(eVar, wVar);
            }
        }
        if (str == null) {
            k41.b.B(eVar, "id");
            throw null;
        }
        if (str2 == null) {
            k41.b.B(eVar, "name");
            throw null;
        }
        if (koVar == null) {
            k41.b.B(eVar, "dataType");
            throw null;
        }
        if (h4Var == null) {
            k41.b.B(eVar, "configuration");
            throw null;
        }
        if (str3 != null) {
            return new j4(str, num, str2, koVar, h4Var, str3);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public static void d(ea.f fVar, aa.w wVar, j4 j4Var) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(j4Var, "value");
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, j4Var.a);
        fVar.z0("databaseId");
        aa.c.b(ro0.a.a).b(fVar, wVar, j4Var.b);
        fVar.z0("name");
        bVar.b(fVar, wVar, j4Var.c);
        fVar.z0("dataType");
        fVar.I(j4Var.d.r);
        fVar.z0("configuration");
        aa.c.c(l4.a, false).b(fVar, wVar, j4Var.e);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, j4Var.f);
    }
}
