package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class t20 {
    public final String a;
    public final x20 b;

    public t20(String str, x20 x20Var) {
        this.a = str;
        this.b = x20Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t20)) {
            return false;
        }
        t20 t20Var = (t20) obj;
        return k71.k.b(this.a, t20Var.a) && k71.k.b(this.b, t20Var.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        x20 x20Var = this.b;
        return hashCode + (x20Var == null ? 0 : x20Var.hashCode());
    }

    public final String toString() {
        return "OnPullRequest(id=" + this.a + ", timelineItem=" + this.b + ")";
    }
}
