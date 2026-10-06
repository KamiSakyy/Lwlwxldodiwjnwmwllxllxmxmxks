package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class h2 {
    public final k2 a;

    public h2(k2 k2Var) {
        this.a = k2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h2) && k71.k.b(this.a, ((h2) obj).a);
    }

    public final int hashCode() {
        k2 k2Var = this.a;
        if (k2Var == null) {
            return 0;
        }
        return k2Var.hashCode();
    }

    public final String toString() {
        return "AddUpvote(subject=" + this.a + ")";
    }
}
