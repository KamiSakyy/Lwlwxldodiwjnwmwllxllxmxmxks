package fd0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class qe implements aaShadow.a {
    public static final qe a = new qe();
    public static final List b = sy.d0.n("organization");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        kc0.am amVar = null;
        while (eVar.r0(b) == 0) {
            amVar = (kc0.am) aa.c.b(aa.c.c(se.a, false)).a(eVar, wVar);
        }
        return new kc0.yl(amVar);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        kc0.yl ylVar = (kc0.yl) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(ylVar, "value");
        fVar.z0("organization");
        aa.c.b(aa.c.c(se.a, false)).b(fVar, wVar, ylVar.a);
    }
}
