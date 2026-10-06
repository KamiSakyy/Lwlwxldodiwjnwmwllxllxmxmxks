package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class z30 {
    public final String a;
    public final String b;
    public final qw.f c;

    public z30(String str, String str2, qw.f fVar) {
        this.a = str;
        this.b = str2;
        this.c = fVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z30)) {
            return false;
        }
        z30 z30Var = (z30) obj;
        return k71.k.b(this.a, z30Var.a) && k71.k.b(this.b, z30Var.b) && k71.k.b(this.c, z30Var.c);
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
