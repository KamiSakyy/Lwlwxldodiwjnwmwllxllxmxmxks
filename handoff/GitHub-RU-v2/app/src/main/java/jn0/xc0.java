package jn0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class xc0 implements aaShadow.n0 {
    public static final nc0 Companion = new nc0();
    public final String r;
    public final aa.u0 s;
    public final aa.u0 t;
    public final aa.u0 u;

    public xc0(String str, aa.u0 u0Var, aa.u0 u0Var2, aa.u0 u0Var3) {
        k71.k.g(str, "id");
        this.r = str;
        this.s = u0Var;
        this.t = u0Var2;
        this.u = u0Var3;
    }

    public final aa.m d() {
        pz0.sk.Companion.getClass();
        aa.q0 q0Var = pz0.sk.v1;
        k71.k.g(q0Var, "type");
        List list = kz0.l6.a;
        List list2 = kz0.l6.a;
        k71.k.g(list2, "selections");
        x61.r rVar = x61.r.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xc0)) {
            return false;
        }
        xc0 xc0Var = (xc0) obj;
        return k71.k.b(this.r, xc0Var.r) && this.s.equals(xc0Var.s) && this.t.equals(xc0Var.t) && this.u.equals(xc0Var.u);
    }

    public final aa.p0 g() {
        return aa.c.c(eo0.qx.a, false);
    }

    public final int hashCode() {
        return this.u.hashCode() + jo.f4.a(this.t, jo.f4.a(this.s, this.r.hashCode() * 31, 31), 31);
    }

    public final String i() {
        return "07067f071595e5576e9fd3fb2688d77ff0647af9372b9c7f98eb63f14a5020ff";
    }

    public final String j() {
        Companion.getClass();
        return "mutation UpdatePullRequestReviewers($id: ID!, $userIds: [ID!], $teamIds: [ID!], $union: Boolean) { requestReviews(input: { pullRequestId: $id userIds: $userIds teamIds: $teamIds union: $union } ) { actor { __typename ...NodeIdFragment login } pullRequest { id repository { id owner { __typename id login } __typename } reviewRequests(first: 25) { nodes { __typename ...ReviewRequestFields id } } latestReviews(first: 25) { nodes { __typename ...ReviewFields id } } __typename } } }  fragment NodeIdFragment on Node { id __typename }  fragment avatarFragment on Actor { __typename ...NodeIdFragment avatarUrl }  fragment ReviewRequestFields on ReviewRequest { __typename id asCodeOwner requestedReviewer { __typename ...NodeIdFragment ... on User { __typename id login ...avatarFragment } ... on Team { __typename id name teamAvatar: avatarUrl } } }  fragment ReviewFields on PullRequestReview { __typename id authorCanPushToRepository author { __typename login ...avatarFragment ... on User { id } } state onBehalfOf(first: 25) { nodes { id name __typename } } body comments(first: 1) { totalCount } }";
    }

    public final String name() {
        return "UpdatePullRequestReviewers";
    }

    public final void o(ea.f fVar, aa.w wVar, boolean z) {
        k71.k.g(wVar, "customScalarAdapters");
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, this.r);
        jo.f4.e(fVar, "userIds", bVar).d(fVar, wVar, this.s);
        jo.f4.e(fVar, "teamIds", bVar).d(fVar, wVar, this.t);
        fVar.z0("union");
        aa.c.d(aa.c.k).d(fVar, wVar, this.u);
    }

    public final String toString() {
        StringBuilder t = jo.f4.t(this.s, "UpdatePullRequestReviewersMutation(id=", this.r, ", userIds=", ", teamIds=");
        t.append(this.t);
        t.append(", union=");
        t.append(this.u);
        t.append(")");
        return t.toString();
    }
}
