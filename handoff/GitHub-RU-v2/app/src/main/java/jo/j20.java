package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class j20 {
    public String a;
    public g20 b;
    public String c;

    public j20(String str, g20 g20Var, String str2) {
        this.a = str;
        this.b = g20Var;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j20)) {
            return false;
        }
        j20 j20Var = (j20) obj;
        return k71.k.b(this.a, j20Var.a) && k71.k.b(this.b, j20Var.b) && k71.k.b(this.c, j20Var.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        g20 g20Var = this.b;
        return this.c.hashCode() + ((hashCode + (g20Var == null ? 0 : g20Var.hashCode())) * 31);
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
