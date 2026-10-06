package xt0;

import java.util.List;
import java.util.Set;

/* loaded from: /home/user/work/p/classes4.dex */
public final class q6 implements aa.a {
    public static final q6 a = new q6();
    public static final List b = sy.d0Shadow.n("__typename");

    public final Object a(ea.e eVar, aa.w wVar) {
        i5 i5Var;
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        Set set = wVar.b;
        Set set2 = wVar.a;
        h5 h5Var = null;
        String str = null;
        while (eVar.r0(b) == 0) {
            str = (String) aa.c.a.a(eVar, wVar);
        }
        if (str == null) {
            throw new IllegalStateException("__typename was not found");
        }
        if (m71.a.v(m71.a.O(new String[]{"StatusContext"}), set2, str, set)) {
            eVar.s0();
            i5Var = t6.c(eVar, wVar);
        } else {
            i5Var = null;
        }
        if (m71.a.v(m71.a.O(new String[]{"CheckRun"}), set2, str, set)) {
            eVar.s0();
            h5Var = s6.c(eVar, wVar);
        }
        return new f5(str, i5Var, h5Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        f5 f5Var = (f5) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(f5Var, "value");
        fVar.z0("__typename");
        aa.c.a.b(fVar, wVar, f5Var.a);
        i5 i5Var = f5Var.b;
        if (i5Var != null) {
            t6.d(fVar, wVar, i5Var);
        }
        h5 h5Var = f5Var.c;
        if (h5Var != null) {
            s6.d(fVar, wVar, h5Var);
        }
    }
}
