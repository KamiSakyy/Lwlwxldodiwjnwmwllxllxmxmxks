package cq;

/* loaded from: /home/user/work/p/classes3.dex */
public final class g2 {
    public final String a;
    public final String b;
    public final eq.c c;

    public g2(String str, String str2, eq.c cVar) {
        this.a = str;
        this.b = str2;
        this.c = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g2)) {
            return false;
        }
        g2 g2Var = (g2) obj;
        return k71.k.b(this.a, g2Var.a) && k71.k.b(this.b, g2Var.b) && k71.k.b(this.c, g2Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("Actor(__typename=", this.a, ", id=", this.b, ", actorFields=");
        o.append(this.c);
        o.append(")");
        return o.toString();
    }
}
