package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class g40 {
    public final d40 a;
    public final h40 b;

    public g40(d40 d40Var, h40 h40Var) {
        this.a = d40Var;
        this.b = h40Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g40)) {
            return false;
        }
        g40 g40Var = (g40) obj;
        return k71.k.b(this.a, g40Var.a) && k71.k.b(this.b, g40Var.b);
    }

    public final int hashCode() {
        d40 d40Var = this.a;
        int hashCode = (d40Var == null ? 0 : d40Var.hashCode()) * 31;
        h40 h40Var = this.b;
        return hashCode + (h40Var != null ? h40Var.hashCode() : 0);
    }

    public final String toString() {
        return "UnlockLockable(actor=" + this.a + ", unlockedRecord=" + this.b + ")";
    }
}
