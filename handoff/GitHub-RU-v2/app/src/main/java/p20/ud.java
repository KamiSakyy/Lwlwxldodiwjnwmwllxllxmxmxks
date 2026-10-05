package p20;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class ud implements aa.a {
    public static final ud a = new ud();
    public static final List b = sy.d0.n("organization");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        u10.wk wkVar = null;
        while (eVar.r0(b) == 0) {
            wkVar = (u10.wk) aa.c.b(aa.c.c(wd.a, false)).a(eVar, wVar);
        }
        return new u10.uk(wkVar);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        u10.uk ukVar = (u10.uk) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(ukVar, "value");
        fVar.z0("organization");
        aa.c.b(aa.c.c(wd.a, false)).b(fVar, wVar, ukVar.a);
    }
}
