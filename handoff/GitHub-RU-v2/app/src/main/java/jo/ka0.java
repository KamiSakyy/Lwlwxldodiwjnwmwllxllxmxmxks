package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class ka0 implements aaShadow.m0 {
    public la0 a;

    public ka0(la0 la0Var) {
        this.a = la0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ka0) && k71.k.b(this.a, ((ka0) obj).a);
    }

    public final int hashCode() {
        la0 la0Var = this.a;
        if (la0Var == null) {
            return 0;
        }
        return la0Var.hashCode();
    }

    public final String toString() {
        return "Data(unfollowUser=" + this.a + ")";
    }
}
