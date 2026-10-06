package tz;

import java.util.List;
import java.util.Set;

/* loaded from: /home/user/work/p/classes3.dex */
public final class q2 implements aa.a {
    public static final q2 a = new q2();
    public static final List b = sy.d0Shadow.n("__typename");

    public final Object a(ea.e eVar, aa.w wVar) {
        s1 s1Var;
        r1 r1Var;
        l0 l0Var;
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        Set set = wVar.b;
        Set set2 = wVar.a;
        k0 k0Var = null;
        String str = null;
        while (eVar.r0(b) == 0) {
            str = (String) aa.c.a.a(eVar, wVar);
        }
        if (str == null) {
            throw new IllegalStateException("__typename was not found");
        }
        if (m71.a.v(m71.a.O(new String[]{"User"}), set2, str, set)) {
            eVar.s0();
            s1Var = a4.c(eVar, wVar);
        } else {
            s1Var = null;
        }
        if (m71.a.v(m71.a.O(new String[]{"Team"}), set2, str, set)) {
            eVar.s0();
            r1Var = z3.c(eVar, wVar);
        } else {
            r1Var = null;
        }
        if (m71.a.v(m71.a.O(new String[]{"Mannequin"}), set2, str, set)) {
            eVar.s0();
            l0Var = t2.c(eVar, wVar);
        } else {
            l0Var = null;
        }
        if (m71.a.v(m71.a.O(new String[]{"Bot"}), set2, str, set)) {
            eVar.s0();
            k0Var = s2.c(eVar, wVar);
        }
        return new i0(str, s1Var, r1Var, l0Var, k0Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        i0 i0Var = (i0) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(i0Var, "value");
        fVar.z0("__typename");
        aa.c.a.b(fVar, wVar, i0Var.a);
        s1 s1Var = i0Var.b;
        if (s1Var != null) {
            a4.d(fVar, wVar, s1Var);
        }
        r1 r1Var = i0Var.c;
        if (r1Var != null) {
            z3.d(fVar, wVar, r1Var);
        }
        l0 l0Var = i0Var.d;
        if (l0Var != null) {
            t2.d(fVar, wVar, l0Var);
        }
        k0 k0Var = i0Var.e;
        if (k0Var != null) {
            s2.d(fVar, wVar, k0Var);
        }
    }
}
