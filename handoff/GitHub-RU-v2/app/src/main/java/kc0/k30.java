package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class k30 {
    public j30 a;

    public k30(j30 j30Var) {
        this.a = j30Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k30) && k71.k.b(this.a, ((k30) obj).a);
    }

    public final int hashCode() {
        j30 j30Var = this.a;
        if (j30Var == null) {
            return 0;
        }
        return j30Var.hashCode();
    }

    public final String toString() {
        return "UnresolveReviewThread(thread=" + this.a + ")";
    }
}
