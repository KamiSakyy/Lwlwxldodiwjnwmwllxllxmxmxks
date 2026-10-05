package tz;

import java.util.Iterator;
import java.util.List;
import m10.pt;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class p implements aa.a {
    public static final List a = x61.l.r(new String[]{"id", "databaseId", "name", "dataType", "__typename"});

    public static o c(ea.e eVar, aa.w wVar) {
        Object obj;
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        Integer num = null;
        String str2 = null;
        pt ptVar = null;
        String str3 = null;
        while (true) {
            int r0 = eVar.r0(a);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 1) {
                num = (Integer) aa.c.b(tp.a.a).a(eVar, wVar);
            } else if (r0 == 2) {
                str2 = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 3) {
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
                if (r0 != 4) {
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
        if (ptVar == null) {
            k41.b.B(eVar, "dataType");
            throw null;
        }
        if (str3 != null) {
            return new o(str, num, str2, ptVar, str3);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public static void d(ea.f fVar, aa.w wVar, o oVar) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(oVar, "value");
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, oVar.a);
        fVar.z0("databaseId");
        aa.c.b(tp.a.a).b(fVar, wVar, oVar.b);
        fVar.z0("name");
        bVar.b(fVar, wVar, oVar.c);
        fVar.z0("dataType");
        fVar.I(oVar.d.r);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, oVar.e);
    }
}
