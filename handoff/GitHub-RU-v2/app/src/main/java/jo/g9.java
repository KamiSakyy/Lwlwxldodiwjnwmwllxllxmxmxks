package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class g9 {
    public String a;
    public n9 b;
    public String c;

    public g9(String str, n9 n9Var, String str2) {
        this.a = str;
        this.b = n9Var;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g9)) {
            return false;
        }
        g9 g9Var = (g9) obj;
        return k71.k.b(this.a, g9Var.a) && k71.k.b(this.b, g9Var.b) && k71.k.b(this.c, g9Var.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        n9 n9Var = this.b;
        return this.c.hashCode() + ((hashCode + (n9Var == null ? 0 : n9Var.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Answer(id=");
        sb.append(this.a);
        sb.append(", replyTo=");
        sb.append(this.b);
        sb.append(", __typename=");
        return com.github.rudroid.copilot.h1.p(sb, this.c, ")");
    }
}
