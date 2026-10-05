package w80;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class v2 implements aa.a {
    public static final List a = x61.l.r(new String[]{"__typename", "id", "issueOrPullRequest"});

    public static l2 c(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        String str2 = null;
        i2 i2Var = null;
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
                i2Var = (i2) aa.c.b(aa.c.c(s2.a, true)).a(eVar, wVar);
            }
        }
        eVar.s0();
        o2 c = r2.c(eVar, wVar);
        eVar.s0();
        m90.e eVar2 = m90.e.a;
        m90.b c2 = m90.e.c(eVar, wVar);
        if (str == null) {
            k41.b.B(eVar, "__typename");
            throw null;
        }
        if (str2 != null) {
            return new l2(str, str2, i2Var, c, c2);
        }
        k41.b.B(eVar, "id");
        throw null;
    }
}
