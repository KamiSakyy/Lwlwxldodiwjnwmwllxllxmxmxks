package os0;

import aa.w;
import java.util.Iterator;
import java.util.List;
import jo.f4Shadow;
import k71.k;
import pz0.bf;
import pz0.df;
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
        String str = null;
        String str2 = null;
        String str3 = null;
        bf bfVar = null;
        df dfVar = null;
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
                        nextLong = f4Shadow.c(1, nextLong, "substring(...)");
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
                bf.Companion.getClass();
                Iterator it = bf.x.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (((bf) obj).r.equals(u)) {
                        break;
                    }
                }
                bf bfVar2 = (bf) obj;
                bfVar = bfVar2 == null ? bf.v : bfVar2;
            } else {
                if (r0 != 5) {
                    break;
                }
                num = num2;
                dfVar = (df) aa.c.b(qz0.a.x).a(eVar, wVar);
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
        if (bfVar != null) {
            return new c(intValue, str, str2, str3, bfVar, dfVar);
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
        aa.c.b(qz0.a.x).b(fVar, wVar, cVar.f);
    }
}
