package j10;

import aa.w;
import i10.y;
import i10.z;
import java.util.List;
import sy.d0Shadow;

/* loaded from: /home/user/work/p/classes3.dex */
public final class n implements aa.a {
    public static final n a = new n();
    public static final List b = d0Shadow.n("rejectMobileAuthDeviceRequest");

    public final Object a(ea.e eVar, w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        z zVar = null;
        while (eVar.r0(b) == 0) {
            zVar = (z) aa.c.b(aa.c.c(o.a, false)).a(eVar, wVar);
        }
        return new y(zVar);
    }

    public final void b(ea.f fVar, w wVar, Object obj) {
        y yVar = (y) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(yVar, "value");
        fVar.z0("rejectMobileAuthDeviceRequest");
        aa.c.b(aa.c.c(o.a, false)).b(fVar, wVar, yVar.a);
    }

}
