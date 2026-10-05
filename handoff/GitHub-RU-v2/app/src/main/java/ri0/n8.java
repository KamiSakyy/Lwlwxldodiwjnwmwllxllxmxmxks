package ri0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class n8 {
    public final String a;
    public final m8 b;
    public final String c;

    public n8(String str, m8 m8Var, String str2) {
        this.a = str;
        this.b = m8Var;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n8)) {
            return false;
        }
        n8 n8Var = (n8) obj;
        return k71.k.b(this.a, n8Var.a) && k71.k.b(this.b, n8Var.b) && k71.k.b(this.c, n8Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + a0.s0.b(this.b.a, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Node(id=");
        sb.append(this.a);
        sb.append(", comments=");
        sb.append(this.b);
        sb.append(", __typename=");
        return com.github.rudroid.copilot.h1.p(sb, this.c, ")");
    }
}
