package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class q4 {
    public String a;
    public String b;
    public s4 c;

    public q4(String str, String str2, s4 s4Var) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = str2;
        this.c = s4Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q4)) {
            return false;
        }
        q4 q4Var = (q4) obj;
        return k71.k.b(this.a, q4Var.a) && k71.k.b(this.b, q4Var.b) && k71.k.b(this.c, q4Var.c);
    }

    public final int hashCode() {
        int i = com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
        s4 s4Var = this.c;
        return i + (s4Var == null ? 0 : s4Var.hashCode());
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("Node(__typename=", this.a, ", id=", this.b, ", onPullRequest=");
        o.append(this.c);
        o.append(")");
        return o.toString();
    }
}
