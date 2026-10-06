package p20;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class kd implements aaShadow.a {
    public static final kd a = new kd();
    public static final List b = sy.d0.n("minimizeComment");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        u10.fk fkVar = null;
        while (eVar.r0(b) == 0) {
            fkVar = (u10.fk) aa.c.b(aa.c.c(ld.a, false)).a(eVar, wVar);
        }
        return new u10.ek(fkVar);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        u10.ek ekVar = (u10.ek) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(ekVar, "value");
        fVar.z0("minimizeComment");
        aa.c.b(aa.c.c(ld.a, false)).b(fVar, wVar, ekVar.a);
    }
}
