package ct0;

import aa.c;
import aa.w;
import aa.x;
import ea.e;
import ea.f;
import java.time.LocalTime;
import java.util.Iterator;
import java.util.List;
import k71.k;
import pz0.lk;
import pz0.q7;
import x61.l;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class b implements aa.a {
    public static final List a = l.r(new String[]{"day", "id", "startTime", "endTime", "__typename"});

    public static a c(e eVar, w wVar) {
        Object obj;
        k.g(eVar, "reader");
        k.g(wVar, "customScalarAdapters");
        q7 q7Var = null;
        String str = null;
        LocalTime localTime = null;
        LocalTime localTime2 = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(a);
            if (r0 == 0) {
                String u = eVar.u();
                k.d(u);
                q7.Companion.getClass();
                Iterator it = q7.C.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (((q7) obj).r.equals(u)) {
                        break;
                    }
                }
                q7 q7Var2 = (q7) obj;
                q7Var = q7Var2 == null ? q7.A : q7Var2;
            } else if (r0 != 1) {
                x xVar = lk.a;
                if (r0 == 2) {
                    lk.Companion.getClass();
                    localTime = (LocalTime) wVar.e(xVar).a(eVar, wVar);
                } else if (r0 == 3) {
                    lk.Companion.getClass();
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
        if (q7Var == null) {
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
            return new a(q7Var, str, localTime, localTime2, str2);
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
        lk.Companion.getClass();
        x xVar = lk.a;
        wVar.e(xVar).b(fVar, wVar, aVar.c);
        fVar.z0("endTime");
        wVar.e(xVar).b(fVar, wVar, aVar.d);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, aVar.e);
    }
}
