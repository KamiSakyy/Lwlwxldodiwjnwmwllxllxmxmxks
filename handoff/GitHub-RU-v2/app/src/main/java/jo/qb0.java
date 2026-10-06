package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class qb0 implements aaShadow.m0 {
    public final tb0 a;
    public final rb0 b;

    public qb0(tb0 tb0Var, rb0 rb0Var) {
        this.a = tb0Var;
        this.b = rb0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qb0)) {
            return false;
        }
        qb0 qb0Var = (qb0) obj;
        return k71.k.b(this.a, qb0Var.a) && k71.k.b(this.b, qb0Var.b);
    }

    public final int hashCode() {
        tb0 tb0Var = this.a;
        int hashCode = (tb0Var == null ? 0 : tb0Var.hashCode()) * 31;
        rb0 rb0Var = this.b;
        return hashCode + (rb0Var != null ? rb0Var.hashCode() : 0);
    }

    public final String toString() {
        return "Data(updateSubscription=" + this.a + ", markNotificationAsDone=" + this.b + ")";
    }
}
