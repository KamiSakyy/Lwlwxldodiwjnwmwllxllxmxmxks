package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class j40 {
    public final String a;
    public final String b;
    public final o40 c;
    public final yf0.i d;

    public j40(String str, String str2, o40 o40Var, yf0.i iVar) {
        this.a = str;
        this.b = str2;
        this.c = o40Var;
        this.d = iVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j40)) {
            return false;
        }
        j40 j40Var = (j40) obj;
        return k71.k.b(this.a, j40Var.a) && k71.k.b(this.b, j40Var.b) && k71.k.b(this.c, j40Var.c) && k71.k.b(this.d, j40Var.d);
    }

    public final int hashCode() {
        int i = com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
        o40 o40Var = this.c;
        return this.d.hashCode() + ((i + (o40Var == null ? 0 : o40Var.hashCode())) * 31);
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
