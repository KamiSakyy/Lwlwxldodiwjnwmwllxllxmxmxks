package e20;

import aa.w;
import d20.l;
import java.util.List;
import k71.k;
import sy.d0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class g implements aa.a {
    public static final g a = new g();
    public static final List b = d0.n("mobileUpdatesUrl");

    public final Object a(ea.e eVar, w wVar) {
        k.g(eVar, "reader");
        k.g(wVar, "customScalarAdapters");
        String str = null;
        while (eVar.r0(b) == 0) {
            str = (String) aa.c.i.a(eVar, wVar);
        }
        return new l(str);
    }

    public final void b(ea.f fVar, w wVar, Object obj) {
        l lVar = (l) obj;
        k.g(fVar, "writer");
        k.g(wVar, "customScalarAdapters");
        k.g(lVar, "value");
        fVar.z0("mobileUpdatesUrl");
        aa.c.i.b(fVar, wVar, lVar.a);
    }

    // [restore] вложенный стаб: оригинал потерян при декомпиляции
    public static class w<T1,T2,T3,T4> {
        public w() {
        }
    }
}
