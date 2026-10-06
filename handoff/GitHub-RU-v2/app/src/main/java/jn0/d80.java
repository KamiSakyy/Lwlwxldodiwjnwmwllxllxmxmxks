package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class d80 {
    public final a80 a;
    public final e80 b;

    public d80(a80 a80Var, e80 e80Var) {
        this.a = a80Var;
        this.b = e80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d80)) {
            return false;
        }
        d80 d80Var = (d80) obj;
        return k71.k.b(this.a, d80Var.a) && k71.k.b(this.b, d80Var.b);
    }

    public final int hashCode() {
        a80 a80Var = this.a;
        int hashCode = (a80Var == null ? 0 : a80Var.hashCode()) * 31;
        e80 e80Var = this.b;
        return hashCode + (e80Var != null ? e80Var.hashCode() : 0);
    }

    public final String toString() {
        return "UnlockLockable(actor=" + this.a + ", unlockedRecord=" + this.b + ")";
    }
}
