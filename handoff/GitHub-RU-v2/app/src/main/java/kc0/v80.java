package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class v80 {
    public m80 a;
    public t80 b;

    public v80(m80 m80Var, t80 t80Var) {
        this.a = m80Var;
        this.b = t80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v80)) {
            return false;
        }
        v80 v80Var = (v80) obj;
        return k71.k.b(this.a, v80Var.a) && k71.k.b(this.b, v80Var.b);
    }

    public final int hashCode() {
        m80 m80Var = this.a;
        int hashCode = (m80Var == null ? 0 : m80Var.hashCode()) * 31;
        t80 t80Var = this.b;
        return hashCode + (t80Var != null ? t80Var.hashCode() : 0);
    }

    public final String toString() {
        return "RequestReviews(actor=" + this.a + ", pullRequest=" + this.b + ")";
    }
}
