package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class t20 implements aaShadow.v0 {
    public u20 a;
    public String b;
    public String c;

    public t20(u20 u20Var, String str, String str2) {
        this.a = u20Var;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t20)) {
            return false;
        }
        t20 t20Var = (t20) obj;
        return k71.k.b(this.a, t20Var.a) && k71.k.b(this.b, t20Var.b) && k71.k.b(this.c, t20Var.c);
    }

    public final int hashCode() {
        u20 u20Var = this.a;
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i((u20Var == null ? 0 : u20Var.hashCode()) * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Data(repository=");
        sb.append(this.a);
        sb.append(", id=");
        sb.append(this.b);
        sb.append(", __typename=");
        return com.github.rudroid.copilot.h1.p(sb, this.c, ")");
    }
}
