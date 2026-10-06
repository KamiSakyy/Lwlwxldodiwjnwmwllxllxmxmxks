package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class p50 {
    public String a;
    public String b;
    public yf0.i c;
    public aj0.c d;
    public yf0.o e;

    public p50(String str, String str2, yf0.i iVar, aj0.c cVar, yf0.o oVar) {
        this.a = str;
        this.b = str2;
        this.c = iVar;
        this.d = cVar;
        this.e = oVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p50)) {
            return false;
        }
        p50 p50Var = (p50) obj;
        return k71.k.b(this.a, p50Var.a) && k71.k.b(this.b, p50Var.b) && k71.k.b(this.c, p50Var.c) && k71.k.b(this.d, p50Var.d) && k71.k.b(this.e, p50Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("Comment(__typename=", this.a, ", id=", this.b, ", discussionCommentFragment=");
        o.append(this.c);
        o.append(", reactionFragment=");
        o.append(this.d);
        o.append(", discussionCommentRepliesFragment=");
        o.append(this.e);
        o.append(")");
        return o.toString();
    }
}
