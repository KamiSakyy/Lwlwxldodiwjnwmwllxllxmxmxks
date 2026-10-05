package qn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class m2 {
    public final String a;
    public final String b;
    public final n2 c;

    public m2(String str, String str2, n2 n2Var) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = str2;
        this.c = n2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m2)) {
            return false;
        }
        m2 m2Var = (m2) obj;
        return k71.k.b(this.a, m2Var.a) && k71.k.b(this.b, m2Var.b) && k71.k.b(this.c, m2Var.c);
    }

    public final int hashCode() {
        int i = com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
        n2 n2Var = this.c;
        return i + (n2Var == null ? 0 : n2Var.hashCode());
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("Node(__typename=", this.a, ", id=", this.b, ", onWorkflow=");
        o.append(this.c);
        o.append(")");
        return o.toString();
    }
}
