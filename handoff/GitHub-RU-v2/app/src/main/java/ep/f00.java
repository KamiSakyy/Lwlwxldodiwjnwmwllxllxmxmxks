package ep;

import java.util.List;
import jo.dg0;
import jo.fg0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class f00 implements aaShadow.a {
    public static final f00 a = new f00();
    public static final List b = sy.d0.n("updatePullRequestReview");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        fg0 fg0Var = null;
        while (eVar.r0(b) == 0) {
            fg0Var = (fg0) aa.c.b(aa.c.c(h00.a, false)).a(eVar, wVar);
        }
        return new dg0(fg0Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        dg0 dg0Var = (dg0) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(dg0Var, "value");
        fVar.z0("updatePullRequestReview");
        aa.c.b(aa.c.c(h00.a, false)).b(fVar, wVar, dg0Var.a);
    }
}
