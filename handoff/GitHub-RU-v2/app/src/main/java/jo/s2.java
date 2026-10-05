package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class s2 implements aa.m0 {
    public final q2 a;

    public s2(q2 q2Var) {
        this.a = q2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s2) && k71.k.b(this.a, ((s2) obj).a);
    }

    public final int hashCode() {
        q2 q2Var = this.a;
        if (q2Var == null) {
            return 0;
        }
        return q2Var.hashCode();
    }

    public final String toString() {
        return "Data(approveActionRequiredWorkflowRuns=" + this.a + ")";
    }
}
