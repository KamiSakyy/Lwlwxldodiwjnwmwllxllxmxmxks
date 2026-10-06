package jo;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class z4 implements aaShadow.w0 {
    public static final k4 Companion = new k4();
    public String r;
    public aa.u0 s;

    public z4(aa.u0 u0Var, String str) {
        k71.k.g(str, "id");
        this.r = str;
        this.s = u0Var;
    }

    public final aa.m d() {
        m10.p00.Companion.getClass();
        aa.q0 q0Var = m10.p00.F;
        k71.k.g(q0Var, "type");
        List list = h10.w.a;
        List list2 = h10.w.a;
        k71.k.g(list2, "selections");
        x61.rShadow rVar = x61.rShadow.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z4)) {
            return false;
        }
        z4 z4Var = (z4) obj;
        return k71.k.b(this.r, z4Var.r) && this.s.equals(z4Var.s);
    }

    public final aa.p0 g() {
        return aa.c.c(ep.s2.a, false);
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
        return f4.k(this.s, "ChecksQuery(id=", this.r, ", after=", ")");
    }
}
