package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class wa0 {
    public final ra0 a;
    public final ua0 b;

    public wa0(ra0 ra0Var, ua0 ua0Var) {
        this.a = ra0Var;
        this.b = ua0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wa0)) {
            return false;
        }
        wa0 wa0Var = (wa0) obj;
        return k71.k.b(this.a, wa0Var.a) && k71.k.b(this.b, wa0Var.b);
    }

    public final int hashCode() {
        ra0 ra0Var = this.a;
        int hashCode = (ra0Var == null ? 0 : ra0Var.hashCode()) * 31;
        ua0 ua0Var = this.b;
        return hashCode + (ua0Var != null ? ua0Var.hashCode() : 0);
    }

    public final String toString() {
        return "UpdateIssue(actor=" + this.a + ", issue=" + this.b + ")";
    }
}
