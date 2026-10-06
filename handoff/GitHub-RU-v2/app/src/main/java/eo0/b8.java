package eo0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class b8 implements aaShadow.a {
    public static final List a = sy.d0Shadow.n("__typename");

    public static jn0.ac c(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        while (eVar.r0(a) == 0) {
            str = (String) aa.c.a.a(eVar, wVar);
        }
        eVar.s0();
        ar0.p0 c = ar0.u0.c(eVar, wVar);
        if (str != null) {
            return new jn0.ac(str, c);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public static void d(ea.f fVar, aa.w wVar, jn0.ac acVar) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(acVar, "value");
        fVar.z0("__typename");
        aa.c.a.b(fVar, wVar, acVar.a);
        List list = ar0.u0.a;
        ar0.u0.d(fVar, wVar, acVar.b);
    }
}
