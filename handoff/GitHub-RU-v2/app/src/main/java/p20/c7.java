package p20;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class c7 implements aa.a {
    public static final c7 a = new c7();
    public static final List b = sy.d0.n("repository");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        u10.ta taVar = null;
        while (eVar.r0(b) == 0) {
            taVar = (u10.ta) aa.c.b(aa.c.c(e7.a, false)).a(eVar, wVar);
        }
        return new u10.ra(taVar);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        u10.ra raVar = (u10.ra) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(raVar, "value");
        fVar.z0("repository");
        aa.c.b(aa.c.c(e7.a, false)).b(fVar, wVar, raVar.a);
    }
}
