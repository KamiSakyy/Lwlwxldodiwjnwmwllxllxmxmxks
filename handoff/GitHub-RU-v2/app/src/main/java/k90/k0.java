package k90;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class k0 implements aa.a {
    public static final List a = sy.d0Shadow.n("term");

    public static o c(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        while (eVar.r0(a) == 0) {
            str = (String) aa.c.a.a(eVar, wVar);
        }
        if (str != null) {
            return new o(str);
        }
        k41.b.B(eVar, "term");
        throw null;
    }

    public static void d(ea.f fVar, aa.w wVar, o oVar) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(oVar, "value");
        fVar.z0("term");
        aa.c.a.b(fVar, wVar, oVar.a);
    }
}
