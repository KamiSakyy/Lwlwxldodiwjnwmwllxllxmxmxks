package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class o00 implements aaShadow.v0 {
    public final r00 a;
    public final String b;
    public final String c;

    public o00(r00 r00Var, String str, String str2) {
        this.a = r00Var;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o00)) {
            return false;
        }
        o00 o00Var = (o00) obj;
        return k71.k.b(this.a, o00Var.a) && k71.k.b(this.b, o00Var.b) && k71.k.b(this.c, o00Var.c);
    }

    public final int hashCode() {
        r00 r00Var = this.a;
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i((r00Var == null ? 0 : r00Var.hashCode()) * 31, this.b, 31);
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
