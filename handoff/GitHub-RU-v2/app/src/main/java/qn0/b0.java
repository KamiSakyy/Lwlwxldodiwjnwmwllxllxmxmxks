package qn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class b0 {
    public String a;
    public String b;
    public c0 c;

    public b0(String str, String str2, c0 c0Var) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = str2;
        this.c = c0Var;
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
        int i = com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
        c0 c0Var = this.c;
        return i + (c0Var == null ? 0 : c0Var.hashCode());
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("Node(__typename=", this.a, ", id=", this.b, ", onCheckRun=");
        o.append(this.c);
        o.append(")");
        return o.toString();
    }
}
