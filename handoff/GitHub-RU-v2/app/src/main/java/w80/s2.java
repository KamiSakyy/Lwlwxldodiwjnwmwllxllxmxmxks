package w80;

import java.util.List;
import java.util.Set;

/* loaded from: /home/user/work/p/classes3.dex */
public final class s2 implements aa.a {
    public static final s2 a = new s2();
    public static final List b = sy.d0.n("__typename");

    public final Object a(ea.e eVar, aa.w wVar) {
        j2 j2Var;
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        Set set = wVar.b;
        Set set2 = wVar.a;
        k2 k2Var = null;
        String str = null;
        while (eVar.r0(b) == 0) {
            str = (String) aa.c.a.a(eVar, wVar);
        }
        if (str == null) {
            throw new IllegalStateException("__typename was not found");
        }
        if (m71.a.v(m71.a.O(new String[]{"Issue"}), set2, str, set)) {
            eVar.s0();
            j2Var = t2.c(eVar, wVar);
        } else {
            j2Var = null;
        }
        if (m71.a.v(m71.a.O(new String[]{"PullRequest"}), set2, str, set)) {
            eVar.s0();
            k2Var = u2.c(eVar, wVar);
        }
        return new i2(str, j2Var, k2Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        i2 i2Var = (i2) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(i2Var, "value");
        fVar.z0("__typename");
        aa.c.a.b(fVar, wVar, i2Var.a);
        j2 j2Var = i2Var.b;
        if (j2Var != null) {
            t2.d(fVar, wVar, j2Var);
        }
        k2 k2Var = i2Var.c;
        if (k2Var != null) {
            u2.d(fVar, wVar, k2Var);
        }
    }
}
