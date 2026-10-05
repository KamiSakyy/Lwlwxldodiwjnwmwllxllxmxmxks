package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class x20 {
    public final String a;
    public final r20 b;
    public final u20 c;

    public x20(String str, r20 r20Var, u20 u20Var) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = r20Var;
        this.c = u20Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x20)) {
            return false;
        }
        x20 x20Var = (x20) obj;
        return k71.k.b(this.a, x20Var.a) && k71.k.b(this.b, x20Var.b) && k71.k.b(this.c, x20Var.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        r20 r20Var = this.b;
        int hashCode2 = (hashCode + (r20Var == null ? 0 : r20Var.a.hashCode())) * 31;
        u20 u20Var = this.c;
        return hashCode2 + (u20Var != null ? u20Var.hashCode() : 0);
    }

    public final String toString() {
        return "TimelineItem1(__typename=" + this.a + ", onNode=" + this.b + ", onPullRequestReviewThread=" + this.c + ")";
    }
}
