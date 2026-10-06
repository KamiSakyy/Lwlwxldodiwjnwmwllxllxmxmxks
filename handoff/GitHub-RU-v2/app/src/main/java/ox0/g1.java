package ox0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class g1 {
    public d1 a;
    public f1Shadow b;
    public String c;
    public String d;

    public g1(d1 d1Var, f1Shadow f1Var, String str, String str2) {
        this.a = d1Var;
        this.b = f1Var;
        this.c = str;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g1)) {
            return false;
        }
        g1 g1Var = (g1) obj;
        return k71.k.b(this.a, g1Var.a) && k71.k.b(this.b, g1Var.b) && k71.k.b(this.c, g1Var.c) && k71.k.b(this.d, g1Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + com.github.rudroid.copilot.h1.i((this.b.hashCode() + (Integer.hashCode(this.a.a) * 31)) * 31, this.c, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Viewer(inbox=");
        sb.append(this.a);
        sb.append(", notificationFilters=");
        sb.append(this.b);
        sb.append(", id=");
        return x.i.k(sb, this.c, ", __typename=", this.d, ")");
    }
}
