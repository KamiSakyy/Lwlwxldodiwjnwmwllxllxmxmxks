package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class v00 {
    public String a;
    public u00 b;
    public String c;

    public v00(String str, u00 u00Var, String str2) {
        this.a = str;
        this.b = u00Var;
        this.c = str2;
    }

    public static v00 a(v00 v00Var, u00 u00Var) {
        String str = v00Var.a;
        String str2 = v00Var.c;
        v00Var.getClass();
        return new v00(str, u00Var, str2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v00)) {
            return false;
        }
        v00 v00Var = (v00) obj;
        return k71.k.b(this.a, v00Var.a) && k71.k.b(this.b, v00Var.b) && k71.k.b(this.c, v00Var.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        u00 u00Var = this.b;
        return this.c.hashCode() + ((hashCode + (u00Var == null ? 0 : u00Var.hashCode())) * 31);
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
