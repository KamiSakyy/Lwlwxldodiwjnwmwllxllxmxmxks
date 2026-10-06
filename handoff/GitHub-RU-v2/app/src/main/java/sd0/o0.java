package sd0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class o0 implements aa.a {
    public static final List a = x61.l.r(new String[]{"contentHTML", "markDownFileLines"});

    public static a0 c(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        List list = null;
        while (true) {
            int r0 = eVar.r0(a);
            if (r0 == 0) {
                str = (String) aa.c.i.a(eVar, wVar);
            } else {
                if (r0 != 1) {
                    return new a0Shadow(str, list);
                }
                list = (List) aa.c.b(aa.c.a(aa.c.b(aa.c.c(l0.a, true)))).a(eVar, wVar);
            }
        }
    }

    public static void d(ea.f fVar, aa.w wVar, a0Shadow a0Var) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(a0Var, "value");
        fVar.z0("contentHTML");
        aa.c.i.b(fVar, wVar, a0Var.a);
        fVar.z0("markDownFileLines");
        aa.c.b(aa.c.a(aa.c.b(aa.c.c(l0.a, true)))).b(fVar, wVar, a0Var.b);
    }
}
