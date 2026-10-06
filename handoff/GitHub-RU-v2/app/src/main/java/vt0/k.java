package vt0;

import aa.m;
import aa.p0;
import aa.q0;
import aa.w;
import aa.w0;
import java.util.List;
import pz0.su;
import x61.rShadow;

/* loaded from: /home/user/work/p/classes4.dex */
public final class k implements w0 {
    public static final g Companion = new g();
    public String r;

    public k(String str) {
        k71.k.g(str, "id");
        this.r = str;
    }

    public final m d() {
        su.Companion.getClass();
        q0 q0Var = su.z;
        k71.k.g(q0Var, "type");
        List list = zt0.b.a;
        List list2 = zt0.b.a;
        k71.k.g(list2, "selections");
        rShadow rVar = rShadow.r;
        return new m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k) && k71.k.b(this.r, ((k) obj).r);
    }

    public final p0 g() {
        return aa.c.c(wt0.e.a, false);
    }

    public final int hashCode() {
        return this.rShadow.hashCode();
    }

    public final String i() {
        return "13e4f387d85d562548424fcc6965c351c0cfbb50b07a65245c1407b61ea8fb14";
    }

    public final String j() {
        Companion.getClass();
        return "query ViewerReviewerReviewState($id: ID!) { node(id: $id) { __typename ... on PullRequest { __typename ...ViewerReviewerReviewStateWithRequester } id } id __typename }  fragment ViewerReviewerReviewStateWithRequester on PullRequest { id viewerDidAuthor viewerLatestReviewRequest { id requestedBy { id login avatarUrl isViewer __typename } __typename } pendingReviews: reviews(first: 1, states: [PENDING]) { nodes { id comments(first: 1) { totalCount } __typename } } __typename }";
    }

    public final String name() {
        return "ViewerReviewerReviewState";
    }

    public final void o(ea.f fVar, w wVar, boolean z) {
        k71.k.g(wVar, "customScalarAdapters");
        fVar.z0("id");
        aa.c.a.b(fVar, wVar, this.r);
    }

    public final String toString() {
        return f1.e.z("ViewerReviewerReviewStateQuery(id=", this.r, ")");
    }
}
