package gv;

/* loaded from: /home/user/work/p/classes3.dex */
public final class b0 {
    public final String a;
    public final String b;
    public final y7 c;

    public b0(String str, String str2, y7 y7Var) {
        this.a = str;
        this.b = str2;
        this.c = y7Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b0)) {
            return false;
        }
        b0 b0Var = (b0) obj;
        return k71.k.b(this.a, b0Var.a) && k71.k.b(this.b, b0Var.b) && k71.k.b(this.c, b0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("Node1(__typename=", this.a, ", id=", this.b, ", reviewThreadCommentFragment=");
        o.append(this.c);
        o.append(")");
        return o.toString();
    }
}
