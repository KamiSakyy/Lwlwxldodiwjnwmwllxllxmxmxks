package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class q90 {
    public String a;
    public String b;
    public wi0.c c;

    public q90(String str, String str2, wi0.c cVar) {
        this.a = str;
        this.b = str2;
        this.c = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q90)) {
            return false;
        }
        q90 q90Var = (q90) obj;
        return k71.k.b(this.a, q90Var.a) && k71.k.b(this.b, q90Var.b) && k71.k.b(this.c, q90Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("PullRequestReview(__typename=", this.a, ", id=", this.b, ", pullRequestReviewFields=");
        o.append(this.c);
        o.append(")");
        return o.toString();
    }
}
