package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class t80 implements aaShadow.v0 {
    public final c90 a;
    public final String b;
    public final String c;

    public t80(c90 c90Var, String str, String str2) {
        this.a = c90Var;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t80)) {
            return false;
        }
        t80 t80Var = (t80) obj;
        return k71.k.b(this.a, t80Var.a) && k71.k.b(this.b, t80Var.b) && k71.k.b(this.c, t80Var.c);
    }

    public final int hashCode() {
        c90 c90Var = this.a;
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i((c90Var == null ? 0 : c90Var.hashCode()) * 31, this.b, 31);
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
