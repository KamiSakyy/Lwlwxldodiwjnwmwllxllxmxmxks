package c40;

import aa.w;
import java.util.List;
import k71.k;
import sy.d0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class d implements aa.a {
    public static final d a = new d();
    public static final List b = d0.n("__typename");

    public final Object a(ea.e eVar, w wVar) {
        k.g(eVar, "reader");
        k.g(wVar, "customScalarAdapters");
        String str = null;
        while (eVar.r0(b) == 0) {
            str = (String) aa.c.a.a(eVar, wVar);
        }
        eVar.s0();
        e30.a c = e30.b.c(eVar, wVar);
        if (str != null) {
            return new a(str, c);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, w wVar, Object obj) {
        a aVar = (a) obj;
        k.g(fVar, "writer");
        k.g(wVar, "customScalarAdapters");
        k.g(aVar, "value");
        fVar.z0("__typename");
        aa.c.a.b(fVar, wVar, aVar.a);
        List list = e30.b.a;
        e30.b.d(fVar, wVar, aVar.b);
    }

    // [restore] вложенный стаб: оригинал потерян при декомпиляции
    public static class w<T1,T2,T3,T4> {
        public w() {
        }
    }
}
