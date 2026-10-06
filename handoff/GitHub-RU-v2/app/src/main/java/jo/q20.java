package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class q20 {
    public n20 a;
    public p20 b;
    public String c;
    public String d;

    public q20(n20 n20Var, p20 p20Var, String str, String str2) {
        this.a = n20Var;
        this.b = p20Var;
        this.c = str;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q20)) {
            return false;
        }
        q20 q20Var = (q20) obj;
        return k71.k.b(this.a, q20Var.a) && k71.k.b(this.b, q20Var.b) && k71.k.b(this.c, q20Var.c) && k71.k.b(this.d, q20Var.d);
    }

    public final int hashCode() {
        n20 n20Var = this.a;
        int hashCode = (n20Var == null ? 0 : n20Var.hashCode()) * 31;
        p20 p20Var = this.b;
        return this.d.hashCode() + com.github.rudroid.copilot.h1.i((hashCode + (p20Var != null ? p20Var.hashCode() : 0)) * 31, this.c, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Repository(defaultBranchRef=");
        sb.append(this.a);
        sb.append(", refs=");
        sb.append(this.b);
        sb.append(", id=");
        return x.i.k(sb, this.c, ", __typename=", this.d, ")");
    }
}
