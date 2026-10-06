package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class f1Shadow {
    public String a;
    public String b;
    public e1 c;
    public lv.c d;

    public Object f1(String str, String str2, e1 e1Var, lv.c cVar) {
        this.a = str;
        this.b = str2;
        this.c = e1Var;
        this.d = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f1Shadow)) {
            return false;
        }
        f1Shadow f1Var = (f1Shadow) obj;
        return k71.k.b(this.a, f1Var.a) && k71.k.b(this.b, f1Var.b) && k71.k.b(this.c, f1Var.c) && k71.k.b(this.d, f1Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31)) * 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("PullRequestReview(__typename=", this.a, ", id=", this.b, ", pullRequest=");
        o.append(this.c);
        o.append(", pullRequestReviewFields=");
        o.append(this.d);
        o.append(")");
        return o.toString();
    }
}
