package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class q60 {
    public String a;
    public k60 b;
    public n60 c;

    public q60(String str, k60 k60Var, n60 n60Var) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = k60Var;
        this.c = n60Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q60)) {
            return false;
        }
        q60 q60Var = (q60) obj;
        return k71.k.b(this.a, q60Var.a) && k71.k.b(this.b, q60Var.b) && k71.k.b(this.c, q60Var.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        k60 k60Var = this.b;
        int hashCode2 = (hashCode + (k60Var == null ? 0 : k60Var.a.hashCode())) * 31;
        n60 n60Var = this.c;
        return hashCode2 + (n60Var != null ? n60Var.hashCode() : 0);
    }

    public final String toString() {
        return "TimelineItem1(__typename=" + this.a + ", onNode=" + this.b + ", onPullRequestReviewThread=" + this.c + ")";
    }
}
