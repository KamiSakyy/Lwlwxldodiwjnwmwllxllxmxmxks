package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class x20 implements aaShadow.v0 {
    public z20 a;
    public String b;
    public String c;

    public x20(z20 z20Var, String str, String str2) {
        this.a = z20Var;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x20)) {
            return false;
        }
        x20 x20Var = (x20) obj;
        return k71.k.b(this.a, x20Var.a) && k71.k.b(this.b, x20Var.b) && k71.k.b(this.c, x20Var.c);
    }

    public final int hashCode() {
        z20 z20Var = this.a;
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i((z20Var == null ? 0 : z20Var.hashCode()) * 31, this.b, 31);
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
