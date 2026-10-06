package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class f50 implements aaShadow.m0 {
    public i50 a;
    public g50 b;

    public f50(i50 i50Var, g50 g50Var) {
        this.a = i50Var;
        this.b = g50Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f50)) {
            return false;
        }
        f50 f50Var = (f50) obj;
        return k71.k.b(this.a, f50Var.a) && k71.k.b(this.b, f50Var.b);
    }

    public final int hashCode() {
        i50 i50Var = this.a;
        int hashCode = (i50Var == null ? 0 : i50Var.hashCode()) * 31;
        g50 g50Var = this.b;
        return hashCode + (g50Var != null ? g50Var.hashCode() : 0);
    }

    public final String toString() {
        return "Data(updateSubscription=" + this.a + ", markNotificationAsDone=" + this.b + ")";
    }
}
