package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class n00 {
    public final String a;
    public final m00 b;
    public final String c;

    public n00(String str, m00 m00Var, String str2) {
        this.a = str;
        this.b = m00Var;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n00)) {
            return false;
        }
        n00 n00Var = (n00) obj;
        return k71.k.b(this.a, n00Var.a) && k71.k.b(this.b, n00Var.b) && k71.k.b(this.c, n00Var.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        m00 m00Var = this.b;
        return this.c.hashCode() + ((hashCode + (m00Var == null ? 0 : m00Var.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Comparison(id=");
        sb.append(this.a);
        sb.append(", compare=");
        sb.append(this.b);
        sb.append(", __typename=");
        return com.github.rudroid.copilot.h1.p(sb, this.c, ")");
    }
}
