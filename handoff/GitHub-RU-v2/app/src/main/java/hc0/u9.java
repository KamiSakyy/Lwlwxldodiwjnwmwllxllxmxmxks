package hc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class u9 {
    public aa.u0 a;
    public aa.u0 b;

    public u9(aa.u0 u0Var, aa.u0 u0Var2) {
        this.a = u0Var;
        this.b = u0Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u9)) {
            return false;
        }
        u9 u9Var = (u9) obj;
        return this.a.equals(u9Var.a) && this.b.equals(u9Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "FileChanges(additions=" + this.a + ", deletions=" + this.b + ")";
    }
}
