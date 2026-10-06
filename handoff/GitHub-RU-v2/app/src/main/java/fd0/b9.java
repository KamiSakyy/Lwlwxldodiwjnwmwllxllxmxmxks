package fd0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class b9 implements aaShadow.a {
    public static final b9 a = new b9();
    public static final List b = sy.d0.n("organization");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        kc0.pd pdVar = null;
        while (eVar.r0(b) == 0) {
            pdVar = (kc0.pd) aa.c.b(aa.c.c(c9.a, true)).a(eVar, wVar);
        }
        return new kc0.od(pdVar);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        kc0.od odVar = (kc0.od) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(odVar, "value");
        fVar.z0("organization");
        aa.c.b(aa.c.c(c9.a, true)).b(fVar, wVar, odVar.a);
    }
}
