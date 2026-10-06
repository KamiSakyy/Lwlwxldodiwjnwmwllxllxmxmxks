package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class b10 {
    public String a;
    public v00 b;
    public String c;

    public b10(String str, v00 v00Var, String str2) {
        this.a = str;
        this.b = v00Var;
        this.c = str2;
    }

    public static b10 a(b10 b10Var, v00 v00Var) {
        String str = b10Var.a;
        String str2 = b10Var.c;
        b10Var.getClass();
        return new b10(str, v00Var, str2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b10)) {
            return false;
        }
        b10 b10Var = (b10) obj;
        return k71.k.b(this.a, b10Var.a) && k71.k.b(this.b, b10Var.b) && k71.k.b(this.c, b10Var.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        v00 v00Var = this.b;
        return this.c.hashCode() + ((hashCode + (v00Var == null ? 0 : v00Var.hashCode())) * 31);
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
