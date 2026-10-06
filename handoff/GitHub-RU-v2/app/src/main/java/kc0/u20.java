package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class u20 {
    public String a;
    public l20 b;

    public u20(String str, l20 l20Var) {
        this.a = str;
        this.b = l20Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u20)) {
            return false;
        }
        u20 u20Var = (u20) obj;
        return k71.k.b(this.a, u20Var.a) && k71.k.b(this.b, u20Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "OnPullRequestReviewThread(id=" + this.a + ", comments=" + this.b + ")";
    }
}
