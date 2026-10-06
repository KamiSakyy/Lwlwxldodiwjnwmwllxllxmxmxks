package xt0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class x7 {
    public String a;
    public w7 b;
    public String c;

    public x7(String str, w7 w7Var, String str2) {
        this.a = str;
        this.b = w7Var;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x7)) {
            return false;
        }
        x7 x7Var = (x7) obj;
        return k71.k.b(this.a, x7Var.a) && k71.k.b(this.b, x7Var.b) && k71.k.b(this.c, x7Var.c);
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
