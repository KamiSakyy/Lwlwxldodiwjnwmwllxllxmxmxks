package e50;

import com.github.rudroid.copilot.h1;

/* loaded from: /home/user/work/p/classes3.dex */
public final class n {
    public final String a;
    public final String b;
    public final i50.h c;
    public final i80.c d;
    public final i50.n e;

    public n(String str, String str2, i50.h hVar, i80.c cVar, i50.n nVar) {
        k71.k.g(str, "__typename");
        k71.k.g(hVar, "discussionCommentFragment");
        this.a = str;
        this.b = str2;
        this.c = hVar;
        this.d = cVar;
        this.e = nVar;
    }

    public static n a(n nVar, i50.h hVar, i50.n nVar2, int i) {
        String str = nVar.a;
        String str2 = nVar.b;
        i80.c cVar = nVar.d;
        if ((i & 16) != 0) {
            nVar2 = nVar.e;
        }
        nVar.getClass();
        k71.k.g(str, "__typename");
        return new n(str, str2, hVar, cVar, nVar2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return k71.k.b(this.a, nVar.a) && k71.k.b(this.b, nVar.b) && k71.k.b(this.c, nVar.c) && k71.k.b(this.d, nVar.d) && k71.k.b(this.e, nVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + h1.i(this.a.hashCode() * 31, this.b, 31)) * 31)) * 31);
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
