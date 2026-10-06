package sz;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class b implements aa.a {
    public static final b a = new b();
    public static final List b = sy.d0Shadow.n("addProjectV2ItemById");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        rz.a aVar = null;
        while (eVar.r0(b) == 0) {
            aVar = (rz.a) aa.c.b(aa.c.c(a.a, false)).a(eVar, wVar);
        }
        return new rz.c(aVar);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        rz.c cVar = (rz.c) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(cVar, "value");
        fVar.z0("addProjectV2ItemById");
        aa.c.b(aa.c.c(a.a, false)).b(fVar, wVar, cVar.a);
    }
}
