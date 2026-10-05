package pw0;

import java.util.List;
import java.util.Set;

/* loaded from: /home/user/work/p/classes4.dex */
public final class u implements aa.a {
    public static final u a = new u();
    public static final List b = sy.d0.n("__typename");

    public final Object a(ea.e eVar, aa.w wVar) {
        ow0.h0 h0Var;
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        Set set = wVar.b;
        Set set2 = wVar.a;
        ow0.f0 f0Var = null;
        String str = null;
        while (eVar.r0(b) == 0) {
            str = (String) aa.c.a.a(eVar, wVar);
        }
        if (str == null) {
            throw new IllegalStateException("__typename was not found");
        }
        if (m71.a.v(m71.a.O(new String[]{"StatusContext"}), set2, str, set)) {
            eVar.s0();
            h0Var = y.c(eVar, wVar);
        } else {
            h0Var = null;
        }
        if (m71.a.v(m71.a.O(new String[]{"CheckRun"}), set2, str, set)) {
            eVar.s0();
            f0Var = w.c(eVar, wVar);
        }
        return new ow0.d0(str, h0Var, f0Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        ow0.d0 d0Var = (ow0.d0) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(d0Var, "value");
        fVar.z0("__typename");
        aa.c.a.b(fVar, wVar, d0Var.a);
        ow0.h0 h0Var = d0Var.b;
        if (h0Var != null) {
            y.d(fVar, wVar, h0Var);
        }
        ow0.f0 f0Var = d0Var.c;
        if (f0Var != null) {
            w.d(fVar, wVar, f0Var);
        }
    }
}
