package tz;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class s3 implements aa.a {
    public static final List a = x61.l.r(new String[]{"repository", "field"});

    public static k1 c(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        v1 v1Var = null;
        z zVar = null;
        while (true) {
            int r0 = eVar.r0(a);
            if (r0 == 0) {
                v1Var = (v1) aa.c.b(aa.c.c(e4.a, false)).a(eVar, wVar);
            } else {
                if (r0 != 1) {
                    break;
                }
                zVar = (z) aa.c.c(h2.a, true).a(eVar, wVar);
            }
        }
        if (zVar != null) {
            return new k1(v1Var, zVar);
        }
        k41.b.B(eVar, "field");
        throw null;
    }

    public static void d(ea.f fVar, aa.w wVar, k1 k1Var) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(k1Var, "value");
        fVar.z0("repository");
        aa.c.b(aa.c.c(e4.a, false)).b(fVar, wVar, k1Var.a);
        fVar.z0("field");
        aa.c.c(h2.a, true).b(fVar, wVar, k1Var.b);
    }
}
