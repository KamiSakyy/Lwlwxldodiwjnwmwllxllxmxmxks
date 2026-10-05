package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class sb0 implements aa.m0 {
    public final dc0 a;

    public sb0(dc0 dc0Var) {
        this.a = dc0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sb0) && k71.k.b(this.a, ((sb0) obj).a);
    }

    public final int hashCode() {
        dc0 dc0Var = this.a;
        if (dc0Var == null) {
            return 0;
        }
        return dc0Var.hashCode();
    }

    public final String toString() {
        return "Data(updatePullRequestBranch=" + this.a + ")";
    }
}
