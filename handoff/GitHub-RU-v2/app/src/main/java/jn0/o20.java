package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class o20 {
    public l20 a;
    public String b;
    public String c;

    public o20(l20 l20Var, String str, String str2) {
        this.a = l20Var;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o20)) {
            return false;
        }
        o20 o20Var = (o20) obj;
        return k71.k.b(this.a, o20Var.a) && k71.k.b(this.b, o20Var.b) && k71.k.b(this.c, o20Var.c);
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
