package is;

/* loaded from: /home/user/work/p/classes3.dex */
public final class g0 {
    public String a;
    public String b;
    public n0 c;
    public ms.i d;

    public g0(String str, String str2, n0 n0Var, ms.i iVar) {
        this.a = str;
        this.b = str2;
        this.c = n0Var;
        this.d = iVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g0)) {
            return false;
        }
        g0 g0Var = (g0) obj;
        return k71.k.b(this.a, g0Var.a) && k71.k.b(this.b, g0Var.b) && k71.k.b(this.c, g0Var.c) && k71.k.b(this.d, g0Var.d);
    }

    public final int hashCode() {
        int i = com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
        n0 n0Var = this.c;
        return this.d.hashCode() + ((i + (n0Var == null ? 0 : n0Var.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("Answer(__typename=", this.a, ", id=", this.b, ", replyTo=");
        o.append(this.c);
        o.append(", discussionCommentFragment=");
        o.append(this.d);
        o.append(")");
        return o.toString();
    }
}
