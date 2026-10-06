package zx;

import java.util.List;
import m10.p00;

/* loaded from: /home/user/work/p/classes3.dex */
public final class b1 implements aa.w0 {
    public static final n0 Companion = new n0();
    public final String r;
    public final int s;

    public b1(String str, int i) {
        k71.k.g(str, "id");
        this.r = str;
        this.s = i;
    }

    public final aa.m d() {
        p00.Companion.getClass();
        aa.q0 q0Var = p00.F;
        k71.k.g(q0Var, "type");
        List list = dy.h.a;
        List list2 = dy.h.a;
        k71.k.g(list2, "selections");
        x61.r rVar = x61.r.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b1)) {
            return false;
        }
        b1 b1Var = (b1) obj;
        return k71.k.b(this.r, b1Var.r) && this.s == b1Var.s;
    }

    public final aa.p0 g() {
        return aa.c.c(ay.a0.a, false);
    }

    public final int hashCode() {
        return Integer.hashCode(this.s) + (this.r.hashCode() * 31);
    }

    public final String i() {
        return "7056253febc8af9752148447a9f1e8601290b1d7640808b8ba0b8b13c67ec677";
    }

    public final String j() {
        Companion.getClass();
        return "query RefreshStatusChecks($id: ID!, $prNumber: Int!) { node(id: $id) { __typename ... on PullRequest { id requiredStatusChecks(first: 25) { totalCount nodes { id context state description __typename } } actionRequiredWorkflowRunCount commits(last: 1) { __typename totalCount nodes { id commit { id committedDate statusCheckRollup { id state contexts(first: 100) { totalCount nodes { __typename ... on StatusContext { id context state avatarUrl description targetUrl isRequired(pullRequestNumber: $prNumber) } ... on CheckRun { id conclusion name duration summary permalink checkSuite { workflowRun { workflow { name id __typename } id __typename } app { logoUrl id __typename } id __typename } isRequired(pullRequestNumber: $prNumber) } } } __typename } __typename } __typename } } } id } id __typename }";
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
