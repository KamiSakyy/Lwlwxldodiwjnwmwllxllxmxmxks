package e50;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class r0 implements aa.a {
    public static final List a = sy.d0.n("id");

    public static g0 c(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        while (eVar.r0(a) == 0) {
            str = (String) aa.c.a.a(eVar, wVar);
        }
        if (str != null) {
            return new g0(str);
        }
        k41.b.B(eVar, "id");
        throw null;
    }

    public static void d(ea.f fVar, aa.w wVar, g0 g0Var) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(g0Var, "value");
        fVar.z0("id");
        aa.c.a.b(fVar, wVar, g0Var.a);
    }
}
