package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class y6 {
    public String a;
    public x6 b;
    public String c;

    public y6(String str, x6 x6Var, String str2) {
        this.a = str;
        this.b = x6Var;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y6)) {
            return false;
        }
        y6 y6Var = (y6) obj;
        return k71.k.b(this.a, y6Var.a) && k71.k.b(this.b, y6Var.b) && k71.k.b(this.c, y6Var.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        x6 x6Var = this.b;
        return this.c.hashCode() + ((hashCode + (x6Var == null ? 0 : x6Var.hashCode())) * 31);
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
