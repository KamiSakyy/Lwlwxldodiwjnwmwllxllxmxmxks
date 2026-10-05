package iy0;

import java.util.Iterator;
import java.util.List;
import pz0.ko;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class x implements aa.a {
    public static final List a = x61.l.r(new String[]{"dataType", "id"});

    public static w c(ea.e eVar, aa.w wVar) {
        Object obj;
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        ko koVar = null;
        String str = null;
        while (true) {
            int r0 = eVar.r0(a);
            if (r0 == 0) {
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
                if (r0 != 1) {
                    break;
                }
                str = (String) aa.c.a.a(eVar, wVar);
            }
        }
        if (koVar == null) {
            k41.b.B(eVar, "dataType");
            throw null;
        }
        if (str != null) {
            return new w(koVar, str);
        }
        k41.b.B(eVar, "id");
        throw null;
    }

    public static void d(ea.f fVar, aa.w wVar, w wVar2) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(wVar2, "value");
        fVar.z0("dataType");
        fVar.I(wVar2.a.r);
        fVar.z0("id");
        aa.c.a.b(fVar, wVar, wVar2.b);
    }
}
