package ep;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class cm implements aa.a {
    public static final cm a = new cm();
    public static final List b = sy.d0.n("removeSubIssue");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        jo.ew ewVar = null;
        while (eVar.r0(b) == 0) {
            ewVar = (jo.ew) aa.c.b(aa.c.c(gm.a, false)).a(eVar, wVar);
        }
        return new jo.aw(ewVar);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jo.aw awVar = (jo.aw) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(awVar, "value");
        fVar.z0("removeSubIssue");
        aa.c.b(aa.c.c(gm.a, false)).b(fVar, wVar, awVar.a);
    }
}
