package p20;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class q8 implements aaShadow.a {
    public static final q8 a = new q8();
    public static final List b = sy.d0.n("repository");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        u10.ad adVar = null;
        while (eVar.r0(b) == 0) {
            adVar = (u10.ad) aa.c.b(aa.c.c(r8.a, true)).a(eVar, wVar);
        }
        return new u10.zc(adVar);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        u10.zc zcVar = (u10.zc) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(zcVar, "value");
        fVar.z0("repository");
        aa.c.b(aa.c.c(r8.a, true)).b(fVar, wVar, zcVar.a);
    }
}
