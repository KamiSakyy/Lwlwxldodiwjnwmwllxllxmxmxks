package fd0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class km implements aa.a {
    public static final km a = new km();
    public static final List b = sy.d0.n("repository");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        kc0.mw mwVar = null;
        while (eVar.r0(b) == 0) {
            mwVar = (kc0.mw) aa.c.b(aa.c.c(lm.a, false)).a(eVar, wVar);
        }
        return new kc0.lw(mwVar);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        kc0.lw lwVar = (kc0.lw) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(lwVar, "value");
        fVar.z0("repository");
        aa.c.b(aa.c.c(lm.a, false)).b(fVar, wVar, lwVar.a);
    }
}
