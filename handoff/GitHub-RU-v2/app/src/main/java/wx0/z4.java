package wx0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class z4 {
    public String a;
    public String b;
    public y4 c;
    public x4 d;

    public z4(String str, String str2, y4 y4Var, x4 x4Var) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = str2;
        this.c = y4Var;
        this.d = x4Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z4)) {
            return false;
        }
        z4 z4Var = (z4) obj;
        return k71.k.b(this.a, z4Var.a) && k71.k.b(this.b, z4Var.b) && k71.k.b(this.c, z4Var.c) && k71.k.b(this.d, z4Var.d);
    }

    public final int hashCode() {
        int i = com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
        y4 y4Var = this.c;
        int hashCode = (i + (y4Var == null ? 0 : y4Var.a.hashCode())) * 31;
        x4 x4Var = this.d;
        return hashCode + (x4Var != null ? x4Var.a.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("Owner(__typename=", this.a, ", id=", this.b, ", onUser=");
        o.append(this.c);
        o.append(", onOrganization=");
        o.append(this.d);
        o.append(")");
        return o.toString();
    }
}
