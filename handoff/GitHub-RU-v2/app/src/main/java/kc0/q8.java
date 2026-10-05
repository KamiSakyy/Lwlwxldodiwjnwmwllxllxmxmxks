package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class q8 implements aa.m0 {
    public final r8 a;

    public q8(r8 r8Var) {
        this.a = r8Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof q8) && k71.k.b(this.a, ((q8) obj).a);
    }

    public final int hashCode() {
        r8 r8Var = this.a;
        if (r8Var == null) {
            return 0;
        }
        return r8Var.hashCode();
    }

    public final String toString() {
        return "Data(deletePullRequestReviewComment=" + this.a + ")";
    }
}
