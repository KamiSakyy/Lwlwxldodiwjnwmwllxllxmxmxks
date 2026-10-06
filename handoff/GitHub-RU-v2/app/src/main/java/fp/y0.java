package fp;

import java.util.List;
import jo.f4;
import m10.p00;

/* loaded from: /home/user/work/p/classes3.dex */
public final class y0 implements aa.w0 {
    public static final s0 Companion = new s0();
    public int r;
    public aa.u0 s;
    public aa1.b t;
    public aa.u0 u;

    public y0(int i, aa.u0 u0Var, aa1.b bVar, aa.u0 u0Var2) {
        this.r = i;
        this.s = u0Var;
        this.t = bVar;
        this.u = u0Var2;
    }

    public final aa.m d() {
        p00.Companion.getClass();
        aa.q0 q0Var = p00.F;
        k71.k.g(q0Var, "type");
        List list = jp.f.a;
        List list2 = jp.f.a;
        k71.k.g(list2, "selections");
        x61.r rVar = x61.r.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y0)) {
            return false;
        }
        y0 y0Var = (y0) obj;
        return this.r == y0Var.r && this.s.equals(y0Var.s) && this.t.equals(y0Var.t) && this.u.equals(y0Var.u);
    }

    public final aa.p0 g() {
        return aa.c.c(gp.s.a, false);
    }

    public final int hashCode() {
        return this.u.hashCode() + f1.e.a(this.t, f4.a(this.s, Integer.hashCode(this.r) * 31, 31), 31);
    }

    public final String i() {
        return "d0a25e7feac46bb678561d07dde8b6e145eee2155d140cfa53a1d440edfdbf2b";
    }

    public final String j() {
        Companion.getClass();
        return "query ViewerAgentTasks($first: Int!, $after: String, $filterBy: CopilotAgentTaskFilter, $orderBy: CopilotAgentTaskOrder) { viewer { viewerCopilotAgentTasks(first: $first, after: $after, filterBy: $filterBy, orderBy: $orderBy) { pageInfo { hasNextPage endCursor } nodes { __typename ...CopilotAgentTaskFragment taskId } } id __typename } id __typename }  fragment AgentPullRequestResourceFragment on PullRequest { id state isDraft isInMergeQueue title titleHTMLString: titleHTML number repository { id name owner { id login } __typename } url additions deletions __typename }  fragment CopilotAgentTaskFragment on CopilotAgentTask { taskId title state type lastUpdatedAt repository { id name owner { id login } __typename } resources { __typename ... on PullRequest { __typename ...AgentPullRequestResourceFragment id } } __typename }";
    }

    public final String name() {
        return "ViewerAgentTasks";
    }

    public final void o(ea.f fVar, aa.w wVar, boolean z) {
        k71.k.g(wVar, "customScalarAdapters");
        fVar.z0("first");
        fVar.z(this.r);
        fVar.z0("after");
        aa.c.d(aa.c.i).d(fVar, wVar, this.s);
        aa.u0 u0Var = this.t;
        if (u0Var instanceof aa.u0) {
            fVar.z0("filterBy");
            aa.c.d(aa.c.b(aa.c.c(n10.a.l, false))).d(fVar, wVar, u0Var);
        }
        fVar.z0("orderBy");
        aa.c.d(aa.c.b(aa.c.c(n10.a.m, false))).d(fVar, wVar, this.u);
    }

    public final String toString() {
        return "ViewerAgentTasksQuery(first=" + this.r + ", after=" + this.s + ", filterBy=" + this.t + ", orderBy=" + this.u + ")";
    }
}
