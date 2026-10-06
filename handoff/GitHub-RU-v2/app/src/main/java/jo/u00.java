package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class u00 {
    public String a;
    public x00 b;
    public String c;

    public u00(String str, x00 x00Var, String str2) {
        this.a = str;
        this.b = x00Var;
        this.c = str2;
    }

    public static u00 a(u00 u00Var, x00 x00Var) {
        String str = u00Var.a;
        String str2 = u00Var.c;
        u00Var.getClass();
        return new u00(str, x00Var, str2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u00)) {
            return false;
        }
        u00 u00Var = (u00) obj;
        return k71.k.b(this.a, u00Var.a) && k71.k.b(this.b, u00Var.b) && k71.k.b(this.c, u00Var.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        x00 x00Var = this.b;
        return this.c.hashCode() + ((hashCode + (x00Var == null ? 0 : x00Var.hashCode())) * 31);
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
