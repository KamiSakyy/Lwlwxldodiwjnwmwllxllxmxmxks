package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class h6 {
    public final String a;
    public final String b;
    public final er.l1 c;

    public h6(String str, String str2, er.l1 l1Var) {
        this.a = str;
        this.b = str2;
        this.c = l1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h6)) {
            return false;
        }
        h6 h6Var = (h6) obj;
        return k71.k.b(this.a, h6Var.a) && k71.k.b(this.b, h6Var.b) && k71.k.b(this.c, h6Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("Commit(__typename=", this.a, ", id=", this.b, ", commitFields=");
        o.append(this.c);
        o.append(")");
        return o.toString();
    }
}
