package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class m60 {
    public final String a;
    public final q60 b;

    public m60(String str, q60 q60Var) {
        this.a = str;
        this.b = q60Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m60)) {
            return false;
        }
        m60 m60Var = (m60) obj;
        return k71.k.b(this.a, m60Var.a) && k71.k.b(this.b, m60Var.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        q60 q60Var = this.b;
        return hashCode + (q60Var == null ? 0 : q60Var.hashCode());
    }

    public final String toString() {
        return "OnPullRequest(id=" + this.a + ", timelineItem=" + this.b + ")";
    }
}
