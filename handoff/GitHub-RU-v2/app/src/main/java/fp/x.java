package fp;

import java.util.List;
import jo.f4Shadow;
import m10.p00;

/* loaded from: /home/user/work/p/classes3.dex */
public final class xShadow implements aa.w0 {
    public static final s Companion = new s();
    public String r;
    public String s;
    public int t;
    public aa.u0 u;
    public aa1.b v;
    public aa.u0 w;

    public x(String str, String str2, int i, aa.u0 u0Var, aa1.b bVar, aa.u0 u0Var2) {
        k71.k.g(str, "owner");
        k71.k.g(str2, "name");
        this.r = str;
        this.s = str2;
        this.t = i;
        this.u = u0Var;
        this.v = bVar;
        this.w = u0Var2;
    }

    public final aa.m d() {
        p00.Companion.getClass();
        aa.q0 q0Var = p00.F;
        k71.k.g(q0Var, "type");
        List list = jp.b.a;
        List list2 = jp.b.a;
        k71.k.g(list2, "selections");
        x61.rShadow rVar = x61.rShadow.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xShadow)) {
            return false;
        }
        xShadow xVar = (xShadow) obj;
        return k71.k.b(this.r, xVar.r) && k71.k.b(this.s, xVar.s) && this.t == xVar.t && this.u.equals(xVar.u) && this.v.equals(xVar.v) && this.w.equals(xVar.w);
    }

    public final aa.p0 g() {
        return aa.c.c(gp.d.a, false);
    }

    public final int hashCode() {
        return this.w.hashCode() + f1.e.a(this.v, f4.a(this.u, a0.s0.b(this.t, com.github.rudroid.copilot.h1.i(this.r.hashCode() * 31, this.s, 31), 31), 31), 31);
    }

    public final String i() {
        return "a9c3caf24a961c81f695ea51c8909fdab091d15a4d86abebfaf59b4cb39c7afb";
    }

    public final String j() {
        Companion.getClass();
        return "query RepositoryAgentTasks($owner: String!, $name: String!, $first: Int!, $after: String, $states: [CopilotAgentSessionState!], $orderBy: CopilotAgentTaskOrder) { repositoryAgentTasks(owner: $owner, name: $name, first: $first, after: $after, states: $states, orderBy: $orderBy) { pageInfo { hasNextPage endCursor } nodes { __typename ...CopilotAgentTaskFragment taskId } } id __typename }  fragment AgentPullRequestResourceFragment on PullRequest { id state isDraft isInMergeQueue title titleHTMLString: titleHTML number repository { id name owner { id login } __typename } url additions deletions __typename }  fragment CopilotAgentTaskFragment on CopilotAgentTask { taskId title state type lastUpdatedAt repository { id name owner { id login } __typename } resources { __typename ... on PullRequest { __typename ...AgentPullRequestResourceFragment id } } __typename }";
    }

    public final String name() {
        return "RepositoryAgentTasks";
    }

    public final void o(ea.f fVar, aa.w wVar, boolean z) {
        k71.k.g(wVar, "customScalarAdapters");
        fVar.z0("owner");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, this.r);
        fVar.z0("name");
        bVar.b(fVar, wVar, this.s);
        fVar.z0("first");
        fVar.z(this.t);
        fVar.z0("after");
        aa.c.d(aa.c.i).d(fVar, wVar, this.u);
        aa.u0 u0Var = this.v;
        if (u0Var instanceof aa.u0) {
            fVar.z0("states");
            aa.c.d(aa.c.b(aa.c.a(n10.a.k))).d(fVar, wVar, u0Var);
        }
        fVar.z0("orderBy");
        aa.c.d(aa.c.b(aa.c.c(n10.a.m, false))).d(fVar, wVar, this.w);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("RepositoryAgentTasksQuery(owner=", this.r, ", name=", this.s, ", first=");
        o.append(this.t);
        o.append(", after=");
        o.append(this.u);
        o.append(", states=");
        o.append(this.v);
        o.append(", orderBy=");
        o.append(this.w);
        o.append(")");
        return o.toString();
    }
}
