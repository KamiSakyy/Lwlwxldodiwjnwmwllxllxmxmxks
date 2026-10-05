package eh0;

import aa.w;
import gn0.xc;
import gn0.zc;
import java.util.Iterator;
import java.util.List;
import jo.f4;
import k71.k;
import x61.l;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class i implements aa.a {
    public static final List a = l.r(new String[]{"__typename", "id", "number", "title", "issueState", "stateReason"});

    public static c c(ea.e eVar, w wVar) {
        Integer num;
        Object obj;
        k.g(eVar, "reader");
        k.g(wVar, "customScalarAdapters");
        Integer num2 = null;
        xc xcVar = null;
        zc zcVar = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        while (true) {
            int r0 = eVar.r0(a);
            if (r0 == 0) {
                num = num2;
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 1) {
                num = num2;
                str2 = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 2) {
                long nextLong = eVar.nextLong();
                if (nextLong > 2147483647L) {
                    while (nextLong > 2147483647L) {
                        nextLong = f4.c(1, nextLong, "substring(...)");
                    }
                    num2 = Integer.valueOf((int) nextLong);
                } else {
                    num2 = Integer.valueOf((int) nextLong);
                }
            } else if (r0 == 3) {
                num = num2;
                str3 = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 4) {
                num = num2;
                String u = eVar.u();
                k.d(u);
                xc.Companion.getClass();
                Iterator it = xc.x.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (((xc) obj).r.equals(u)) {
                        break;
                    }
                }
                xc xcVar2 = (xc) obj;
                xcVar = xcVar2 == null ? xc.v : xcVar2;
            } else {
                if (r0 != 5) {
                    break;
                }
                num = num2;
                zcVar = (zc) aa.c.b(hn0.a.t).a(eVar, wVar);
            }
            num2 = num;
        }
        Integer num3 = num2;
        if (str == null) {
            k41.b.B(eVar, "__typename");
            throw null;
        }
        if (str2 == null) {
            k41.b.B(eVar, "id");
            throw null;
        }
        if (num3 == null) {
            k41.b.B(eVar, "number");
            throw null;
        }
        int intValue = num3.intValue();
        if (str3 == null) {
            k41.b.B(eVar, "title");
            throw null;
        }
        if (xcVar != null) {
            return new c(intValue, xcVar, zcVar, str, str2, str3);
        }
        k41.b.B(eVar, "issueState");
        throw null;
    }

    public static void d(ea.f fVar, w wVar, c cVar) {
        k.g(fVar, "writer");
        k.g(wVar, "customScalarAdapters");
        k.g(cVar, "value");
        fVar.z0("__typename");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, cVar.a);
        fVar.z0("id");
        bVar.b(fVar, wVar, cVar.b);
        fVar.z0("number");
        fVar.z(cVar.c);
        fVar.z0("title");
        bVar.b(fVar, wVar, cVar.d);
        fVar.z0("issueState");
        fVar.I(cVar.e.r);
        fVar.z0("stateReason");
        aa.c.b(hn0.a.t).b(fVar, wVar, cVar.f);
    }

    // [restore] вложенный стаб: оригинал потерян при декомпиляции
    public static class w<T1,T2,T3,T4> {
        public w() {
        }
    }
}
