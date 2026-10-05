package pz;

import aa.w;
import ea.f;
import java.util.List;
import k71.k;
import sy.d0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class b implements aa.a {
    public static final b a = new b();
    public static final List b = d0.n("changeUserStatus");

    public final Object a(ea.e eVar, w wVar) {
        k.g(eVar, "reader");
        k.g(wVar, "customScalarAdapters");
        oz.a aVar = null;
        while (eVar.r0(b) == 0) {
            aVar = (oz.a) aa.c.b(aa.c.c(a.a, false)).a(eVar, wVar);
        }
        return new oz.c(aVar);
    }

    public final void b(f fVar, w wVar, Object obj) {
        oz.c cVar = (oz.c) obj;
        k.g(fVar, "writer");
        k.g(wVar, "customScalarAdapters");
        k.g(cVar, "value");
        fVar.z0("changeUserStatus");
        aa.c.b(aa.c.c(a.a, false)).b(fVar, wVar, cVar.a);
    }
}
