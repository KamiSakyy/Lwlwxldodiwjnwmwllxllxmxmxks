package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class dw {
    public String a;
    public String b;
    public xt0.p2 c;

    public dw(String str, String str2, xt0.p2 p2Var) {
        this.a = str;
        this.b = str2;
        this.c = p2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dw)) {
            return false;
        }
        dw dwVar = (dw) obj;
        return k71.k.b(this.a, dwVar.a) && k71.k.b(this.b, dwVar.b) && k71.k.b(this.c, dwVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("PullRequest(__typename=", this.a, ", id=", this.b, ", pullRequestItemFragment=");
        o.append(this.c);
        o.append(")");
        return o.toString();
    }
}
