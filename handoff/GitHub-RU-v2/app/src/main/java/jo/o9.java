package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class o9 {
    public final String a;
    public final String b;
    public final ms.o c;

    public o9(String str, String str2, ms.o oVar) {
        this.a = str;
        this.b = str2;
        this.c = oVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o9)) {
            return false;
        }
        o9 o9Var = (o9) obj;
        return k71.k.b(this.a, o9Var.a) && k71.k.b(this.b, o9Var.b) && k71.k.b(this.c, o9Var.c);
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
