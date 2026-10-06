package ap0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class i4 implements aa.a {
    public static final List a = sy.d0Shadow.n("textFieldFileLines");

    public static u3 c(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        List list = null;
        while (eVar.r0(a) == 0) {
            list = (List) aa.c.b(aa.c.a(aa.c.b(aa.c.c(n4.a, true)))).a(eVar, wVar);
        }
        return new u3(list);
    }

    public static void d(ea.f fVar, aa.w wVar, u3 u3Var) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(u3Var, "value");
        fVar.z0("textFieldFileLines");
        aa.c.b(aa.c.a(aa.c.b(aa.c.c(n4.a, true)))).b(fVar, wVar, u3Var.a);
    }
}
