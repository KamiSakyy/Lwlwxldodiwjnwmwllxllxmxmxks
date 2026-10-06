package p20;

import java.util.List;
import u10.uz;
import u10.yz;

/* loaded from: /home/user/work/p/classes3.dex */
public final class noShadow implements aaShadow.a {
    public static final noShadow a = new noShadow();
    public static final List b = sy.d0Shadow.n("repositoryOwner");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        yz yzVar = null;
        while (eVar.r0(b) == 0) {
            yzVar = (yz) aa.c.b(aa.c.c(ro.a, true)).a(eVar, wVar);
        }
        return new uz(yzVar);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        uz uzVar = (uz) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(uzVar, "value");
        fVar.z0("repositoryOwner");
        aa.c.b(aa.c.c(ro.a, true)).b(fVar, wVar, uzVar.a);
    }
    public Object e(Object p1, Object p2, Object p3, Object p4) { return null; }
    public Object h(Object p1, Object p2, Object p3, Object p4) { return null; }
}
