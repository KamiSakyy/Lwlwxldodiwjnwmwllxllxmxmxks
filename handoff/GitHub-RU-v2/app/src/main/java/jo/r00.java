package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class r00 {
    public String a;
    public n00 b;
    public String c;

    public r00(String str, n00 n00Var, String str2) {
        this.a = str;
        this.b = n00Var;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r00)) {
            return false;
        }
        r00 r00Var = (r00) obj;
        return k71.k.b(this.a, r00Var.a) && k71.k.b(this.b, r00Var.b) && k71.k.b(this.c, r00Var.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        n00 n00Var = this.b;
        return this.c.hashCode() + ((hashCode + (n00Var == null ? 0 : n00Var.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Repository(id=");
        sb.append(this.a);
        sb.append(", comparison=");
        sb.append(this.b);
        sb.append(", __typename=");
        return com.github.rudroid.copilot.h1.p(sb, this.c, ")");
    }
}
