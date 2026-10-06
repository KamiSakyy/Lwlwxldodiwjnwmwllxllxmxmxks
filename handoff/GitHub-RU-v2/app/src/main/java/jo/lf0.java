package jo;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class lf0 implements aaShadow.n0 {
    public static final bf0 Companion = new bf0();
    public String r;
    public aa.u0 s;
    public aa.u0 t;
    public aa.u0 u;
    public aa.u0 v;

    public lf0(String str, aa.u0 u0Var, aa.u0 u0Var2, aa.u0 u0Var3, aa.u0 u0Var4) {
        k71.k.g(str, "id");
        this.r = str;
        this.s = u0Var;
        this.t = u0Var2;
        this.u = u0Var3;
        this.v = u0Var4;
    }

    public final aa.m d() {
        m10.vp.Companion.getClass();
        aa.q0 q0Var = m10.vp.A1;
        k71.k.g(q0Var, "type");
        List list = h10.u6.a;
        List list2 = h10.u6.a;
        k71.k.g(list2, "selections");
        x61.rShadow rVar = x61.rShadow.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lf0)) {
            return false;
        }
        lf0 lf0Var = (lf0) obj;
        return k71.k.b(this.r, lf0Var.r) && this.s.equals(lf0Var.s) && this.t.equals(lf0Var.t) && this.u.equals(lf0Var.u) && this.v.equals(lf0Var.v);
    }

    public final aa.p0 g() {
        return aa.c.c(ep.mz.a, false);
    }

    public final int hashCode() {
        return this.v.hashCode() + f4.a(this.u, f4.a(this.t, f4.a(this.s, this.r.hashCode() * 31, 31), 31), 31);
    }

    public final String i() {
        return "a3692dac638bf82e3acd3411678b93d09276030f797df0e6a2616c2ae90ba59d";
    }

    public final String j() {
        Companion.getClass();
        return "mutation UpdatePullRequestReviewers($id: ID!, $userIds: [ID!], $teamIds: [ID!], $botIds: [ID!], $union: Boolean) { requestReviews(input: { pullRequestId: $id userIds: $userIds teamIds: $teamIds botIds: $botIds union: $union } ) { actor { __typename ...NodeIdFragment login } pullRequest { id repository { id owner { __typename id login } __typename } reviewRequests(first: 25) { nodes { __typename ...ReviewRequestFields id } } latestReviews(first: 25) { nodes { __typename ...ReviewFields id } } __typename } } }  fragment NodeIdFragment on Node { id __typename }  fragment avatarFragment on Actor { __typename ...NodeIdFragment avatarUrl }  fragment ReviewRequestFields on ReviewRequest { __typename id asCodeOwner requestedReviewer { __typename ...NodeIdFragment ... on User { __typename id login ...avatarFragment } ... on Team { __typename id name teamAvatar: avatarUrl } ... on Bot { __typename id login displayName ...avatarFragment isCopilot url } } }  fragment ReviewFields on PullRequestReview { __typename id authorCanPushToRepository author { __typename login ...avatarFragment ... on User { id } ... on Bot { id displayName isCopilot url } } state onBehalfOf(first: 25) { nodes { id name __typename } } body comments(first: 1) { totalCount } }";
    }

    public final String name() {
        return "UpdatePullRequestReviewers";
    }

    public final void o(ea.f fVar, aa.w wVar, boolean z) {
        k71.k.g(wVar, "customScalarAdapters");
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, this.r);
        f4.e(fVar, "userIds", bVar).d(fVar, wVar, this.s);
        f4.e(fVar, "teamIds", bVar).d(fVar, wVar, this.t);
        f4.e(fVar, "botIds", bVar).d(fVar, wVar, this.u);
        fVar.z0("union");
        aa.c.d(aa.c.k).d(fVar, wVar, this.v);
    }

    public final String toString() {
        StringBuilder t = f4.t(this.s, "UpdatePullRequestReviewersMutation(id=", this.r, ", userIds=", ", teamIds=");
        t.append(this.t);
        t.append(", botIds=");
        t.append(this.u);
        t.append(", union=");
        return f1.e.j(t, this.v, ")");
    }
}
