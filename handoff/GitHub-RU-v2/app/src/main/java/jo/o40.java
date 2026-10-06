package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class o40 {
    public final l40 a;
    public final String b;
    public final String c;

    public o40(l40 l40Var, String str, String str2) {
        this.a = l40Var;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o40)) {
            return false;
        }
        o40 o40Var = (o40) obj;
        return k71.k.b(this.a, o40Var.a) && k71.k.b(this.b, o40Var.b) && k71.k.b(this.c, o40Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Node(issue=");
        sb.append(this.a);
        sb.append(", id=");
        sb.append(this.b);
        sb.append(", __typename=");
        return com.github.rudroid.copilot.h1.p(sb, this.c, ")");
    }
}
