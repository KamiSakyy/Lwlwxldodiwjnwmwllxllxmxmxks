package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class c30 implements aaShadow.v0 {
    public final e30 a;
    public final String b;
    public final String c;

    public c30(e30 e30Var, String str, String str2) {
        this.a = e30Var;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c30)) {
            return false;
        }
        c30 c30Var = (c30) obj;
        return k71.k.b(this.a, c30Var.a) && k71.k.b(this.b, c30Var.b) && k71.k.b(this.c, c30Var.c);
    }

    public final int hashCode() {
        e30 e30Var = this.a;
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i((e30Var == null ? 0 : e30Var.hashCode()) * 31, this.b, 31);
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
