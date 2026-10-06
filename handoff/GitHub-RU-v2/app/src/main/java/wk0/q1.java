package wk0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class q1 {
    public String a;
    public String b;
    public n0 c;

    public q1(String str, String str2, n0 n0Var) {
        this.a = str;
        this.b = str2;
        this.c = n0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q1)) {
            return false;
        }
        q1 q1Var = (q1) obj;
        return k71.k.b(this.a, q1Var.a) && k71.k.b(this.b, q1Var.b) && k71.k.b(this.c, q1Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("Status(__typename=", this.a, ", id=", this.b, ", profileStatusFragment=");
        o.append(this.c);
        o.append(")");
        return o.toString();
    }
}
