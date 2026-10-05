package fi0;

import aa.c;
import aa.w;
import ea.e;
import java.util.List;
import k71.k;
import x61.l;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class b implements aa.a {
    public static final List a = l.r(new String[]{"hasPreviousPage", "startCursor"});

    public static a c(e eVar, w wVar) {
        k.g(eVar, "reader");
        k.g(wVar, "customScalarAdapters");
        Boolean bool = null;
        String str = null;
        while (true) {
            int r0 = eVar.r0(a);
            if (r0 == 0) {
                bool = (Boolean) c.f.a(eVar, wVar);
            } else {
                if (r0 != 1) {
                    break;
                }
                str = (String) c.i.a(eVar, wVar);
            }
        }
        if (bool != null) {
            return new a(str, bool.booleanValue());
        }
        k41.b.B(eVar, "hasPreviousPage");
        throw null;
    }

}
