package mz0;

import aa.w;
import java.util.List;
import sy.d0Shadow;

/* loaded from: /home/user/work/p/classes4.dex */
public class e implements aa.a {
    public static final e a = new e();
    public static final List b = d0Shadow.n("deleteMobileDevicePublicKey");

    public final Object a(ea.e eVar, w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        lz0.k kVar = null;
        while (eVar.r0(b) == 0) {
            kVar = (lz0.k) aa.c.b(aa.c.c(f.a, false)).a(eVar, wVar);
        }
        return new lz0.j(kVar);
    }

    public final void b(ea.f fVar, w wVar, Object obj) {
        lz0.j jVar = (lz0.j) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(jVar, "value");
        fVar.z0("deleteMobileDevicePublicKey");
        aa.c.b(aa.c.c(f.a, false)).b(fVar, wVar, jVar.a);
    }
}
