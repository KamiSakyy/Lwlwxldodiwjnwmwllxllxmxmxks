package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class x0 {
    public String a;
    public String b;
    public gv.y7 c;

    public x0(String str, String str2, gv.y7 y7Var) {
        this.a = str;
        this.b = str2;
        this.c = y7Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x0)) {
            return false;
        }
        x0 x0Var = (x0) obj;
        return k71.k.b(this.a, x0Var.a) && k71.k.b(this.b, x0Var.b) && k71.k.b(this.c, x0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("Node(__typename=", this.a, ", id=", this.b, ", reviewThreadCommentFragment=");
        o.append(this.c);
        o.append(")");
        return o.toString();
    }
}
