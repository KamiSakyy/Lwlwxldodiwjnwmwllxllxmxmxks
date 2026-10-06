package jo;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class nm implements aaShadow.n0 {
    public static final jm Companion = new jm();
    public String r;

    public nm(String str) {
        this.r = str;
    }

    public final aa.m d() {
        m10.vp.Companion.getClass();
        aa.q0 q0Var = m10.vp.A1;
        k71.k.g(q0Var, "type");
        List list = h10.r2.a;
        List list2 = h10.r2.a;
        k71.k.g(list2, "selections");
        x61.r rVar = x61.r.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nm) && k71.k.b(this.r, ((nm) obj).r);
    }

    public final aa.p0 g() {
        return aa.c.c(ep.ze.a, false);
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
