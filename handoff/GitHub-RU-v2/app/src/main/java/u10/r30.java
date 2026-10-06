package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class r30 {
    public final String a;
    public final String b;
    public final i50.h c;
    public final i80.c d;
    public final i50.n e;

    public r30(String str, String str2, i50.h hVar, i80.c cVar, i50.n nVar) {
        this.a = str;
        this.b = str2;
        this.c = hVar;
        this.d = cVar;
        this.e = nVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r30)) {
            return false;
        }
        r30 r30Var = (r30) obj;
        return k71.k.b(this.a, r30Var.a) && k71.k.b(this.b, r30Var.b) && k71.k.b(this.c, r30Var.c) && k71.k.b(this.d, r30Var.d) && k71.k.b(this.e, r30Var.e);
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
