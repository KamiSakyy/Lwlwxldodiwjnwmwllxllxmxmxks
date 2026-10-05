package zx;

/* loaded from: /home/user/work/p/classes3.dex */
public final class k0 {
    public final a1 a;
    public final j0 b;
    public final String c;
    public final String d;

    public k0(a1 a1Var, j0 j0Var, String str, String str2) {
        this.a = a1Var;
        this.b = j0Var;
        this.c = str;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k0)) {
            return false;
        }
        k0 k0Var = (k0) obj;
        return k71.k.b(this.a, k0Var.a) && k71.k.b(this.b, k0Var.b) && k71.k.b(this.c, k0Var.c) && k71.k.b(this.d, k0Var.d);
    }

    public final int hashCode() {
        a1 a1Var = this.a;
        int hashCode = (a1Var == null ? 0 : a1Var.hashCode()) * 31;
        j0 j0Var = this.b;
        return this.d.hashCode() + com.github.rudroid.copilot.h1.i((hashCode + (j0Var != null ? j0Var.hashCode() : 0)) * 31, this.c, 31);
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
