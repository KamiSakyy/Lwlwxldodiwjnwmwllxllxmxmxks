package kc0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class k4 implements aaShadow.w0 {
    public static final v3 Companion = new v3();
    public String r;
    public aa.u0 s;

    public k4(aa.u0 u0Var, String str) {
        k71.k.g(str, "id");
        this.r = str;
        this.s = u0Var;
    }

    public final aa.m d() {
        gn0.rn.Companion.getClass();
        aa.q0 q0Var = gn0.rn.z;
        k71.k.g(q0Var, "type");
        List list = en0.u.a;
        List list2 = en0.u.a;
        k71.k.g(list2, "selections");
        x61.rShadow rVar = x61.rShadow.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k4)) {
            return false;
        }
        k4 k4Var = (k4) obj;
        return k71.k.b(this.r, k4Var.r) && this.s.equals(k4Var.s);
    }

    public final aa.p0 g() {
        return aa.c.c(fd0.i2.a, false);
    }

    public final int hashCode() {
        return this.s.hashCode() + (this.r.hashCode() * 31);
    }

    public final String i() {
        return "0866602f92b1ff4169beea0b260cf2f9d4c59538b546dc0d07aa83ecbeb06461";
    }

    public final String j() {
        Companion.getClass();
        return "query Checks($id: ID!, $after: String) { node(id: $id) { __typename ... on PullRequest { requiredStatusChecks(first: 25) { totalCount nodes { id context state description __typename } } commits(last: 1, after: null) { nodes { commit { pushedDate statusCheckRollup { id contexts(first: 25, after: $after) { pageInfo { hasNextPage endCursor } nodes { __typename ... on StatusContext { id context state avatarUrl description targetUrl isRequired(pullRequestId: $id) } ... on CheckRun { id conclusion name summary permalink duration checkSuite { workflowRun { workflow { name id __typename } id __typename } app { logoUrl id __typename } id __typename } isRequired(pullRequestId: $id) } } } __typename } id __typename } id __typename } } } id } }";
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
        return jo.f4Shadow.k(this.s, "ChecksQuery(id=", this.r, ", after=", ")");
    }
}
