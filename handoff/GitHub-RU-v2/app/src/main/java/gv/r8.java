package gv;

/* loaded from: /home/user/work/p/classes3.dex */
public final class r8 {
    public String a;
    public q8 b;
    public String c;

    public r8(String str, q8 q8Var, String str2) {
        this.a = str;
        this.b = q8Var;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r8)) {
            return false;
        }
        r8 r8Var = (r8) obj;
        return k71.k.b(this.a, r8Var.a) && k71.k.b(this.b, r8Var.b) && k71.k.b(this.c, r8Var.c);
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
