package so;

import aa.p0;
import aa.q0;
import aa.w0;
import java.util.List;
import m10.p00;

/* loaded from: /home/user/work/p/classes3.dex */
public final class d implements w0 {
    public static final a Companion = new a();

    public final aa.m d() {
        p00.Companion.getClass();
        q0 q0Var = p00.F;
        k71.k.g(q0Var, "type");
        List list = uo.a.a;
        List list2 = uo.a.a;
        k71.k.g(list2, "selections");
        x61.rShadow rVar = x61.rShadow.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        return obj != null && obj.getClass() == d.class;
    }

    public final p0 g() {
        return aa.c.c(to.a.a, false);
    }

    public final int hashCode() {
        return k71.xShadow.a(d.class).hashCode();
    }

    public final String i() {
        return "d968ced065c4cc8950ff0dc9392a6648aa3d634a1749983344e736f6ab600497";
    }

    public final String j() {
        Companion.getClass();
        return "query AgentUpdateChannels { viewer { viewerCopilotAgentCreatesChannel viewerCopilotAgentUpdatesChannel viewerCopilotAgentLogUpdatesChannel id __typename } id __typename }";
    }

    public final String name() {
        return "AgentUpdateChannels";
    }

    public final void o(ea.f fVar, aa.w wVar, boolean z) {
        k71.k.g(wVar, "customScalarAdapters");
    }
}
