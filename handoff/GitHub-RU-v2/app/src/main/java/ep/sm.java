package ep;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class sm implements aaShadow.a {
    public static final List a = sy.d0.n("contributors");

    public static jo.ww c(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        jo.swShadow swVar = null;
        while (eVar.r0(a) == 0) {
            swVar = (jo.sw) aa.c.c(om.a, false).a(eVar, wVar);
        }
        if (swVar != null) {
            return new jo.ww(swVar);
        }
        k41.b.B(eVar, "contributors");
        throw null;
    }

    public static void d(ea.f fVar, aa.w wVar, jo.ww wwVar) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(wwVar, "value");
        fVar.z0("contributors");
        aa.c.c(om.a, false).b(fVar, wVar, wwVar.a);
    }
}
