package uu0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class g1 {
    public final String a;
    public final h1 b;

    public g1(String str, h1 h1Var) {
        this.a = str;
        this.b = h1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g1)) {
            return false;
        }
        g1 g1Var = (g1) obj;
        return k71.k.b(this.a, g1Var.a) && k71.k.b(this.b, g1Var.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        h1 h1Var = this.b;
        return hashCode + (h1Var == null ? 0 : h1Var.hashCode());
    }

    public final String toString() {
        return "OnCommit(oid=" + this.a + ", statusCheckRollup=" + this.b + ")";
    }
}
