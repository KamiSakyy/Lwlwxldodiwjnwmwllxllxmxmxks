package b20;

/* loaded from: /home/user/work/p/classes3.dex */
public final class j2 {
    public String a;
    public String b;
    public k2 c;

    public j2(String str, String str2, k2 k2Var) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = str2;
        this.c = k2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j2)) {
            return false;
        }
        j2 j2Var = (j2) obj;
        return k71.k.b(this.a, j2Var.a) && k71.k.b(this.b, j2Var.b) && k71.k.b(this.c, j2Var.c);
    }

    public final int hashCode() {
        int i = com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
        k2 k2Var = this.c;
        return i + (k2Var == null ? 0 : k2Var.hashCode());
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("Node(__typename=", this.a, ", id=", this.b, ", onWorkflow=");
        o.append(this.c);
        o.append(")");
        return o.toString();
    }
}
