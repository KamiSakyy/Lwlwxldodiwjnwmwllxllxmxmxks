package vw0;

import aa.w;
import java.util.List;
import sy.d0Shadow;
import uw0.y;

/* loaded from: /home/user/work/p/classes4.dex */
public final class n implements aa.a {
    public static final n a = new n();
    public static final List b = d0Shadow.n("updateUserList");

    public final Object a(ea.e eVar, w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        y yVar = null;
        while (eVar.r0(b) == 0) {
            yVar = (y) aa.c.b(aa.c.c(p.a, false)).a(eVar, wVar);
        }
        return new uw0.w(yVar);
    }

    public final void b(ea.f fVar, w wVar, Object obj) {
        uw0.w wVar2 = (uw0.w) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(wVar2, "value");
        fVar.z0("updateUserList");
        aa.c.b(aa.c.c(p.a, false)).b(fVar, wVar, wVar2.a);
    }
}
