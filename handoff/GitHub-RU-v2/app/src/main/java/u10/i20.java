package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class i20 {
    public f20 a;
    public j20 b;

    public i20(f20 f20Var, j20 j20Var) {
        this.a = f20Var;
        this.b = j20Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i20)) {
            return false;
        }
        i20 i20Var = (i20) obj;
        return k71.k.b(this.a, i20Var.a) && k71.k.b(this.b, i20Var.b);
    }

    public final int hashCode() {
        f20 f20Var = this.a;
        int hashCode = (f20Var == null ? 0 : f20Var.hashCode()) * 31;
        j20 j20Var = this.b;
        return hashCode + (j20Var != null ? j20Var.hashCode() : 0);
    }

    public final String toString() {
        return "UnlockLockable(actor=" + this.a + ", unlockedRecord=" + this.b + ")";
    }
}
