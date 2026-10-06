package tu0;

import aa.w;
import ea.f;
import java.util.List;
import k71.k;
import sy.d0Shadow;

/* loaded from: /home/user/work/p/classes4.dex */
public final class c implements aa.a {
    public static final c a = new c();
    public static final List b = d0Shadow.n("__typename");

    public final Object a(ea.e eVar, w wVar) {
        k.g(eVar, "reader");
        k.g(wVar, "customScalarAdapters");
        String str = null;
        while (eVar.r0(b) == 0) {
            str = (String) aa.c.a.a(eVar, wVar);
        }
        eVar.s0();
        mw0.a c = mw0.b.c(eVar, wVar);
        if (str != null) {
            return new su0.d(str, c);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(f fVar, w wVar, Object obj) {
        su0.d dVar = (su0.d) obj;
        k.g(fVar, "writer");
        k.g(wVar, "customScalarAdapters");
        k.g(dVar, "value");
        fVar.z0("__typename");
        aa.c.a.b(fVar, wVar, dVar.a);
        List list = mw0.b.a;
        mw0.b.d(fVar, wVar, dVar.b);
    }
}
