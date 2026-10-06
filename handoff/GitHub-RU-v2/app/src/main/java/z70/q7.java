package z70;

/* loaded from: /home/user/work/p/classes3.dex */
public final class q7 {
    public final String a;
    public final p7 b;
    public final String c;

    public q7(String str, p7 p7Var, String str2) {
        this.a = str;
        this.b = p7Var;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q7)) {
            return false;
        }
        q7 q7Var = (q7) obj;
        return k71.k.b(this.a, q7Var.a) && k71.k.b(this.b, q7Var.b) && k71.k.b(this.c, q7Var.c);
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
