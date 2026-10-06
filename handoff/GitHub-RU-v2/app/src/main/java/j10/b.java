package j10;

import aa.w;
import java.util.List;
import sy.d0Shadow;

/* loaded from: /home/user/work/p/classes3.dex */
public class b implements aa.a {
    public static final b a = new b();
    public static final List b = d0Shadow.n("addMobileDevicePublicKey");

    public final Object a(ea.e eVar, w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        i10.a aVar = null;
        while (eVar.r0(b) == 0) {
            aVar = (i10.a) aa.c.b(aa.c.c(a.a, false)).a(eVar, wVar);
        }
        return new i10.c(aVar);
    }

    public final void b(ea.f fVar, w wVar, Object obj) {
        i10.c cVar = (i10.c) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(cVar, "value");
        fVar.z0("addMobileDevicePublicKey");
        aa.c.b(aa.c.c(a.a, false)).b(fVar, wVar, cVar.a);
    }

}
