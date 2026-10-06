package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class n60 {
    public String a;
    public e60 b;

    public n60(String str, e60 e60Var) {
        this.a = str;
        this.b = e60Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n60)) {
            return false;
        }
        n60 n60Var = (n60) obj;
        return k71.k.b(this.a, n60Var.a) && k71.k.b(this.b, n60Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "OnPullRequestReviewThread(id=" + this.a + ", comments=" + this.b + ")";
    }
}
