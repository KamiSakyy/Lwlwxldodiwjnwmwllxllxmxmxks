package h10;

import java.util.List;
import m10.d9;
import m10.eh;
import m10.vp;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class g0 {
    public static final List a;

    static {
        eh.Companion.getClass();
        aa.x xVar = eh.a;
        aa.r b = v8.l0.b(xVar);
        x61.r rVar = x61.r.r;
        List r = x61.l.r(new aa.m[]{new aa.m("taskId", b, (String) null, rVar, rVar, rVar), new aa.m("title", xVar, (String) null, rVar, rVar, rVar), new aa.m("__typename", v8.l0.b(xVar), (String) null, rVar, rVar, rVar)});
        m10.q7.Companion.getClass();
        aa.q0 q0Var = m10.q7.a;
        k71.k.g(q0Var, "type");
        List n = sy.d0.n(new aa.m("task", q0Var, (String) null, rVar, rVar, r));
        d9.Companion.getClass();
        aa.q0 q0Var2 = d9.a;
        k71.k.g(q0Var2, "type");
        vp.Companion.getClass();
        a = sy.d0.n(new aa.m("createCopilotAgentTask", q0Var2, (String) null, rVar, no.a.s(vp.D, new aa.u0(x61.x.u(new w61.k[]{new w61.k("agentId", new aa.t("agentId")), new w61.k("baseRef", new aa.t("baseRef")), new w61.k("createPullRequest", new aa.t("createPullRequest")), new w61.k("customAgent", new aa.t("subagent")), new w61.k("eventType", new aa.t("eventType")), new w61.k("model", new aa.t("modelId")), new w61.k("problemStatement", new aa.t("problemStatement")), new w61.k("repositoryId", new aa.t("repositoryId"))}))), n));
    }
}
