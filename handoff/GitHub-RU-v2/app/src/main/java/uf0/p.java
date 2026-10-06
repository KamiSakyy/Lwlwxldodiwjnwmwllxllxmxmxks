package uf0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class p {
    public final String a;
    public final String b;
    public final yf0.i c;
    public final aj0.c d;
    public final yf0.o e;

    public p(String str, String str2, yf0.i iVar, aj0.c cVar, yf0.o oVar) {
        k71.k.g(str, "__typename");
        k71.k.g(iVar, "discussionCommentFragment");
        this.a = str;
        this.b = str2;
        this.c = iVar;
        this.d = cVar;
        this.e = oVar;
    }

    public static p a(p pVar, yf0.i iVar, yf0.o oVar, int i) {
        String str = pVar.a;
        String str2 = pVar.b;
        aj0.c cVar = pVar.d;
        if ((i & 16) != 0) {
            oVar = pVar.e;
        }
        pVar.getClass();
        k71.k.g(str, "__typename");
        return new p(str, str2, iVar, cVar, oVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return k71.k.b(this.a, pVar.a) && k71.k.b(this.b, pVar.b) && k71.k.b(this.c, pVar.c) && k71.k.b(this.d, pVar.d) && k71.k.b(this.e, pVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("Node(__typename=", this.a, ", id=", this.b, ", discussionCommentFragment=");
        o.append(this.c);
        o.append(", reactionFragment=");
        o.append(this.d);
        o.append(", discussionCommentRepliesFragment=");
        o.append(this.e);
        o.append(")");
        return o.toString();
    }
}
