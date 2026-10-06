package p20;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class wg implements aaShadow.a {
    public static final wg a = new wg();
    public static final List b = sy.d0.n("repository");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        u10.jp jpVar = null;
        while (eVar.r0(b) == 0) {
            jpVar = (u10.jp) aa.c.b(aa.c.c(jh.a, false)).a(eVar, wVar);
        }
        return new u10.wo(jpVar);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        u10.wo woVar = (u10.wo) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(woVar, "value");
        fVar.z0("repository");
        aa.c.b(aa.c.c(jh.a, false)).b(fVar, wVar, woVar.a);
    }
}
