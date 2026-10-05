package fd0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class i7 implements aa.a {
    public static final i7 a = new i7();
    public static final List b = sy.d0.n("repository");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        kc0.bb bbVar = null;
        while (eVar.r0(b) == 0) {
            bbVar = (kc0.bb) aa.c.b(aa.c.c(k7.a, false)).a(eVar, wVar);
        }
        return new kc0.za(bbVar);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        kc0.za zaVar = (kc0.za) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(zaVar, "value");
        fVar.z0("repository");
        aa.c.b(aa.c.c(k7.a, false)).b(fVar, wVar, zaVar.a);
    }
}
