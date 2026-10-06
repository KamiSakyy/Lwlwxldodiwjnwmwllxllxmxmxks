package p20;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class j implements aaShadow.a {
    public static final j a = new j();
    public static final List b = sy.d0.n("pollOption");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        u10.r rVar = null;
        while (eVar.r0(b) == 0) {
            rVar = (u10.r) aa.c.b(aa.c.c(m.a, false)).a(eVar, wVar);
        }
        return new u10.n(rVar);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        u10.n nVar = (u10.n) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(nVar, "value");
        fVar.z0("pollOption");
        aa.c.b(aa.c.c(m.a, false)).b(fVar, wVar, nVar.a);
    }
}
