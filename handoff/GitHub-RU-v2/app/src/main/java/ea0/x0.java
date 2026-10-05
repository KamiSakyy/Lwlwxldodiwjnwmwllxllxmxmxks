package ea0;

import java.util.ArrayList;
import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class x0 implements aa.a {
    public static final List a = x61.l.r(new String[]{"topContributors", "id", "__typename"});

    public static u0 c(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        ArrayList arrayList = null;
        String str = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(a);
            if (r0 == 0) {
                arrayList = aa.c.a(aa.c.c(w0.a, true)).c(eVar, wVar);
            } else if (r0 == 1) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else {
                if (r0 != 2) {
                    break;
                }
                str2 = (String) aa.c.a.a(eVar, wVar);
            }
        }
        if (arrayList == null) {
            k41.b.B(eVar, "topContributors");
            throw null;
        }
        if (str == null) {
            k41.b.B(eVar, "id");
            throw null;
        }
        if (str2 != null) {
            return new u0(str, str2, arrayList);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }
}
