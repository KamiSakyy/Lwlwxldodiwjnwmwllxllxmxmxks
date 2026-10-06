package ri0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class c5 {
    public final p4 a;
    public final m5 b;
    public final String c;
    public final String d;

    public c5(p4 p4Var, m5 m5Var, String str, String str2) {
        this.a = p4Var;
        this.b = m5Var;
        this.c = str;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c5)) {
            return false;
        }
        c5 c5Var = (c5) obj;
        return k71.k.b(this.a, c5Var.a) && k71.k.b(this.b, c5Var.b) && k71.k.b(this.c, c5Var.c) && k71.k.b(this.d, c5Var.d);
    }

    public final int hashCode() {
        p4 p4Var = this.a;
        return this.d.hashCode() + com.github.rudroid.copilot.h1.i((this.b.hashCode() + ((p4Var == null ? 0 : p4Var.hashCode()) * 31)) * 31, this.c, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Node1(column=");
        sb.append(this.a);
        sb.append(", project=");
        sb.append(this.b);
        sb.append(", id=");
        return x.i.k(sb, this.c, ", __typename=", this.d, ")");
    }
}
