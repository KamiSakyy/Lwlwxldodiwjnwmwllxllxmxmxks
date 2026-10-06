package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class h2 implements aaShadow.m0 {
    public f2 a;

    public h2(f2 f2Var) {
        this.a = f2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h2) && k71.k.b(this.a, ((h2) obj).a);
    }

    public final int hashCode() {
        f2 f2Var = this.a;
        if (f2Var == null) {
            return 0;
        }
        return f2Var.hashCode();
    }

    public final String toString() {
        return "Data(approveActionRequiredWorkflowRuns=" + this.a + ")";
    }
}
