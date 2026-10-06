package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class ga0 {
    public ha0 a;

    public ga0(ha0 ha0Var) {
        this.a = ha0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ga0) && k71.k.b(this.a, ((ga0) obj).a);
    }

    public final int hashCode() {
        ha0 ha0Var = this.a;
        if (ha0Var == null) {
            return 0;
        }
        return ha0Var.hashCode();
    }

    public final String toString() {
        return "UnfollowUser(user=" + this.a + ")";
    }
}
