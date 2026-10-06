package ep;

import java.util.List;
import jo.x30;
import jo.y30;

/* loaded from: /home/user/work/p/classes3.dex */
public final class tr implements aaShadow.a {
    public static final tr a = new tr();
    public static final List b = sy.d0.n("resolveReviewThread");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        y30 y30Var = null;
        while (eVar.r0(b) == 0) {
            y30Var = (y30) aa.c.b(aa.c.c(ur.a, false)).a(eVar, wVar);
        }
        return new x30(y30Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        x30 x30Var = (x30) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(x30Var, "value");
        fVar.z0("resolveReviewThread");
        aa.c.b(aa.c.c(ur.a, false)).b(fVar, wVar, x30Var.a);
    }
}
