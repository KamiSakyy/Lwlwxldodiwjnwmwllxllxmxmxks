package ep;

import java.util.List;
import java.util.Set;

/* loaded from: /home/user/work/p/classes3.dex */
public final class sg implements aaShadow.a {
    public static final sg a = new sg();
    public static final List b = sy.d0.n("__typename");

    public final Object a(ea.e eVar, aa.w wVar) {
        cq.n2 n2Var;
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        Set set = wVar.b;
        Set set2 = wVar.a;
        cq.r2 r2Var = null;
        String str = null;
        while (eVar.r0(b) == 0) {
            str = (String) aa.c.a.a(eVar, wVar);
        }
        if (str == null) {
            throw new IllegalStateException("__typename was not found");
        }
        if (m71.a.v(m71.a.O(new String[]{"MobileCopilotFeatureComparisonSubsection"}), set2, str, set)) {
            eVar.s0();
            n2Var = cq.o2.c(eVar, wVar);
        } else {
            n2Var = null;
        }
        if (m71.a.v(m71.a.O(new String[]{"MobileCopilotPaywallChatModels"}), set2, str, set)) {
            eVar.s0();
            r2Var = cq.s2.c(eVar, wVar);
        }
        return new jo.to(str, n2Var, r2Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jo.to toVar = (jo.to) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(toVar, "value");
        fVar.z0("__typename");
        aa.c.a.b(fVar, wVar, toVar.a);
        cq.n2 n2Var = toVar.b;
        if (n2Var != null) {
            cq.o2.d(fVar, wVar, n2Var);
        }
        cq.r2 r2Var = toVar.c;
        if (r2Var != null) {
            cq.s2.d(fVar, wVar, r2Var);
        }
    }
}
