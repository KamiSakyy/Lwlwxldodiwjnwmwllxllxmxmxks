package fp;

import java.util.List;
import m10.p00;

/* loaded from: /home/user/work/p/classes3.dex */
public final class r0 implements aa.w0 {
    public static final n0 Companion = new n0();
    public final String r;

    public r0(String str) {
        this.r = str;
    }

    public final aa.m d() {
        p00.Companion.getClass();
        aa.q0 q0Var = p00.F;
        k71.k.g(q0Var, "type");
        List list = jp.e.a;
        List list2 = jp.e.a;
        k71.k.g(list2, "selections");
        x61.r rVar = x61.r.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r0) && k71.k.b(this.r, ((r0) obj).r);
    }

    public final aa.p0 g() {
        return aa.c.c(gp.p.a, false);
    }

    public final int hashCode() {
        return this.r.hashCode();
    }

    public final String i() {
        return "dd26e27a728e70a59979344014ab442c5f3f8966d85ed3983cc483637a8474a3";
    }

    public final String j() {
        Companion.getClass();
        return "query ViewerAgentTask($taskId: String!) { viewer { viewerCopilotAgentTask(taskId: $taskId) { __typename ...CopilotAgentTaskFragment taskId } id __typename } id __typename }  fragment AgentPullRequestResourceFragment on PullRequest { id state isDraft isInMergeQueue title titleHTMLString: titleHTML number repository { id name owner { id login } __typename } url additions deletions __typename }  fragment CopilotAgentTaskFragment on CopilotAgentTask { taskId title state type lastUpdatedAt repository { id name owner { id login } __typename } resources { __typename ... on PullRequest { __typename ...AgentPullRequestResourceFragment id } } __typename }";
    }

    public final String name() {
        return "ViewerAgentTask";
    }

    public final void o(ea.f fVar, aa.w wVar, boolean z) {
        k71.k.g(wVar, "customScalarAdapters");
        fVar.z0("taskId");
        aa.c.a.b(fVar, wVar, this.r);
    }

    public final String toString() {
        return f1.e.z("ViewerAgentTaskQuery(taskId=", this.r, ")");
    }
}
