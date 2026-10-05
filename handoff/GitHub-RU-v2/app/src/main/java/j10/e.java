package j10;

import aa.w;
import java.util.List;
import sy.d0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class e implements aa.a {
    public static final e a = new e();
    public static final List b = d0.n("deleteMobileDevicePublicKey");

    public final Object a(ea.e eVar, w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        i10.k kVar = null;
        while (eVar.r0(b) == 0) {
            kVar = (i10.k) aa.c.b(aa.c.c(f.a, false)).a(eVar, wVar);
        }
        return new i10.j(kVar);
    }

    public final void b(ea.f fVar, w wVar, Object obj) {
        i10.j jVar = (i10.j) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(jVar, "value");
        fVar.z0("deleteMobileDevicePublicKey");
        aa.c.b(aa.c.c(f.a, false)).b(fVar, wVar, jVar.a);
    }

}
