package j70;

import aa.w;
import java.util.List;
import k71.k;
import sy.d0Shadow;

/* loaded from: /home/user/work/p/classes3.dex */
public class b implements aa.a {
    public static final b a = new b();
    public static final List b = d0Shadow.n("organization");

    public final Object a(ea.e eVar, w wVar) {
        k.g(eVar, "reader");
        k.g(wVar, "customScalarAdapters");
        i70.d dVar = null;
        while (eVar.r0(b) == 0) {
            dVar = (i70.d) aa.c.b(aa.c.c(c.a, true)).a(eVar, wVar);
        }
        return new i70.c(dVar);
    }

    public final void b(ea.f fVar, w wVar, Object obj) {
        i70.c cVar = (i70.c) obj;
        k.g(fVar, "writer");
        k.g(wVar, "customScalarAdapters");
        k.g(cVar, "value");
        fVar.z0("organization");
        aa.c.b(aa.c.c(c.a, true)).b(fVar, wVar, cVar.a);
    }
}
