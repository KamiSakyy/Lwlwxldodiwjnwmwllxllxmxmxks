package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class x6 {
    public String a;
    public a7 b;
    public String c;

    public x6(String str, a7 a7Var, String str2) {
        this.a = str;
        this.b = a7Var;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x6)) {
            return false;
        }
        x6 x6Var = (x6) obj;
        return k71.k.b(this.a, x6Var.a) && k71.k.b(this.b, x6Var.b) && k71.k.b(this.c, x6Var.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        a7 a7Var = this.b;
        return this.c.hashCode() + ((hashCode + (a7Var == null ? 0 : a7Var.hashCode())) * 31);
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
