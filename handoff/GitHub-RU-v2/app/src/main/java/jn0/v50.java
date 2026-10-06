package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class v50 {
    public final String a;
    public final u50 b;
    public final String c;
    public final cu0.c d;

    public v50(String str, u50 u50Var, String str2, cu0.c cVar) {
        this.a = str;
        this.b = u50Var;
        this.c = str2;
        this.d = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v50)) {
            return false;
        }
        v50 v50Var = (v50) obj;
        return k71.k.b(this.a, v50Var.a) && k71.k.b(this.b, v50Var.b) && k71.k.b(this.c, v50Var.c) && k71.k.b(this.d, v50Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + com.github.rudroid.copilot.h1.i((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, this.c, 31);
    }

    public final String toString() {
        return "PullRequestReview(__typename=" + this.a + ", pullRequest=" + this.b + ", id=" + this.c + ", pullRequestReviewFields=" + this.d + ")";
    }
}
