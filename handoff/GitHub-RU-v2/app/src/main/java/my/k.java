package my;

import aa.w;
import dw.m3;
import dw.t3;
import java.util.List;
import java.util.Set;
import sy.d0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class k implements aa.a {
    public static final k a = new k();
    public static final List b = d0.n("__typename");

    public final Object a(ea.e eVar, w wVar) {
        m3 m3Var;
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        Set set = wVar.b;
        Set set2 = wVar.a;
        dw.o oVar = null;
        String str = null;
        while (eVar.r0(b) == 0) {
            str = (String) aa.c.a.a(eVar, wVar);
        }
        if (str == null) {
            throw new IllegalStateException("__typename was not found");
        }
        if (m71.a.v(m71.a.O(new String[]{"Repository"}), set2, str, set)) {
            eVar.s0();
            m3Var = t3.c(eVar, wVar);
        } else {
            m3Var = null;
        }
        if (m71.a.v(m71.a.O(new String[]{"Repository"}), set2, str, set)) {
            eVar.s0();
            oVar = dw.t.c(eVar, wVar);
        }
        return new ly.r(str, m3Var, oVar);
    }

    public final void b(ea.f fVar, w wVar, Object obj) {
        ly.r rVar = (ly.r) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(rVar, "value");
        fVar.z0("__typename");
        aa.c.a.b(fVar, wVar, rVar.a);
        m3 m3Var = rVar.b;
        if (m3Var != null) {
            t3.d(fVar, wVar, m3Var);
        }
        dw.o oVar = rVar.c;
        if (oVar != null) {
            dw.t.d(fVar, wVar, oVar);
        }
    }
}
