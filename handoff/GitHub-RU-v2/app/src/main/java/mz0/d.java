package mz0;

import aa.w;
import java.util.List;
import sy.d0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class d implements aa.a {
    public static final d a = new d();
    public static final List b = d0.n("approveMobileAuthDeviceRequest");

    public final Object a(ea.e eVar, w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        lz0.e eVar2 = null;
        while (eVar.r0(b) == 0) {
            eVar2 = (lz0.e) aa.c.b(aa.c.c(c.a, false)).a(eVar, wVar);
        }
        return new lz0.g(eVar2);
    }

    public final void b(ea.f fVar, w wVar, Object obj) {
        lz0.g gVar = (lz0.g) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(gVar, "value");
        fVar.z0("approveMobileAuthDeviceRequest");
        aa.c.b(aa.c.c(c.a, false)).b(fVar, wVar, gVar.a);
    }
}
