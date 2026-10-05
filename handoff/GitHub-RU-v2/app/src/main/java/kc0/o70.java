package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class o70 implements aa.m0 {
    public final z70 a;

    public o70(z70 z70Var) {
        this.a = z70Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o70) && k71.k.b(this.a, ((o70) obj).a);
    }

    public final int hashCode() {
        z70 z70Var = this.a;
        if (z70Var == null) {
            return 0;
        }
        return z70Var.hashCode();
    }

    public final String toString() {
        return "Data(updatePullRequestBranch=" + this.a + ")";
    }
}
