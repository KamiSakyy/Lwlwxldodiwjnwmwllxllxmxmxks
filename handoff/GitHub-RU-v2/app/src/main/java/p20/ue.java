package p20;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class ue implements aaShadow.a {
    public static final ue a = new ue();
    public static final List b = sy.d0Shadow.n("repository");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        u10.im imVar = null;
        while (eVar.r0(b) == 0) {
            imVar = (u10.im) aa.c.b(aa.c.c(ye.a, false)).a(eVar, wVar);
        }
        return new u10.em(imVar);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        u10.em emVar = (u10.em) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(emVar, "value");
        fVar.z0("repository");
        aa.c.b(aa.c.c(ye.a, false)).b(fVar, wVar, emVar.a);
    }
}
