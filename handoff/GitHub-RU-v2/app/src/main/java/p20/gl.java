package p20;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class gl implements aaShadow.a {
    public static final gl a = new gl();
    public static final List b = sy.d0.n("repository");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        u10.yu yuVar = null;
        while (eVar.r0(b) == 0) {
            yuVar = (u10.yu) aa.c.b(aa.c.c(hl.a, false)).a(eVar, wVar);
        }
        return new u10.xu(yuVar);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        u10.xu xuVar = (u10.xu) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(xuVar, "value");
        fVar.z0("repository");
        aa.c.b(aa.c.c(hl.a, false)).b(fVar, wVar, xuVar.a);
    }
}
