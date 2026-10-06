package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class d7 {
    public String a;
    public y6 b;
    public String c;

    public d7(String str, y6 y6Var, String str2) {
        this.a = str;
        this.b = y6Var;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d7)) {
            return false;
        }
        d7 d7Var = (d7) obj;
        return k71.k.b(this.a, d7Var.a) && k71.k.b(this.b, d7Var.b) && k71.k.b(this.c, d7Var.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        y6 y6Var = this.b;
        return this.c.hashCode() + ((hashCode + (y6Var == null ? 0 : y6Var.hashCode())) * 31);
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
