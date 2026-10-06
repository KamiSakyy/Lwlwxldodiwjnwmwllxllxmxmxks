package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class c90 implements aaShadow.m0 {
    public f90 a;
    public d90 b;

    public c90(f90 f90Var, d90 d90Var) {
        this.a = f90Var;
        this.b = d90Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c90)) {
            return false;
        }
        c90 c90Var = (c90) obj;
        return k71.k.b(this.a, c90Var.a) && k71.k.b(this.b, c90Var.b);
    }

    public final int hashCode() {
        f90 f90Var = this.a;
        int hashCode = (f90Var == null ? 0 : f90Var.hashCode()) * 31;
        d90 d90Var = this.b;
        return hashCode + (d90Var != null ? d90Var.hashCode() : 0);
    }

    public final String toString() {
        return "Data(updateSubscription=" + this.a + ", markNotificationAsDone=" + this.b + ")";
    }
}
