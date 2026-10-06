package ep;

import java.util.List;
import jo.dk0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class s20 implements aaShadow.a {
    public static final s20 a = new s20();
    public static final List b = sy.d0Shadow.n("__typename");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        while (eVar.r0(b) == 0) {
            str = (String) aa.c.a.a(eVar, wVar);
        }
        eVar.s0();
        xx.a c = xxShadow.b.c(eVar, wVar);
        if (str != null) {
            return new dk0(str, c);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        dk0 dk0Var = (dk0) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(dk0Var, "value");
        fVar.z0("__typename");
        aa.c.a.b(fVar, wVar, dk0Var.a);
        List list = xxShadow.b.a;
        xxShadow.b.d(fVar, wVar, dk0Var.b);
    }
}
