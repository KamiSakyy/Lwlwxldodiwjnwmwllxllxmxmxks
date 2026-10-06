package p20;

import java.util.List;
import u10.d50;

/* loaded from: /home/user/work/p/classes3.dex */
public final class es implements aaShadow.a {
    public static final es a = new es();
    public static final List b = sy.d0Shadow.n("success");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        Boolean bool = null;
        while (eVar.r0(b) == 0) {
            bool = (Boolean) aa.c.k.a(eVar, wVar);
        }
        return new d50(bool);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        d50 d50Var = (d50) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(d50Var, "value");
        fVar.z0("success");
        aa.c.k.b(fVar, wVar, d50Var.a);
    }
}
