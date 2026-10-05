package p20;

import java.util.List;
import u10.c30;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class vq implements aa.a {
    public static final List a = sy.d0.n("id");

    public static c30 c(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        while (eVar.r0(a) == 0) {
            str = (String) aa.c.a.a(eVar, wVar);
        }
        if (str != null) {
            return new c30(str);
        }
        k41.b.B(eVar, "id");
        throw null;
    }

    public static void d(ea.f fVar, aa.w wVar, c30 c30Var) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(c30Var, "value");
        fVar.z0("id");
        aa.c.a.b(fVar, wVar, c30Var.a);
    }
}
