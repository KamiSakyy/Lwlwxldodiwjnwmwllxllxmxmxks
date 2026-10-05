package qo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class n2 {
    public final String a;
    public final String b;
    public final boolean c;
    public final vo.h2 d;

    public n2(String str, String str2, boolean z, vo.h2 h2Var) {
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = h2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n2)) {
            return false;
        }
        n2 n2Var = (n2) obj;
        return k71.k.b(this.a, n2Var.a) && k71.k.b(this.b, n2Var.b) && this.c == n2Var.c && k71.k.b(this.d, n2Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + x.i.e(com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31), 31, this.c);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("OnWorkflow(__typename=", this.a, ", id=", this.b, ", hasWorkflowDispatchTriggerForBranch=");
        o.append(this.c);
        o.append(", workflowInputsFragment=");
        o.append(this.d);
        o.append(")");
        return o.toString();
    }
}
