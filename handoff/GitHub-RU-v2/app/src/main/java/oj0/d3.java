package oj0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class d3 {
    public final b3 a;
    public final e3 b;
    public final String c;
    public final String d;

    public d3(b3 b3Var, e3 e3Var, String str, String str2) {
        this.a = b3Var;
        this.b = e3Var;
        this.c = str;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d3)) {
            return false;
        }
        d3 d3Var = (d3) obj;
        return k71.k.b(this.a, d3Var.a) && k71.k.b(this.b, d3Var.b) && k71.k.b(this.c, d3Var.c) && k71.k.b(this.d, d3Var.d);
    }

    public final int hashCode() {
        b3 b3Var = this.a;
        return this.d.hashCode() + com.github.rudroid.copilot.h1.i((this.b.hashCode() + ((b3Var == null ? 0 : b3Var.hashCode()) * 31)) * 31, this.c, 31);
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
