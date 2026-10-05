package fd0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class ym implements aa.a {
    public static final ym a = new ym();
    public static final List b = sy.d0.n("repository");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        kc0.jx jxVar = null;
        while (eVar.r0(b) == 0) {
            jxVar = (kc0.jx) aa.c.b(aa.c.c(an.a, false)).a(eVar, wVar);
        }
        return new kc0.hx(jxVar);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        kc0.hx hxVar = (kc0.hx) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(hxVar, "value");
        fVar.z0("repository");
        aa.c.b(aa.c.c(an.a, false)).b(fVar, wVar, hxVar.a);
    }
}
