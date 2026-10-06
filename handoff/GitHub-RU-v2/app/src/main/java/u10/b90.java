package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class b90 {
    public String a;
    public String b;
    public ea0.c c;

    public b90(String str, String str2, ea0.c cVar) {
        this.a = str;
        this.b = str2;
        this.c = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b90)) {
            return false;
        }
        b90 b90Var = (b90) obj;
        return k71.k.b(this.a, b90Var.a) && k71.k.b(this.b, b90Var.b) && k71.k.b(this.c, b90Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("Viewer(__typename=", this.a, ", id=", this.b, ", homeNavLinks=");
        o.append(this.c);
        o.append(")");
        return o.toString();
    }
}
