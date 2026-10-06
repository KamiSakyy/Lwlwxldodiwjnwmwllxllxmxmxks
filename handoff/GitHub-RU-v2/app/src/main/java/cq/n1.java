package cq;

/* loaded from: /home/user/work/p/classes3.dex */
public final class n1 {
    public String a;
    public String b;
    public w6 c;

    public n1(String str, String str2, w6 w6Var) {
        this.a = str;
        this.b = str2;
        this.c = w6Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n1)) {
            return false;
        }
        n1 n1Var = (n1) obj;
        return k71.k.b(this.a, n1Var.a) && k71.k.b(this.b, n1Var.b) && k71.k.b(this.c, n1Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("Follower(__typename=", this.a, ", id=", this.b, ", userFeedFragment=");
        o.append(this.c);
        o.append(")");
        return o.toString();
    }
}
