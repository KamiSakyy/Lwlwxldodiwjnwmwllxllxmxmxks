package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class h30 implements aa.v0 {
    public final l30 a;
    public final String b;
    public final String c;

    public h30(l30 l30Var, String str, String str2) {
        this.a = l30Var;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h30)) {
            return false;
        }
        h30 h30Var = (h30) obj;
        return k71.k.b(this.a, h30Var.a) && k71.k.b(this.b, h30Var.b) && k71.k.b(this.c, h30Var.c);
    }

    public final int hashCode() {
        l30 l30Var = this.a;
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i((l30Var == null ? 0 : l30Var.hashCode()) * 31, this.b, 31);
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
