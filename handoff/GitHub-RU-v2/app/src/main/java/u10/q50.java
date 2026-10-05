package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class q50 implements aa.m0 {
    public final z50 a;

    public q50(z50 z50Var) {
        this.a = z50Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof q50) && k71.k.b(this.a, ((q50) obj).a);
    }

    public final int hashCode() {
        z50 z50Var = this.a;
        if (z50Var == null) {
            return 0;
        }
        return z50Var.hashCode();
    }

    public final String toString() {
        return "Data(updatePullRequestBranch=" + this.a + ")";
    }
}
