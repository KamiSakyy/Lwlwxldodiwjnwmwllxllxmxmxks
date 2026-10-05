package ek0;

import aa.w;
import java.util.List;
import k71.k;
import sy.d0;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class e implements aa.a {
    public static final List a = d0.n("viewerSubscriptionTypes");

    public static a c(ea.e eVar, w wVar) {
        k.g(eVar, "reader");
        k.g(wVar, "customScalarAdapters");
        List list = null;
        while (eVar.r0(a) == 0) {
            list = (List) aa.c.b(aa.c.a(hn0.a.i)).a(eVar, wVar);
        }
        return new a(list);
    }

    public static void d(ea.f fVar, w wVar, a aVar) {
        k.g(fVar, "writer");
        k.g(wVar, "customScalarAdapters");
        k.g(aVar, "value");
        fVar.z0("viewerSubscriptionTypes");
        aa.c.b(aa.c.a(hn0.a.i)).b(fVar, wVar, aVar.a);
    }

    // [restore] вложенный стаб: оригинал потерян при декомпиляции
    public static class w<T1,T2,T3,T4> {
        public w() {
        }
    }
}
