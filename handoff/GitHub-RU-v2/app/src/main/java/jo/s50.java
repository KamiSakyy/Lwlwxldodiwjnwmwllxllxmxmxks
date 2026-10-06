package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class s50 implements aaShadow.v0 {
    public final w50 a;
    public final String b;
    public final String c;

    public s50(w50 w50Var, String str, String str2) {
        this.a = w50Var;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s50)) {
            return false;
        }
        s50 s50Var = (s50) obj;
        return k71.k.b(this.a, s50Var.a) && k71.k.b(this.b, s50Var.b) && k71.k.b(this.c, s50Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Data(search=");
        sb.append(this.a);
        sb.append(", id=");
        sb.append(this.b);
        sb.append(", __typename=");
        return com.github.rudroid.copilot.h1.p(sb, this.c, ")");
    }
}
