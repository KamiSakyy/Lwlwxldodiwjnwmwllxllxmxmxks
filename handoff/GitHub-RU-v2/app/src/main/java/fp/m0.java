package fp;

import java.util.List;
import m10.p00;

/* loaded from: /home/user/work/p/classes3.dex */
public final class m0 implements aa.w0 {
    public static final i0 Companion = new i0();
    public final String r;

    public m0(String str) {
        this.r = str;
    }

    public final aa.m d() {
        p00.Companion.getClass();
        aa.q0 q0Var = p00.F;
        k71.k.g(q0Var, "type");
        List list = jp.d.a;
        List list2 = jp.d.a;
        k71.k.g(list2, "selections");
        x61.r rVar = x61.r.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m0) && k71.k.b(this.r, ((m0) obj).r);
    }

    public final aa.p0 g() {
        return aa.c.c(gp.m.a, false);
    }

    public final int hashCode() {
        return this.r.hashCode();
    }

    public final String i() {
        return "0603d7a7e1a9dda9e257fe8297e24fa1a6cb61c2129411bc3d8e18784a36506e";
    }

    public final String j() {
        Companion.getClass();
        return "query ViewerAgentSession($id: String!) { viewer { viewerCopilotAgentSession(sessionId: $id) { __typename ...ViewerAgentSessionFragment sessionId } id __typename } id __typename }  fragment AgentPullRequestResourceFragment on PullRequest { id state isDraft isInMergeQueue title titleHTMLString: titleHTML number repository { id name owner { id login } __typename } url additions deletions __typename }  fragment ViewerAgentSessionFragment on CopilotAgentSession { sessionId name state createdAt lastUpdatedAt completedAt resource { __typename ... on PullRequest { __typename ...AgentPullRequestResourceFragment id } } __typename }";
    }

    public final String name() {
        return "ViewerAgentSession";
    }

    public final void o(ea.f fVar, aa.w wVar, boolean z) {
        k71.k.g(wVar, "customScalarAdapters");
        fVar.z0("id");
        aa.c.a.b(fVar, wVar, this.r);
    }

    public final String toString() {
        return f1.e.z("ViewerAgentSessionQuery(id=", this.r, ")");
    }
    public Object f(Object p1, Object p2, Object p3, Object p4, Object p5) { return null; }
}
