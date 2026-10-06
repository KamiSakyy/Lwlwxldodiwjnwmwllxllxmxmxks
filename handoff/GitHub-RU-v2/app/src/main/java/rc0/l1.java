package rc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class l1 {
    public final String a;
    public final String b;
    public final m1 c;

    public l1(String str, String str2, m1 m1Var) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = str2;
        this.c = m1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l1)) {
            return false;
        }
        l1 l1Var = (l1) obj;
        return k71.k.b(this.a, l1Var.a) && k71.k.b(this.b, l1Var.b) && k71.k.b(this.c, l1Var.c);
    }

    public final int hashCode() {
        int i = com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
        m1 m1Var = this.c;
        return i + (m1Var == null ? 0 : m1Var.hashCode());
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("Node(__typename=", this.a, ", id=", this.b, ", onCheckSuite=");
        o.append(this.c);
        o.append(")");
        return o.toString();
    }
}
