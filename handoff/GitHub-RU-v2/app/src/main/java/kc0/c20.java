package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class c20 {
    public final String a;
    public final b20 b;
    public final String c;
    public final wi0.c d;

    public c20(String str, b20 b20Var, String str2, wi0.c cVar) {
        this.a = str;
        this.b = b20Var;
        this.c = str2;
        this.d = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c20)) {
            return false;
        }
        c20 c20Var = (c20) obj;
        return k71.k.b(this.a, c20Var.a) && k71.k.b(this.b, c20Var.b) && k71.k.b(this.c, c20Var.c) && k71.k.b(this.d, c20Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + com.github.rudroid.copilot.h1.i((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, this.c, 31);
    }

    public final String toString() {
        return "PullRequestReview(__typename=" + this.a + ", pullRequest=" + this.b + ", id=" + this.c + ", pullRequestReviewFields=" + this.d + ")";
    }
}
