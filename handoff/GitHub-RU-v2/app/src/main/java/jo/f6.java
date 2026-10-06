package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class f6 {
    public String a;
    public String b;
    public er.b0 c;

    public f6(String str, String str2, er.b0 b0Var) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = str2;
        this.c = b0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f6)) {
            return false;
        }
        f6 f6Var = (f6) obj;
        return k71.k.b(this.a, f6Var.a) && k71.k.b(this.b, f6Var.b) && k71.k.b(this.c, f6Var.c);
    }

    public final int hashCode() {
        int i = com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
        er.b0 b0Var = this.c;
        return i + (b0Var == null ? 0 : b0Var.hashCode());
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("Node(__typename=", this.a, ", id=", this.b, ", commitDetailFields=");
        o.append(this.c);
        o.append(")");
        return o.toString();
    }
}
