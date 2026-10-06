package qo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class x2 {
    public String a;
    public String b;
    public y2 c;

    public x2(String str, String str2, y2 y2Var) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = str2;
        this.c = y2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x2)) {
            return false;
        }
        x2 x2Var = (x2) obj;
        return k71.k.b(this.a, x2Var.a) && k71.k.b(this.b, x2Var.b) && k71.k.b(this.c, x2Var.c);
    }

    public final int hashCode() {
        int i = com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
        y2 y2Var = this.c;
        return i + (y2Var == null ? 0 : y2Var.hashCode());
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("Node(__typename=", this.a, ", id=", this.b, ", onWorkflow=");
        o.append(this.c);
        o.append(")");
        return o.toString();
    }
}
