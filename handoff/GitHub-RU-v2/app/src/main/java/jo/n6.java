package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class n6 {
    public final String a;
    public final h6 b;
    public final String c;

    public n6(String str, h6 h6Var, String str2) {
        this.a = str;
        this.b = h6Var;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n6)) {
            return false;
        }
        n6 n6Var = (n6) obj;
        return k71.k.b(this.a, n6Var.a) && k71.k.b(this.b, n6Var.b) && k71.k.b(this.c, n6Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Node1(id=");
        sb.append(this.a);
        sb.append(", commit=");
        sb.append(this.b);
        sb.append(", __typename=");
        return com.github.rudroid.copilot.h1.p(sb, this.c, ")");
    }
}
