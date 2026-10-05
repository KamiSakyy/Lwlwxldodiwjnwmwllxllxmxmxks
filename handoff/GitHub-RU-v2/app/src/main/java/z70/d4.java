package z70;

/* loaded from: /home/user/work/p/classes3.dex */
public final class d4 {
    public final k5 a;
    public final z3 b;
    public final String c;
    public final String d;

    public d4(k5 k5Var, z3 z3Var, String str, String str2) {
        this.a = k5Var;
        this.b = z3Var;
        this.c = str;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d4)) {
            return false;
        }
        d4 d4Var = (d4) obj;
        return k71.k.b(this.a, d4Var.a) && k71.k.b(this.b, d4Var.b) && k71.k.b(this.c, d4Var.c) && k71.k.b(this.d, d4Var.d);
    }

    public final int hashCode() {
        k5 k5Var = this.a;
        int hashCode = (k5Var == null ? 0 : k5Var.hashCode()) * 31;
        z3 z3Var = this.b;
        return this.d.hashCode() + com.github.rudroid.copilot.h1.i((hashCode + (z3Var != null ? z3Var.hashCode() : 0)) * 31, this.c, 31);
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
