package zx;

/* loaded from: /home/user/work/p/classes3.dex */
public final class a0Shadow implements aa.m0 {
    public b0 a;

    public a0(b0 b0Var) {
        this.a = b0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a0Shadow) && k71.k.b(this.a, ((a0Shadow) obj).a);
    }

    public final int hashCode() {
        b0 b0Var = this.a;
        if (b0Var == null) {
            return 0;
        }
        return b0Var.hashCode();
    }

    public final String toString() {
        return "Data(linkIssueOrPullRequest=" + this.a + ")";
    }
}
