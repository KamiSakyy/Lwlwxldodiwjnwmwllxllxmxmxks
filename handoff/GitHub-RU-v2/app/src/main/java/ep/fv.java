package ep;

import java.util.List;
import java.util.Set;
import jo.u80;
import jo.w80;
import jo.z80;

/* loaded from: /home/user/work/p/classes3.dex */
public final class fv implements aa.a {
    public static final fv a = new fv();
    public static final List b = sy.d0.n("__typename");

    public final Object a(ea.e eVar, aa.w wVar) {
        w80 w80Var;
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        Set set = wVar.b;
        Set set2 = wVar.a;
        z80 z80Var = null;
        String str = null;
        while (eVar.r0(b) == 0) {
            str = (String) aa.c.a.a(eVar, wVar);
        }
        if (str == null) {
            throw new IllegalStateException("__typename was not found");
        }
        if (m71.a.v(m71.a.O(new String[]{"Issue"}), set2, str, set)) {
            eVar.s0();
            w80Var = hv.c(eVar, wVar);
        } else {
            w80Var = null;
        }
        if (m71.a.v(m71.a.O(new String[]{"PullRequest"}), set2, str, set)) {
            eVar.s0();
            z80Var = kv.c(eVar, wVar);
        }
        return new u80(str, w80Var, z80Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        u80 u80Var = (u80) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(u80Var, "value");
        fVar.z0("__typename");
        aa.c.a.b(fVar, wVar, u80Var.a);
        w80 w80Var = u80Var.b;
        if (w80Var != null) {
            hv.d(fVar, wVar, w80Var);
        }
        z80 z80Var = u80Var.c;
        if (z80Var != null) {
            kv.d(fVar, wVar, z80Var);
        }
    }
}
