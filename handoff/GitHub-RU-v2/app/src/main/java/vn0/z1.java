package vn0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class z1 implements aa.a {
    public static final List a = x61.l.r(new String[]{"nodes", "pageInfo"});

    public static w1 c(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        List list = null;
        v1 v1Var = null;
        while (true) {
            int r0 = eVar.r0(a);
            if (r0 == 0) {
                list = (List) aa.c.b(aa.c.a(aa.c.b(aa.c.c(x1.a, true)))).a(eVar, wVar);
            } else {
                if (r0 != 1) {
                    break;
                }
                v1Var = (v1) aa.c.c(y1.a, false).a(eVar, wVar);
            }
        }
        if (v1Var != null) {
            return new w1(list, v1Var);
        }
        k41.b.B(eVar, "pageInfo");
        throw null;
    }
}
