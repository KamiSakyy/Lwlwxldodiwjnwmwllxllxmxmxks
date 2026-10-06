package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class x7 {
    public String a;
    public String b;
    public yf0.o c;

    public x7(String str, String str2, yf0.o oVar) {
        this.a = str;
        this.b = str2;
        this.c = oVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x7)) {
            return false;
        }
        x7 x7Var = (x7) obj;
        return k71.k.b(this.a, x7Var.a) && k71.k.b(this.b, x7Var.b) && k71.k.b(this.c, x7Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("ReplyTo(__typename=", this.a, ", id=", this.b, ", discussionCommentRepliesFragment=");
        o.append(this.c);
        o.append(")");
        return o.toString();
    }
}
