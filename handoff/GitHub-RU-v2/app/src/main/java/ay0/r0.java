package ay0;

import java.util.List;
import java.util.Set;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class r0 implements aa.a {
    public static final List a = sy.d0.n("__typename");

    public static i0 c(ea.e eVar, aa.w wVar) {
        a0 a0Var;
        b0 b0Var;
        c0 c0Var;
        d0 d0Var;
        e0 e0Var;
        f0 f0Var;
        g0 g0Var;
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        Set set = wVar.b;
        Set set2 = wVar.a;
        h0 h0Var = null;
        String str = null;
        while (eVar.r0(a) == 0) {
            str = (String) aa.c.a.a(eVar, wVar);
        }
        if (str == null) {
            throw new IllegalStateException("__typename was not found");
        }
        if (m71.a.v(m71.a.O(new String[]{"ProjectV2GroupAssigneeValue"}), set2, str, set)) {
            eVar.s0();
            a0Var = j0.c(eVar, wVar);
        } else {
            a0Var = null;
        }
        if (m71.a.v(m71.a.O(new String[]{"ProjectV2GroupDateValue"}), set2, str, set)) {
            eVar.s0();
            b0Var = k0.c(eVar, wVar);
        } else {
            b0Var = null;
        }
        if (m71.a.v(m71.a.O(new String[]{"ProjectV2GroupIterationValue"}), set2, str, set)) {
            eVar.s0();
            c0Var = l0.c(eVar, wVar);
        } else {
            c0Var = null;
        }
        if (m71.a.v(m71.a.O(new String[]{"ProjectV2GroupMilestoneValue"}), set2, str, set)) {
            eVar.s0();
            d0Var = m0.c(eVar, wVar);
        } else {
            d0Var = null;
        }
        if (m71.a.v(m71.a.O(new String[]{"ProjectV2GroupNumberValue"}), set2, str, set)) {
            eVar.s0();
            e0Var = n0.c(eVar, wVar);
        } else {
            e0Var = null;
        }
        if (m71.a.v(m71.a.O(new String[]{"ProjectV2GroupRepositoryValue"}), set2, str, set)) {
            eVar.s0();
            f0Var = o0.c(eVar, wVar);
        } else {
            f0Var = null;
        }
        if (m71.a.v(m71.a.O(new String[]{"ProjectV2GroupSingleSelectValue"}), set2, str, set)) {
            eVar.s0();
            g0Var = p0.c(eVar, wVar);
        } else {
            g0Var = null;
        }
        if (m71.a.v(m71.a.O(new String[]{"ProjectV2GroupTextValue"}), set2, str, set)) {
            eVar.s0();
            h0Var = q0.c(eVar, wVar);
        }
        return new i0(str, a0Var, b0Var, c0Var, d0Var, e0Var, f0Var, g0Var, h0Var);
    }
}
