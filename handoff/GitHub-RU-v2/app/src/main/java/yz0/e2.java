package yz0;

import com.github.service.models.response.IssueOrPullRequest$ReviewerReviewState;

/* loaded from: /home/user/work/p/classes4.dex */
public final class e2 {
    public final com.github.service.models.response.a a;
    public final IssueOrPullRequest$ReviewerReviewState b;
    public final boolean c;
    public final String d;
    public final sy.e0 e;
    public final boolean f;
    public final d2 g;

    public /* synthetic */ e2(com.github.service.models.response.a aVar, IssueOrPullRequest$ReviewerReviewState issueOrPullRequest$ReviewerReviewState, String str, sy.e0 e0Var, boolean z, int i) {
        this(aVar, issueOrPullRequest$ReviewerReviewState, true, str, e0Var, (i & 32) != 0 ? false : z, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e2)) {
            return false;
        }
        e2 e2Var = (e2) obj;
        return k71.k.b(this.a, e2Var.a) && this.b == e2Var.b && this.c == e2Var.c && k71.k.b(this.d, e2Var.d) && k71.k.b(this.e, e2Var.e) && this.f == e2Var.f && k71.k.b(this.g, e2Var.g);
    }

    public final int hashCode() {
        int e = x.i.e((this.e.hashCode() + com.github.rudroid.copilot.h1.i(x.i.e((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c), this.d, 31)) * 31, 31, this.f);
        d2 d2Var = this.g;
        return e + (d2Var == null ? 0 : d2Var.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Reviewer(reviewer=");
        sb.append(this.a);
        sb.append(", state=");
        sb.append(this.b);
        sb.append(", canPush=");
        com.github.rudroid.m0.z(sb, this.c, ", id=", this.d, ", type=");
        sb.append(this.e);
        sb.append(", isCodeOwner=");
        sb.append(this.f);
        sb.append(", latestReview=");
        sb.append(this.g);
        sb.append(")");
        return sb.toString();
    }

    public e2(com.github.service.models.response.a aVar, IssueOrPullRequest$ReviewerReviewState issueOrPullRequest$ReviewerReviewState, boolean z, String str, sy.e0 e0Var, boolean z2, d2 d2Var) {
        k71.k.g(issueOrPullRequest$ReviewerReviewState, "state");
        k71.k.g(str, "id");
        this.a = aVar;
        this.b = issueOrPullRequest$ReviewerReviewState;
        this.c = z;
        this.d = str;
        this.e = e0Var;
        this.f = z2;
        this.g = d2Var;
    }

    // [restore] вложенный стаб: оригинал потерян при декомпиляции
    public static class IssueOrPullRequest$ReviewerReviewState<T1,T2,T3,T4> {
        public IssueOrPullRequest$ReviewerReviewState() {
        }
    }
}
