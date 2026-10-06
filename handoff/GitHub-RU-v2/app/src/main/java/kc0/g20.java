package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class g20 implements aaShadow.m0 {
    public final j20 a;
    public final h20 b;

    public g20(j20 j20Var, h20 h20Var) {
        this.a = j20Var;
        this.b = h20Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g20)) {
            return false;
        }
        g20 g20Var = (g20) obj;
        return k71.k.b(this.a, g20Var.a) && k71.k.b(this.b, g20Var.b);
    }

    public final int hashCode() {
        j20 j20Var = this.a;
        int hashCode = (j20Var == null ? 0 : j20Var.hashCode()) * 31;
        h20 h20Var = this.b;
        return hashCode + (h20Var != null ? h20Var.hashCode() : 0);
    }

    public final String toString() {
        return "Data(updateSubscription=" + this.a + ", markNotificationAsUndone=" + this.b + ")";
    }
}
