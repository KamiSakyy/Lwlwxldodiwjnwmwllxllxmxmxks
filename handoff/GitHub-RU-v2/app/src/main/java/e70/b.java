package e70;

import aa.c;
import aa.w;
import ea.e;
import java.util.List;
import jo.f4;
import k71.k;
import x61.l;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class b implements aa.a {
    public static final List a = l.r(new String[]{"id", "name", "unreadCount", "queryString", "isDefaultFilter", "__typename"});

    public static a c(e eVar, w wVar) {
        Integer num;
        k.g(eVar, "reader");
        k.g(wVar, "customScalarAdapters");
        Integer num2 = null;
        Boolean bool = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        while (true) {
            int r0 = eVar.r0(a);
            if (r0 == 0) {
                num = num2;
                str = (String) c.a.a(eVar, wVar);
            } else if (r0 == 1) {
                num = num2;
                str2 = (String) c.a.a(eVar, wVar);
            } else if (r0 == 2) {
                Boolean bool2 = bool;
                long nextLong = eVar.nextLong();
                if (nextLong > 2147483647L) {
                    while (nextLong > 2147483647L) {
                        nextLong = f4.c(1, nextLong, "substring(...)");
                    }
                    num2 = Integer.valueOf((int) nextLong);
                } else {
                    num2 = Integer.valueOf((int) nextLong);
                }
                bool = bool2;
            } else if (r0 == 3) {
                num = num2;
                str3 = (String) c.a.a(eVar, wVar);
            } else if (r0 == 4) {
                num = num2;
                bool = (Boolean) c.f.a(eVar, wVar);
            } else {
                if (r0 != 5) {
                    break;
                }
                num = num2;
                str4 = (String) c.a.a(eVar, wVar);
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
        if (num3 == null) {
            k41.b.B(eVar, "unreadCount");
            throw null;
        }
        Boolean bool3 = bool;
        int intValue = num3.intValue();
        if (str3 == null) {
            k41.b.B(eVar, "queryString");
            throw null;
        }
        if (bool3 == null) {
            k41.b.B(eVar, "isDefaultFilter");
            throw null;
        }
        boolean booleanValue = bool3.booleanValue();
        if (str4 != null) {
            return new a(intValue, str, str2, str3, str4, booleanValue);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }
}
