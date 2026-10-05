package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class q70 {
    public final String a;
    public final String b;
    public final e80.c c;

    public q70(String str, String str2, e80.c cVar) {
        this.a = str;
        this.b = str2;
        this.c = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q70)) {
            return false;
        }
        q70 q70Var = (q70) obj;
        return k71.k.b(this.a, q70Var.a) && k71.k.b(this.b, q70Var.b) && k71.k.b(this.c, q70Var.c);
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
