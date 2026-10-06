package ep;

import java.util.List;
import jo.k70;
import jo.n70;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class hu implements aaShadow.a {
    public static final List a = sy.d0.n("sponsorshipsAsSponsor");

    public static k70 c(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        n70 n70Var = null;
        while (eVar.r0(a) == 0) {
            n70Var = (n70) aa.c.c(ku.a, false).a(eVar, wVar);
        }
        if (n70Var != null) {
            return new k70(n70Var);
        }
        k41.b.B(eVar, "sponsorshipsAsSponsor");
        throw null;
    }

    public static void d(ea.f fVar, aa.w wVar, k70 k70Var) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(k70Var, "value");
        fVar.z0("sponsorshipsAsSponsor");
        aa.c.c(ku.a, false).b(fVar, wVar, k70Var.a);
    }
}
