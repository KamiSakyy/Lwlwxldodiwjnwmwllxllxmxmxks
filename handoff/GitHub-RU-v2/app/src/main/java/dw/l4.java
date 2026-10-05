package dw;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class l4 implements aa.a {
    public static final List a = x61.l.r(new String[]{"__typename", "id", "issueOrPullRequest"});

    public static x3 c(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        String str2 = null;
        u3 u3Var = null;
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
                u3Var = (u3) aa.c.b(aa.c.c(i4.a, true)).a(eVar, wVar);
            }
        }
        eVar.s0();
        c4 c = g4.c(eVar, wVar);
        eVar.s0();
        yw.f fVar = yw.f.a;
        yw.b c2 = yw.f.c(eVar, wVar);
        if (str == null) {
            k41.b.B(eVar, "__typename");
            throw null;
        }
        if (str2 != null) {
            return new x3(str, str2, u3Var, c, c2);
        }
        k41.b.B(eVar, "id");
        throw null;
    }
}
