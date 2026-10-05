package ep;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class xf implements aa.a {
    public static final xf a = new xf();
    public static final List b = sy.d0.n("mergePullRequest");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        jo.rn rnVar = null;
        while (eVar.r0(b) == 0) {
            rnVar = (jo.rn) aa.c.b(aa.c.c(zf.a, false)).a(eVar, wVar);
        }
        return new jo.pn(rnVar);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jo.pn pnVar = (jo.pn) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(pnVar, "value");
        fVar.z0("mergePullRequest");
        aa.c.b(aa.c.c(zf.a, false)).b(fVar, wVar, pnVar.a);
    }
}
