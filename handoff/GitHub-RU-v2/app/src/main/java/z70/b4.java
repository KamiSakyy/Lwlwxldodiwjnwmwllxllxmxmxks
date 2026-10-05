package z70;

/* loaded from: /home/user/work/p/classes3.dex */
public final class b4 {
    public final c5 a;
    public final String b;
    public final String c;

    public b4(c5 c5Var, String str, String str2) {
        this.a = c5Var;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b4)) {
            return false;
        }
        b4 b4Var = (b4) obj;
        return k71.k.b(this.a, b4Var.a) && k71.k.b(this.b, b4Var.b) && k71.k.b(this.c, b4Var.c);
    }

    public final int hashCode() {
        c5 c5Var = this.a;
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i((c5Var == null ? 0 : c5Var.hashCode()) * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BaseRef(refUpdateRule=");
        sb.append(this.a);
        sb.append(", id=");
        sb.append(this.b);
        sb.append(", __typename=");
        return com.github.rudroid.copilot.h1.p(sb, this.c, ")");
    }
}
