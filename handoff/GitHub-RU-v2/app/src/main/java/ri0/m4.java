package ri0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class m4 {
    public p5 a;
    public String b;
    public String c;

    public m4(p5 p5Var, String str, String str2) {
        this.a = p5Var;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m4)) {
            return false;
        }
        m4 m4Var = (m4) obj;
        return k71.k.b(this.a, m4Var.a) && k71.k.b(this.b, m4Var.b) && k71.k.b(this.c, m4Var.c);
    }

    public final int hashCode() {
        p5 p5Var = this.a;
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i((p5Var == null ? 0 : p5Var.hashCode()) * 31, this.b, 31);
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
