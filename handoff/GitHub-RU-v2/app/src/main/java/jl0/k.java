package jl0;

import aa.w;
import java.util.List;
import java.util.Set;
import oj0.e2;
import oj0.l2;
import sy.d0Shadow;

/* loaded from: /home/user/work/p/classes4.dex */
public final class k implements aa.a {
    public static final k a = new k();
    public static final List b = d0Shadow.n("__typename");

    public final Object a(ea.e eVar, w wVar) {
        e2 e2Var;
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        Set set = wVar.b;
        Set set2 = wVar.a;
        oj0.h hVar = null;
        String str = null;
        while (eVar.r0(b) == 0) {
            str = (String) aa.c.a.a(eVar, wVar);
        }
        if (str == null) {
            throw new IllegalStateException("__typename was not found");
        }
        if (m71.a.v(m71.a.O(new String[]{"Repository"}), set2, str, set)) {
            eVar.s0();
            e2Var = l2.c(eVar, wVar);
        } else {
            e2Var = null;
        }
        if (m71.a.v(m71.a.O(new String[]{"Repository"}), set2, str, set)) {
            eVar.s0();
            hVar = oj0.m.c(eVar, wVar);
        }
        return new il0.r(str, e2Var, hVar);
    }

    public final void b(ea.f fVar, w wVar, Object obj) {
        il0.r rVar = (il0.r) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(rVar, "value");
        fVar.z0("__typename");
        aa.c.a.b(fVar, wVar, rVar.a);
        e2 e2Var = rVar.b;
        if (e2Var != null) {
            l2.d(fVar, wVar, e2Var);
        }
        oj0.h hVar = rVar.c;
        if (hVar != null) {
            oj0.m.d(fVar, wVar, hVar);
        }
    }
}
