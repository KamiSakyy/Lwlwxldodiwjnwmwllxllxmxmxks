package jo;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class ss implements aa.w0 {
    public static final js Companion = new js();
    public final boolean r;
    public final boolean s;
    public final boolean t;
    public final boolean u;

    public ss(boolean z, boolean z2, boolean z3, boolean z4) {
        this.r = z;
        this.s = z2;
        this.t = z3;
        this.u = z4;
    }

    public final aa.m d() {
        m10.p00.Companion.getClass();
        aa.q0 q0Var = m10.p00.F;
        k71.k.g(q0Var, "type");
        List list = h10.m3.a;
        List list2 = h10.m3.a;
        k71.k.g(list2, "selections");
        x61.r rVar = x61.r.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ss)) {
            return false;
        }
        ss ssVar = (ss) obj;
        return this.r == ssVar.r && this.s == ssVar.s && this.t == ssVar.t && this.u == ssVar.u;
    }

    public final aa.p0 g() {
        return aa.c.c(ep.kj.a, false);
    }

    public final int hashCode() {
        return Integer.hashCode(30) + x.i.e(x.i.e(x.i.e(Boolean.hashCode(this.r) * 31, 31, this.s), 31, this.t), 31, this.u);
    }

    public final String i() {
        return "1a0203f7b066c7d92ae0699ce23e413bc5b2c54fbe3c1e71f96e85bf6fb260bb";
    }

    public final String j() {
        Companion.getClass();
        return "query PullsWidget($includeCreated: Boolean!, $includeAssigned: Boolean!, $includeMentioned: Boolean!, $includeRequested: Boolean!, $first: Int!) { created: search(query: \"is:open archived:false is:pr author:@me sort:created-desc\", type: ISSUE, first: $first) @include(if: $includeCreated) { issueCount nodes { __typename ...WidgetPullRequestRowFragment } } assigned: search(query: \"is:open archived:false is:pr assignee:@me sort:created-desc\", type: ISSUE, first: $first) @include(if: $includeAssigned) { issueCount nodes { __typename ...WidgetPullRequestRowFragment } } mentioned: search(query: \"is:open is:pr archived:false mentions:@me sort:created-desc\", type: ISSUE, first: $first) @include(if: $includeMentioned) { issueCount nodes { __typename ...WidgetPullRequestRowFragment } } requested: search(query: \"is:open is:pr archived:false review-requested:@me sort:created-desc\", type: ISSUE, first: $first) @include(if: $includeRequested) { issueCount nodes { __typename ...WidgetPullRequestRowFragment } } id __typename }  fragment WidgetPullRequestRowFragment on PullRequest { id title number url repository { id name owner { id login } __typename } commits(last: 1) { edges { node { commit { statusCheckRollup { state id __typename } id __typename } id __typename } } } __typename }";
    }

    public final String name() {
        return "PullsWidget";
    }

    public final void o(ea.f fVar, aa.w wVar, boolean z) {
        k71.k.g(wVar, "customScalarAdapters");
        fVar.z0("includeCreated");
        aa.b bVar = aa.c.f;
        f4.C(this.r, bVar, fVar, wVar, "includeAssigned");
        f4.C(this.s, bVar, fVar, wVar, "includeMentioned");
        f4.C(this.t, bVar, fVar, wVar, "includeRequested");
        f4.C(this.u, bVar, fVar, wVar, "first");
        fVar.z(30);
    }

    public final String toString() {
        return com.github.rudroid.m0.m(com.github.rudroid.copilot.h1.u("PullsWidgetQuery(includeCreated=", this.r, ", includeAssigned=", this.s, ", includeMentioned="), this.t, ", includeRequested=", this.u, ", first=30)");
    }


}
