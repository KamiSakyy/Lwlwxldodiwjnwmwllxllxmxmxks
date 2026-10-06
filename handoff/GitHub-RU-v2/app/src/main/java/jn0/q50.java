package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class q50 {
    public String a;
    public String b;
    public uu0.v5 c;

    public q50(String str, String str2, uu0.v5 v5Var) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = str2;
        this.c = v5Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q50)) {
            return false;
        }
        q50 q50Var = (q50) obj;
        return k71.k.b(this.a, q50Var.a) && k71.k.b(this.b, q50Var.b) && k71.k.b(this.c, q50Var.c);
    }

    public final int hashCode() {
        int i = com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
        uu0.v5 v5Var = this.c;
        return i + (v5Var == null ? 0 : v5Var.hashCode());
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("Node(__typename=", this.a, ", id=", this.b, ", subIssueListFragment=");
        o.append(this.c);
        o.append(")");
        return o.toString();
    }
}
