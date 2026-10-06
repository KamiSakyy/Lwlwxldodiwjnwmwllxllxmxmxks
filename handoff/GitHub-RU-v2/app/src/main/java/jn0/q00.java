package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class q00 {
    public final n00 a;
    public final p00 b;
    public final String c;
    public final String d;

    public q00(n00 n00Var, p00 p00Var, String str, String str2) {
        this.a = n00Var;
        this.b = p00Var;
        this.c = str;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q00)) {
            return false;
        }
        q00 q00Var = (q00) obj;
        return k71.k.b(this.a, q00Var.a) && k71.k.b(this.b, q00Var.b) && k71.k.b(this.c, q00Var.c) && k71.k.b(this.d, q00Var.d);
    }

    public final int hashCode() {
        n00 n00Var = this.a;
        int hashCode = (n00Var == null ? 0 : n00Var.hashCode()) * 31;
        p00 p00Var = this.b;
        return this.d.hashCode() + com.github.rudroid.copilot.h1.i((hashCode + (p00Var != null ? p00Var.hashCode() : 0)) * 31, this.c, 31);
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
