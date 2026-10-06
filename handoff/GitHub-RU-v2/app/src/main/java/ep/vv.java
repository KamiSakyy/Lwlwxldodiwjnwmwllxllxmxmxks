package ep;

import java.util.List;
import jo.o90;
import jo.q90;

/* loaded from: /home/user/work/p/classes3.dex */
public final class vv implements aaShadow.a {
    public static final vv a = new vv();
    public static final List b = sy.d0.n("unresolveReviewThread");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        q90 q90Var = null;
        while (eVar.r0(b) == 0) {
            q90Var = (q90) aa.c.b(aa.c.c(xv.a, false)).a(eVar, wVar);
        }
        return new o90(q90Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        o90 o90Var = (o90) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(o90Var, "value");
        fVar.z0("unresolveReviewThread");
        aa.c.b(aa.c.c(xv.a, false)).b(fVar, wVar, o90Var.a);
    }
}
