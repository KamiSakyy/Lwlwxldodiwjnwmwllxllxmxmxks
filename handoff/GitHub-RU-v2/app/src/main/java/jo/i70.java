package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class i70 {
    public m70 a;
    public String b;
    public String c;

    public i70(m70 m70Var, String str, String str2) {
        this.a = m70Var;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i70)) {
            return false;
        }
        i70 i70Var = (i70) obj;
        return k71.k.b(this.a, i70Var.a) && k71.k.b(this.b, i70Var.b) && k71.k.b(this.c, i70Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Node1(sponsorable=");
        sb.append(this.a);
        sb.append(", id=");
        sb.append(this.b);
        sb.append(", __typename=");
        return com.github.rudroid.copilot.h1.p(sb, this.c, ")");
    }
}
