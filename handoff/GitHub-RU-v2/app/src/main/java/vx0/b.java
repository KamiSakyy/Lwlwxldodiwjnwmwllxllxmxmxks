package vx0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public class b implements aa.a {
    public static final b a = new b();
    public static final List b = sy.d0Shadow.n("addProjectV2ItemById");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        ux0.a aVar = null;
        while (eVar.r0(b) == 0) {
            aVar = (ux0.a) aa.c.b(aa.c.c(a.a, false)).a(eVar, wVar);
        }
        return new ux0.c(aVar);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        ux0.c cVar = (ux0.c) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(cVar, "value");
        fVar.z0("addProjectV2ItemById");
        aa.c.b(aa.c.c(a.a, false)).b(fVar, wVar, cVar.a);
    }
}
