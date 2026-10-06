package wx0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class d5 implements aa.a {
    public static final List a = sy.d0Shadow.n("login");

    public static x4 c(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        while (eVar.r0(a) == 0) {
            str = (String) aa.c.a.a(eVar, wVar);
        }
        if (str != null) {
            return new x4(str);
        }
        k41.b.B(eVar, "login");
        throw null;
    }

    public static void d(ea.f fVar, aa.w wVar, x4 x4Var) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(x4Var, "value");
        fVar.z0("login");
        aa.c.a.b(fVar, wVar, x4Var.a);
    }
}
