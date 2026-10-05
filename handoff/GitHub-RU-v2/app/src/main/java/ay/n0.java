package ay;

import java.util.List;
import java.util.Set;
import zx.g1;
import zx.h1;
import zx.i1;

/* loaded from: /home/user/work/p/classes3.dex */
public final class n0 implements aa.a {
    public static final n0 a = new n0();
    public static final List b = sy.d0.n("__typename");

    public final Object a(ea.e eVar, aa.w wVar) {
        zx.f1 f1Var;
        h1 h1Var;
        i1 i1Var;
        g1 g1Var;
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
            f1Var = o0.c(eVar, wVar);
        } else {
            f1Var = null;
        }
        if (m71.a.v(m71.a.O(new String[]{"Mannequin"}), set2, str, set)) {
            eVar.s0();
            h1Var = q0.c(eVar, wVar);
        } else {
            h1Var = null;
        }
        if (m71.a.v(m71.a.O(new String[]{"Organization"}), set2, str, set)) {
            eVar.s0();
            i1Var = r0.c(eVar, wVar);
        } else {
            i1Var = null;
        }
        if (m71.a.v(m71.a.O(new String[]{"EnterpriseUserAccount"}), set2, str, set)) {
            eVar.s0();
            g1Var = p0.c(eVar, wVar);
        } else {
            g1Var = null;
        }
        if (m71.a.v(m71.a.O(new String[]{"User"}), set2, str, set)) {
            eVar.s0();
            c1Var = qx.d1.c(eVar, wVar);
        }
        return new zx.e1(str, f1Var, h1Var, i1Var, g1Var, c1Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        zx.e1 e1Var = (zx.e1) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(e1Var, "value");
        fVar.z0("__typename");
        aa.c.a.b(fVar, wVar, e1Var.a);
        zx.f1 f1Var = e1Var.b;
        if (f1Var != null) {
            o0.d(fVar, wVar, f1Var);
        }
        h1 h1Var = e1Var.c;
        if (h1Var != null) {
            q0.d(fVar, wVar, h1Var);
        }
        i1 i1Var = e1Var.d;
        if (i1Var != null) {
            r0.d(fVar, wVar, i1Var);
        }
        g1 g1Var = e1Var.e;
        if (g1Var != null) {
            p0.d(fVar, wVar, g1Var);
        }
        qx.c1 c1Var = e1Var.f;
        if (c1Var != null) {
            qx.d1.d(fVar, wVar, c1Var);
        }
    }
}
