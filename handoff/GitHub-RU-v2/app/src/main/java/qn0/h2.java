package qn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class h2 implements aa.m0 {
    public final i2 a;

    public h2(i2 i2Var) {
        this.a = i2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h2) && k71.k.b(this.a, ((h2) obj).a);
    }

    public final int hashCode() {
        i2 i2Var = this.a;
        if (i2Var == null) {
            return 0;
        }
        return i2Var.hashCode();
    }

    public final String toString() {
        return "Data(dispatchWorkflowRun=" + this.a + ")";
    }
}
