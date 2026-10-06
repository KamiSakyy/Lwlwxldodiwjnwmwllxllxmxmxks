package z70;

/* loaded from: /home/user/work/p/classes3.dex */
public final class y7 {
    public String a;
    public x7 b;
    public String c;

    public y7(String str, x7 x7Var, String str2) {
        this.a = str;
        this.b = x7Var;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y7)) {
            return false;
        }
        y7 y7Var = (y7) obj;
        return k71.k.b(this.a, y7Var.a) && k71.k.b(this.b, y7Var.b) && k71.k.b(this.c, y7Var.c);
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
