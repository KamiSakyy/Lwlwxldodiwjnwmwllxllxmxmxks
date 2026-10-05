package e80;

import aa.w;
import java.util.List;
import sy.d0;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class q implements aa.a {
    public static final List a = d0.n("id");

    public static k c(ea.e eVar, w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        while (eVar.r0(a) == 0) {
            str = (String) aa.c.a.a(eVar, wVar);
        }
        if (str != null) {
            return new k(str);
        }
        k41.b.B(eVar, "id");
        throw null;
    }

    public static void d(ea.f fVar, w wVar, k kVar) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(kVar, "value");
        fVar.z0("id");
        aa.c.a.b(fVar, wVar, kVar.a);
    }

    // [restore] вложенный стаб: оригинал потерян при декомпиляции
    public static class w<T1,T2,T3,T4> {
        public w() {
        }
    }
}
