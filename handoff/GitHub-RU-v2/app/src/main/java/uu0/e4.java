package uu0;

import java.util.List;
import java.util.Set;

/* loaded from: /home/user/work/p/classes4.dex */
public final class e4 implements aa.a {
    public static final e4 a = new e4();
    public static final List b = sy.d0.n("__typename");

    public final Object a(ea.e eVar, aa.w wVar) {
        t3 t3Var;
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        Set set = wVar.b;
        Set set2 = wVar.a;
        u3 u3Var = null;
        String str = null;
        while (eVar.r0(b) == 0) {
            str = (String) aa.c.a.a(eVar, wVar);
        }
        if (str == null) {
            throw new IllegalStateException("__typename was not found");
        }
        if (m71.a.v(m71.a.O(new String[]{"Issue"}), set2, str, set)) {
            eVar.s0();
            t3Var = f4.c(eVar, wVar);
        } else {
            t3Var = null;
        }
        if (m71.a.v(m71.a.O(new String[]{"PullRequest"}), set2, str, set)) {
            eVar.s0();
            u3Var = g4.c(eVar, wVar);
        }
        return new s3(str, t3Var, u3Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        s3 s3Var = (s3) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(s3Var, "value");
        fVar.z0("__typename");
        aa.c.a.b(fVar, wVar, s3Var.a);
        t3 t3Var = s3Var.b;
        if (t3Var != null) {
            f4.d(fVar, wVar, t3Var);
        }
        u3 u3Var = s3Var.c;
        if (u3Var != null) {
            g4.d(fVar, wVar, u3Var);
        }
    }
}
