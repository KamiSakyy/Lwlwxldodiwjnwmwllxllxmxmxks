package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class b20 implements aaShadow.v0 {
    public final c20 a;
    public final String b;
    public final String c;

    public b20(c20 c20Var, String str, String str2) {
        this.a = c20Var;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b20)) {
            return false;
        }
        b20 b20Var = (b20) obj;
        return k71.k.b(this.a, b20Var.a) && k71.k.b(this.b, b20Var.b) && k71.k.b(this.c, b20Var.c);
    }

    public final int hashCode() {
        c20 c20Var = this.a;
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i((c20Var == null ? 0 : c20Var.hashCode()) * 31, this.b, 31);
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
