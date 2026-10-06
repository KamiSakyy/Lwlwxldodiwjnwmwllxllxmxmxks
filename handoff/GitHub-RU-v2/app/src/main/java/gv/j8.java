package gv;

/* loaded from: /home/user/work/p/classes3.dex */
public final class j8 {
    public final String a;
    public final i8 b;
    public final String c;

    public j8(String str, i8 i8Var, String str2) {
        this.a = str;
        this.b = i8Var;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j8)) {
            return false;
        }
        j8 j8Var = (j8) obj;
        return k71.k.b(this.a, j8Var.a) && k71.k.b(this.b, j8Var.b) && k71.k.b(this.c, j8Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + a0.s0.b(this.b.a, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Node(id=");
        sb.append(this.a);
        sb.append(", comments=");
        sb.append(this.b);
        sb.append(", __typename=");
        return com.github.rudroid.copilot.h1.p(sb, this.c, ")");
    }
}
