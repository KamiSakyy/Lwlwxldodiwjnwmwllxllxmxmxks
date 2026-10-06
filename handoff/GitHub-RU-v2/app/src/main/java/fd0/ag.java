package fd0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class ag implements aaShadow.a {
    public static final ag a = new ag();
    public static final List b = sy.d0.n("repository");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        kc0.yn ynVar = null;
        while (eVar.r0(b) == 0) {
            ynVar = (kc0.yn) aa.c.b(aa.c.c(dg.a, false)).a(eVar, wVar);
        }
        return new kc0.vn(ynVar);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        kc0.vn vnVar = (kc0.vn) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(vnVar, "value");
        fVar.z0("repository");
        aa.c.b(aa.c.c(dg.a, false)).b(fVar, wVar, vnVar.a);
    }
}
