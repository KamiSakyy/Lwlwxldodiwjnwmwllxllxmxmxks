package ap0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class o1 {
    public final String a;
    public final String b;
    public final cp0.c c;

    public o1(String str, String str2, cp0.c cVar) {
        this.a = str;
        this.b = str2;
        this.c = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o1)) {
            return false;
        }
        o1 o1Var = (o1) obj;
        return k71.k.b(this.a, o1Var.a) && k71.k.b(this.b, o1Var.b) && k71.k.b(this.c, o1Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
    }

    public final String toString() {
        return f1.e.m(a0.s0.o("Actor(__typename=", this.a, ", id=", this.b, ", actorFields="), this.c, ")");
    }
}
