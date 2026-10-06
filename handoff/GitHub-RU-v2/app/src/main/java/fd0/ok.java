package fd0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class ok implements aaShadow.a {
    public static final ok a = new ok();
    public static final List b = sy.d0Shadow.n("node");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        kc0.zt ztVar = null;
        while (eVar.r0(b) == 0) {
            ztVar = (kc0.zt) aa.c.b(aa.c.c(qk.a, true)).a(eVar, wVar);
        }
        return new kc0.xt(ztVar);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        kc0.xt xtVar = (kc0.xt) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(xtVar, "value");
        fVar.z0("node");
        aa.c.b(aa.c.c(qk.a, true)).b(fVar, wVar, xtVar.a);
    }
}
