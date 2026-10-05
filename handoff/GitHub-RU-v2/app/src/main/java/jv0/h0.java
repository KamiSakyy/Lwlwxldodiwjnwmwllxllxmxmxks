package jv0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class h0 implements aa.a {
    public static final List a = sy.d0.n("term");

    public static n c(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        while (eVar.r0(a) == 0) {
            str = (String) aa.c.a.a(eVar, wVar);
        }
        if (str != null) {
            return new n(str);
        }
        k41.b.B(eVar, "term");
        throw null;
    }

    public static void d(ea.f fVar, aa.w wVar, n nVar) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(nVar, "value");
        fVar.z0("term");
        aa.c.a.b(fVar, wVar, nVar.a);
    }
}
