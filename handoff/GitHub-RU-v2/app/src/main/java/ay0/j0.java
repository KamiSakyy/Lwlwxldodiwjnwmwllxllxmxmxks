package ay0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class j0 implements aa.a {
    public static final List a = sy.d0Shadow.n("logins");

    public static a0 c(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        List list = null;
        while (eVar.r0(a) == 0) {
            list = (List) aa.c.b(aa.c.a(aa.c.a)).a(eVar, wVar);
        }
        return new a0(list);
    }

    public static void d(ea.f fVar, aa.w wVar, a0 a0Var) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(a0Var, "value");
        fVar.z0("logins");
        aa.c.b(aa.c.a(aa.c.a)).b(fVar, wVar, a0Var.a);
    }
}
