package z70;

/* loaded from: /home/user/work/p/classes3.dex */
public final class p4 {
    public e4 a;
    public z4 b;
    public String c;
    public String d;

    public p4(e4 e4Var, z4 z4Var, String str, String str2) {
        this.a = e4Var;
        this.b = z4Var;
        this.c = str;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p4)) {
            return false;
        }
        p4 p4Var = (p4) obj;
        return k71.k.b(this.a, p4Var.a) && k71.k.b(this.b, p4Var.b) && k71.k.b(this.c, p4Var.c) && k71.k.b(this.d, p4Var.d);
    }

    public final int hashCode() {
        e4 e4Var = this.a;
        return this.d.hashCode() + com.github.rudroid.copilot.h1.i((this.b.hashCode() + ((e4Var == null ? 0 : e4Var.hashCode()) * 31)) * 31, this.c, 31);
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
