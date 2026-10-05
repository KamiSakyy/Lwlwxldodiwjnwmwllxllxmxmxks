package qe0;

import java.util.List;
import sy.d0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class n implements aa.a {
    public static final n a = new n();
    public static final List b = d0.n("__typename");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        while (eVar.r0(b) == 0) {
            str = (String) aa.c.a.a(eVar, wVar);
        }
        eVar.s0();
        ud0.a c = ud0.b.c(eVar, wVar);
        if (str != null) {
            return new a(str, c);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        a aVar = (a) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(aVar, "value");
        fVar.z0("__typename");
        aa.c.a.b(fVar, wVar, aVar.a);
        List list = ud0.b.a;
        ud0.b.d(fVar, wVar, aVar.b);
    }
}
