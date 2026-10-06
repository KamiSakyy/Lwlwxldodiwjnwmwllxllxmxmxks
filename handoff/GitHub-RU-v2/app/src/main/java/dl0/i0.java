package dl0;

import aa.w0;
import gn0.rn;
import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class i0 implements w0 {
    public static final u Companion = new u();
    public final String r;
    public final int s;

    public i0(String str, int i) {
        k71.k.g(str, "id");
        this.r = str;
        this.s = i;
    }

    public final aa.m d() {
        rn.Companion.getClass();
        aa.q0 q0Var = rn.z;
        k71.k.g(q0Var, "type");
        List list = fl0.d.a;
        List list2 = fl0.d.a;
        k71.k.g(list2, "selections");
        x61.r rVar = x61.r.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i0)) {
            return false;
        }
        i0 i0Var = (i0) obj;
        return k71.k.b(this.r, i0Var.r) && this.s == i0Var.s;
    }

    public final aa.p0 g() {
        return aa.c.c(el0.p.a, false);
    }

    public final int hashCode() {
        return Integer.hashCode(this.s) + (this.r.hashCode() * 31);
    }

    public final String i() {
        return "5133af1b7012de9254ad0402c57d9a5e506952057f093ac7f4901b402a092dc3";
    }

    public final String j() {
        Companion.getClass();
        return "query RefreshStatusChecks($id: ID!, $prNumber: Int!) { node(id: $id) { __typename ... on PullRequest { id requiredStatusChecks(first: 25) { totalCount nodes { id context state description __typename } } actionRequiredWorkflowRunCount commits(last: 1) { __typename totalCount nodes { id commit { id committedDate statusCheckRollup { id state contexts(first: 100) { totalCount nodes { __typename ... on StatusContext { id context state avatarUrl description targetUrl isRequired(pullRequestNumber: $prNumber) } ... on CheckRun { id conclusion name duration summary permalink checkSuite { workflowRun { workflow { name id __typename } id __typename } app { logoUrl id __typename } id __typename } isRequired(pullRequestNumber: $prNumber) } } } __typename } __typename } __typename } } } id } }";
    }

    public final String name() {
        return "RefreshStatusChecks";
    }

    public final void o(ea.f fVar, aa.w wVar, boolean z) {
        k71.k.g(wVar, "customScalarAdapters");
        fVar.z0("id");
        aa.c.a.b(fVar, wVar, this.r);
        fVar.z0("prNumber");
        fVar.z(this.s);
    }

    public final String toString() {
        return com.github.rudroid.m0.b(this.s, "RefreshStatusChecksQuery(id=", this.r, ", prNumber=", ")");
    }
}
