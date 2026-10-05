package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class n2 implements aa.m0 {
    public final l2 a;

    public n2(l2 l2Var) {
        this.a = l2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n2) && k71.k.b(this.a, ((n2) obj).a);
    }

    public final int hashCode() {
        l2 l2Var = this.a;
        if (l2Var == null) {
            return 0;
        }
        return l2Var.hashCode();
    }

    public final String toString() {
        return "Data(approveActionRequiredWorkflowRuns=" + this.a + ")";
    }
}
