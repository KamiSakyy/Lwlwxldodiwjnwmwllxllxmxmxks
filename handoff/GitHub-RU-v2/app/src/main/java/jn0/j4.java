package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class j4 {
    public final m4 a;
    public final a4 b;

    public j4(m4 m4Var, a4 a4Var) {
        this.a = m4Var;
        this.b = a4Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j4)) {
            return false;
        }
        j4 j4Var = (j4) obj;
        return k71.k.b(this.a, j4Var.a) && k71.k.b(this.b, j4Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "OnPullRequest(requiredStatusChecks=" + this.a + ", commits=" + this.b + ")";
    }
}
