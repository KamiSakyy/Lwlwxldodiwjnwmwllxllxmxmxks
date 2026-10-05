package ep;

import java.util.List;
import java.util.Set;

/* loaded from: /home/user/work/p/classes3.dex */
public final class s1 implements aa.a {
    public static final s1 a = new s1();
    public static final List b = sy.d0.n("__typename");

    public final Object a(ea.e eVar, aa.w wVar) {
        jo.e3 e3Var;
        jo.f3 f3Var;
        jo.g3 g3Var;
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        Set set = wVar.b;
        Set set2 = wVar.a;
        qx.c1 c1Var = null;
        String str = null;
        while (eVar.r0(b) == 0) {
            str = (String) aa.c.a.a(eVar, wVar);
        }
        if (str == null) {
            throw new IllegalStateException("__typename was not found");
        }
        if (m71.a.v(m71.a.O(new String[]{"Bot"}), set2, str, set)) {
            eVar.s0();
            e3Var = v1.c(eVar, wVar);
        } else {
            e3Var = null;
        }
        if (m71.a.v(m71.a.O(new String[]{"Mannequin"}), set2, str, set)) {
            eVar.s0();
            f3Var = w1.c(eVar, wVar);
        } else {
            f3Var = null;
        }
        if (m71.a.v(m71.a.O(new String[]{"Organization"}), set2, str, set)) {
            eVar.s0();
            g3Var = x1.c(eVar, wVar);
        } else {
            g3Var = null;
        }
        if (m71.a.v(m71.a.O(new String[]{"User"}), set2, str, set)) {
            eVar.s0();
            c1Var = qx.d1.c(eVar, wVar);
        }
        return new jo.b3(str, e3Var, f3Var, g3Var, c1Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jo.b3 b3Var = (jo.b3) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(b3Var, "value");
        fVar.z0("__typename");
        aa.c.a.b(fVar, wVar, b3Var.a);
        jo.e3 e3Var = b3Var.b;
        if (e3Var != null) {
            v1.d(fVar, wVar, e3Var);
        }
        jo.f3 f3Var = b3Var.c;
        if (f3Var != null) {
            w1.d(fVar, wVar, f3Var);
        }
        jo.g3 g3Var = b3Var.d;
        if (g3Var != null) {
            x1.d(fVar, wVar, g3Var);
        }
        qx.c1 c1Var = b3Var.e;
        if (c1Var != null) {
            qx.d1.d(fVar, wVar, c1Var);
        }
    }
}
