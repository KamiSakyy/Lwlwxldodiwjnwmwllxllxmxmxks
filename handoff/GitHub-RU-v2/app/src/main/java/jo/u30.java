package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class u30 {
    public final t30 a;
    public final String b;
    public final String c;

    public u30(t30 t30Var, String str, String str2) {
        this.a = t30Var;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u30)) {
            return false;
        }
        u30 u30Var = (u30) obj;
        return k71.k.b(this.a, u30Var.a) && k71.k.b(this.b, u30Var.b) && k71.k.b(this.c, u30Var.c);
    }

    public final int hashCode() {
        t30 t30Var = this.a;
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i((t30Var == null ? 0 : t30Var.hashCode()) * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Repository(readme=");
        sb.append(this.a);
        sb.append(", id=");
        sb.append(this.b);
        sb.append(", __typename=");
        return com.github.rudroid.copilot.h1.p(sb, this.c, ")");
    }
}
