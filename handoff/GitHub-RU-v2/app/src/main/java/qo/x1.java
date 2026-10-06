package qo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class x1 {
    public final String a;
    public final String b;
    public final y1 c;

    public x1(String str, String str2, y1 y1Var) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = str2;
        this.c = y1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x1)) {
            return false;
        }
        x1 x1Var = (x1) obj;
        return k71.k.b(this.a, x1Var.a) && k71.k.b(this.b, x1Var.b) && k71.k.b(this.c, x1Var.c);
    }

    public final int hashCode() {
        int i = com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
        y1 y1Var = this.c;
        return i + (y1Var == null ? 0 : y1Var.hashCode());
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("Node(__typename=", this.a, ", id=", this.b, ", onCommit=");
        o.append(this.c);
        o.append(")");
        return o.toString();
    }
}
