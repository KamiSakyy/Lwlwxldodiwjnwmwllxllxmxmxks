package ri0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class g5 {
    public String a;
    public q4 b;
    public String c;

    public g5(String str, q4 q4Var, String str2) {
        this.a = str;
        this.b = q4Var;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g5)) {
            return false;
        }
        g5 g5Var = (g5) obj;
        return k71.k.b(this.a, g5Var.a) && k71.k.b(this.b, g5Var.b) && k71.k.b(this.c, g5Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Node5(id=");
        sb.append(this.a);
        sb.append(", commit=");
        sb.append(this.b);
        sb.append(", __typename=");
        return com.github.rudroid.copilot.h1.p(sb, this.c, ")");
    }
}
