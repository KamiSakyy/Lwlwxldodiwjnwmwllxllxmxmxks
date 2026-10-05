package fd0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class qd implements aa.a {
    public static final List a = sy.d0.n("mentionableUsers");

    public static kc0.kk c(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        kc0.hk hkVar = null;
        while (eVar.r0(a) == 0) {
            hkVar = (kc0.hk) aa.c.c(nd.a, false).a(eVar, wVar);
        }
        if (hkVar != null) {
            return new kc0.kk(hkVar);
        }
        k41.b.B(eVar, "mentionableUsers");
        throw null;
    }

    public static void d(ea.f fVar, aa.w wVar, kc0.kk kkVar) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(kkVar, "value");
        fVar.z0("mentionableUsers");
        aa.c.c(nd.a, false).b(fVar, wVar, kkVar.a);
    }
}
