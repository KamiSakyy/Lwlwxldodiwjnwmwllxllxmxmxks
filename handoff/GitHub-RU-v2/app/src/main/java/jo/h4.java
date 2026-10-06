package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class h4 {
    public final y4 a;
    public final g4 b;
    public final String c;
    public final String d;

    public h4(y4 y4Var, g4 g4Var, String str, String str2) {
        this.a = y4Var;
        this.b = g4Var;
        this.c = str;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h4)) {
            return false;
        }
        h4 h4Var = (h4) obj;
        return k71.k.b(this.a, h4Var.a) && k71.k.b(this.b, h4Var.b) && k71.k.b(this.c, h4Var.c) && k71.k.b(this.d, h4Var.d);
    }

    public final int hashCode() {
        y4 y4Var = this.a;
        int hashCode = (y4Var == null ? 0 : y4Var.hashCode()) * 31;
        g4 g4Var = this.b;
        return this.d.hashCode() + com.github.rudroid.copilot.h1.i((hashCode + (g4Var != null ? g4Var.hashCode() : 0)) * 31, this.c, 31);
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
