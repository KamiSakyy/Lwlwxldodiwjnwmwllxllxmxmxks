package fd0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class ca implements aa.a {
    public static final List a = x61.l.r(new String[]{"following", "followers"});

    public static kc0.ze c(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        kc0.ve veVar = null;
        kc0.ue ueVar = null;
        while (true) {
            int r0 = eVar.r0(a);
            if (r0 == 0) {
                veVar = (kc0.ve) aa.c.c(y9.a, false).a(eVar, wVar);
            } else {
                if (r0 != 1) {
                    break;
                }
                ueVar = (kc0.ue) aa.c.c(x9.a, false).a(eVar, wVar);
            }
        }
        if (veVar == null) {
            k41.b.B(eVar, "following");
            throw null;
        }
        if (ueVar != null) {
            return new kc0.ze(veVar, ueVar);
        }
        k41.b.B(eVar, "followers");
        throw null;
    }

    public static void d(ea.f fVar, aa.w wVar, kc0.ze zeVar) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(zeVar, "value");
        fVar.z0("following");
        aa.c.c(y9.a, false).b(fVar, wVar, zeVar.a);
        fVar.z0("followers");
        aa.c.c(x9.a, false).b(fVar, wVar, zeVar.b);
    }
}
