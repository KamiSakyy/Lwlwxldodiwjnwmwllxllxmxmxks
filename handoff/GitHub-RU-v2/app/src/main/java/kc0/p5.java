package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class p5 {
    public final String a;
    public final String b;
    public final we0.b0 c;

    public p5(String str, String str2, we0.b0 b0Var) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = str2;
        this.c = b0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p5)) {
            return false;
        }
        p5 p5Var = (p5) obj;
        return k71.k.b(this.a, p5Var.a) && k71.k.b(this.b, p5Var.b) && k71.k.b(this.c, p5Var.c);
    }

    public final int hashCode() {
        int i = com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
        we0.b0 b0Var = this.c;
        return i + (b0Var == null ? 0 : b0Var.hashCode());
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("Node(__typename=", this.a, ", id=", this.b, ", commitDetailFields=");
        o.append(this.c);
        o.append(")");
        return o.toString();
    }
}
