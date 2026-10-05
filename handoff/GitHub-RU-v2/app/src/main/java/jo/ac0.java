package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class ac0 {
    public final String a;
    public final String b;
    public final ms.i c;
    public final pv.c d;
    public final ms.o e;

    public ac0(String str, String str2, ms.i iVar, pv.c cVar, ms.o oVar) {
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
        if (!(obj instanceof ac0)) {
            return false;
        }
        ac0 ac0Var = (ac0) obj;
        return k71.k.b(this.a, ac0Var.a) && k71.k.b(this.b, ac0Var.b) && k71.k.b(this.c, ac0Var.c) && k71.k.b(this.d, ac0Var.d) && k71.k.b(this.e, ac0Var.e);
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
