package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class a3 implements aa.v0 {
    public final l3 a;
    public final c3 b;
    public final String c;
    public final String d;

    public a3(l3 l3Var, c3 c3Var, String str, String str2) {
        this.a = l3Var;
        this.b = c3Var;
        this.c = str;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a3)) {
            return false;
        }
        a3 a3Var = (a3) obj;
        return k71.k.b(this.a, a3Var.a) && k71.k.b(this.b, a3Var.b) && k71.k.b(this.c, a3Var.c) && k71.k.b(this.d, a3Var.d);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        c3 c3Var = this.b;
        return this.d.hashCode() + com.github.rudroid.copilot.h1.i((hashCode + (c3Var == null ? 0 : c3Var.hashCode())) * 31, this.c, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Data(viewer=");
        sb.append(this.a);
        sb.append(", node=");
        sb.append(this.b);
        sb.append(", id=");
        return x.i.k(sb, this.c, ", __typename=", this.d, ")");
    }
}
