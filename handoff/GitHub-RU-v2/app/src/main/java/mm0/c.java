package mm0;

import aa.w;
import java.util.List;
import k71.k;
import sy.d0;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class c implements aa.a {
    public static final List a = d0.n("__typename");

    public static lm0.d c(ea.e eVar, w wVar) {
        k.g(eVar, "reader");
        k.g(wVar, "customScalarAdapters");
        String str = null;
        while (eVar.r0(a) == 0) {
            str = (String) aa.c.a.a(eVar, wVar);
        }
        eVar.s0();
        nm0.d dVar = nm0.d.a;
        nm0.a c = nm0.d.c(eVar, wVar);
        if (str != null) {
            return new lm0.d(str, c);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public static void d(ea.f fVar, w wVar, lm0.d dVar) {
        k.g(fVar, "writer");
        k.g(wVar, "customScalarAdapters");
        k.g(dVar, "value");
        fVar.z0("__typename");
        aa.c.a.b(fVar, wVar, dVar.a);
        nm0.d dVar2 = nm0.d.a;
        nm0.d.d(fVar, wVar, dVar.b);
    }
    public static final Object i = null;
}
