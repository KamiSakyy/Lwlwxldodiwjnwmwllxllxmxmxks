package p20;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class bb implements aaShadow.a {
    public static final bb a = new bb();
    public static final List b = sy.d0Shadow.n("discussion");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        u10.ig igVar = null;
        while (eVar.r0(b) == 0) {
            igVar = (u10.ig) aa.c.b(aa.c.c(ab.a, false)).a(eVar, wVar);
        }
        return new u10.jg(igVar);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        u10.jg jgVar = (u10.jg) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(jgVar, "value");
        fVar.z0("discussion");
        aa.c.b(aa.c.c(ab.a, false)).b(fVar, wVar, jgVar.a);
    }
}
