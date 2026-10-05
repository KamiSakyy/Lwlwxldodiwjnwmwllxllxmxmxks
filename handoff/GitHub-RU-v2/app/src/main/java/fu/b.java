package fu;

import aa.c;
import aa.w;
import ea.e;
import ea.f;
import java.time.ZonedDateTime;
import java.util.Iterator;
import java.util.List;
import k71.k;
import m10.gn;
import m10.sa;
import x61.l;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class b implements aa.a {
    public static final List a = l.r(new String[]{"__typename", "id", "title", "state", "progressPercentage", "dueOn"});

    public static a c(e eVar, w wVar) {
        Double d;
        Object obj;
        k.g(eVar, "reader");
        k.g(wVar, "customScalarAdapters");
        Double d2 = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        gn gnVar = null;
        ZonedDateTime zonedDateTime = null;
        while (true) {
            int r0 = eVar.r0(a);
            if (r0 == 0) {
                d = d2;
                str = (String) c.a.a(eVar, wVar);
            } else if (r0 == 1) {
                d = d2;
                str2 = (String) c.a.a(eVar, wVar);
            } else if (r0 == 2) {
                d = d2;
                str3 = (String) c.a.a(eVar, wVar);
            } else if (r0 == 3) {
                d = d2;
                String u = eVar.u();
                k.d(u);
                gn.Companion.getClass();
                Iterator it = gn.v.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (((gn) obj).r.equals(u)) {
                        break;
                    }
                }
                gn gnVar2 = (gn) obj;
                gnVar = gnVar2 == null ? gn.t : gnVar2;
            } else if (r0 == 4) {
                d2 = (Double) c.c.a(eVar, wVar);
            } else {
                if (r0 != 5) {
                    break;
                }
                d = d2;
                sa.Companion.getClass();
                zonedDateTime = (ZonedDateTime) no.a.h(wVar, sa.a, eVar, wVar);
            }
            d2 = d;
        }
        Double d3 = d2;
        if (str == null) {
            k41.b.B(eVar, "__typename");
            throw null;
        }
        if (str2 == null) {
            k41.b.B(eVar, "id");
            throw null;
        }
        if (str3 == null) {
            k41.b.B(eVar, "title");
            throw null;
        }
        if (gnVar == null) {
            k41.b.B(eVar, "state");
            throw null;
        }
        if (d3 != null) {
            return new a(str, str2, str3, gnVar, d3.doubleValue(), zonedDateTime);
        }
        k41.b.B(eVar, "progressPercentage");
        throw null;
    }

    public static void d(f fVar, w wVar, a aVar) {
        k.g(fVar, "writer");
        k.g(wVar, "customScalarAdapters");
        k.g(aVar, "value");
        fVar.z0("__typename");
        aa.b bVar = c.a;
        bVar.b(fVar, wVar, aVar.a);
        fVar.z0("id");
        bVar.b(fVar, wVar, aVar.b);
        fVar.z0("title");
        bVar.b(fVar, wVar, aVar.c);
        fVar.z0("state");
        fVar.I(aVar.d.r);
        fVar.z0("progressPercentage");
        c.c.b(fVar, wVar, Double.valueOf(aVar.e));
        fVar.z0("dueOn");
        sa.Companion.getClass();
        c.b(wVar.e(sa.a)).b(fVar, wVar, aVar.f);
    }
}
