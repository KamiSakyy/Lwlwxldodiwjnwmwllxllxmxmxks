package gv;

/* loaded from: /home/user/work/p/classes3.dex */
public final class y4 {
    public final f6 a;
    public final u4 b;
    public final String c;
    public final String d;

    public y4(f6 f6Var, u4 u4Var, String str, String str2) {
        this.a = f6Var;
        this.b = u4Var;
        this.c = str;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y4)) {
            return false;
        }
        y4 y4Var = (y4) obj;
        return k71.k.b(this.a, y4Var.a) && k71.k.b(this.b, y4Var.b) && k71.k.b(this.c, y4Var.c) && k71.k.b(this.d, y4Var.d);
    }

    public final int hashCode() {
        f6 f6Var = this.a;
        int hashCode = (f6Var == null ? 0 : f6Var.hashCode()) * 31;
        u4 u4Var = this.b;
        return this.d.hashCode() + com.github.rudroid.copilot.h1.i((hashCode + (u4Var != null ? u4Var.hashCode() : 0)) * 31, this.c, 31);
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
