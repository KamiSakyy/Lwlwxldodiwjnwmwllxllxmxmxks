package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class rl {
    public final String a;
    public final String b;
    public final tl c;
    public final ul d;
    public final sl e;

    public rl(String str, String str2, tl tlVar, ul ulVar, sl slVar) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = str2;
        this.c = tlVar;
        this.d = ulVar;
        this.e = slVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rl)) {
            return false;
        }
        rl rlVar = (rl) obj;
        return k71.k.b(this.a, rlVar.a) && k71.k.b(this.b, rlVar.b) && k71.k.b(this.c, rlVar.c) && k71.k.b(this.d, rlVar.d) && k71.k.b(this.e, rlVar.e);
    }

    public final int hashCode() {
        int i = com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
        tl tlVar = this.c;
        int hashCode = (i + (tlVar == null ? 0 : tlVar.hashCode())) * 31;
        ul ulVar = this.d;
        int hashCode2 = (hashCode + (ulVar == null ? 0 : ulVar.hashCode())) * 31;
        sl slVar = this.e;
        return hashCode2 + (slVar != null ? slVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("Node(__typename=", this.a, ", id=", this.b, ", onIssue=");
        o.append(this.c);
        o.append(", onPullRequest=");
        o.append(this.d);
        o.append(", onDiscussion=");
        o.append(this.e);
        o.append(")");
        return o.toString();
    }
}
