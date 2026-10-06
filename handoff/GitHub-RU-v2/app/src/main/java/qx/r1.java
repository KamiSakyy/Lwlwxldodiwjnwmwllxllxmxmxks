package qx;

/* loaded from: /home/user/work/p/classes3.dex */
public final class r1 {
    public final String a;
    public final String b;
    public final n0 c;

    public r1(String str, String str2, n0 n0Var) {
        this.a = str;
        this.b = str2;
        this.c = n0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r1)) {
            return false;
        }
        r1 r1Var = (r1) obj;
        return k71.k.b(this.a, r1Var.a) && k71.k.b(this.b, r1Var.b) && k71.k.b(this.c, r1Var.c);
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
