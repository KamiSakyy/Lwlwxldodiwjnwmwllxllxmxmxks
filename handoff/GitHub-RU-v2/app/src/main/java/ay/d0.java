package ay;

import java.util.List;
import java.util.Set;

/* loaded from: /home/user/work/p/classes3.dex */
public final class d0 implements aa.a {
    public static final d0 a = new d0();
    public static final List b = sy.d0.n("__typename");

    public final Object a(ea.e eVar, aa.w wVar) {
        zx.w0 w0Var;
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        Set set = wVar.b;
        Set set2 = wVar.a;
        zx.u0 u0Var = null;
        String str = null;
        while (eVar.r0(b) == 0) {
            str = (String) aa.c.a.a(eVar, wVar);
        }
        if (str == null) {
            throw new IllegalStateException("__typename was not found");
        }
        if (m71.a.v(m71.a.O(new String[]{"StatusContext"}), set2, str, set)) {
            eVar.s0();
            w0Var = h0.c(eVar, wVar);
        } else {
            w0Var = null;
        }
        if (m71.a.v(m71.a.O(new String[]{"CheckRun"}), set2, str, set)) {
            eVar.s0();
            u0Var = f0.c(eVar, wVar);
        }
        return new zx.s0(str, w0Var, u0Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        zx.s0 s0Var = (zx.s0) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(s0Var, "value");
        fVar.z0("__typename");
        aa.c.a.b(fVar, wVar, s0Var.a);
        zx.w0 w0Var = s0Var.b;
        if (w0Var != null) {
            h0.d(fVar, wVar, w0Var);
        }
        zx.u0 u0Var = s0Var.c;
        if (u0Var != null) {
            f0.d(fVar, wVar, u0Var);
        }
    }
}
