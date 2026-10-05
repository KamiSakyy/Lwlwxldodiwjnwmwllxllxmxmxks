package tz;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class h3 implements aa.a {
    public static final List a = sy.d0.n("__typename");

    public static z0 c(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        q0 q0Var = null;
        String str = null;
        while (eVar.r0(a) == 0) {
            str = (String) aa.c.a.a(eVar, wVar);
        }
        if (str == null) {
            throw new IllegalStateException("__typename was not found");
        }
        if (m71.a.v(m71.a.O(new String[]{"ProjectV2Field", "ProjectV2IterationField", "ProjectV2SingleSelectField"}), wVar.a, str, wVar.b)) {
            eVar.s0();
            q0Var = y2.c(eVar, wVar);
        }
        return new z0(str, q0Var);
    }
}
