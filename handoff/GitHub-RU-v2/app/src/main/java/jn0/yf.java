package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class yf {
    public String a;
    public String b;
    public cq0.l1 c;

    public yf(String str, String str2, cq0.l1 l1Var) {
        this.a = str;
        this.b = str2;
        this.c = l1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yf)) {
            return false;
        }
        yf yfVar = (yf) obj;
        return k71.k.b(this.a, yfVar.a) && k71.k.b(this.b, yfVar.b) && k71.k.b(this.c, yfVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("Node(__typename=", this.a, ", id=", this.b, ", commitFields=");
        o.append(this.c);
        o.append(")");
        return o.toString();
    }
}
