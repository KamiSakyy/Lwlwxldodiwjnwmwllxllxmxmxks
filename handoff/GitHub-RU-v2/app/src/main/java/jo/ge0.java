package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class ge0 implements aa.m0 {
    public final re0 a;

    public ge0(re0 re0Var) {
        this.a = re0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ge0) && k71.k.b(this.a, ((ge0) obj).a);
    }

    public final int hashCode() {
        re0 re0Var = this.a;
        if (re0Var == null) {
            return 0;
        }
        return re0Var.hashCode();
    }

    public final String toString() {
        return "Data(updatePullRequestBranch=" + this.a + ")";
    }
}
