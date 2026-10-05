package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class s30 implements aa.v0 {
    public final u30 a;
    public final String b;
    public final String c;

    public s30(u30 u30Var, String str, String str2) {
        this.a = u30Var;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s30)) {
            return false;
        }
        s30 s30Var = (s30) obj;
        return k71.k.b(this.a, s30Var.a) && k71.k.b(this.b, s30Var.b) && k71.k.b(this.c, s30Var.c);
    }

    public final int hashCode() {
        u30 u30Var = this.a;
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i((u30Var == null ? 0 : u30Var.hashCode()) * 31, this.b, 31);
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
