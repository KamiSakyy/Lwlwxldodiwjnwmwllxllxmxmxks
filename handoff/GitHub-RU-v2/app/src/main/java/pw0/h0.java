package pw0;

import java.util.List;
import java.util.Set;
import ow0.u0;
import ow0.v0;
import ow0.w0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class h0 implements aa.a {
    public static final h0 a = new h0();
    public static final List b = sy.d0Shadow.n("__typename");

    public final Object a(ea.e eVar, aa.w wVar) {
        v0 v0Var;
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        Set set = wVar.b;
        Set set2 = wVar.a;
        w0 w0Var = null;
        String str = null;
        while (eVar.r0(b) == 0) {
            str = (String) aa.c.a.a(eVar, wVar);
        }
        if (str == null) {
            throw new IllegalStateException("__typename was not found");
        }
        if (m71.a.v(m71.a.O(new String[]{"Issue"}), set2, str, set)) {
            eVar.s0();
            v0Var = i0.c(eVar, wVar);
        } else {
            v0Var = null;
        }
        if (m71.a.v(m71.a.O(new String[]{"PullRequest"}), set2, str, set)) {
            eVar.s0();
            w0Var = j0.c(eVar, wVar);
        }
        return new u0(str, v0Var, w0Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        u0 u0Var = (u0) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(u0Var, "value");
        fVar.z0("__typename");
        aa.c.a.b(fVar, wVar, u0Var.a);
        v0 v0Var = u0Var.b;
        if (v0Var != null) {
            i0.d(fVar, wVar, v0Var);
        }
        w0 w0Var = u0Var.c;
        if (w0Var != null) {
            j0.d(fVar, wVar, w0Var);
        }
    }
}
