package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class jd0 implements aaShadow.m0 {
    public final md0 a;

    public jd0(md0 md0Var) {
        this.a = md0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jd0) && k71.k.b(this.a, ((jd0) obj).a);
    }

    public final int hashCode() {
        md0 md0Var = this.a;
        if (md0Var == null) {
            return 0;
        }
        return md0Var.hashCode();
    }

    public final String toString() {
        return "Data(updatePullRequestReviewComment=" + this.a + ")";
    }
}
