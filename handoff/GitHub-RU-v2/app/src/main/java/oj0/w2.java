package oj0;

import java.util.List;
import java.util.Set;

/* loaded from: /home/user/work/p/classes4.dex */
public final class w2 implements aa.a {
    public static final w2 a = new w2();
    public static final List b = sy.d0Shadow.n("__typename");

    public final Object a(ea.e eVar, aa.w wVar) {
        n2 n2Var;
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        Set set = wVar.b;
        Set set2 = wVar.a;
        o2 o2Var = null;
        String str = null;
        while (eVar.r0(b) == 0) {
            str = (String) aa.c.a.a(eVar, wVar);
        }
        if (str == null) {
            throw new IllegalStateException("__typename was not found");
        }
        if (m71.a.v(m71.a.O(new String[]{"Issue"}), set2, str, set)) {
            eVar.s0();
            n2Var = x2.c(eVar, wVar);
        } else {
            n2Var = null;
        }
        if (m71.a.v(m71.a.O(new String[]{"PullRequest"}), set2, str, set)) {
            eVar.s0();
            o2Var = y2.c(eVar, wVar);
        }
        return new m2(str, n2Var, o2Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        m2 m2Var = (m2) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(m2Var, "value");
        fVar.z0("__typename");
        aa.c.a.b(fVar, wVar, m2Var.a);
        n2 n2Var = m2Var.b;
        if (n2Var != null) {
            x2.d(fVar, wVar, n2Var);
        }
        o2 o2Var = m2Var.c;
        if (o2Var != null) {
            y2.d(fVar, wVar, o2Var);
        }
    }
}
