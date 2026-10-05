package fd0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class n7 implements aa.a {
    public static final List a = sy.d0.n("__typename");

    public static kc0.gb c(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        while (eVar.r0(a) == 0) {
            str = (String) aa.c.a.a(eVar, wVar);
        }
        eVar.s0();
        uf0.p0 c = uf0.u0.c(eVar, wVar);
        if (str != null) {
            return new kc0.gb(str, c);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public static void d(ea.f fVar, aa.w wVar, kc0.gb gbVar) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(gbVar, "value");
        fVar.z0("__typename");
        aa.c.a.b(fVar, wVar, gbVar.a);
        List list = uf0.u0.a;
        uf0.u0.d(fVar, wVar, gbVar.b);
    }
}
