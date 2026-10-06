package qo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class r2 {
    public String a;
    public String b;
    public s2 c;

    public r2(String str, String str2, s2 s2Var) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = str2;
        this.c = s2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r2)) {
            return false;
        }
        r2 r2Var = (r2) obj;
        return k71.k.b(this.a, r2Var.a) && k71.k.b(this.b, r2Var.b) && k71.k.b(this.c, r2Var.c);
    }

    public final int hashCode() {
        int i = com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
        s2 s2Var = this.c;
        return i + (s2Var == null ? 0 : s2Var.hashCode());
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("Node(__typename=", this.a, ", id=", this.b, ", onWorkflow=");
        o.append(this.c);
        o.append(")");
        return o.toString();
    }
}
