package ep;

import java.util.List;
import jo.xi0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class w10 implements aaShadow.a {
    public static final w10 a = new w10();
    public static final List b = sy.d0.n("api");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        while (eVar.r0(b) == 0) {
            str = (String) aa.c.a.a(eVar, wVar);
        }
        if (str != null) {
            return new xi0(str);
        }
        k41.b.B(eVar, "api");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        xi0 xi0Var = (xi0) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(xi0Var, "value");
        fVar.z0("api");
        aa.c.a.b(fVar, wVar, xi0Var.a);
    }
}
