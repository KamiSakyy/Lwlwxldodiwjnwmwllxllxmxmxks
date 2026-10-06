package z70;

/* loaded from: /home/user/work/p/classes3.dex */
public final class q4 {
    public String a;
    public String b;
    public c90.d c;

    public q4(String str, String str2, c90.d dVar) {
        this.a = str;
        this.b = str2;
        this.c = dVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q4)) {
            return false;
        }
        q4 q4Var = (q4) obj;
        return k71.k.b(this.a, q4Var.a) && k71.k.b(this.b, q4Var.b) && k71.k.b(this.c, q4Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("Node2(__typename=", this.a, ", id=", this.b, ", reviewRequestFields=");
        o.append(this.c);
        o.append(")");
        return o.toString();
    }
}
