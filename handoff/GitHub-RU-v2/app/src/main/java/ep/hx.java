package ep;

import java.util.List;
import jo.wb0;
import jo.yb0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class hx implements aaShadow.a {
    public static final hx a = new hx();
    public static final List b = sy.d0.n("updateDiscussion");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        yb0 yb0Var = null;
        while (eVar.r0(b) == 0) {
            yb0Var = (yb0) aa.c.b(aa.c.c(jx.a, false)).a(eVar, wVar);
        }
        return new wb0(yb0Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        wb0 wb0Var = (wb0) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(wb0Var, "value");
        fVar.z0("updateDiscussion");
        aa.c.b(aa.c.c(jx.a, false)).b(fVar, wVar, wb0Var.a);
    }
}
