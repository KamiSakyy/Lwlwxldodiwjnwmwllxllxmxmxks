package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class z50 implements aa.m0 {
    public final c60 a;
    public final a60 b;

    public z50(c60 c60Var, a60 a60Var) {
        this.a = c60Var;
        this.b = a60Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z50)) {
            return false;
        }
        z50 z50Var = (z50) obj;
        return k71.k.b(this.a, z50Var.a) && k71.k.b(this.b, z50Var.b);
    }

    public final int hashCode() {
        c60 c60Var = this.a;
        int hashCode = (c60Var == null ? 0 : c60Var.hashCode()) * 31;
        a60 a60Var = this.b;
        return hashCode + (a60Var != null ? a60Var.hashCode() : 0);
    }

    public final String toString() {
        return "Data(updateSubscription=" + this.a + ", markNotificationAsUndone=" + this.b + ")";
    }
}
