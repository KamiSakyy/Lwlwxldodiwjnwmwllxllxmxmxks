package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class m90 {
    public String a;
    public String b;
    public er0.i c;
    public gu0.c d;
    public er0.o e;

    public m90(String str, String str2, er0.i iVar, gu0.c cVar, er0.o oVar) {
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
        if (!(obj instanceof m90)) {
            return false;
        }
        m90 m90Var = (m90) obj;
        return k71.k.b(this.a, m90Var.a) && k71.k.b(this.b, m90Var.b) && k71.k.b(this.c, m90Var.c) && k71.k.b(this.d, m90Var.d) && k71.k.b(this.e, m90Var.e);
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
