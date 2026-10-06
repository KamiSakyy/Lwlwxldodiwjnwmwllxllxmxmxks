package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class y3 {
    public p4 a;
    public x3 b;
    public String c;
    public String d;

    public y3(p4 p4Var, x3 x3Var, String str, String str2) {
        this.a = p4Var;
        this.b = x3Var;
        this.c = str;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y3)) {
            return false;
        }
        y3 y3Var = (y3) obj;
        return k71.k.b(this.a, y3Var.a) && k71.k.b(this.b, y3Var.b) && k71.k.b(this.c, y3Var.c) && k71.k.b(this.d, y3Var.d);
    }

    public final int hashCode() {
        p4 p4Var = this.a;
        int hashCode = (p4Var == null ? 0 : p4Var.hashCode()) * 31;
        x3 x3Var = this.b;
        return this.d.hashCode() + com.github.rudroid.copilot.h1.i((hashCode + (x3Var != null ? x3Var.hashCode() : 0)) * 31, this.c, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CheckSuite(workflowRun=");
        sb.append(this.a);
        sb.append(", app=");
        sb.append(this.b);
        sb.append(", id=");
        return x.i.k(sb, this.c, ", __typename=", this.d, ")");
    }
}
