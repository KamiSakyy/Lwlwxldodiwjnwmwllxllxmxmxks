package lu;

import aa.c;
import aa.w;
import aa.x;
import ea.e;
import ea.f;
import java.time.LocalTime;
import java.util.Iterator;
import java.util.List;
import k71.k;
import m10.mp;
import m10.ua;
import x61.l;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class b implements aa.a {
    public static final List a = l.r(new String[]{"day", "id", "startTime", "endTime", "__typename"});

    public static a c(e eVar, w wVar) {
        Object obj;
        k.g(eVar, "reader");
        k.g(wVar, "customScalarAdapters");
        ua uaVar = null;
        String str = null;
        LocalTime localTime = null;
        LocalTime localTime2 = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(a);
            if (r0 == 0) {
                String u = eVar.u();
                k.d(u);
                ua.Companion.getClass();
                Iterator it = ua.C.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (((ua) obj).r.equals(u)) {
                        break;
                    }
                }
                ua uaVar2 = (ua) obj;
                uaVar = uaVar2 == null ? ua.A : uaVar2;
            } else if (r0 != 1) {
                x xVar = mp.a;
                if (r0 == 2) {
                    mp.Companion.getClass();
                    localTime = (LocalTime) wVar.e(xVar).a(eVar, wVar);
                } else if (r0 == 3) {
                    mp.Companion.getClass();
                    localTime2 = (LocalTime) wVar.e(xVar).a(eVar, wVar);
                } else {
                    if (r0 != 4) {
                        break;
                    }
                    str2 = (String) c.a.a(eVar, wVar);
                }
            } else {
                str = (String) c.a.a(eVar, wVar);
            }
        }
        if (uaVar == null) {
            k41.b.B(eVar, "day");
            throw null;
        }
        if (str == null) {
            k41.b.B(eVar, "id");
            throw null;
        }
        if (localTime == null) {
            k41.b.B(eVar, "startTime");
            throw null;
        }
        if (localTime2 == null) {
            k41.b.B(eVar, "endTime");
            throw null;
        }
        if (str2 != null) {
            return new a(uaVar, str, localTime, localTime2, str2);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public static void d(f fVar, w wVar, a aVar) {
        k.g(fVar, "writer");
        k.g(wVar, "customScalarAdapters");
        k.g(aVar, "value");
        fVar.z0("day");
        fVar.I(aVar.a.r);
        fVar.z0("id");
        aa.b bVar = c.a;
        bVar.b(fVar, wVar, aVar.b);
        fVar.z0("startTime");
        mp.Companion.getClass();
        x xVar = mp.a;
        wVar.e(xVar).b(fVar, wVar, aVar.c);
        fVar.z0("endTime");
        wVar.e(xVar).b(fVar, wVar, aVar.d);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, aVar.e);
    }
}
