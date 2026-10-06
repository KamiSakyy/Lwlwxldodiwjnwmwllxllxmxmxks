package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class b6 {
    public String a;
    public a6 b;
    public String c;

    public b6(String str, a6 a6Var, String str2) {
        this.a = str;
        this.b = a6Var;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b6)) {
            return false;
        }
        b6 b6Var = (b6) obj;
        return k71.k.b(this.a, b6Var.a) && k71.k.b(this.b, b6Var.b) && k71.k.b(this.c, b6Var.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        a6 a6Var = this.b;
        return this.c.hashCode() + ((hashCode + (a6Var == null ? 0 : a6Var.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Repository(id=");
        sb.append(this.a);
        sb.append(", gitObject=");
        sb.append(this.b);
        sb.append(", __typename=");
        return com.github.rudroid.copilot.h1.p(sb, this.c, ")");
    }
}
