package eo0;

import java.util.List;
import java.util.Set;
import jn0.h60;
import jn0.j60;
import jn0.m60;

/* loaded from: /home/user/work/p/classes4.dex */
public final class lt implements aaShadow.a {
    public static final lt a = new lt();
    public static final List b = sy.d0.n("__typename");

    public final Object a(ea.e eVar, aa.w wVar) {
        j60 j60Var;
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        Set set = wVar.b;
        Set set2 = wVar.a;
        m60 m60Var = null;
        String str = null;
        while (eVar.r0(b) == 0) {
            str = (String) aa.c.a.a(eVar, wVar);
        }
        if (str == null) {
            throw new IllegalStateException("__typename was not found");
        }
        if (m71.a.v(m71.a.O(new String[]{"Issue"}), set2, str, set)) {
            eVar.s0();
            j60Var = nt.c(eVar, wVar);
        } else {
            j60Var = null;
        }
        if (m71.a.v(m71.a.O(new String[]{"PullRequest"}), set2, str, set)) {
            eVar.s0();
            m60Var = qt.c(eVar, wVar);
        }
        return new h60(str, j60Var, m60Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        h60 h60Var = (h60) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(h60Var, "value");
        fVar.z0("__typename");
        aa.c.a.b(fVar, wVar, h60Var.a);
        j60 j60Var = h60Var.b;
        if (j60Var != null) {
            nt.d(fVar, wVar, j60Var);
        }
        m60 m60Var = h60Var.c;
        if (m60Var != null) {
            qt.d(fVar, wVar, m60Var);
        }
    }
}
