package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class p7 {
    public final String a;
    public final String b;
    public final i50.n c;

    public p7(String str, String str2, i50.n nVar) {
        this.a = str;
        this.b = str2;
        this.c = nVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p7)) {
            return false;
        }
        p7 p7Var = (p7) obj;
        return k71.k.b(this.a, p7Var.a) && k71.k.b(this.b, p7Var.b) && k71.k.b(this.c, p7Var.c);
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
