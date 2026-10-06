package jo;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class o7 implements aaShadow.n0 {
    public static final k7 Companion = new k7();
    public String r;
    public aa.u0 s;
    public m10.i7 t;
    public aa.u0 u;
    public aa.u0 v;
    public aa1.b w;
    public aa1.b x;
    public aa.u0 y;

    public o7(String str, aa.u0 u0Var, m10.i7 i7Var, aa.u0 u0Var2, aa.u0 u0Var3, aa1.b bVar, aa1.b bVar2, aa.u0 u0Var4) {
        k71.k.g(str, "repositoryId");
        this.r = str;
        this.s = u0Var;
        this.t = i7Var;
        this.u = u0Var2;
        this.v = u0Var3;
        this.w = bVar;
        this.x = bVar2;
        this.y = u0Var4;
    }

    public final aa.m d() {
        m10.vp.Companion.getClass();
        aa.q0 q0Var = m10.vp.A1;
        k71.k.g(q0Var, "type");
        List list = h10.g0.a;
        List list2 = h10.g0.a;
        k71.k.g(list2, "selections");
        x61.r rVar = x61.r.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o7)) {
            return false;
        }
        o7 o7Var = (o7) obj;
        return k71.k.b(this.r, o7Var.r) && this.s.equals(o7Var.s) && this.t == o7Var.t && this.u.equals(o7Var.u) && this.v.equals(o7Var.v) && this.w.equals(o7Var.w) && this.x.equals(o7Var.x) && this.y.equals(o7Var.y);
    }

    public final aa.p0 g() {
        return aa.c.c(ep.y4.a, false);
    }

    public final int hashCode() {
        return this.y.hashCode() + f1.e.a(this.x, f1.e.a(this.w, f4.a(this.v, f4.a(this.u, (this.t.hashCode() + f4.a(this.s, this.r.hashCode() * 31, 31)) * 31, 31), 31), 31), 31);
    }

    public final String i() {
        return "1a4712d1d37665d482208324010baf74488b18fb75e6464e8d303a4871d04a2d";
    }

    public final String j() {
        Companion.getClass();
        return "mutation CreateCopilotAgentTask($repositoryId: ID!, $baseRef: String, $eventType: CopilotAgentEventType!, $problemStatement: String, $subagent: String, $agentId: Int, $modelId: String, $createPullRequest: Boolean) { createCopilotAgentTask(input: { baseRef: $baseRef repositoryId: $repositoryId eventType: $eventType problemStatement: $problemStatement customAgent: $subagent agentId: $agentId model: $modelId createPullRequest: $createPullRequest } ) { task { taskId title __typename } } }";
    }

    public final String name() {
        return "CreateCopilotAgentTask";
    }

    public final void o(ea.f fVar, aa.w wVar, boolean z) {
        k71.k.g(wVar, "customScalarAdapters");
        fVar.z0("repositoryId");
        aa.c.a.b(fVar, wVar, this.r);
        fVar.z0("baseRef");
        aa.o0 o0Var = aa.c.i;
        f4.y(o0Var, fVar, wVar, this.s, "eventType");
        fVar.I(this.t.r);
        fVar.z0("problemStatement");
        aa.c.d(o0Var).d(fVar, wVar, this.u);
        fVar.z0("subagent");
        aa.c.d(o0Var).d(fVar, wVar, this.v);
        aa.u0 u0Var = this.w;
        if (u0Var instanceof aaShadow.u0) {
            fVar.z0("agentId");
            aa.c.d(aa.c.b(tp.a.a)).d(fVar, wVar, u0Var);
        }
        aa.u0 u0Var2 = this.x;
        if (u0Var2 instanceof aaShadow.u0) {
            fVar.z0("modelId");
            aa.c.d(o0Var).d(fVar, wVar, u0Var2);
        }
        fVar.z0("createPullRequest");
        aa.c.d(aa.c.k).d(fVar, wVar, this.y);
    }

    public final String toString() {
        StringBuilder t = f4.t(this.s, "CreateCopilotAgentTaskMutation(repositoryId=", this.r, ", baseRef=", ", eventType=");
        t.append(this.t);
        t.append(", problemStatement=");
        t.append(this.u);
        t.append(", subagent=");
        t.append(this.v);
        t.append(", agentId=");
        t.append(this.w);
        t.append(", modelId=");
        t.append(this.x);
        t.append(", createPullRequest=");
        t.append(this.y);
        t.append(")");
        return t.toString();
    }
}
