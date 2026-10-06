package p20;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class sh implements aaShadow.a {
    public static final sh a = new sh();
    public static final List b = sy.d0Shadow.n("repository");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        u10.zp zpVar = null;
        while (eVar.r0(b) == 0) {
            zpVar = (u10.zp) aa.c.b(aa.c.c(xh.a, false)).a(eVar, wVar);
        }
        return new u10.up(zpVar);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        u10.up upVar = (u10.up) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(upVar, "value");
        fVar.z0("repository");
        aa.c.b(aa.c.c(xh.a, false)).b(fVar, wVar, upVar.a);
    }
}
