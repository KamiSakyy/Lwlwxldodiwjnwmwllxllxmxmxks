package yz0;

import com.github.service.models.response.type.PullRequestMergeMethod;

/* loaded from: /home/user/work/p/classes4.dex */
public final class e1 {
    public final s7 a;
    public final boolean b;
    public final boolean c;
    public final PullRequestMergeMethod d;

    public e1(s7 s7Var, boolean z, boolean z2, PullRequestMergeMethod pullRequestMergeMethod) {
        k71.k.g(pullRequestMergeMethod, "mergeMethod");
        this.a = s7Var;
        this.b = z;
        this.c = z2;
        this.d = pullRequestMergeMethod;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e1)) {
            return false;
        }
        e1 e1Var = (e1) obj;
        return k71.k.b(this.a, e1Var.a) && this.b == e1Var.b && this.c == e1Var.c && this.d == e1Var.d;
    }

    public final int hashCode() {
        return this.d.hashCode() + x.i.e(x.i.e(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        return "EnableAutoMerge(autoMergeEnabledEvent=" + this.a + ", viewerCanEnableAutoMerge=" + this.b + ", viewerCanDisableAutoMerge=" + this.c + ", mergeMethod=" + this.d + ")";
    }
}
