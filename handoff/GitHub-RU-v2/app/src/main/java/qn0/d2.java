package qn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class d2 {
    public String a;
    public String b;
    public e2 c;

    public d2(String str, String str2, e2 e2Var) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = str2;
        this.c = e2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d2)) {
            return false;
        }
        d2 d2Var = (d2) obj;
        return k71.k.b(this.a, d2Var.a) && k71.k.b(this.b, d2Var.b) && k71.k.b(this.c, d2Var.c);
    }

    public final int hashCode() {
        int i = com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
        e2 e2Var = this.c;
        return i + (e2Var == null ? 0 : e2Var.hashCode());
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("Node(__typename=", this.a, ", id=", this.b, ", onWorkflow=");
        o.append(this.c);
        o.append(")");
        return o.toString();
    }
}
