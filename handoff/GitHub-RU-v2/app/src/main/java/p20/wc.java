package p20;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class wc implements aa.a {
    public static final List a = sy.d0.n("mentionableUsers");

    public static u10.ij c(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        u10.fj fjVar = null;
        while (eVar.r0(a) == 0) {
            fjVar = (u10.fj) aa.c.c(tc.a, false).a(eVar, wVar);
        }
        if (fjVar != null) {
            return new u10.ij(fjVar);
        }
        k41.b.B(eVar, "mentionableUsers");
        throw null;
    }

    public static void d(ea.f fVar, aa.w wVar, u10.ij ijVar) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(ijVar, "value");
        fVar.z0("mentionableUsers");
        aa.c.c(tc.a, false).b(fVar, wVar, ijVar.a);
    }
}
