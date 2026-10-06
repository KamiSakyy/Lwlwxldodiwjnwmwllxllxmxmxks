package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class qd0 {
    public String a;
    public String b;
    public cu0.c c;

    public qd0(String str, String str2, cu0.c cVar) {
        this.a = str;
        this.b = str2;
        this.c = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qd0)) {
            return false;
        }
        qd0 qd0Var = (qd0) obj;
        return k71.k.b(this.a, qd0Var.a) && k71.k.b(this.b, qd0Var.b) && k71.k.b(this.c, qd0Var.c);
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
