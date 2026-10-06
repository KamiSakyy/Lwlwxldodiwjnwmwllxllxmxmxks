package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class d90 {
    public String a;
    public x80 b;
    public a90 c;

    public d90(String str, x80 x80Var, a90 a90Var) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = x80Var;
        this.c = a90Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d90)) {
            return false;
        }
        d90 d90Var = (d90) obj;
        return k71.k.b(this.a, d90Var.a) && k71.k.b(this.b, d90Var.b) && k71.k.b(this.c, d90Var.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        x80 x80Var = this.b;
        int hashCode2 = (hashCode + (x80Var == null ? 0 : x80Var.a.hashCode())) * 31;
        a90 a90Var = this.c;
        return hashCode2 + (a90Var != null ? a90Var.hashCode() : 0);
    }

    public final String toString() {
        return "TimelineItem1(__typename=" + this.a + ", onNode=" + this.b + ", onPullRequestReviewThread=" + this.c + ")";
    }
}
