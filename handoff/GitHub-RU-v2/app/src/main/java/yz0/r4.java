package yz0;

import com.github.service.models.response.PullRequestState;

/* loaded from: /home/user/work/p/classes4.dex */
public final class r4 extends o.b {
    public final boolean A;
    public final String t;
    public final String u;
    public final boolean v;
    public final int w;
    public final PullRequestState x;
    public final String y;
    public final String z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r4(String str, String str2, boolean z, int i, PullRequestState pullRequestState, String str3, String str4, boolean z2) {
        super(str, true);
        k71.k.g(str, "id");
        k71.k.g(str2, "url");
        k71.k.g(pullRequestState, "state");
        k71.k.g(str3, "repoOwner");
        k71.k.g(str4, "repoName");
        this.t = str;
        this.u = str2;
        this.v = z;
        this.w = i;
        this.x = pullRequestState;
        this.y = str3;
        this.z = str4;
        this.A = z2;
    }

    public final String c() {
        return this.t;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r4)) {
            return false;
        }
        r4 r4Var = (r4) obj;
        return k71.k.b(this.t, r4Var.t) && k71.k.b(this.u, r4Var.u) && this.v == r4Var.v && this.w == r4Var.w && this.x == r4Var.x && k71.k.b(this.y, r4Var.y) && k71.k.b(this.z, r4Var.z) && this.A == r4Var.A;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.A) + com.github.rudroid.copilot.h1.i(com.github.rudroid.copilot.h1.i((this.x.hashCode() + a0.s0.b(this.w, x.i.e(com.github.rudroid.copilot.h1.i(this.t.hashCode() * 31, this.u, 31), 31, this.v), 31)) * 31, this.y, 31), this.z, 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("PullRequest(id=", this.t, ", url=", this.u, ", isDraft=");
        com.github.rudroid.m0.y(o, this.v, ", number=", this.w, ", state=");
        o.append(this.x);
        o.append(", repoOwner=");
        o.append(this.y);
        o.append(", repoName=");
        return com.github.rudroid.m0.k(o, this.z, ", isInMergeQueue=", this.A, ")");
    }


}
