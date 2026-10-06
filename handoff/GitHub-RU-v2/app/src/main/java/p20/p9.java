package p20;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class p9 implements aaShadow.a {
    public static final List a = x61.l.r(new String[]{"following", "followers"});

    public static u10.ge c(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        u10.ce ceVar = null;
        u10.be beVar = null;
        while (true) {
            int r0 = eVar.r0(a);
            if (r0 == 0) {
                ceVar = (u10.ce) aa.c.c(l9.a, false).a(eVar, wVar);
            } else {
                if (r0 != 1) {
                    break;
                }
                beVar = (u10.be) aa.c.c(k9.a, false).a(eVar, wVar);
            }
        }
        if (ceVar == null) {
            k41.b.B(eVar, "following");
            throw null;
        }
        if (beVar != null) {
            return new u10.ge(ceVar, beVar);
        }
        k41.b.B(eVar, "followers");
        throw null;
    }

    public static void d(ea.f fVar, aa.w wVar, u10.ge geVar) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(geVar, "value");
        fVar.z0("following");
        aa.c.c(l9.a, false).b(fVar, wVar, geVar.a);
        fVar.z0("followers");
        aa.c.c(k9.a, false).b(fVar, wVar, geVar.b);
    }
}
