package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class z10 {
    public String a;
    public String b;
    public hv0.f c;

    public z10(String str, String str2, hv0.f fVar) {
        this.a = str;
        this.b = str2;
        this.c = fVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z10)) {
            return false;
        }
        z10 z10Var = (z10) obj;
        return k71.k.b(this.a, z10Var.a) && k71.k.b(this.b, z10Var.b) && k71.k.b(this.c, z10Var.c);
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
