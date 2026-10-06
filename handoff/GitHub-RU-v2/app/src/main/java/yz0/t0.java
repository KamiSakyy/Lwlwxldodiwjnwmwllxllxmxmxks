package yz0;

import com.github.service.models.response.IssueOrPullRequestState;

/* loaded from: /home/user/work/p/classes4.dex */
public final class t0 {
    public String a;
    public IssueOrPullRequestState b;
    public String c;
    public int d;
    public String e;
    public String f;
    public com.github.service.models.response.a g;
    public boolean h;

    public t0(String str, IssueOrPullRequestState issueOrPullRequestState, String str2, int i, String str3, String str4, com.github.service.models.response.a aVar, boolean z) {
        k71.k.g(issueOrPullRequestState, "state");
        this.a = str;
        this.b = issueOrPullRequestState;
        this.c = str2;
        this.d = i;
        this.e = str3;
        this.f = str4;
        this.g = aVar;
        this.h = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t0)) {
            return false;
        }
        t0 t0Var = (t0) obj;
        return k71.k.b(this.a, t0Var.a) && this.b == t0Var.b && k71.k.b(this.c, t0Var.c) && this.d == t0Var.d && k71.k.b(this.e, t0Var.e) && k71.k.b(this.f, t0Var.f) && k71.k.b(this.g, t0Var.g) && this.h == t0Var.h;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.h) + jo.f4.b(this.g, com.github.rudroid.copilot.h1.i(com.github.rudroid.copilot.h1.i(a0.s0.b(this.d, com.github.rudroid.copilot.h1.i((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, this.c, 31), 31), this.e, 31), this.f, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PullRequest(id=");
        sb.append(this.a);
        sb.append(", state=");
        sb.append(this.b);
        sb.append(", headRefName=");
        a0.s0.w(this.d, this.c, ", number=", ", title=", sb);
        f1.e.x(sb, this.e, ", repoName=", this.f, ", repoOwner=");
        sb.append(this.g);
        sb.append(", isInMergeQueue=");
        sb.append(this.h);
        sb.append(")");
        return sb.toString();
    }
}
