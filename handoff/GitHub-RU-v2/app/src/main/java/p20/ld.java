package p20;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class ld implements aaShadow.a {
    public static final ld a = new ld();
    public static final List b = sy.d0Shadow.n("minimizedComment");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        u10.gk gkVar = null;
        while (eVar.r0(b) == 0) {
            gkVar = (u10.gk) aa.c.b(aa.c.c(md.a, true)).a(eVar, wVar);
        }
        return new u10.fk(gkVar);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        u10.fk fkVar = (u10.fk) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(fkVar, "value");
        fVar.z0("minimizedComment");
        aa.c.b(aa.c.c(md.a, true)).b(fVar, wVar, fkVar.a);
    }
}
