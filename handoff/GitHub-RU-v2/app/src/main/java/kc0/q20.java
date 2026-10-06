package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class q20 {
    public y20 a;
    public String b;

    public q20(y20 y20Var, String str) {
        this.a = y20Var;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q20)) {
            return false;
        }
        q20 q20Var = (q20) obj;
        return k71.k.b(this.a, q20Var.a) && k71.k.b(this.b, q20Var.b);
    }

    public final int hashCode() {
        y20 y20Var = this.a;
        return this.b.hashCode() + ((y20Var == null ? 0 : y20Var.hashCode()) * 31);
    }

    public final String toString() {
        return "OnIssue(timelineItem=" + this.a + ", id=" + this.b + ")";
    }
}
