package eo0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class k8 implements aaShadow.a {
    public static final k8 a = new k8();
    public static final List b = sy.d0.n("dismissPullRequestReview");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        jn0.qc qcVar = null;
        while (eVar.r0(b) == 0) {
            qcVar = (jn0.qc) aa.c.b(aa.c.c(l8.a, false)).a(eVar, wVar);
        }
        return new jn0.pc(qcVar);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jn0.pc pcVar = (jn0.pc) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(pcVar, "value");
        fVar.z0("dismissPullRequestReview");
        aa.c.b(aa.c.c(l8.a, false)).b(fVar, wVar, pcVar.a);
    }
}
