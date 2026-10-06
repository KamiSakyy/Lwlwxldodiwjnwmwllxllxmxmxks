package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class ph0 {
    public final String a;
    public final String b;
    public final qx.c c;

    public ph0(String str, String str2, qx.c cVar) {
        this.a = str;
        this.b = str2;
        this.c = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ph0)) {
            return false;
        }
        ph0 ph0Var = (ph0) obj;
        return k71.k.b(this.a, ph0Var.a) && k71.k.b(this.b, ph0Var.b) && k71.k.b(this.c, ph0Var.c);
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
