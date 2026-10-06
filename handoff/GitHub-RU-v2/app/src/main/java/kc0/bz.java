package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class bz {
    public final String a;
    public final String b;
    public final ri0.p2 c;

    public bz(String str, String str2, ri0.p2 p2Var) {
        this.a = str;
        this.b = str2;
        this.c = p2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bz)) {
            return false;
        }
        bz bzVar = (bz) obj;
        return k71.k.b(this.a, bzVar.a) && k71.k.b(this.b, bzVar.b) && k71.k.b(this.c, bzVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("OnPullRequest(__typename=", this.a, ", id=", this.b, ", pullRequestItemFragment=");
        o.append(this.c);
        o.append(")");
        return o.toString();
    }
}
