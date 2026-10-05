package eo0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class l8 implements aa.a {
    public static final l8 a = new l8();
    public static final List b = sy.d0.n("pullRequestReview");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        jn0.sc scVar = null;
        while (eVar.r0(b) == 0) {
            scVar = (jn0.sc) aa.c.b(aa.c.c(n8.a, true)).a(eVar, wVar);
        }
        return new jn0.qc(scVar);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jn0.qc qcVar = (jn0.qc) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(qcVar, "value");
        fVar.z0("pullRequestReview");
        aa.c.b(aa.c.c(n8.a, true)).b(fVar, wVar, qcVar.a);
    }
}
