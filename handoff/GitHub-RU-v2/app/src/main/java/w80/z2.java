package w80;

/* loaded from: /home/user/work/p/classes3.dex */
public final class z2 {
    public x2 a;
    public a3 b;
    public String c;
    public String d;

    public z2(x2 x2Var, a3 a3Var, String str, String str2) {
        this.a = x2Var;
        this.b = a3Var;
        this.c = str;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z2)) {
            return false;
        }
        z2 z2Var = (z2) obj;
        return k71.k.b(this.a, z2Var.a) && k71.k.b(this.b, z2Var.b) && k71.k.b(this.c, z2Var.c) && k71.k.b(this.d, z2Var.d);
    }

    public final int hashCode() {
        x2 x2Var = this.a;
        return this.d.hashCode() + com.github.rudroid.copilot.h1.i((this.b.hashCode() + ((x2Var == null ? 0 : x2Var.hashCode()) * 31)) * 31, this.c, 31);
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
