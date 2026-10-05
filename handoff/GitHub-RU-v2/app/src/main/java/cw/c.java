package cw;

import aa.w;
import ea.f;
import java.util.List;
import k71.k;
import sy.d0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class c implements aa.a {
    public static final c a = new c();
    public static final List b = d0.n("__typename");

    public final Object a(ea.e eVar, w wVar) {
        k.g(eVar, "reader");
        k.g(wVar, "customScalarAdapters");
        String str = null;
        while (eVar.r0(b) == 0) {
            str = (String) aa.c.a.a(eVar, wVar);
        }
        eVar.s0();
        xx.a c = xx.b.c(eVar, wVar);
        if (str != null) {
            return new bw.d(str, c);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(f fVar, w wVar, Object obj) {
        bw.d dVar = (bw.d) obj;
        k.g(fVar, "writer");
        k.g(wVar, "customScalarAdapters");
        k.g(dVar, "value");
        fVar.z0("__typename");
        aa.c.a.b(fVar, wVar, dVar.a);
        List list = xx.b.a;
        xx.b.d(fVar, wVar, dVar.b);
    }

    // [restore] вложенный стаб: оригинал потерян при декомпиляции
    public static class w<T1,T2,T3,T4> {
        public w() {
        }
    }
}
