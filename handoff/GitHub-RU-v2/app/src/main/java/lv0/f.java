package lv0;

import aa.w;
import java.util.Iterator;
import java.util.List;
import jo.f4Shadow;
import pz0.bf;
import pz0.df;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class f implements aa.a {
    public static final List a = x61.l.r(new String[]{"issueState", "title", "url", "number", "stateReason"});

    public static b c(ea.e eVar, w wVar) {
        Integer num;
        Object obj;
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        Integer num2 = null;
        bf bfVar = null;
        String str = null;
        String str2 = null;
        df dfVar = null;
        while (true) {
            int r0 = eVar.r0(a);
            if (r0 == 0) {
                num = num2;
                String u = eVar.u();
                k71.k.d(u);
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
                dfVar = (df) aa.c.b(qz0.a.x).a(eVar, wVar);
            }
            num2 = num;
        }
        Integer num3 = num2;
        if (bfVar == null) {
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
        if (num3 != null) {
            return new b(bfVar, str, str2, num3.intValue(), dfVar);
        }
        k41.b.B(eVar, "number");
        throw null;
    }
}
