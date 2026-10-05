package p20;

import java.util.List;
import u10.w50;

/* loaded from: /home/user/work/p/classes3.dex */
public final class rs implements aa.a {
    public static final rs a = new rs();
    public static final List b = sy.d0.n("viewerCanPush");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        Boolean bool = null;
        while (eVar.r0(b) == 0) {
            bool = (Boolean) aa.c.f.a(eVar, wVar);
        }
        if (bool != null) {
            return new w50(bool.booleanValue());
        }
        k41.b.B(eVar, "viewerCanPush");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        w50 w50Var = (w50) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(w50Var, "value");
        fVar.z0("viewerCanPush");
        aa.c.f.b(fVar, wVar, Boolean.valueOf(w50Var.a));
    }
}
