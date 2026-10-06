package qo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class a1 {
    public String a;
    public String b;
    public b1 c;

    public a1(String str, String str2, b1 b1Var) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = str2;
        this.c = b1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a1)) {
            return false;
        }
        a1 a1Var = (a1) obj;
        return k71.k.b(this.a, a1Var.a) && k71.k.b(this.b, a1Var.b) && k71.k.b(this.c, a1Var.c);
    }

    public final int hashCode() {
        int i = com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
        b1 b1Var = this.c;
        return i + (b1Var == null ? 0 : b1Var.hashCode());
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("Node(__typename=", this.a, ", id=", this.b, ", onCheckSuite=");
        o.append(this.c);
        o.append(")");
        return o.toString();
    }
}
