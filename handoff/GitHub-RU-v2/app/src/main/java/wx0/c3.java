package wx0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class c3 implements aa.a {
    public static final List a = sy.d0Shadow.n("__typename");

    public static u0 c(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        l0 l0Var = null;
        String str = null;
        while (eVar.r0(a) == 0) {
            str = (String) aa.c.a.a(eVar, wVar);
        }
        if (str == null) {
            throw new IllegalStateException("__typename was not found");
        }
        if (m71.a.v(m71.a.O(new String[]{"ProjectV2Field", "ProjectV2IterationField", "ProjectV2SingleSelectField"}), wVar.a, str, wVar.b)) {
            eVar.s0();
            l0Var = t2.c(eVar, wVar);
        }
        return new u0(str, l0Var);
    }
}
