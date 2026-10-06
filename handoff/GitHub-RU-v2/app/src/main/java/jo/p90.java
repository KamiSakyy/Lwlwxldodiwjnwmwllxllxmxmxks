package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class p90 {
    public String a;
    public String b;
    public qw.f c;

    public p90(String str, String str2, qw.f fVar) {
        this.a = str;
        this.b = str2;
        this.c = fVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p90)) {
            return false;
        }
        p90 p90Var = (p90) obj;
        return k71.k.b(this.a, p90Var.a) && k71.k.b(this.b, p90Var.b) && k71.k.b(this.c, p90Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("Thread(__typename=", this.a, ", id=", this.b, ", reviewThreadFragment=");
        o.append(this.c);
        o.append(")");
        return o.toString();
    }
}
