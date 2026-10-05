package jn0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class q4 implements aa.w0 {
    public static final b4 Companion = new b4();
    public final String r;
    public final aa.u0 s;

    public q4(aa.u0 u0Var, String str) {
        k71.k.g(str, "id");
        this.r = str;
        this.s = u0Var;
    }

    public final aa.m d() {
        pz0.su.Companion.getClass();
        aa.q0 q0Var = pz0.su.z;
        k71.k.g(q0Var, "type");
        List list = kz0.v.a;
        List list2 = kz0.v.a;
        k71.k.g(list2, "selections");
        x61.r rVar = x61.r.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q4)) {
            return false;
        }
        q4 q4Var = (q4) obj;
        return k71.k.b(this.r, q4Var.r) && this.s.equals(q4Var.s);
    }

    public final aa.p0 g() {
        return aa.c.c(eo0.m2.a, false);
    }

    public final int hashCode() {
        return this.s.hashCode() + (this.r.hashCode() * 31);
    }

    public final String i() {
        return "04cc3a26c89425bf672022e9324b6dec7d705a0449ed234499bb72d8ba982d51";
    }

    public final String j() {
        Companion.getClass();
        return "query Checks($id: ID!, $after: String) { node(id: $id) { __typename ... on PullRequest { requiredStatusChecks(first: 25) { totalCount nodes { id context state description __typename } } commits(last: 1, after: null) { nodes { commit { pushedDate statusCheckRollup { id contexts(first: 25, after: $after) { pageInfo { hasNextPage endCursor } nodes { __typename ... on StatusContext { id context state avatarUrl description targetUrl isRequired(pullRequestId: $id) } ... on CheckRun { id conclusion name summary permalink duration checkSuite { workflowRun { workflow { name id __typename } id __typename } app { logoUrl id __typename } id __typename } isRequired(pullRequestId: $id) } } } __typename } id __typename } id __typename } } } id } id __typename }";
    }

    public final String name() {
        return "Checks";
    }

    public final void o(ea.f fVar, aa.w wVar, boolean z) {
        k71.k.g(wVar, "customScalarAdapters");
        fVar.z0("id");
        aa.c.a.b(fVar, wVar, this.r);
        fVar.z0("after");
        aa.c.d(aa.c.i).d(fVar, wVar, this.s);
    }

    public final String toString() {
        return jo.f4.k(this.s, "ChecksQuery(id=", this.r, ", after=", ")");
    }
}
