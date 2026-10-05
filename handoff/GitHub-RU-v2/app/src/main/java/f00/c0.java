package f00;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class c0 implements aa.a {
    public static final List a = sy.d0.n("sortValues");

    public static b0 c(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        List list = null;
        while (eVar.r0(a) == 0) {
            list = (List) aa.c.b(aa.c.a(aa.c.c(d0.a, false))).a(eVar, wVar);
        }
        return new b0(list);
    }

    public static void d(ea.f fVar, aa.w wVar, b0 b0Var) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(b0Var, "value");
        fVar.z0("sortValues");
        aa.c.b(aa.c.a(aa.c.c(d0.a, false))).b(fVar, wVar, b0Var.a);
    }
}
