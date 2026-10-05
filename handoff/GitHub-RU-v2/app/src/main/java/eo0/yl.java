package eo0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class yl implements aa.a {
    public static final List a = sy.d0.n("forks");

    public static jn0.tv c(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        jn0.qv qvVar = null;
        while (eVar.r0(a) == 0) {
            qvVar = (jn0.qv) aa.c.c(vl.a, false).a(eVar, wVar);
        }
        if (qvVar != null) {
            return new jn0.tv(qvVar);
        }
        k41.b.B(eVar, "forks");
        throw null;
    }

    public static void d(ea.f fVar, aa.w wVar, jn0.tv tvVar) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(tvVar, "value");
        fVar.z0("forks");
        aa.c.c(vl.a, false).b(fVar, wVar, tvVar.a);
    }
}
