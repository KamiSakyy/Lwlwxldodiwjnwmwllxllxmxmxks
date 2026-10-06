package fd0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class af implements aaShadow.a {
    public static final af a = new af();
    public static final List b = sy.d0.n("organization");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        kc0.om omVar = null;
        while (eVar.r0(b) == 0) {
            omVar = (kc0.om) aa.c.b(aa.c.c(cf.a, false)).a(eVar, wVar);
        }
        return new kc0.mm(omVar);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        kc0.mm mmVar = (kc0.mm) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(mmVar, "value");
        fVar.z0("organization");
        aa.c.b(aa.c.c(cf.a, false)).b(fVar, wVar, mmVar.a);
    }
}
