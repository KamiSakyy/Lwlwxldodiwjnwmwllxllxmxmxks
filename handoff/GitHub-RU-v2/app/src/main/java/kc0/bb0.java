package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class bb0 {
    public String a;
    public String b;
    public wk0.c c;

    public bb0(String str, String str2, wk0.c cVar) {
        this.a = str;
        this.b = str2;
        this.c = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bb0)) {
            return false;
        }
        bb0 bb0Var = (bb0) obj;
        return k71.k.b(this.a, bb0Var.a) && k71.k.b(this.b, bb0Var.b) && k71.k.b(this.c, bb0Var.c);
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
