package ep;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class r8 implements aa.a {
    public static final List a = sy.d0.n("__typename");

    public static jo.xc c(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        while (eVar.r0(a) == 0) {
            str = (String) aa.c.a.a(eVar, wVar);
        }
        eVar.s0();
        is.p0 c = is.u0.c(eVar, wVar);
        if (str != null) {
            return new jo.xc(str, c);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public static void d(ea.f fVar, aa.w wVar, jo.xc xcVar) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(xcVar, "value");
        fVar.z0("__typename");
        aa.c.a.b(fVar, wVar, xcVar.a);
        List list = is.u0.a;
        is.u0.d(fVar, wVar, xcVar.b);
    }
}
