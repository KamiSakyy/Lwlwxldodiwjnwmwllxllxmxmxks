package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class p00 {
    public final String a;
    public final String b;
    public final er.l1 c;

    public p00(String str, String str2, er.l1 l1Var) {
        this.a = str;
        this.b = str2;
        this.c = l1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p00)) {
            return false;
        }
        p00 p00Var = (p00) obj;
        return k71.k.b(this.a, p00Var.a) && k71.k.b(this.b, p00Var.b) && k71.k.b(this.c, p00Var.c);
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
