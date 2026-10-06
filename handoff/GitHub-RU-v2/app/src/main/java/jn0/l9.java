package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class l9 {
    public String a;
    public n9 b;

    public l9(String str, n9 n9Var) {
        this.a = str;
        this.b = n9Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l9)) {
            return false;
        }
        l9 l9Var = (l9) obj;
        return k71.k.b(this.a, l9Var.a) && k71.k.b(this.b, l9Var.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        n9 n9Var = this.b;
        return hashCode + (n9Var == null ? 0 : n9Var.hashCode());
    }

    public final String toString() {
        return "DeletePullRequestReviewComment(__typename=" + this.a + ", pullRequestReview=" + this.b + ")";
    }
}
