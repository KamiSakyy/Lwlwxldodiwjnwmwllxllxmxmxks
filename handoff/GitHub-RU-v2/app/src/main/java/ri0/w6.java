package ri0;

import java.util.List;
import java.util.Set;

/* loaded from: /home/user/work/p/classes4.dex */
public final class w6 implements aa.a {
    public static final w6 a = new w6();
    public static final List b = sy.d0Shadow.n("__typename");

    public final Object a(ea.e eVar, aa.w wVar) {
        k5 k5Var;
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        Set set = wVar.b;
        Set set2 = wVar.a;
        j5 j5Var = null;
        String str = null;
        while (eVar.r0(b) == 0) {
            str = (String) aa.c.a.a(eVar, wVar);
        }
        if (str == null) {
            throw new IllegalStateException("__typename was not found");
        }
        if (m71.a.v(m71.a.O(new String[]{"StatusContext"}), set2, str, set)) {
            eVar.s0();
            k5Var = z6.c(eVar, wVar);
        } else {
            k5Var = null;
        }
        if (m71.a.v(m71.a.O(new String[]{"CheckRun"}), set2, str, set)) {
            eVar.s0();
            j5Var = y6.c(eVar, wVar);
        }
        return new h5(str, k5Var, j5Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        h5 h5Var = (h5) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(h5Var, "value");
        fVar.z0("__typename");
        aa.c.a.b(fVar, wVar, h5Var.a);
        k5 k5Var = h5Var.b;
        if (k5Var != null) {
            z6.d(fVar, wVar, k5Var);
        }
        j5 j5Var = h5Var.c;
        if (j5Var != null) {
            y6.d(fVar, wVar, j5Var);
        }
    }
}
