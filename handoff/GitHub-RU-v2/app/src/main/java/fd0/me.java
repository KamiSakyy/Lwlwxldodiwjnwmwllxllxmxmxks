package fd0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class me implements aa.a {
    public static final me a = new me();
    public static final List b = sy.d0.n("viewer");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        kc0.ul ulVar = null;
        while (eVar.r0(b) == 0) {
            ulVar = (kc0.ul) aa.c.c(oe.a, false).a(eVar, wVar);
        }
        if (ulVar != null) {
            return new kc0.sl(ulVar);
        }
        k41.b.B(eVar, "viewer");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        kc0.sl slVar = (kc0.sl) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(slVar, "value");
        fVar.z0("viewer");
        aa.c.c(oe.a, false).b(fVar, wVar, slVar.a);
    }
}
