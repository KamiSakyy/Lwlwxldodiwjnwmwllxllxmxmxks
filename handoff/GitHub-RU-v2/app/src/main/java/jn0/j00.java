package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class j00 {
    public String a;
    public g00 b;
    public String c;

    public j00(String str, g00 g00Var, String str2) {
        this.a = str;
        this.b = g00Var;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j00)) {
            return false;
        }
        j00 j00Var = (j00) obj;
        return k71.k.b(this.a, j00Var.a) && k71.k.b(this.b, j00Var.b) && k71.k.b(this.c, j00Var.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        g00 g00Var = this.b;
        return this.c.hashCode() + ((hashCode + (g00Var == null ? 0 : g00Var.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Repository(id=");
        sb.append(this.a);
        sb.append(", labels=");
        sb.append(this.b);
        sb.append(", __typename=");
        return com.github.rudroid.copilot.h1.p(sb, this.c, ")");
    }
}
