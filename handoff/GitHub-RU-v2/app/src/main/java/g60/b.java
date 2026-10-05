package g60;

import aa.c;
import aa.w;
import ea.e;
import java.util.List;
import k71.k;
import x61.l;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class b implements aa.a {
    public static final List a = l.r(new String[]{"name", "spdxId", "id", "__typename"});

    public static a c(e eVar, w wVar) {
        k.g(eVar, "reader");
        k.g(wVar, "customScalarAdapters");
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        while (true) {
            int r0 = eVar.r0(a);
            if (r0 == 0) {
                str = (String) c.a.a(eVar, wVar);
            } else if (r0 == 1) {
                str2 = (String) c.i.a(eVar, wVar);
            } else if (r0 == 2) {
                str3 = (String) c.a.a(eVar, wVar);
            } else {
                if (r0 != 3) {
                    break;
                }
                str4 = (String) c.a.a(eVar, wVar);
            }
        }
        if (str == null) {
            k41.b.B(eVar, "name");
            throw null;
        }
        if (str3 == null) {
            k41.b.B(eVar, "id");
            throw null;
        }
        if (str4 != null) {
            return new a(str, str2, str3, str4);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

}
