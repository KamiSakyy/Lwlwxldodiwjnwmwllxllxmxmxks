package ep;

import java.util.List;
import jo.e80;
import jo.f80;

/* loaded from: /home/user/work/p/classes3.dex */
public final class wu implements aa.a {
    public static final wu a = new wu();
    public static final List b = sy.d0.n("pullRequestReview");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        e80 e80Var = null;
        while (eVar.r0(b) == 0) {
            e80Var = (e80) aa.c.b(aa.c.c(vu.a, true)).a(eVar, wVar);
        }
        return new f80(e80Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        f80 f80Var = (f80) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(f80Var, "value");
        fVar.z0("pullRequestReview");
        aa.c.b(aa.c.c(vu.a, true)).b(fVar, wVar, f80Var.a);
    }
}
