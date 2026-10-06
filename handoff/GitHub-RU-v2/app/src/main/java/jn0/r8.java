package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class r8 {
    public String a;
    public String b;
    public er0.o c;

    public r8(String str, String str2, er0.o oVar) {
        this.a = str;
        this.b = str2;
        this.c = oVar;
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
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("ReplyTo(__typename=", this.a, ", id=", this.b, ", discussionCommentRepliesFragment=");
        o.append(this.c);
        o.append(")");
        return o.toString();
    }
}
