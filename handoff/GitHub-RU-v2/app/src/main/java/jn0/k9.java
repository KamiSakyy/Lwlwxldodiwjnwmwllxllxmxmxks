package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class k9 implements aaShadow.m0 {
    public l9 a;

    public k9(l9 l9Var) {
        this.a = l9Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k9) && k71.k.b(this.a, ((k9) obj).a);
    }

    public final int hashCode() {
        l9 l9Var = this.a;
        if (l9Var == null) {
            return 0;
        }
        return l9Var.hashCode();
    }

    public final String toString() {
        return "Data(deletePullRequestReviewComment=" + this.a + ")";
    }
}
