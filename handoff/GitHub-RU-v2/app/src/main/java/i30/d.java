package i30;

import aa.w;
import java.util.List;
import java.util.Set;
import sy.d0;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class d implements aa.a {
    public static final List a = d0.n("__typename");

    public static c c(ea.e eVar, w wVar) {
        a aVar;
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        Set set = wVar.b;
        Set set2 = wVar.a;
        b bVar = null;
        String str = null;
        while (eVar.r0(a) == 0) {
            str = (String) aa.c.a.a(eVar, wVar);
        }
        if (str == null) {
            throw new IllegalStateException("__typename was not found");
        }
        if (m71.a.v(m71.a.O(new String[]{"Issue"}), set2, str, set)) {
            eVar.s0();
            aVar = e.c(eVar, wVar);
        } else {
            aVar = null;
        }
        if (m71.a.v(m71.a.O(new String[]{"PullRequest"}), set2, str, set)) {
            eVar.s0();
            bVar = f.c(eVar, wVar);
        }
        return new c(str, aVar, bVar);
    }

    // [restore] вложенный стаб: оригинал потерян при декомпиляции
    public static class w<T1,T2,T3,T4> {
        public w() {
        }
    }
}
