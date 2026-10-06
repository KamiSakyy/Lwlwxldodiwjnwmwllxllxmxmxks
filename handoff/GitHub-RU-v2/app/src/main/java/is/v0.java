package is;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class v0 implements aa.a {
    public static final List a = sy.d0Shadow.n("id");

    public static k0 c(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        while (eVar.r0(a) == 0) {
            str = (String) aa.c.a.a(eVar, wVar);
        }
        if (str != null) {
            return new k0(str);
        }
        k41.b.B(eVar, "id");
        throw null;
    }

    public static void d(ea.f fVar, aa.w wVar, k0 k0Var) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(k0Var, "value");
        fVar.z0("id");
        aa.c.a.b(fVar, wVar, k0Var.a);
    }
}
