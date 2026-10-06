package p20;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class ul implements aaShadow.a {
    public static final ul a = new ul();
    public static final List b = sy.d0.n("repository");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        u10.xv xvVar = null;
        while (eVar.r0(b) == 0) {
            xvVar = (u10.xv) aa.c.b(aa.c.c(yl.a, false)).a(eVar, wVar);
        }
        return new u10.tv(xvVar);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        u10.tv tvVar = (u10.tv) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(tvVar, "value");
        fVar.z0("repository");
        aa.c.b(aa.c.c(yl.a, false)).b(fVar, wVar, tvVar.a);
    }
}
