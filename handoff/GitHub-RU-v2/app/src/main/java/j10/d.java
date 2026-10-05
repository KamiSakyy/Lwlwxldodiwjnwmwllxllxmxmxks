package j10;

import aa.w;
import java.util.List;
import sy.d0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class d implements aa.a {
    public static final d a = new d();
    public static final List b = d0.n("approveMobileAuthDeviceRequest");

    public final Object a(ea.e eVar, w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        i10.e eVar2 = null;
        while (eVar.r0(b) == 0) {
            eVar2 = (i10.e) aa.c.b(aa.c.c(c.a, false)).a(eVar, wVar);
        }
        return new i10.g(eVar2);
    }

    public final void b(ea.f fVar, w wVar, Object obj) {
        i10.g gVar = (i10.g) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(gVar, "value");
        fVar.z0("approveMobileAuthDeviceRequest");
        aa.c.b(aa.c.c(c.a, false)).b(fVar, wVar, gVar.a);
    }

}
