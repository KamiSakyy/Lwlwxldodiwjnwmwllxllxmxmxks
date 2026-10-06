package fd0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class wf implements aaShadow.a {
    public static final wf a = new wf();
    public static final List b = sy.d0.n("viewer");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        kc0.qn qnVar = null;
        while (eVar.r0(b) == 0) {
            qnVar = (kc0.qn) aa.c.c(xf.a, true).a(eVar, wVar);
        }
        if (qnVar != null) {
            return new kc0.pn(qnVar);
        }
        k41.b.B(eVar, "viewer");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        kc0.pn pnVar = (kc0.pn) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(pnVar, "value");
        fVar.z0("viewer");
        aa.c.c(xf.a, true).b(fVar, wVar, pnVar.a);
    }
}
