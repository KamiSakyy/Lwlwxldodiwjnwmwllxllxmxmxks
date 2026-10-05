package oj0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class z2 implements aa.a {
    public static final List a = x61.l.r(new String[]{"__typename", "id", "issueOrPullRequest"});

    public static p2 c(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        String str2 = null;
        m2 m2Var = null;
        while (true) {
            int r0 = eVar.r0(a);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 1) {
                str2 = (String) aa.c.a.a(eVar, wVar);
            } else {
                if (r0 != 2) {
                    break;
                }
                m2Var = (m2) aa.c.b(aa.c.c(w2.a, true)).a(eVar, wVar);
            }
        }
        eVar.s0();
        s2 c = v2.c(eVar, wVar);
        eVar.s0();
        ek0.f fVar = ek0.f.a;
        ek0.b c2 = ek0.f.c(eVar, wVar);
        if (str == null) {
            k41.b.B(eVar, "__typename");
            throw null;
        }
        if (str2 != null) {
            return new p2(str, str2, m2Var, c, c2);
        }
        k41.b.B(eVar, "id");
        throw null;
    }
}
