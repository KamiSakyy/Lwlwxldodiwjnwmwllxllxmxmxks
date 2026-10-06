package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class ra0 {
    public na0 a;
    public sa0 b;

    public ra0(na0 na0Var, sa0 sa0Var) {
        this.a = na0Var;
        this.b = sa0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ra0)) {
            return false;
        }
        ra0 ra0Var = (ra0) obj;
        return k71.k.b(this.a, ra0Var.a) && k71.k.b(this.b, ra0Var.b);
    }

    public final int hashCode() {
        na0 na0Var = this.a;
        int hashCode = (na0Var == null ? 0 : na0Var.hashCode()) * 31;
        sa0 sa0Var = this.b;
        return hashCode + (sa0Var != null ? sa0Var.hashCode() : 0);
    }

    public final String toString() {
        return "UnlockLockable(actor=" + this.a + ", unlockedRecord=" + this.b + ")";
    }
}
