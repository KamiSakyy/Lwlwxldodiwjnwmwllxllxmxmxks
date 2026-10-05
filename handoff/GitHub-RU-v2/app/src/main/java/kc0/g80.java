package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class g80 {
    public final c80 a;
    public final h80 b;
    public final String c;
    public final String d;

    public g80(c80 c80Var, h80 h80Var, String str, String str2) {
        this.a = c80Var;
        this.b = h80Var;
        this.c = str;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g80)) {
            return false;
        }
        g80 g80Var = (g80) obj;
        return k71.k.b(this.a, g80Var.a) && k71.k.b(this.b, g80Var.b) && k71.k.b(this.c, g80Var.c) && k71.k.b(this.d, g80Var.d);
    }

    public final int hashCode() {
        c80 c80Var = this.a;
        return this.d.hashCode() + com.github.rudroid.copilot.h1.i((this.b.hashCode() + ((c80Var == null ? 0 : c80Var.hashCode()) * 31)) * 31, this.c, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Node(column=");
        sb.append(this.a);
        sb.append(", project=");
        sb.append(this.b);
        sb.append(", id=");
        return x.i.k(sb, this.c, ", __typename=", this.d, ")");
    }
}
