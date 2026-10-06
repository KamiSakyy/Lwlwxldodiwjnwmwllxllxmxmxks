package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class z1 {
    public String a;
    public String b;
    public String c;
    public uu0.v5 d;
    public uu0.d6 e;

    public z1(String str, String str2, String str3, uu0.v5 v5Var, uu0.d6 d6Var) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = v5Var;
        this.e = d6Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z1)) {
            return false;
        }
        z1 z1Var = (z1) obj;
        return k71.k.b(this.a, z1Var.a) && k71.k.b(this.b, z1Var.b) && k71.k.b(this.c, z1Var.c) && k71.k.b(this.d, z1Var.d) && k71.k.b(this.e, z1Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + com.github.rudroid.copilot.h1.i(com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31), this.c, 31)) * 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("Issue(__typename=", this.a, ", id=", this.b, ", url=");
        o.append(this.c);
        o.append(", subIssueListFragment=");
        o.append(this.d);
        o.append(", subIssueProgressFragment=");
        o.append(this.e);
        o.append(")");
        return o.toString();
    }
}
