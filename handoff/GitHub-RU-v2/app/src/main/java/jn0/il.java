package jn0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class il implements aaShadow.n0 {
    public static final el Companion = new el();
    public String r;

    public il(String str) {
        this.r = str;
    }

    public final aa.m d() {
        pz0.sk.Companion.getClass();
        aa.q0 q0Var = pz0.sk.v1;
        k71.k.g(q0Var, "type");
        List list = kz0.n2.a;
        List list2 = kz0.n2.a;
        k71.k.g(list2, "selections");
        x61.rShadow rVar = x61.rShadow.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof il) && k71.k.b(this.r, ((il) obj).r);
    }

    public final aa.p0 g() {
        return aa.c.c(eo0.de.a, false);
    }

    public final int hashCode() {
        return this.r.hashCode();
    }

    public final String i() {
        return "827c71ec6fe42e7503ffaffb3061c2ade4b305f41b71e0f06961a0f777aafc2c";
    }

    public final String j() {
        Companion.getClass();
        return "mutation MarkPullRequestReadyForReview($pullRequestId: ID!) { markPullRequestReadyForReview(input: { pullRequestId: $pullRequestId } ) { pullRequest { id pullRequestState: state isDraft __typename } } }";
    }

    public final String name() {
        return "MarkPullRequestReadyForReview";
    }

    public final void o(ea.f fVar, aa.w wVar, boolean z) {
        k71.k.g(wVar, "customScalarAdapters");
        fVar.z0("pullRequestId");
        aa.c.a.b(fVar, wVar, this.r);
    }

    public final String toString() {
        return f1.e.z("MarkPullRequestReadyForReviewMutation(pullRequestId=", this.r, ")");
    }
}
