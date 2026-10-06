package oj0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class g0 {
    public String a;
    public h0 b;

    public g0(String str, h0 h0Var) {
        this.a = str;
        this.b = h0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g0)) {
            return false;
        }
        g0 g0Var = (g0) obj;
        return k71.k.b(this.a, g0Var.a) && k71.k.b(this.b, g0Var.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        h0 h0Var = this.b;
        return hashCode + (h0Var == null ? 0 : h0Var.hashCode());
    }

    public final String toString() {
        return "OnCommit(oid=" + this.a + ", statusCheckRollup=" + this.b + ")";
    }
}
