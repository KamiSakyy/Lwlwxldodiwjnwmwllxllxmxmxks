package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class r40 {
    public m40 a;
    public s40 b;
    public String c;
    public String d;

    public r40(m40 m40Var, s40 s40Var, String str, String str2) {
        this.a = m40Var;
        this.b = s40Var;
        this.c = str;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r40)) {
            return false;
        }
        r40 r40Var = (r40) obj;
        return k71.k.b(this.a, r40Var.a) && k71.k.b(this.b, r40Var.b) && k71.k.b(this.c, r40Var.c) && k71.k.b(this.d, r40Var.d);
    }

    public final int hashCode() {
        m40 m40Var = this.a;
        return this.d.hashCode() + com.github.rudroid.copilot.h1.i((this.b.hashCode() + ((m40Var == null ? 0 : m40Var.hashCode()) * 31)) * 31, this.c, 31);
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
