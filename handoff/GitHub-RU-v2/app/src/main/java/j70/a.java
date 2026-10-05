package j70;

import aa.w;
import java.util.List;
import k71.k;
import sy.d0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class a implements aa.a {
    public static final a a = new a();
    public static final List b = d0.n("followOrganization");

    public final Object a(ea.e eVar, w wVar) {
        k.g(eVar, "reader");
        k.g(wVar, "customScalarAdapters");
        i70.c cVar = null;
        while (eVar.r0(b) == 0) {
            cVar = (i70.c) aa.c.b(aa.c.c(b.a, false)).a(eVar, wVar);
        }
        return new i70.b(cVar);
    }

    public final void b(ea.f fVar, w wVar, Object obj) {
        i70.b bVar = (i70.b) obj;
        k.g(fVar, "writer");
        k.g(wVar, "customScalarAdapters");
        k.g(bVar, "value");
        fVar.z0("followOrganization");
        aa.c.b(aa.c.c(b.a, false)).b(fVar, wVar, bVar.a);
    }
}
