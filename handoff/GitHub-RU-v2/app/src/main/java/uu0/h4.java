package uu0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class h4 implements aa.a {
    public static final List a = x61.l.r(new String[]{"__typename", "id", "issueOrPullRequest"});

    public static v3 c(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        String str2 = null;
        s3 s3Var = null;
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
                s3Var = (s3) aa.c.b(aa.c.c(e4.a, true)).a(eVar, wVar);
            }
        }
        eVar.s0();
        z3 c = d4.c(eVar, wVar);
        eVar.s0();
        nv0.f fVar = nv0.f.a;
        nv0.b c2 = nv0.f.c(eVar, wVar);
        if (str == null) {
            k41.b.B(eVar, "__typename");
            throw null;
        }
        if (str2 != null) {
            return new v3(str, str2, s3Var, c, c2);
        }
        k41.b.B(eVar, "id");
        throw null;
    }
}
