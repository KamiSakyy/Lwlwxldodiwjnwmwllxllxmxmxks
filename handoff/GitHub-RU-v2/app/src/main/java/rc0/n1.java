package rc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class n1 {
    public final String a;
    public final String b;
    public final wc0.r0 c;

    public n1(String str, String str2, wc0.r0 r0Var) {
        this.a = str;
        this.b = str2;
        this.c = r0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n1)) {
            return false;
        }
        n1 n1Var = (n1) obj;
        return k71.k.b(this.a, n1Var.a) && k71.k.b(this.b, n1Var.b) && k71.k.b(this.c, n1Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("WorkflowRun(__typename=", this.a, ", id=", this.b, ", checkSuiteWorkflowRunFragment=");
        o.append(this.c);
        o.append(")");
        return o.toString();
    }
}
