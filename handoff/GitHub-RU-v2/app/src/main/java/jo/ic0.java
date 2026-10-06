package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class ic0 {
    public hc0 a;

    public ic0(hc0 hc0Var) {
        this.a = hc0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ic0) && k71.k.b(this.a, ((ic0) obj).a);
    }

    public final int hashCode() {
        hc0 hc0Var = this.a;
        if (hc0Var == null) {
            return 0;
        }
        return hc0Var.hashCode();
    }

    public final String toString() {
        return "UpdateDiscussion(discussion=" + this.a + ")";
    }
}
