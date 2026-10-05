package b20;

/* loaded from: /home/user/work/p/classes3.dex */
public final class f1 {
    public final String a;
    public final String b;
    public final g20.r0 c;

    public f1(String str, String str2, g20.r0 r0Var) {
        this.a = str;
        this.b = str2;
        this.c = r0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f1)) {
            return false;
        }
        f1 f1Var = (f1) obj;
        return k71.k.b(this.a, f1Var.a) && k71.k.b(this.b, f1Var.b) && k71.k.b(this.c, f1Var.c);
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
