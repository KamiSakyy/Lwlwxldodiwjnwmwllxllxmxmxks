package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class eg0 {
    public String a;
    public String b;
    public lv.c c;

    public eg0(String str, String str2, lv.c cVar) {
        this.a = str;
        this.b = str2;
        this.c = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eg0)) {
            return false;
        }
        eg0 eg0Var = (eg0) obj;
        return k71.k.b(this.a, eg0Var.a) && k71.k.b(this.b, eg0Var.b) && k71.k.b(this.c, eg0Var.c);
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
