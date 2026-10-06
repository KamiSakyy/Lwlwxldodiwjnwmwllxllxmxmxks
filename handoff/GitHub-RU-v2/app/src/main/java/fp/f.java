package fp;

import java.util.List;
import m10.p00;

/* loaded from: /home/user/work/p/classes3.dex */
public final class f implements aa.w0 {
    public static final b Companion = new b();
    public final String r;

    public f(String str) {
        this.r = str;
    }

    public final aa.m d() {
        p00.Companion.getClass();
        aa.q0 q0Var = p00.F;
        k71.k.g(q0Var, "type");
        List list = jp.a.a;
        List list2 = jp.a.a;
        k71.k.g(list2, "selections");
        x61.r rVar = x61.r.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f) && k71.k.b(this.r, ((f) obj).r);
    }

    public final aa.p0 g() {
        return aa.c.c(gp.a.a, false);
    }

    public final int hashCode() {
        return this.r.hashCode();
    }

    public final String i() {
        return "097166d8db47ce33d05cdbdab5ac8625a60893c5eec73ff16b321bab83c76062";
    }

    public final String j() {
        Companion.getClass();
        return "query AgentTaskResource($id: ID!) { node(id: $id) { __typename ... on PullRequest { __typename ...AgentPullRequestResourceFragment } id } id __typename }  fragment AgentPullRequestResourceFragment on PullRequest { id state isDraft isInMergeQueue title titleHTMLString: titleHTML number repository { id name owner { id login } __typename } url additions deletions __typename }";
    }

    public final String name() {
        return "AgentTaskResource";
    }

    public final void o(ea.f fVar, aa.w wVar, boolean z) {
        k71.k.g(wVar, "customScalarAdapters");
        fVar.z0("id");
        aa.c.a.b(fVar, wVar, this.r);
    }

    public final String toString() {
        return f1.e.z("AgentTaskResourceQuery(id=", this.r, ")");
    }
}
