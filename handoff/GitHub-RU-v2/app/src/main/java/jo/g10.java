package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class g10 {
    public String a;
    public f10 b;
    public String c;

    public g10(String str, f10 f10Var, String str2) {
        this.a = str;
        this.b = f10Var;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g10)) {
            return false;
        }
        g10 g10Var = (g10) obj;
        return k71.k.b(this.a, g10Var.a) && k71.k.b(this.b, g10Var.b) && k71.k.b(this.c, g10Var.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        f10 f10Var = this.b;
        return this.c.hashCode() + ((hashCode + (f10Var == null ? 0 : f10Var.hashCode())) * 31);
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
