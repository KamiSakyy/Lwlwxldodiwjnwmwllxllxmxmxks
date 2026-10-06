package wc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class w0 {
    public String a;
    public z0 b;
    public u0 c;
    public String d;
    public v e;

    public w0(String str, z0 z0Var, u0 u0Var, String str2, v vVar) {
        this.a = str;
        this.b = z0Var;
        this.c = u0Var;
        this.d = str2;
        this.e = vVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w0)) {
            return false;
        }
        w0 w0Var = (w0) obj;
        return k71.k.b(this.a, w0Var.a) && k71.k.b(this.b, w0Var.b) && k71.k.b(this.c, w0Var.c) && k71.k.b(this.d, w0Var.d) && k71.k.b(this.e, w0Var.e);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        z0 z0Var = this.b;
        int hashCode2 = (hashCode + (z0Var == null ? 0 : z0Var.hashCode())) * 31;
        u0 u0Var = this.c;
        return this.e.hashCode() + com.github.rudroid.copilot.h1.i((hashCode2 + (u0Var != null ? u0Var.hashCode() : 0)) * 31, this.d, 31);
    }

    public final String toString() {
        return "Node(__typename=" + this.a + ", workflowRun=" + this.b + ", app=" + this.c + ", id=" + this.d + ", checkSuiteFragment=" + this.e + ")";
    }
}
