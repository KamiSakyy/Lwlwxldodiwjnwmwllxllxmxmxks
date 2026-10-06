package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class v60 {
    public m60 a;
    public t60 b;

    public v60(m60 m60Var, t60 t60Var) {
        this.a = m60Var;
        this.b = t60Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v60)) {
            return false;
        }
        v60 v60Var = (v60) obj;
        return k71.k.b(this.a, v60Var.a) && k71.k.b(this.b, v60Var.b);
    }

    public final int hashCode() {
        m60 m60Var = this.a;
        int hashCode = (m60Var == null ? 0 : m60Var.hashCode()) * 31;
        t60 t60Var = this.b;
        return hashCode + (t60Var != null ? t60Var.hashCode() : 0);
    }

    public final String toString() {
        return "RequestReviews(actor=" + this.a + ", pullRequest=" + this.b + ")";
    }
}
