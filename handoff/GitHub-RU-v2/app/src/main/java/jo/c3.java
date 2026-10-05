package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class c3 {
    public final String a;
    public final String b;
    public final h3 c;
    public final d3 d;

    public c3(String str, String str2, h3 h3Var, d3 d3Var) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = str2;
        this.c = h3Var;
        this.d = d3Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c3)) {
            return false;
        }
        c3 c3Var = (c3) obj;
        return k71.k.b(this.a, c3Var.a) && k71.k.b(this.b, c3Var.b) && k71.k.b(this.c, c3Var.c) && k71.k.b(this.d, c3Var.d);
    }

    public final int hashCode() {
        int i = com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
        h3 h3Var = this.c;
        int hashCode = (i + (h3Var == null ? 0 : h3Var.a.hashCode())) * 31;
        d3 d3Var = this.d;
        return hashCode + (d3Var != null ? d3Var.a.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("Node(__typename=", this.a, ", id=", this.b, ", onRepositoryNode=");
        o.append(this.c);
        o.append(", onAssignable=");
        o.append(this.d);
        o.append(")");
        return o.toString();
    }
}
