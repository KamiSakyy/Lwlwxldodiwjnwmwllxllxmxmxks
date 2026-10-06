package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class r8 {
    public final String a;
    public final t8 b;

    public r8(String str, t8 t8Var) {
        this.a = str;
        this.b = t8Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r8)) {
            return false;
        }
        r8 r8Var = (r8) obj;
        return k71.k.b(this.a, r8Var.a) && k71.k.b(this.b, r8Var.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        t8 t8Var = this.b;
        return hashCode + (t8Var == null ? 0 : t8Var.hashCode());
    }

    public final String toString() {
        return "DeletePullRequestReviewComment(__typename=" + this.a + ", pullRequestReview=" + this.b + ")";
    }
}
