package p20;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class zd implements aaShadow.a {
    public static final zd a = new zd();
    public static final List b = sy.d0Shadow.n("organization");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        u10.el elVar = null;
        while (eVar.r0(b) == 0) {
            elVar = (u10.el) aa.c.b(aa.c.c(ce.a, false)).a(eVar, wVar);
        }
        return new u10.bl(elVar);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        u10.bl blVar = (u10.bl) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(blVar, "value");
        fVar.z0("organization");
        aa.c.b(aa.c.c(ce.a, false)).b(fVar, wVar, blVar.a);
    }
}
