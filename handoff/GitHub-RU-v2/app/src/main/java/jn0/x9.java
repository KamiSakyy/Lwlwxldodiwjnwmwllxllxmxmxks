package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class x9 {
    public String a;
    public String b;
    public y9 c;

    public x9(String str, String str2, y9 y9Var) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = str2;
        this.c = y9Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x9)) {
            return false;
        }
        x9 x9Var = (x9) obj;
        return k71.k.b(this.a, x9Var.a) && k71.k.b(this.b, x9Var.b) && k71.k.b(this.c, x9Var.c);
    }

    public final int hashCode() {
        int i = com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
        y9 y9Var = this.c;
        return i + (y9Var == null ? 0 : y9Var.hashCode());
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("Node(__typename=", this.a, ", id=", this.b, ", onCheckSuite=");
        o.append(this.c);
        o.append(")");
        return o.toString();
    }
}
