package zx;

/* loaded from: /home/user/work/p/classes3.dex */
public final class p1 {
    public String a;
    public String b;
    public q1 c;

    public p1(String str, String str2, q1 q1Var) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = str2;
        this.c = q1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p1)) {
            return false;
        }
        p1 p1Var = (p1) obj;
        return k71.k.b(this.a, p1Var.a) && k71.k.b(this.b, p1Var.b) && k71.k.b(this.c, p1Var.c);
    }

    public final int hashCode() {
        int i = com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
        q1 q1Var = this.c;
        return i + (q1Var == null ? 0 : q1Var.hashCode());
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("Node(__typename=", this.a, ", id=", this.b, ", onIssue=");
        o.append(this.c);
        o.append(")");
        return o.toString();
    }
}
