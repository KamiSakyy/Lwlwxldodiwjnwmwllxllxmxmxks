package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class j8 {
    public final String a;
    public final l8 b;

    public j8(String str, l8 l8Var) {
        this.a = str;
        this.b = l8Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j8)) {
            return false;
        }
        j8 j8Var = (j8) obj;
        return k71.k.b(this.a, j8Var.a) && k71.k.b(this.b, j8Var.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        l8 l8Var = this.b;
        return hashCode + (l8Var == null ? 0 : l8Var.hashCode());
    }

    public final String toString() {
        return "DeletePullRequestReviewComment(__typename=" + this.a + ", pullRequestReview=" + this.b + ")";
    }
}
