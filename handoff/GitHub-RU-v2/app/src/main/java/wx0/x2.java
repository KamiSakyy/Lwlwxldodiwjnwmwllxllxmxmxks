package wx0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class x2 implements aa.a {
    public static final List a = sy.d0.n("id");

    public static p0 c(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        while (eVar.r0(a) == 0) {
            str = (String) aa.c.a.a(eVar, wVar);
        }
        if (str != null) {
            return new p0(str);
        }
        k41.b.B(eVar, "id");
        throw null;
    }

    public static void d(ea.f fVar, aa.w wVar, p0 p0Var) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(p0Var, "value");
        fVar.z0("id");
        aa.c.a.b(fVar, wVar, p0Var.a);
    }
}
