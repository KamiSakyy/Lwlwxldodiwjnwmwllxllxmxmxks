package cq;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class e5 implements aa.a {
    public static final List a = sy.d0.n("textFieldFileLines");

    public static q4 c(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        List list = null;
        while (eVar.r0(a) == 0) {
            list = (List) aa.c.b(aa.c.a(aa.c.b(aa.c.c(j5.a, true)))).a(eVar, wVar);
        }
        return new q4(list);
    }

    public static void d(ea.f fVar, aa.w wVar, q4 q4Var) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(q4Var, "value");
        fVar.z0("textFieldFileLines");
        aa.c.b(aa.c.a(aa.c.b(aa.c.c(j5.a, true)))).b(fVar, wVar, q4Var.a);
    }
}
