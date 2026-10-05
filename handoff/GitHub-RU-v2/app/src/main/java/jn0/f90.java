package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class f90 {
    public final String a;
    public final e90 b;

    public f90(String str, e90 e90Var) {
        this.a = str;
        this.b = e90Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f90)) {
            return false;
        }
        f90 f90Var = (f90) obj;
        return k71.k.b(this.a, f90Var.a) && k71.k.b(this.b, f90Var.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        e90 e90Var = this.b;
        return hashCode + (e90Var == null ? 0 : e90Var.hashCode());
    }

    public final String toString() {
        return "UpdateSubscription(__typename=" + this.a + ", subscribable=" + this.b + ")";
    }
}
