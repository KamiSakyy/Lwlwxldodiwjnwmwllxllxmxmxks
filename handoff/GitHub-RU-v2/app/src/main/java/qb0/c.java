package qb0;

import aa.w;
import java.util.List;
import k71.k;
import sy.d0;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class c implements aa.a {
    public static final List a = d0.n("__typename");

    public static pb0.d c(ea.e eVar, w wVar) {
        k.g(eVar, "reader");
        k.g(wVar, "customScalarAdapters");
        String str = null;
        while (eVar.r0(a) == 0) {
            str = (String) aa.c.a.a(eVar, wVar);
        }
        eVar.s0();
        rb0.c cVar = rb0.c.a;
        rb0.a c = rb0.c.c(eVar, wVar);
        if (str != null) {
            return new pb0.d(str, c);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public static void d(ea.f fVar, w wVar, pb0.d dVar) {
        k.g(fVar, "writer");
        k.g(wVar, "customScalarAdapters");
        k.g(dVar, "value");
        fVar.z0("__typename");
        aa.c.a.b(fVar, wVar, dVar.a);
        rb0.c cVar = rb0.c.a;
        rb0.c.d(fVar, wVar, dVar.b);
    }
    public static final Object i = null;
}
