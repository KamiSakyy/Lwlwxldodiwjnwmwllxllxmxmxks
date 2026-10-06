package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class g80 {
    public final String a;
    public final String b;
    public final l80 c;
    public final er0.i d;

    public g80(String str, String str2, l80 l80Var, er0.i iVar) {
        this.a = str;
        this.b = str2;
        this.c = l80Var;
        this.d = iVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g80)) {
            return false;
        }
        g80 g80Var = (g80) obj;
        return k71.k.b(this.a, g80Var.a) && k71.k.b(this.b, g80Var.b) && k71.k.b(this.c, g80Var.c) && k71.k.b(this.d, g80Var.d);
    }

    public final int hashCode() {
        int i = com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
        l80 l80Var = this.c;
        return this.d.hashCode() + ((i + (l80Var == null ? 0 : l80Var.hashCode())) * 31);
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
