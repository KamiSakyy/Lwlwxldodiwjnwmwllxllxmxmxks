package z70;

import java.util.List;
import java.util.Set;

/* loaded from: /home/user/work/p/classes3.dex */
public final class h6 implements aa.a {
    public static final h6 a = new h6();
    public static final List b = sy.d0.n("__typename");

    public final Object a(ea.e eVar, aa.w wVar) {
        x4 x4Var;
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        Set set = wVar.b;
        Set set2 = wVar.a;
        w4 w4Var = null;
        String str = null;
        while (eVar.r0(b) == 0) {
            str = (String) aa.c.a.a(eVar, wVar);
        }
        if (str == null) {
            throw new IllegalStateException("__typename was not found");
        }
        if (m71.a.v(m71.a.O(new String[]{"StatusContext"}), set2, str, set)) {
            eVar.s0();
            x4Var = k6.c(eVar, wVar);
        } else {
            x4Var = null;
        }
        if (m71.a.v(m71.a.O(new String[]{"CheckRun"}), set2, str, set)) {
            eVar.s0();
            w4Var = j6.c(eVar, wVar);
        }
        return new u4(str, x4Var, w4Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        u4 u4Var = (u4) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(u4Var, "value");
        fVar.z0("__typename");
        aa.c.a.b(fVar, wVar, u4Var.a);
        x4 x4Var = u4Var.b;
        if (x4Var != null) {
            k6.d(fVar, wVar, x4Var);
        }
        w4 w4Var = u4Var.c;
        if (w4Var != null) {
            j6.d(fVar, wVar, w4Var);
        }
    }
}
