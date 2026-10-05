package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class s10 {
    public final r10 a;
    public final String b;
    public final String c;

    public s10(r10 r10Var, String str, String str2) {
        this.a = r10Var;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s10)) {
            return false;
        }
        s10 s10Var = (s10) obj;
        return k71.k.b(this.a, s10Var.a) && k71.k.b(this.b, s10Var.b) && k71.k.b(this.c, s10Var.c);
    }

    public final int hashCode() {
        r10 r10Var = this.a;
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i((r10Var == null ? 0 : r10Var.hashCode()) * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Repository(defaultBranchRef=");
        sb.append(this.a);
        sb.append(", id=");
        sb.append(this.b);
        sb.append(", __typename=");
        return com.github.rudroid.copilot.h1.p(sb, this.c, ")");
    }
}
