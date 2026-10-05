package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class l50 implements aa.v0 {
    public final p50 a;
    public final String b;
    public final String c;

    public l50(p50 p50Var, String str, String str2) {
        this.a = p50Var;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l50)) {
            return false;
        }
        l50 l50Var = (l50) obj;
        return k71.k.b(this.a, l50Var.a) && k71.k.b(this.b, l50Var.b) && k71.k.b(this.c, l50Var.c);
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
