package sd0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class q0 implements aa.a {
    public static final List a = sy.d0.n("textFieldFileLines");

    public static c0 c(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        List list = null;
        while (eVar.r0(a) == 0) {
            list = (List) aa.c.b(aa.c.a(aa.c.b(aa.c.c(v0.a, true)))).a(eVar, wVar);
        }
        return new c0(list);
    }

    public static void d(ea.f fVar, aa.w wVar, c0 c0Var) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(c0Var, "value");
        fVar.z0("textFieldFileLines");
        aa.c.b(aa.c.a(aa.c.b(aa.c.c(v0.a, true)))).b(fVar, wVar, c0Var.a);
    }
}
