package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class n6 {
    public String a;
    public q6 b;
    public String c;

    public n6(String str, q6 q6Var, String str2) {
        this.a = str;
        this.b = q6Var;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n6)) {
            return false;
        }
        n6 n6Var = (n6) obj;
        return k71.k.b(this.a, n6Var.a) && k71.k.b(this.b, n6Var.b) && k71.k.b(this.c, n6Var.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        q6 q6Var = this.b;
        return this.c.hashCode() + ((hashCode + (q6Var == null ? 0 : q6Var.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Compare(id=");
        sb.append(this.a);
        sb.append(", diff=");
        sb.append(this.b);
        sb.append(", __typename=");
        return com.github.rudroid.copilot.h1.p(sb, this.c, ")");
    }
}
