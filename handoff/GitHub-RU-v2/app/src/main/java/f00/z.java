package f00;

import java.util.Iterator;
import java.util.List;
import m10.pt;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class z implements aa.a {
    public static final List a = x61.l.r(new String[]{"dataType", "id"});

    public static y c(ea.e eVar, aa.w wVar) {
        Object obj;
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        pt ptVar = null;
        String str = null;
        while (true) {
            int r0 = eVar.r0(a);
            if (r0 == 0) {
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
                if (r0 != 1) {
                    break;
                }
                str = (String) aa.c.a.a(eVar, wVar);
            }
        }
        if (ptVar == null) {
            k41.b.B(eVar, "dataType");
            throw null;
        }
        if (str != null) {
            return new y(ptVar, str);
        }
        k41.b.B(eVar, "id");
        throw null;
    }

    public static void d(ea.f fVar, aa.w wVar, y yVar) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(yVar, "value");
        fVar.z0("dataType");
        fVar.I(yVar.a.r);
        fVar.z0("id");
        aa.c.a.b(fVar, wVar, yVar.b);
    }
}
