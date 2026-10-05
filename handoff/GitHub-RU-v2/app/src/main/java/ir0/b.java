package ir0;

import aa.c;
import aa.w;
import ea.e;
import java.util.List;
import jo.f4;
import k71.k;
import x61.l;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class b implements aa.a {
    public static final List a = l.r(new String[]{"id", "option", "viewerHasVoted", "totalVoteCount", "__typename"});

    public static a c(e eVar, w wVar) {
        Boolean bool;
        Integer valueOf;
        k.g(eVar, "reader");
        k.g(wVar, "customScalarAdapters");
        Boolean bool2 = null;
        Integer num = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        while (true) {
            int r0 = eVar.r0(a);
            if (r0 == 0) {
                bool = bool2;
                str = (String) c.a.a(eVar, wVar);
            } else if (r0 == 1) {
                bool = bool2;
                str2 = (String) c.a.a(eVar, wVar);
            } else if (r0 == 2) {
                bool2 = (Boolean) c.f.a(eVar, wVar);
            } else if (r0 == 3) {
                bool = bool2;
                long nextLong = eVar.nextLong();
                if (nextLong > 2147483647L) {
                    while (nextLong > 2147483647L) {
                        nextLong = f4.c(1, nextLong, "substring(...)");
                    }
                    valueOf = Integer.valueOf((int) nextLong);
                } else {
                    valueOf = Integer.valueOf((int) nextLong);
                }
                num = valueOf;
            } else {
                if (r0 != 4) {
                    break;
                }
                bool = bool2;
                str3 = (String) c.a.a(eVar, wVar);
            }
            bool2 = bool;
        }
        Boolean bool3 = bool2;
        if (str == null) {
            k41.b.B(eVar, "id");
            throw null;
        }
        if (str2 == null) {
            k41.b.B(eVar, "option");
            throw null;
        }
        if (bool3 == null) {
            k41.b.B(eVar, "viewerHasVoted");
            throw null;
        }
        boolean booleanValue = bool3.booleanValue();
        if (num == null) {
            k41.b.B(eVar, "totalVoteCount");
            throw null;
        }
        int intValue = num.intValue();
        if (str3 != null) {
            return new a(intValue, str, str2, str3, booleanValue);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

}
