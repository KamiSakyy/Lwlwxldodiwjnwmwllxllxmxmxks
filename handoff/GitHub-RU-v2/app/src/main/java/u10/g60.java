package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class g60 {
    public c60 a;
    public h60 b;
    public String c;
    public String d;

    public g60(c60 c60Var, h60 h60Var, String str, String str2) {
        this.a = c60Var;
        this.b = h60Var;
        this.c = str;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g60)) {
            return false;
        }
        g60 g60Var = (g60) obj;
        return k71.k.b(this.a, g60Var.a) && k71.k.b(this.b, g60Var.b) && k71.k.b(this.c, g60Var.c) && k71.k.b(this.d, g60Var.d);
    }

    public final int hashCode() {
        c60 c60Var = this.a;
        return this.d.hashCode() + com.github.rudroid.copilot.h1.i((this.b.hashCode() + ((c60Var == null ? 0 : c60Var.hashCode()) * 31)) * 31, this.c, 31);
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
