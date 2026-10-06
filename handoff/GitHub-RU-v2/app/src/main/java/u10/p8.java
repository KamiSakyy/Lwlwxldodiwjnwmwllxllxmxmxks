package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class p8 {
    public String a;
    public String b;
    public e30.a c;

    public p8(String str, String str2, e30.a aVar) {
        this.a = str;
        this.b = str2;
        this.c = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p8)) {
            return false;
        }
        p8 p8Var = (p8) obj;
        return k71.k.b(this.a, p8Var.a) && k71.k.b(this.b, p8Var.b) && k71.k.b(this.c, p8Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("Creator(__typename=", this.a, ", id=", this.b, ", actorFields=");
        o.append(this.c);
        o.append(")");
        return o.toString();
    }
}
