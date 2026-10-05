package tu;

import aa.w;
import dw.m5;
import dw.n5;
import java.util.List;
import sy.d0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class q implements aa.a {
    public static final q a = new q();
    public static final List b = d0.n("__typename");

    public final Object a(ea.e eVar, w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        while (eVar.r0(b) == 0) {
            str = (String) aa.c.a.a(eVar, wVar);
        }
        eVar.s0();
        m5 c = n5.c(eVar, wVar);
        if (str != null) {
            return new h(str, c);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, w wVar, Object obj) {
        h hVar = (h) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(hVar, "value");
        fVar.z0("__typename");
        aa.c.a.b(fVar, wVar, hVar.a);
        List list = n5.a;
        n5.d(fVar, wVar, hVar.b);
    }
}
