package p20;

import java.util.List;
import u10.qx;
import u10.ux;

/* loaded from: /home/user/work/p/classes3.dex */
public final class bn implements aaShadow.a {
    public static final bn a = new bn();
    public static final List b = sy.d0.n("search");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        ux uxVar = null;
        while (eVar.r0(b) == 0) {
            uxVar = (ux) aa.c.c(fn.a, false).a(eVar, wVar);
        }
        if (uxVar != null) {
            return new qx(uxVar);
        }
        k41.b.B(eVar, "search");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        qx qxVar = (qx) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(qxVar, "value");
        fVar.z0("search");
        aa.c.c(fn.a, false).b(fVar, wVar, qxVar.a);
    }
}
