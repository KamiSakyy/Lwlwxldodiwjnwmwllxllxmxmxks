package li0;

import aa.c;
import aa.w;
import ea.e;
import ea.f;
import gn0.dl;
import java.util.Iterator;
import java.util.List;
import jo.f4Shadow;
import k71.k;
import x61.l;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class b implements aa.a {
    public static final List a = l.r(new String[]{"id", "name", "state", "number", "__typename"});

    public static a c(e eVar, w wVar) {
        Integer num;
        Object obj;
        k.g(eVar, "reader");
        k.g(wVar, "customScalarAdapters");
        Integer num2 = null;
        String str = null;
        String str2 = null;
        dl dlVar = null;
        String str3 = null;
        while (true) {
            int r0 = eVar.r0(a);
            if (r0 == 0) {
                num = num2;
                str = (String) c.a.a(eVar, wVar);
            } else if (r0 == 1) {
                num = num2;
                str2 = (String) c.a.a(eVar, wVar);
            } else if (r0 == 2) {
                num = num2;
                String u = eVar.u();
                k.d(u);
                dl.Companion.getClass();
                Iterator it = dl.v.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (((dl) obj).r.equals(u)) {
                        break;
                    }
                }
                dl dlVar2 = (dl) obj;
                dlVar = dlVar2 == null ? dl.t : dlVar2;
            } else if (r0 == 3) {
                long nextLong = eVar.nextLong();
                if (nextLong > 2147483647L) {
                    while (nextLong > 2147483647L) {
                        nextLong = f4Shadow.c(1, nextLong, "substring(...)");
                    }
                    num2 = Integer.valueOf((int) nextLong);
                } else {
                    num2 = Integer.valueOf((int) nextLong);
                }
            } else {
                if (r0 != 4) {
                    break;
                }
                num = num2;
                str3 = (String) c.a.a(eVar, wVar);
            }
            num2 = num;
        }
        Integer num3 = num2;
        if (str == null) {
            k41.b.B(eVar, "id");
            throw null;
        }
        if (str2 == null) {
            k41.b.B(eVar, "name");
            throw null;
        }
        if (dlVar == null) {
            k41.b.B(eVar, "state");
            throw null;
        }
        if (num3 == null) {
            k41.b.B(eVar, "number");
            throw null;
        }
        int intValue = num3.intValue();
        if (str3 != null) {
            return new a(str, str2, dlVar, intValue, str3);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public static void d(f fVar, w wVar, a aVar) {
        k.g(fVar, "writer");
        k.g(wVar, "customScalarAdapters");
        k.g(aVar, "value");
        fVar.z0("id");
        aa.b bVar = c.a;
        bVar.b(fVar, wVar, aVar.a);
        fVar.z0("name");
        bVar.b(fVar, wVar, aVar.b);
        fVar.z0("state");
        fVar.I(aVar.c.r);
        fVar.z0("number");
        fVar.z(aVar.d);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, aVar.e);
    }
}
