package ep;

import java.util.List;
import jo.eg0;
import jo.fg0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class h00 implements aa.a {
    public static final h00 a = new h00();
    public static final List b = sy.d0.n("pullRequestReview");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        eg0 eg0Var = null;
        while (eVar.r0(b) == 0) {
            eg0Var = (eg0) aa.c.b(aa.c.c(g00.a, true)).a(eVar, wVar);
        }
        return new fg0(eg0Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        fg0 fg0Var = (fg0) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(fg0Var, "value");
        fVar.z0("pullRequestReview");
        aa.c.b(aa.c.c(g00.a, true)).b(fVar, wVar, fg0Var.a);
    }
}
