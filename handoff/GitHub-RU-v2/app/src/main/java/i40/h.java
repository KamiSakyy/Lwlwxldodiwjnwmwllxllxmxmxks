package i40;

import aa.w;
import hc0.jc;
import hc0.lc;
import java.util.Iterator;
import java.util.List;
import jo.f4;
import k71.k;
import x61.l;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class h implements aa.a {
    public static final List a = l.r(new String[]{"issueState", "title", "url", "number", "stateReason", "id"});

    public static b c(ea.e eVar, w wVar) {
        Integer num;
        Object obj;
        k.g(eVar, "reader");
        k.g(wVar, "customScalarAdapters");
        Integer num2 = null;
        jc jcVar = null;
        lc lcVar = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        while (true) {
            int r0 = eVar.r0(a);
            if (r0 == 0) {
                num = num2;
                String u = eVar.u();
                k.d(u);
                jc.Companion.getClass();
                Iterator it = jc.x.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (((jc) obj).r.equals(u)) {
                        break;
                    }
                }
                jc jcVar2 = (jc) obj;
                jcVar = jcVar2 == null ? jc.v : jcVar2;
            } else if (r0 == 1) {
                num = num2;
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 2) {
                num = num2;
                str2 = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 3) {
                long nextLong = eVar.nextLong();
                if (nextLong > 2147483647L) {
                    while (nextLong > 2147483647L) {
                        nextLong = f4.c(1, nextLong, "substring(...)");
                    }
                    num2 = Integer.valueOf((int) nextLong);
                } else {
                    num2 = Integer.valueOf((int) nextLong);
                }
            } else if (r0 == 4) {
                num = num2;
                lcVar = (lc) aa.c.b(ic0.a.t).a(eVar, wVar);
            } else {
                if (r0 != 5) {
                    break;
                }
                num = num2;
                str3 = (String) aa.c.a.a(eVar, wVar);
            }
            num2 = num;
        }
        Integer num3 = num2;
        if (jcVar == null) {
            k41.b.B(eVar, "issueState");
            throw null;
        }
        if (str == null) {
            k41.b.B(eVar, "title");
            throw null;
        }
        if (str2 == null) {
            k41.b.B(eVar, "url");
            throw null;
        }
        if (num3 == null) {
            k41.b.B(eVar, "number");
            throw null;
        }
        int intValue = num3.intValue();
        if (str3 != null) {
            return new b(intValue, jcVar, lcVar, str, str2, str3);
        }
        k41.b.B(eVar, "id");
        throw null;
    }

    public static void d(ea.f fVar, w wVar, b bVar) {
        k.g(fVar, "writer");
        k.g(wVar, "customScalarAdapters");
        k.g(bVar, "value");
        fVar.z0("issueState");
        fVar.I(bVar.a.r);
        fVar.z0("title");
        aa.b bVar2 = aa.c.a;
        bVar2.b(fVar, wVar, bVar.b);
        fVar.z0("url");
        bVar2.b(fVar, wVar, bVar.c);
        fVar.z0("number");
        fVar.z(bVar.d);
        fVar.z0("stateReason");
        aa.c.b(ic0.a.t).b(fVar, wVar, bVar.e);
        fVar.z0("id");
        bVar2.b(fVar, wVar, bVar.f);
    }

}
